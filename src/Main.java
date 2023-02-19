public class Main {
    private static Employee[] employees = new Employee[10];
    private static Employee employee;

    public static void printList() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void getMonthlyExpenses() {
        int monthlyExpenses = 0;
        for (Employee employee : employees) {
            monthlyExpenses = monthlyExpenses + employee.getSalary();
        }
        System.out.println("Ежемесячные расходы на зарплаты сотрудникам составляют: " + monthlyExpenses + " рублей.");
    }

    public static void getMaxSalary() {
        int maxSalary = 1;
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
        int minSalary = 100000;
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
        int monthlyExpenses = 0;
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
    }
}