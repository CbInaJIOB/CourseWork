public class Main {
    public static void main(String[] args) {
      System.out.printf("Hello and welcome!");

        Employee[] emp = new Employee[10];

        emp[0] = new Employee("Иванов", "Иван", "Иванович", 1, 250000f);
        emp[1] = new Employee("Петров", "Петр ", "Петрович", 2, 350000f);
        emp[2] = new Employee("Сергеев", "Сергей", "Сергеевич", 3, 150000f);
        emp[3] = new Employee("Владимиров", "Владимир", "Владимирович", 4, 450000f);
        emp[4] = new Employee("Юрьев", "Юрий", "Юрьевич", 5, 50000f);


        Employee.showAll(emp);
        Employee.amountExpenses(emp);
        Employee.minSalary(emp);
        Employee.maxSalary(emp);
        Employee.salaryAverage(emp);
        Employee.printFIO(emp);

    }
}