package ismat;

public class ReturnMethodWithParameter {

    public int doMultiplication(int num1, int num2) {

        int total = num1 * num2;
        System.out.println("total" + total);
        return total;

    }

    public int doDivision(int num1, int num2) {
        int total2 = num2 / num1;
        System.out.println("total number is: " + total2);

        return total2;
    }
// signature pattern can't be use twice or if the method name same then pattern has to be different
//public int doMultiplication(int a,int b ,int c    ){
//    int a=a;
//    int b=b;
//     int c=c;
//     int total= a*b*c;
//    System.out.println("total multiplicaton is: " +total  );
//return total;
//}

    public double getWeeklySalary(double perHourSalary, double workingHour) {


        double weeklySalary = perHourSalary * workingHour;
        System.out.println("weekly  salary is: " + weeklySalary);
        return weeklySalary;
    }

    public String getInfo(String name, int age) {
        System.out.println("name is: " + name + "and age is: " + age);
        String nameAndAge = name + age;
        return nameAndAge;
    }
    public String getStudentinfo( String name){
        System.out.println("student name is "  +name);
        return name;

    }
    public int getSummation(double num1,double num2){
        double total=num1+num2;
        System.out.println(   "summation number   "     + total);
         return (int) total;
    }
    public char getDressSize(char size){
        System.out.println("dress size is "    +size);
        return size;
    }
    public boolean isBergerAvailable( boolean berger){
        System.out.println("berger is available"  +true);
        return  true;
    }


    public int getAddition(int num1,int num2){
       int totalAddNumber=num1+num2;
        return totalAddNumber;
    }


    public  double getSummation(int num1,int num2,double num3){
        double total=num1+num2+num3;
        System.out.println("total number is  " +total );
        return total;
    }
    public  double getSummation1(int num1,int num2) {
        double total = num1 + num2;
        return total;
    }


    public static void main(String[] args) {
        ReturnMethodWithParameter ReturnMethodWithParameter = new ReturnMethodWithParameter();

        ReturnMethodWithParameter.doMultiplication(5, 6);
        ReturnMethodWithParameter.doDivision(5, 15);
        ReturnMethodWithParameter.getWeeklySalary(50, 40);
        ReturnMethodWithParameter.getInfo("ismat", 34);
        ReturnMethodWithParameter.getStudentinfo("tania");
        ReturnMethodWithParameter.getStudentinfo("irin");
        ReturnMethodWithParameter.getStudentinfo("tazwar");
        ReturnMethodWithParameter.getStudentinfo("tahmina");
        ReturnMethodWithParameter.getStudentinfo("husna");
        ReturnMethodWithParameter.getSummation(30.00,20.15);
        ReturnMethodWithParameter.getDressSize('M');
        ReturnMethodWithParameter.isBergerAvailable(true);
        ReturnMethodWithParameter.getSummation(5,6,25.50) ;
        System.out.println( "addition number is "  +  ReturnMethodWithParameter.getAddition(30,40));
        // one time code lifetime unlimited  argument passing  wow dynamic
        double num5=400;
        double num6=num5+ ReturnMethodWithParameter.getSummation1(20,20) ;
        System.out.println( " num 6 number is "      +num6);

    }


}
