package Objects;
import java.io.Serializable;
import java.util.Date;
import java.time.LocalDateTime;
public class Organization implements Serializable {
    private static final long serialVersionUID = 2L;
    private long id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private long annualTurnover; //Поле может быть null, Значение поля должно быть больше 0
    private String fullName; //Длина строки не должна быть больше 831, Поле может быть null
    private long employeesCount; //Значение поля должно быть больше 0
    private OrganizationType type; //Поле может быть null
    private Address officialAddress; //Поле не может быть null
    public Organization(long id,String name, Coordinates coordinates, long annualTurnover, String fullName,long employeesCount,OrganizationType type, Address officialAddress,java.time.LocalDateTime creationDate){
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.annualTurnover = annualTurnover;
        this.fullName = fullName;
        this.type = type;
        this.officialAddress = officialAddress;
        this.employeesCount = employeesCount;
        this.creationDate = creationDate;
    }
    @Override
    public String toString(){
        return  "<id>"+ String.valueOf(id)+"</id>" +"\n"+"<name>" +name+"</name>"+ "\n" +coordinates.toString()+ "<data>" + creationDate.toString() + "</data>" + "\n" + "<annualTurnover>" +String.valueOf(annualTurnover) + "</annualTurnover>" + "/n" + "<fullName>" + fullName + "</fullName>" + "\n"+ "<employeesCount>" +String.valueOf(employeesCount) + "</employeesCount>"+ "\n"+ "<type>" + type + "</type>"+  "\n" +  officialAddress.toString() + "\n";
    }
    public long getId(){
        return id;
    }
    public long getAnnualTurnover(){
        return annualTurnover;
    }
    public java.time.LocalDateTime getcreationDate(){
        return creationDate;
    }

    public long getEmployeesCount() {
        return employeesCount;
    }

    public OrganizationType getType() {
        return type;
    }
    public void setId(long id){
        this.id = id;
    }



}