import java.util.Scanner;

    class supermarket {
        private int productCode;
        private int price;
        private int quantity;
        private int totalCost;
        private int discount;
        private int net;

        public supermarket() {
            productCode = 0;
            price = 0;
            quantity = 0;
            totalCost = 0;
            discount = 0;
            net = 0;
        }

        public supermarket(int productCode, int price, int quantity, int totalCost, int discount, int net) {
            this.productCode = productCode;
            this.price = price;
            this.quantity = quantity;
            this.totalCost = totalCost;
            this.discount = discount;
            this.net = net;
        }

        public void setProductCode(int productCode) {
            this.productCode = productCode;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public void setTotalCost(int totalCost) {
            this.totalCost = totalCost;
        }

        public void setDiscount(int discount) {
            this.discount = discount;
        }

        public void setNet(int net) {
            this.net = net;
        }

        public int getProductCode() {
            return productCode;
        }

        public int getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

        public int getTotalCost() {
            return totalCost;
        }

        public int getDiscount() {
            return discount;
        }

        public int getNet() {
            return net;
        }

        public void calculateTotalCost() {
            totalCost = price * quantity;
        }

        public void calculateDiscount() {
            if(totalCost > 20000) {
                discount = (int) (totalCost * 0.14);
                net = totalCost - discount;
            } else if(totalCost > 10000 && totalCost < 20000) {
                discount = (int) (totalCost * 0.10);
                net = totalCost - discount;
            } else {
                discount = 0;
                net = totalCost;
            }
        }

        public void printTable() {
            System.out.println(productCode + "\t\t" + price + "\t" + quantity + "\t\t" + totalCost + "\t\t" + discount + "\t\t" + net);
        }

        public static void main(String[] args)
        {
            Scanner myScanner = new Scanner(System.in);

            System.out.print("How many items do you want to enter? ");
            int items = myScanner.nextInt();
            supermarket[] supermarket = new supermarket[items];

            for(int i = 0;i < items;i++)
            {
                supermarket[i] = new supermarket();
                System.out.print("Enter product code: ");
                supermarket[i].setProductCode(myScanner.nextInt());
                System.out.print("Enter price: ");
                supermarket[i].setPrice(myScanner.nextInt());
                System.out.print("Enter quantity: ");
                supermarket[i].setQuantity(myScanner.nextInt());
                supermarket[i].calculateTotalCost();
                supermarket[i].calculateDiscount();
            }

            System.out.println("Item Code\tPrice\tQuantity\tTotal Cost\tDiscount\tNet");
            for(int i = 0;i < items;i++)
            {
                supermarket[i].printTable();
            }

            // print amount payable
            int amountPayable = 0;
            for(int i = 0;i < items;i++)
            {
                amountPayable += supermarket[i].getNet();
            }
            System.out.println("The total amount payable is " + amountPayable);
        }
}