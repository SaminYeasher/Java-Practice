class Employee{
    int salary = 60000;
}
class Engineer extends Employee {
    int benefits;
}
public class Eng {
    public static void main(String[] args) {
    Employee em = new Employee();
    em.salary= 50000;
    Engineer E1 = new Engineer();
    System.out.println("Salary :" + E1.salary+ "\nSalary :" + em.salary + "\nBenefits :" + E1.benefits);
    }
}