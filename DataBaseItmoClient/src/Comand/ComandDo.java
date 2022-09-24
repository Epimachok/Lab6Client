package Comand;

import Comand.executable.*;
import Comand.utils.Creater;
import Objects.Address;
import Objects.Coordinates;
import Objects.Organization;
import Objects.OrganizationType;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.*;
import Objects.OrganizationEmployCountComparator;
import Objects.OrganizationAnnualTurnoverComparator;
import Objects.SendOdject;

public class ComandDo {
    HashMap<String, abstractComand> comand = new HashMap<>();
    Creater creater;
    Help help;
    Clear clear;
    Execute_script execute_script;
    Exit exit;
    Info info;
    Insert insert;
    Max_by_creation_date max_by_creation_date;
    Print_unique_type print_unique_type;
    Remove_all_by_employees_count remove_all_by_employees_count;
    Remove_greater remove_greater;
    Remove_key remove_key;
    Remove_lower remove_lower;
    Replace_if_greater replace_if_greater;
    Show show;
    Update update;
    public ComandDo() {
        creater = new Creater();
        this.clear = new Clear();
        this.execute_script = new Execute_script();
        this.exit = new Exit();
        this.info = new Info();
        this.insert = new Insert();
        this.max_by_creation_date = new Max_by_creation_date();
        this.print_unique_type = new Print_unique_type();
        this.remove_all_by_employees_count = new Remove_all_by_employees_count();
        this.remove_greater = new Remove_greater();
        this.remove_key = new Remove_key();
        this.remove_lower = new Remove_lower();
        this.replace_if_greater = new Replace_if_greater();
        this.show =  new Show();
        this.update = new Update();
        this.help = new Help();
        comand.put("clear", this.clear);
        comand.put("execute_script",this.execute_script);
        comand.put("exit",this.exit);
        comand.put("info",this.info);
        comand.put("insert",this.insert);
        comand.put("max_by_creation_date",this.max_by_creation_date);
        comand.put("print_unique_type",this.print_unique_type);
        comand.put("remove_all_by_employees_count",this.remove_all_by_employees_count);
        comand.put("remove_greater",this.remove_greater);
        comand.put("remove_key",this.remove_key);
        comand.put("remove_lower",this.remove_lower);
        comand.put("replace_if_greater",this.replace_if_greater);
        comand.put("show",this.show);
        comand.put("update",this.update);
        comand.put("help", this.help);





    }
    public SendOdject doing(String[] arg) throws IOException,java.lang.NumberFormatException {
        SendOdject ret = new SendOdject();
        ret.setIsok(false);
        switch (arg[0]) {
            case ("help") -> ret = help.execute(arg);
            case ("info") -> ret = info.execute(arg);
            case ("show") -> ret = show.execute(arg);
            case ("insert") -> ret = insert.execute(arg);
            case ("remove_key") -> ret = remove_key.execute(arg);
            case ("clear") -> ret = clear.execute(arg);
            case ("execute_script") -> ret = execute_script.execute(arg);
            case ("exit") -> ret = exit.execute(arg);
            case ("remove_greater") -> ret = remove_greater.execute(arg);
            case ("remove_all_by_employees_count") -> ret = remove_all_by_employees_count.execute(arg);
            case ("max_by_creation_date") -> ret = max_by_creation_date.execute(arg);
            case ("print_unique_type") -> ret = print_unique_type.execute(arg);
            case ("remove_lower") -> ret = remove_lower.execute(arg);
            case ("replace_if_greater") -> ret = replace_if_greater.execute(arg);
            case ("update") -> ret = update.execute(arg);
            default -> System.out.println("Warning! Attention of such command does not exist. To call a list of commands, write the command 'help'");
        }

        return ret;


    }


}
