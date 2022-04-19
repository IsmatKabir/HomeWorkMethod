package ismat;

public class Pizza {


    public char arePizzaAvailable(String name,char size,double price){
        String pizzaName=name;
        char pizzaSize=size;
        double pizzaPrice=price;
        if (pizzaSize=='L'){
            System.out.println("L size "+pizzaName+" pizza is available");
        } else if (pizzaSize=='M') {
            System.out.println("M size "+pizzaName+" pizaa is available");

        } else {
            System.out.println("We don't sell small go to papa john's 'haha' ");
        }return pizzaSize;
    }

    public static void main(String[] args) {
        Pizza piz = new Pizza();
        piz.arePizzaAvailable("Cheesy", 'S', 18);
    }















}
