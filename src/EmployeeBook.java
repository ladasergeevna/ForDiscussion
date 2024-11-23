public class EmployeeBook {

    private final Employee[] employees;
    private int size = 0;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }


    public void addEmployee(String fullName, int department, float salary) {
        if (size >= employees.length) {
            System.out.println("Нельзя принять нового сотрудника, нет свободных вакансий");
        }
        Employee newEmployee = new Employee(fullName, department, salary);
        employees[size++] = newEmployee;
    }
    public void removeEmployee(String fullName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFullName().equals(fullName)) {
                if (employees == null) {
                    continue;
                }
                System.out.println(employees[i].getFullName() + " удален");
                System.arraycopy(employees, i + 1, employees, i, size - i - 1);
                employees[size - 1] = null;
                size--;
                return;
            }
        }
    }

    public float getSumSalary() {
        int totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public float getAvarageSalary() {
        float avarageSalary = 0;
        avarageSalary = getSumSalary() / employees.length;
        return avarageSalary;
    }

    public void getMaxAndMinSalary() {
        float maxSum = Float.MIN_VALUE;
        float minSum = Float.MAX_VALUE;
        String employeeWithMaxSalary = null;
        String employeeWithMinSalary = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees == null) {
                continue;
            }
            float current = employees[i].getSalary();
            if (current > maxSum) {
                maxSum = current;
                employeeWithMaxSalary = employees[i].getFullName();
            }
            if (current < minSum) {
                minSum = current;
                employeeWithMinSalary = employees[i].getFullName();
            }

        }
        System.out.println("Сотрудник с максимальной зарплатой -  " + employeeWithMaxSalary + " (" + maxSum + ") рублей");
        System.out.println("Сотрудник с минимальной зарплатой -  " + employeeWithMinSalary + " (" + minSum + ") рублей");

    }

    public float salaryAfterIndex(int percent) {
        float salaryAfterIndex = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees == null) {
                continue;
            }
            salaryAfterIndex = employees[i].getSalary() + employees[i].getSalary() * percent / 100;
            System.out.println(employees[i].getId() + ". " + employees[i].getFullName() + " " + salaryAfterIndex + " рублей");

        }
        return salaryAfterIndex;
    }// не понятно как корректно оформить. Убрать return - ошибка. Оставить -лишняя запись
    public int getCurrentSize() {
        return size;
    }

    public String findEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees == null) {
                continue;
            }
            String currentEmployee = employees[i].getFullName();
            if (employees[i].getId() == id) {
                return currentEmployee = employees[i].getFullName();
            }
        }
        return null;
    }// не понятно как корректно оформить

    public Employee getEmployeeWithMinSalaryByDepartment(int department) {
        Employee employeeWithMaxSalary = null;
        for (Employee employee : employees) {
            if (employees == null) {
                continue;
            }
            if (employeeWithMaxSalary == null || (employee.getDepartment() == department && employee.getSalary() <= employeeWithMaxSalary.getSalary())) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }


    public void getEmployeeWithMaxSalaryByDepartment(int department) {
        double maxSalary = -1;
        for (Employee employee : employees) {
            if (employees == null) {
                continue;
            }
            if (employee != null && employee.getDepartment() == department && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        System.out.println("Мaксимальная ЗП в отделе " + department + " равна: " + maxSalary);
    }

    public void printAllEmployee() {
        for (Employee employee : employees) {
            if (employees == null) {
                continue;
            }
            System.out.println(employee.getId() + ". " + employee.getFullName() + "; Department: " + employee.getDepartment() + "; Salary: " + employee.getSalary());
        }
    }


}