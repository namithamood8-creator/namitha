package Namitha.assignment;

public class Employee {
    private String name;
    private int employeeId;
    private double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getName() { return name; }
    public int getEmployeeId() { return employeeId; }
    public double getSalary() { return salary; }

    public void setName(String name) { this.name = name; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
    public void setSalary(double salary) { this.salary = salary; }
}
public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}
