package ismat;

public class NonReturnMethodWithParameter {

    public void doSummation(int num1, int num2) {


        int total = num1 + num2;
        System.out.println("Total   " + total);
    }


    public void doSubtraction(int num1, int num2) {

        int total = num2 - num1;

        System.out.println("total  " + total);
    }


    public void doDivision(int num1, int num2) {
        int total = num2 / num1;
        System.out.println("total is: " + total);
    }

    public void doMultiplication(int num1, int num2) {

        int total = num1 * num2;
        System.out.println("total  multiplication  number is: " + "" + total);

    }
    public void  getImployeeId(String nane, int stid){
      String name= "Ismat " ;
       int id  =1003;
        System.out.println("student name is: "   +name +"and student id is: "  +stid);

    }



    public static void main(String[] args) {

        NonReturnMethodWithParameter p = new NonReturnMethodWithParameter();

        p.doSummation(80, 4);
        p.doSubtraction(40, 60);
        p.doDivision(5, 30);
        p.doMultiplication(50, 50);
        p.getImployeeId("Ismat",1003);


    }


}
