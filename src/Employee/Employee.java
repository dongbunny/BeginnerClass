package Employee;

public class Employee {

    String name;
    int age;
    double salary;
    //Employee的构造器
    public Employee(String name) {
        this.name = name;
    }
    public void empAge(int empAge) {
        age = empAge;
    }
    public void empSalary(double empSalary) {
        salary = empSalary;
    }

    public void printEmployee() {

        System.out.println("名前 ：" + name);
        System.out.println("年齢 ：" + age);
        System.out.println("SALARY ：" + salary);
    }



}
