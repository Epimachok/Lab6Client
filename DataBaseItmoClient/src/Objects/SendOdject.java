package Objects;

import java.io.Serializable;

public class SendOdject implements Serializable {
    private static final long serialVersionUID = 1L;
    private Organization org = null;
    private String comand = null;
    private String scriptFile = null;
    private boolean isok = true;
    private long employeesCount;
    private long id;
    private String key = "-1";

    public SendOdject(){
    }


    public Organization getOrg() {
        return org;
    }

    public String getComand() {
        return comand;
    }

    public String getKey() {
        return key;
    }

    public String getScriptFile() {
        return scriptFile;
    }

    public boolean getisok(){
        return isok;
    }

    public long getEmployeesCount() {
        return employeesCount;
    }

    public void setComand(String comand) {
        this.comand = comand;
    }

    public void setEmployeesCount(long employeesCount) {
        this.employeesCount = employeesCount;
    }

    public void setIsok(boolean isok) {
        this.isok = isok;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setOrg(Organization org) {
        this.org = org;
    }

    public void setScriptFile(String scriptFile) {
        this.scriptFile = scriptFile;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}

