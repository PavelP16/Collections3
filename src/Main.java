public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        // Добавление сотрудников
        Employee emp1 = new Employee("Пушкин Александр Сергеевич", "Писатель", 60_000);
        Employee emp2 = new Employee("Леонардо Давинчи", "Художник", 80_000);
        Employee emp3 = new Employee("Альберт Эйнштейн", "Физик", 70_000);
        Employee emp4 = new Employee("Иоганн Себастьян Бах", "Композитор", 75_000);
        Employee emp5 = new Employee("Иоганн Себастьян Бах", "Композитор", 75_000);
        System.out.println("\n");

        employeeBook.addEmployee(emp1);
        employeeBook.addEmployee(emp2);
        employeeBook.addEmployee(emp3);
        employeeBook.addEmployee(emp4);
        employeeBook.addEmployee(emp5);
        System.out.println("\n");

        // Добавляем сотрудника с существующим ФИО
        employeeBook.addEmployee(emp1);

        // Поиск сотрудника
        Employee foundEmployee = employeeBook.findEmployee("Пушкин Александр Сергеевич");
        System.out.println(foundEmployee);

        // Удаление сотрудника
        employeeBook.removeEmployee("Альберт Эйнштейн");

        // Печать всех сотрудников
        employeeBook.printAllEmployees();
    }
}