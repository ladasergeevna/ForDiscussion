//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee("Kozlova Lada Sergeevna", 1, 135000);
        employeeBook.addEmployee("Kosmicheskiy Sergey Vladimirovich", 1, 140000);
        employeeBook.addEmployee("Chernyh Elena Aleksandrona", 2, 93000);
        employeeBook.addEmployee("Igorev Fedor Eduardovich", 2, 100000);
        employeeBook.addEmployee("Muzichenko Oksana Mihailovna", 3, 80000);
        employeeBook.addEmployee("Burovay Olga Alekseevna", 3, 80000);
        employeeBook.addEmployee("Pesochnikov Vitaliy Alexandrovich", 4, 94000);
        employeeBook.addEmployee("Kolpanov Alexandr Vitalievich", 4, 95000);
        employeeBook.addEmployee("Ponomareva Inna Semenovna", 5, 120000);
        employeeBook.addEmployee("Petrova Galina Vladimirovna", 5, 7000);

        System.out.println("Количество человек в компании: " + employeeBook.getCurrentSize());
        System.out.println("Сумма затрат на ЗП в месяц: " + employeeBook.getSumSalary());
        System.out.println("Cреднее значение зарплат: " + employeeBook.getAvarageSalary());
        employeeBook.getMaxAndMinSalary();
        System.out.println(employeeBook.getEmployeeWithMinSalaryByDepartment(5));
        employeeBook.getEmployeeWithMaxSalaryByDepartment(4);
        System.out.println(employeeBook.findEmployee(4));
        System.out.println();
        System.out.println("Список всех сотрудников");
        employeeBook.printAllEmployee();
        System.out.println();
        System.out.println("Зарплата после индексации");
        System.out.println(employeeBook.salaryAfterIndex(10));

        employeeBook.removeEmployee("Ponomareva Inna Semenovna");
        System.out.println();
        System.out.println("Количество человек в компании: " + employeeBook.getCurrentSize());
        employeeBook.addEmployee("Petrov Garic Vladimirovna", 4, 120000);



    }
}