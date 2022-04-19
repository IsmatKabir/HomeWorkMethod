package ismat;

import java.util.Scanner;

public class WorkshopInScanner {


    public static void main(String[] args) {
        Scanner   scan=new Scanner(System.in) ;
        System.out.println(" calculator workshop");
        int num1= scan.nextInt();
        System.out.println( "enter another number");
        int num2= scan.nextInt();


        int summation=num1+num2;
        System.out.println("summation is: "+summation);

        int num3= scan.nextInt();
        System.out.println( "enter another number");
        int num4= scan.nextInt();


        int subtraction=num3-num4;
        System.out.println("subtraction is: "     + subtraction );

        int num5=scan.nextInt();
        System.out.println("enter another number");
        int num6=scan.nextInt();
        int multiplication=num6*num5;
        System.out.println("multiplication number is "  +""+  multiplication   );
        int num7=scan.nextInt();
        System.out.println("enter another number");
        int num8= scan.nextInt() ;
        int division=num7/num8;
        System.out.println(" division number is:" +"  "+    division  );



        scan.close();

    }




}
