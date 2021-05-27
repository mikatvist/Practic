package Constructor;

public class payChek3 {
    public static void main(String[] args) {
        SalaryCalculator3 sal = new SalaryCalculator3(30,40,0.09,0.24);

        System.out.println(sal.salary());
        System.out.println(sal.salaryAftertax());
        System.out.println("total tax: "+ (sal.salary()-sal.salaryAftertax()));
        System.out.println(sal);

    }
}
