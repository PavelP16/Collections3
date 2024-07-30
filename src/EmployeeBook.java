import java.util.HashMap;
import java.util.Map;

public class EmployeeBook {
    private Map<String, Employee> employees;

    public EmployeeBook() {
        this.employees = new HashMap<>();
    }

    public void addEmployee(Employee employee) {
        String key = employee.getFullName();
        if (!employees.containsKey(key)) {
            employees.put(key, employee);
            System.out.println("Сотрудник " + key + " добавлен.");
        } else {
            System.out.println("Сотрудник с таким ФИО уже существует.");
        }
    }

    public void removeEmployee(String fullName) {
        if (employees.remove(fullName) != null) {
            System.out.println("Сотрудник " + fullName + " удалён.");
        } else {
            System.out.println("Сотрудник с таким ФИО не найден.");
        }
    }

    public Employee findEmployee(String fullName) {
        return employees.get(fullName);
    }

    public void printAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("Нет сотрудников.");
        } else {
            for (Employee employee : employees.values()) {
                System.out.println(employee);
            }
        }
    }
}