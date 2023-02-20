public class Employee {
    private String name;
    private double salary;
    private int department;
    private int id;
    public static int idCounter = 1;


    public Employee(String name, int department, double salary) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        id = idCounter;
        idCounter++;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setSalary(double salary) {
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
