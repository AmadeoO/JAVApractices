package Amadeo.designPatterns.TOP;

public class Provider {
    private String name;
    private String company;
    private String empCode;

    //constructor By name, company and employee code
    public Provider(String name, String company, String empCode) {
        this.name = name;
        this.company = company;
        this.empCode = empCode;
    }
    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
