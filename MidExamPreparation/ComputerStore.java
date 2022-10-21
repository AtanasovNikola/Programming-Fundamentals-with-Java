package MidExamPreparation;
import java.util.Scanner;

import static java.lang.System.in;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String pricesWithoutVAT = scanner.nextLine();
        double sum =0;
        while (!pricesWithoutVAT.equals("special")){
            if (pricesWithoutVAT.equals("regular")){
                break;
            }
            double priceWithoutVAT = Double.parseDouble(pricesWithoutVAT);
            if (priceWithoutVAT>0){
                sum+=priceWithoutVAT;
            }else {
                System.out.println("Invalid price!");
            }
            pricesWithoutVAT= scanner.nextLine();
        }
        double taxes = sum * 0.2;
        double totalPrice= sum+taxes;
        if (sum>0){
            if (pricesWithoutVAT.equals("special")){
                totalPrice-=totalPrice*0.1;
            }
            System.out.printf("Congratulations you've just bought a new computer!\n" +
                    "Price without taxes: %.2f$\n" +
                    "Taxes: %.2f$\n" +
                    "-----------\n" +
                    "Total price: %.2f$\n",sum,taxes,totalPrice);
        }else{
            System.out.println("Invalid order!");
        }
    }
}
