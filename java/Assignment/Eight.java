import java.util.Scanner;

public class Eight {
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("How many items do you want to enter? ");
        int items = myScanner.nextInt();
        int[] productCode = new int[items];
        int[] price = new int[items];
        int[] quantity = new int[items];
        int[] totalCost = new int[items];
        int[] discount = new int[items];
        int[] net = new int[items];
        int amountPayable;

        for(int i = 0;i < items;i++)
        {
            System.out.print("Enter product code: ");
            productCode[i] = myScanner.nextInt();
            System.out.print("Enter price: ");
            price[i] = myScanner.nextInt();
            System.out.print("Enter quantity: ");
            quantity[i] = myScanner.nextInt();
            totalCost[i] = price[i] * quantity[i];
        }

// calculate discount
        for(int i = 0;i < items;i++)
        {
            if(totalCost[i] > 20000) {
                discount[i] = (int) (totalCost[i] * 0.14);
                net[i] = totalCost[i] - discount[i];
            } else if(totalCost[i] > 10000 && totalCost[i] < 20000) {
                discount[i] = (int) (totalCost[i] * 0.10);
                net[i] = totalCost[i] - discount[i];
            } else {
                discount[i] = 0;
                net[i] = totalCost[i];
            }
        }

        System.out.println("Item Code\tPrice\tQuantity\tTotal Cost\tDiscount\tNet");
        for(int i = 0;i < items;i++)
        {
            System.out.println(productCode[i] + "\t\t" + price[i] + "\t" + quantity[i] + "\t\t" + totalCost[i] + "\t\t" + discount[i] + "\t\t" + net[i]);
        }

        // print amount payable
        amountPayable = 0;
        for(int i = 0;i < items;i++)
        {
            amountPayable += net[i];
        }
        System.out.println("The total amount payable is " + amountPayable);
    }
}