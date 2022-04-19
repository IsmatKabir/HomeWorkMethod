package ismat;

public class NonReturnMethod {
// AccessModifier methodName() {}
    // return type : all types of data, void, class type,object
    // method naming : verb+ noun/adjective
    public void dosummation() {
        int num1 = 5;
        int num2 = 6;
        int total = num1 + num2;

        System.out.println("total summation number is: " + total);


    }

    public void doSubtraction() {
        int num1 = 5;
        int num2 = 6;
        int total = num2 - num1;
        System.out.println("total subtraction  number is" + "" + total);

    }

    public void doDivision() {
        int num1 = 100;
        int num2 = 500;
        int total = num2 / num1;
        System.out.println("total division  number  is: "  +" "+ total);


    }

    public void doMultiplication() {
        int num1 = 5;
        int num2 = 6;
        int total = num1 * num2;
        System.out.println("total multiplication is: "+"   "+ total);
    }
    public void getInfo(){
      String firstName= "Ismat" ;
       String lastName="Kabir ";
        String fullName= firstName +""+lastName;
         System.out.println("Student fullName is:" +"  "+ fullName);

    }

    public static void main(String[] args) {
        NonReturnMethod m = new NonReturnMethod();

        m.dosummation();
        m.doSubtraction();
        m.doDivision();
        m.doMultiplication();
        m.getInfo();

    }





}
