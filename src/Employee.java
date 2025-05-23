import java.util.Objects;
public class Employee {
    private  String name;
    private  String surname;// фамилия
    private  String lastname;// отчество
    private int departament;
    private float salary;
    private int id;
    // Конструктор
    public Employee(String surname, String name, String lastname, int departament, float salary) {
        this.surname = surname;
        this.name = name;
        this.lastname = lastname;
        this.departament = departament;
        this.salary = salary;
        counter++;
        id = counter;
    }
    // Счетчик
    public static int counter;

    public String toString() {
        return " ID: " + id + " фамилия: " + surname + ", имя: " + name + ", отчество: " + lastname + ", отдел: " + departament + ", зарплата: " + salary;
    }
    // Getters
    public String getSurname(){
        return surname;
    }
    public String getName(){
        return name;
    }
    public String getLastname(){
        return lastname;
    }

    public int getDepartament() {
        return departament;
    }
    public float getSalary() {
        return salary;
    }
    public int getId() {
        return id;
    }
    // Setters
    public void setDepartament(int departament) {
        this.departament = departament;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    // Переопределение hashCode
    public int hashCode() {
        return Objects.hash(id);
    }
    // Переопределение equals
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee that = (Employee) obj;
        return Objects.equals(id, that.id);

    }
    public static void showAll(Employee[] employees){
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
            else {
                break;
            }
        }
    }
    public static void amountExpenses (Employee[] emp) {
        double sumAll = 0;
        for (int i = 0; i < emp.length ;i++) {
            if (emp[i] != null){
                sumAll = sumAll + emp[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + sumAll );
    }
    public static void minSalary(Employee[] emp){
        double min = emp[0].getSalary();
        for (int i = 0; i < emp.length; i++) {
            if (emp[i] != null) {
                min = Math.min(min, emp[i].getSalary());
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + min);
    }
    public static void maxSalary(Employee[] emp){
        double max = 0;
        for (int i = 0; i < emp.length; i++) {
            if (emp[i] != null) {
                max = Math.max(max, emp[i].getSalary());
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + max);
    }
    public static void salaryAverage(Employee[] emp){
        double salaryAverage = 0;
        double sumAll = 0;
        int counter = 0;
        for (int i = 0; i < emp.length ;i++) {
            if (emp[i] != null){
                sumAll = sumAll + emp[i].getSalary();
                counter++;
            }
        }
        salaryAverage = sumAll/counter;
        System.out.println("Среднее значение зарплат: " + salaryAverage);
    }
    public static void printFIO(Employee[] emp) {
        System.out.println("Печать ФИО всех сотрудников: ");
        for (int i = 0; i < emp.length; i++) {
            if (emp[i] != null) {
                System.out.println(emp[i].getSurname().toString() + " " + emp[i].getName().toString() + " " + emp[i].getLastname().toString());
            }
        }
    }
}
