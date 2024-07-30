public class Employee {
    private String fullName;
    private String position;
    private double salary;

    public Employee(String fullName, String position, double salary) {
        this.fullName = fullName;
        this.position = position;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}