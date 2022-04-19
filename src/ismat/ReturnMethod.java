package ismat;

public class ReturnMethod {

    public int doSummation() {

        int num1 = 50;
        int num2 = 40;
        int total = num1 + num2;
        System.out.println("total " + total);
        return total;

    }

    public int doSubtraction() {

        int num1 = 100;
        int num2 = 20;
        int total = num1 - num2;
        System.out.println("total " + total);
        return total;

    }

    public int doDivision() {


        int num1 = 500;
        int num2 = 10;
        int total = num1 / num2;
        System.out.println("total number  is: " + total);
        return total;
    }

    public static void main(String[] args) {

        ReturnMethod m = new ReturnMethod();

        m.doSummation();
        m.doSubtraction();
        m.doDivision();
        m.doMultiplication();
        m.getMonthlySalary();
        m.isPizzaavailable();
        m.sizeOfDress();
    }

    public int doMultiplication() {
        int num1 = 300;
        int num2 = 500;
        int total = num1 * num2;
        System.out.println("total number is :" + "" + total);
        return total;
    }

    public double getMonthlySalary() {
        double salary = 23;
        double workingHours = 40;
        System.out.println("salary is: " + salary + "and working hours: " + workingHours);
        double monthlySalary = salary * workingHours;
        return monthlySalary;
    }

    public boolean isPizzaavailable(){
    boolean isAvailable=true;
        System.out.println( "pizza availability  "   +isAvailable);
        return  isAvailable;
    }
public char sizeOfDress(){
    char size='M';
    System.out.println(" dress size is "    +size);
    return size;
}


}
