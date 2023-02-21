public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee("Иванов Иван Иванович", 5, 55555);
        employeeBook.addEmployee("Иванова Варвара Васильевна", 3, 56566);
        employeeBook.addEmployee("Иванов Тарас Григорьевич", 2, 67890);
        employeeBook.addEmployee("Иванова Лариса Ивановна", 1, 45098);
        employeeBook.addEmployee("Иванов Василий Петрович", 4, 65432);
        employeeBook.addEmployee("Иванова Татьяна Юрьевна", 3, 67897);
        employeeBook.addEmployee("Иванов Евгений Петрович", 5, 75456);
        employeeBook.addEmployee("Иванова Ольга Владимировна", 4, 57896);
        employeeBook.addEmployee("Иванов Инокентий Петрович", 2, 67843);
        employeeBook.addEmployee("Иванова Тамара Валерьевна", 1, 86765);

        employeeBook.printList();
        employeeBook.printSeparator();
        employeeBook.getMonthlyExpenses();
        employeeBook.printSeparator();
        employeeBook.getMaxSalary();
        employeeBook.printSeparator();
        employeeBook.getMinSalary();
        employeeBook.printSeparator();
        employeeBook.getAverageMonthlyExpenses();
        employeeBook.printSeparator();
        employeeBook.getName();
        employeeBook.printSeparator();
        employeeBook.indexTheSalary(0.05);
        employeeBook.printSeparator();
        employeeBook.printList();
        employeeBook.printSeparator();

        employeeBook.getMaxSalaryDepartment(5);
        employeeBook.printSeparator();
        employeeBook.getMinSalaryDepartment(5);
        employeeBook.printSeparator();
        employeeBook.getMonthlyExpensesDepartment(5);
        employeeBook.printSeparator();
        employeeBook.getAverageMonthlyExpensesDepartment(5);
        employeeBook.printSeparator();
        employeeBook.indexTheSalaryDepartment(5, 0.03);
        employeeBook.printListDepartment(5);
        employeeBook.printSeparator();
        employeeBook.getSalaryLessThanTheNumber(50000);
        employeeBook.printSeparator();
        employeeBook.getSalaryAboveTheNumber(50000);
        employeeBook.printSeparator();

        employeeBook.removeEmployee("Иванов Иван Иванович");
        employeeBook.printSeparator();
        employeeBook.printList();
        employeeBook.printSeparator();
        employeeBook.findEmployee("Иванова Лариса Ивановна");
        employeeBook.changeDepartment("Иванова Лариса Ивановна", 5);
        employeeBook.changeSalary("Иванова Лариса Ивановна",50367);
        employeeBook.findEmployee("Иванова Лариса Ивановна");
        employeeBook.printSeparator();
        employeeBook.addEmployee("Иванов Иван Иванович", 1, 57000);
        employeeBook.printList();
        employeeBook.printSeparator();
        employeeBook.printListDepartments();

    }
}