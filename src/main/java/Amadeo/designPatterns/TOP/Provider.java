package Amadeo.designPatterns.TOP;

import lombok.Getter;
import lombok.Setter;

public class Provider {
    @Getter
    @Setter
    public String name;

    @Getter
    @Setter
    protected String company;

    @Getter
    @Setter
    String empCode;

    @Getter
    @Setter
    private String dni;



    public Provider(String name, String company, String empCode, String dni) {
        this.name = name;
        this.company = company;
        this.empCode = empCode;
        this.dni = dni;
    }
    //    constructor By name, company and employee code
    public Provider(String name, String company, String empCode) {
        this.name = name;
        this.company = company;
        this.empCode = empCode;
    }
    public Provider() {
        this.name = "Juan";
        this.company = "lavandina";
        this.empCode = "1236jp";
        this.dni = "345678990";
    }
}
