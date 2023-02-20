public class Main {
    private static final Employee[] employees = new Employee[10];

    public static void printList() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void getMonthlyExpenses() {
        double monthlyExpenses = 0;
        for (Employee employee : employees) {
            monthlyExpenses = monthlyExpenses + employee.getSalary();
        }
        System.out.println("Ежемесячные расходы на зарплаты сотрудникам составляют: " + monthlyExpenses + " рублей.");
    }

    public static void getMaxSalary() {
        double maxSalary = 1;
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        for (Employee employee : employees) {
            if (employee.getSalary() == maxSalary) {
                System.out.println("Сотрудник с максимальной зарплатой: " + employee);
            }
        }
    }

    public static void getMinSalary() {
        double minSalary = 100000;
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }
        for (Employee employee : employees) {
            if (employee.getSalary() == minSalary) {
                System.out.println("Сотрудник с минимальной зарплатой: " + employee);
            }
        }
    }

    public static void getAverageMonthlyExpenses() {
        double monthlyExpenses = 0;
        for (Employee employee : employees) {
            monthlyExpenses = monthlyExpenses + employee.getSalary();
        }
        double averageMonthlyExpenses = monthlyExpenses / employees.length;
        System.out.println("Средняя зарплата сотрудника составляет: " + averageMonthlyExpenses + " рублей.");
    }

    public static void getName() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }

    public static void indexTheSalary(double percent) {
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() * (1 + percent));
        }
    }

    public static void printListDepartment(int department) {
        System.out.println("Отдел " + department + ". Сотрудники: ");
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
            }
        }
    }

    public static void getMaxSalaryDepartment(int department) {
        double maxSalary = 1;
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary && employee.getDepartment() == department) {
                maxSalary = employee.getSalary();
            }
        }
        for (Employee employee : employees) {
            if (employee.getSalary() == maxSalary) {
                System.out.println("Сотрудник с максимальной зарплатой по отделу: " + employee);
            }
        }
    }

    public static void getMinSalaryDepartment(int department) {
        double minSalary = 100000;
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary && employee.getDepartment() == department) {
                minSalary = employee.getSalary();
            }
        }
        for (Employee employee : employees) {
            if (employee.getSalary() == minSalary) {
                System.out.println("Сотрудник с минимальной зарплатой по отделу: " + employee);
            }
        }
    }

    public static void getMonthlyExpensesDepartment(int department) {
        double monthlyExpenses = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                monthlyExpenses = monthlyExpenses + employee.getSalary();
            }
        }
        System.out.println("Ежемесячные расходы на зарплаты сотрудникам по отделу составляют: " + monthlyExpenses + " рублей.");
    }

    public static void getAverageMonthlyExpensesDepartment(int department) {
        double monthlyExpenses = 0;
        int number = 0;
        double averageMonthlyExpenses = 0;

        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                monthlyExpenses = monthlyExpenses + employee.getSalary();
                number = number + 1;
                averageMonthlyExpenses = monthlyExpenses / number;
            }
        }
        System.out.println("Средняя зарплата сотрудника по отделу составляет: " + averageMonthlyExpenses + " рублей.");
    }

    public static void indexTheSalaryDepartment(int department, double percent) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                employee.setSalary(employee.getSalary() * (1 + percent));
            }
        }
    }

    public static void getSalaryLessThanTheNumber(double a) {
        System.out.println("Сотрудники с зарплатой меньше " + a + ": ");
        for (Employee employee : employees) {
            if (employee.getSalary() < a) {
                System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
            }
        }
    }

    public static void getSalaryAboveTheNumber(double a) {
        System.out.println("Сотрудники с зарплатой больше " + a + ": ");
        for (Employee employee : employees) {
            if (employee.getSalary() >= a) {
                System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
            }
        }
    }

    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван Иванович", 5, 55555);
        employees[1] = new Employee("Иванова Варвара Васильевна", 3, 56566);
        employees[2] = new Employee("Иванов Тарас Григорьевич", 2, 67890);
        employees[3] = new Employee("Иванова Лариса Ивановна", 1, 45098);
        employees[4] = new Employee("Иванов Василий Петрович", 4, 65432);
        employees[5] = new Employee("Иванова Татьяна Юрьевна", 3, 67897);
        employees[6] = new Employee("Иванов Евгений Петрович", 5, 75456);
        employees[7] = new Employee("Иванова Ольга Владимировна", 4, 57896);
        employees[8] = new Employee("Иванов Инокентий Петрович", 2, 67843);
        employees[9] = new Employee("Иванова Тамара Валерьевна", 1, 86765);

        printList();
        getMonthlyExpenses();
        getMaxSalary();
        getMinSalary();
        getAverageMonthlyExpenses();
        getName();
        indexTheSalary(0.05);
        printList();

        getMaxSalaryDepartment(5);
        getMinSalaryDepartment(5);
        getMonthlyExpensesDepartment(5);
        getAverageMonthlyExpensesDepartment(5);
        indexTheSalaryDepartment(5, 0.03);
        printListDepartment(5);
        getSalaryLessThanTheNumber(50000);
        getSalaryAboveTheNumber(50000);
    }
}