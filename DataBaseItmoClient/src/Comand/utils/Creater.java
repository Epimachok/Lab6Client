package Comand.utils;

import Objects.Address;
import Objects.Coordinates;
import Objects.Organization;
import Objects.OrganizationType;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Creater {
    private Scanner scanner = new Scanner(System.in);
    public Creater(){
    }
    public Organization createOrganization(){
        long id = -1;
        String name;
        Coordinates coordinates;
        java.time.LocalDateTime creationDate = LocalDateTime.now();
        long annualTurnover;
        String fullName;
        long employeesCount;
        String strtype;
        OrganizationType type;
        Address officialAddress;
        while (true) {
            System.out.print("name: ");
            name = scanner.nextLine();
            if (!(name.equals(null)) && !(name.equals(""))) {
                break;
            }
            System.out.println("Name cant be null or empty string. Enter name again");
        }
        while (true) {
            try {
                System.out.print("annualTurnover: ");
                annualTurnover = Long.parseLong(scanner.nextLine());
                if (annualTurnover > 0) {
                    break;
                }
                System.out.println("annualTurnover must be >0! Enter annualTurnover again");
            } catch (NumberFormatException e) {
                System.out.println("You must enter an integer! Enter annualTurnover again");
            }
        }
        while (true) {
            System.out.print("fullName: ");
            fullName = scanner.nextLine();
            if (!(fullName.equals(null)) && fullName.length()<=831) {
                break;
            }
            System.out.println("fullName cant be null and must be <=831 symbols. Enter fullName again");
        }
        while (true) {
            try {
                System.out.print("employeesCount: ");
                employeesCount = Long.parseLong(scanner.nextLine());
                if (employeesCount > 0) {
                    break;
                }
                System.out.println("employeesCount must be >0! Enter employeesCount again");
            } catch (NumberFormatException e) {
                System.out.println("You must enter an integer! Enter employeesCount again");
            }
        }
        while (true) {
            System.out.print("Choose a type from these opinion (PUBLIC, GOVERNMENT, TRUST, PRIVATE_LIMITED_COMPANY): ");
            strtype = scanner.nextLine();
            if (strtype.equals("PUBLIC")){
                type = OrganizationType.PUBLIC;
                break;
            }
            else if (strtype.equals("GOVERNMENT")){
                type = OrganizationType.GOVERNMENT;
                break;
            }
            else if (strtype.equals("TRUST")){
                type = OrganizationType.TRUST;
                break;
            }
            else if (strtype.equals("PRIVATE_LIMITED_COMPANY")){
                type = OrganizationType.PRIVATE_LIMITED_COMPANY;
                break;
            }
            else{
                System.out.println("You mast select one from these opinion. Enter type again");
            }
        }
        officialAddress = createAdress();
        coordinates = createCoordinates();
        Organization org = new Organization(id, name, coordinates, annualTurnover, fullName,employeesCount,type, officialAddress, creationDate);
        return org;
    }
    public Address createAdress(){
        String zipcode;
        while (true) {
            System.out.print("zipcode: ");
            zipcode = scanner.nextLine();
            if (!(zipcode.equals(null)) ) {
                break;
            }
            System.out.println("zipcode cant be null. Enter zipcode again");
        }
        Address officialAddress = new Address(zipcode);
        return officialAddress;
    }
    public Coordinates createCoordinates(){
        float x;
        float y;
        while (true) {
            try {
                System.out.print("X coordinate: ");
                x = Float.parseFloat(scanner.nextLine());
                break;
            }
            catch (NumberFormatException e){
                System.out.println("You must enter an float! Enter x again");
            }
        }
        while (true) {
            try {
                System.out.print("Y coordinate: ");
                y = Float.parseFloat(scanner.nextLine());
                break;
            }
            catch (NumberFormatException e){
                System.out.println("You must enter an float! Enter y again");
            }
        }
        return new Coordinates(x,y);
    }
}
