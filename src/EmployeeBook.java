public class EmployeeBook {
    private final Employee[] employees;
    private int size;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    public void addEmployee(String name, int department, double salary) {
        if (size >= employees.length) {
            System.out.println("Нельзя добавить данные, закончилось место.");
        }
        Employee newEmployee = new Employee(name, department, salary);
        employees[size++] = newEmployee;
    }

    public void removeEmployee(String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equals(name)) {
                System.out.println("Сотрудник " + employees[i].getName() + " удален");
                System.arraycopy(employees, i + 1, employees, i, size - i - 1);
                employees[size - 1] = null;
                size--;
                return;
            }
        }
    }

    public void findEmployee(String name) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getName().equals(name)) {
                System.out.println(employee);
                return;
            }
        }
        System.out.println("Сотрудник " + name + " не найден");
    }

    public void changeDepartment(String name, int department) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getName().equals(name)) {
                employee.setDepartment(department);
            }
        }
    }

    public void changeSalary(String name, double salary) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getName().equals(name)) {
                employee.setSalary(salary);
            }
        }
    }

    public int getCurrentSize() {
        return size;
    }

    public void printList() {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
                System.out.println(employee.toString());
        }
    }

    public void getMonthlyExpenses() {
        double monthlyExpenses = 0;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
                monthlyExpenses = monthlyExpenses + employee.getSalary();
            }
        System.out.println("Ежемесячные расходы на зарплаты сотрудникам составляют: " + monthlyExpenses + " рублей.");
    }

    public void getMaxSalary() {
        double maxSalary = 1;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                }
            }
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
                if (employee.getSalary() == maxSalary) {
                    System.out.println("Сотрудник с максимальной зарплатой: " + employee);
                }
            }
        }

    public void getMinSalary() {
        double minSalary = 100000;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                }
            }
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
                if (employee.getSalary() == minSalary) {
                    System.out.println("Сотрудник с минимальной зарплатой: " + employee);
                }
            }
        }

    public void getAverageMonthlyExpenses() {
        double monthlyExpenses = 0;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
                monthlyExpenses = monthlyExpenses + employee.getSalary();
            }
        double averageMonthlyExpenses = monthlyExpenses / size;
        System.out.println("Средняя зарплата сотрудника составляет: " + averageMonthlyExpenses + " рублей.");
    }

    public void getName() {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
                System.out.println(employee.getName());
            }
        }

    public void indexTheSalary(double percent) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
                employee.setSalary(employee.getSalary() * (1 + percent));
            }
        }

    public void printListDepartment(int department) {
        System.out.println("Отдел " + department + ". Сотрудники: ");
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
                if (employee.getDepartment() == department) {
                    System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
            }
        }
    }

    public void printListDepartments() {
    printListDepartment(1);
        System.out.println("***************");
    printListDepartment(2);
        System.out.println("***************");
        printListDepartment(3);
        System.out.println("***************");
        printListDepartment(4);
        System.out.println("***************");
        printListDepartment(5);
    }

    public void getMaxSalaryDepartment(int department) {
        double maxSalary = 1;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
                if (employee.getSalary() > maxSalary && employee.getDepartment() == department) {
                    maxSalary = employee.getSalary();
            }
        }
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
                if (employee.getSalary() == maxSalary) {
                    System.out.println("Сотрудник с максимальной зарплатой по отделу: " + employee);
            }
        }
    }

    public void getMinSalaryDepartment(int department) {
        double minSalary = 100000;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
                if (employee.getSalary() < minSalary && employee.getDepartment() == department) {
                    minSalary = employee.getSalary();
            }
        }
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
                if (employee.getSalary() == minSalary) {
                    System.out.println("Сотрудник с минимальной зарплатой по отделу: " + employee);
            }
        }
    }

    public void getMonthlyExpensesDepartment(int department) {
        double monthlyExpenses = 0;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
                if (employee.getDepartment() == department) {
                    monthlyExpenses = monthlyExpenses + employee.getSalary();
            }
        }
        System.out.println("Ежемесячные расходы на зарплаты сотрудникам по отделу составляют: " + monthlyExpenses + " рублей.");
    }

    public void getAverageMonthlyExpensesDepartment(int department) {
        double monthlyExpenses = 0;
        int number = 0;
        double averageMonthlyExpenses = 0;

        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
                if (employee.getDepartment() == department) {
                    monthlyExpenses = monthlyExpenses + employee.getSalary();
                    number = number + 1;
                    averageMonthlyExpenses = monthlyExpenses / number;
            }
        }
        System.out.println("Средняя зарплата сотрудника по отделу составляет: " + averageMonthlyExpenses + " рублей.");
    }

    public void indexTheSalaryDepartment(int department, double percent) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
                if (employee.getDepartment() == department) {
                    employee.setSalary(employee.getSalary() * (1 + percent));
            }
        }
    }

    public void getSalaryLessThanTheNumber(double a) {
        System.out.println("Сотрудники с зарплатой меньше " + a + ": ");
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
                if (employee.getSalary() < a) {
                    System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
            }
        }
    }

    public void getSalaryAboveTheNumber(double a) {
        System.out.println("Сотрудники с зарплатой больше " + a + ": ");
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
                if (employee.getSalary() >= a) {
                    System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
            }
        }
    }

    public void printSeparator() {
        System.out.println();
    }
}
