public class Employee {
    private String name;
    private int salary;
    private int department;
    private int id;
    public static int idCounter = 1;


    public Employee(String name, int department, int salary) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        id = idCounter;
        idCounter++;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return getId() + "  Имя сотрудника: " + name + "; отдел: " + department + "; зарплата: " + salary + " рублей.";
    }
}
