package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary > 0 && salary <= 10000) {
            System.out.println(salary - (salary * 15 / 100.0));
        } else if (salary > 10000 && salary <= 20000) {
            System.out.println(salary - (salary * 18 / 100.0));
        } else if (salary > 20000) {
            System.out.println(salary - (salary * 20 / 100.0));
        } else {
            System.out.println("wrong input!");
        }
    }

    public static void main(String[] args) {
        SalaryCalculator calculator = new SalaryCalculator();

        calculator.calculateSalary(5000);
    }
}
