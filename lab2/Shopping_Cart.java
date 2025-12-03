package lab2 ;

import java.util.Scanner ;

public class Shopping_Cart {

    public static class Product {
        private String name ;
        private double price ;

        public Product(String name, double price)  {
            this.name = name ;
            this.price = price ;
        }

        public double getPrice() {
            return this.price ;
        }

        public String getName() {
            return this.name ;
        }
    }

    public static class ShoppingCart  {
        private Product[] items = new Product[10] ;
        private int itemCount = 0 ;

        public void addProduct(Product p) {
            if (itemCount >= items.length) {
                System.out.println("The cart is full (maximum 10 items). No more items can be added") ;
                return;
            }
            items[itemCount] = p ;
            itemCount++ ;
        }

        public double calculateTotalPrice() {
            double sum = 0.0 ;
            for (int i = 0; i < itemCount; i++) {
                sum += items[i].getPrice() ;
            }
            return sum ;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter Product Number(Max10): ") ;
        int productCount = input.nextInt() ;

        if (productCount > 10) {
            System.out.println("If the number of products is more than 10, only the first 10 items will be counted") ;
            productCount = 10 ;
        }

        if (productCount < 0) {
            System.out.println("The quantity of products is incorrect") ;
            input.close() ;
            return ;
        }

        ShoppingCart cart = new ShoppingCart() ;

        for (int i = 0; i < productCount; i++) {
            input.nextLine();

            System.out.print("Enter Product Name: ") ;
            String pname = input.nextLine() ;

            System.out.print("Enter Product Price: ") ;
            double price = input.nextDouble() ;
            if (price < 0) {
                System.out.println("The price of the product should not be negative, it will be considered 0.0") ;
                price = 0.0 ;
            }

            Product products = new Product(pname, price) ;
            cart.addProduct(products) ;
        }

        double total = cart.calculateTotalPrice() ;
        System.out.println("Total price: " + total) ;
        
        input.close() ;
    }
}
