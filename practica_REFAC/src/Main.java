import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String p = "Proves";

        int opcio;

        do {
            /*
            REFACT 1: METODE DE REDUCCIÓ DE CODI
            System.out.println("1. ");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("5. ");
            System.out.println("0. Acabar");
             */
            Menu();
            opcio = scan.nextInt();
            scan.nextLine();
            switch (opcio) {
                case 1:
                    System.out.println("intro: ");
                    int num1 = scan.nextInt();
                    System.out.println("intro: ");
                    int num2 = scan.nextInt();
                    // REFACT 9 : EXTRACCIO DE VARIABLE EN IF
                                        /*
                    if (max(num1, num2)) {
                        System.out.println("aaa");
                    } else System.out.println("bbb");
                    break;

                     */
                    final boolean max_number = max(num1, num2);
                    if (max_number) {
                        System.out.println("aaa");
                    } else System.out.println("bbb");

                case 2:
                    double a = 2;
                    double b = 3;
                    double c = 1;
                    calcEquacioSegongrau(a, b, c);
                    break;
                case 3:
                    List<OrderLineItem> lineItems = null;
                    Order asd = new Order(lineItems, 5.5);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("ATENCIÓ!!! \nHa de ser un valor entre 0 i 5");
            }
        } while (opcio != 0);
    }

    //REFACT 1
    public static void Menu() {
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");
        System.out.println("0. Acabar");
    }

    public static boolean max(int a, int b) {
        if (a > b) {
            return true;
        }
        /*
        else if (a == b) {

            return false;
        }
        else {
            return false;
        }

         */
        //REFACT 2: Metode Inline Code : En el cas de que el valor d'a sigui més que b retornarà true, si no false
        else {
            return false;
        }
    }

    public static void calcEquacioSegongrau(double a, double b, double c) {
        /*
        double D = b * b - 4 * a * c;
        */
        // REFACT 11: Canvi en el nom de la variable
        double arrelCalculada = b * b - 4 * a * c;
        if (arrelCalculada > 0) {
            double resultat1, resultat2;
            resultat1 = (-b - Math.sqrt(arrelCalculada)) / (2 * a);
            resultat2 = (-b + Math.sqrt(arrelCalculada)) / (2 * a);
            System.out.println("x1 = " + resultat1 + ", x2 = " + resultat2);
        } else if (arrelCalculada == 0) {
            //refactor 6: Metode variable temporal
            double x = -b / (2 * a);
            //  x = -b / (2 * a);
            System.out.println("x = " + x);
        } else {
            System.out.println("Equation has no roots");
        }
    }

   // REFACT 8: Extraccio de metode de classe Human
  /* public static class Human {

        private String name;
        private String age;
        private String country;
        private String city;
        private String street;
        private String house;
        private String quarter;

        public String obtenirAdrecaCompleta() {
            StringBuilder result = new StringBuilder();
            // REFACT 4: Extraccio de metode
            return.append(country)
                    .append(", ")
                    .append(city)
                    .append(", ")
                    .append(street)
                    .append(", ")
                    .append(house)
                    .append(" ")
                    .append(quarter).toString();


       }
    }

   */

// REFACT 3: Extraccio de metode de classe Order
    /*
    public static class Order {
        private List<OrderLineItem> lineItems;
        private double taxRate;

        public Order(List<OrderLineItem> lineItems, double taxRate) {
            this.lineItems = lineItems;
            this.taxRate = taxRate;
        }

        public double calculateTotalPrice() {
            double subtotal = 0.0;
            for (OrderLineItem item : lineItems) {
                subtotal += item.getPrice();
            }
            double tax = subtotal * taxRate;
            return subtotal + tax;
        }
    }

     */
/*
// REFACT 10: Extraccio de metode de classe OrderLineItem
    public class OrderLineItem {
        private String productName;
        private int quantity;
        private double price;

        public OrderLineItem(String productName, int quantity, double price) {
            this.productName = productName;
            this.quantity = quantity;
            this.price = price;
        }

        public double getPrice() {
            return price * quantity;
        }
    }

 */

    //REFACT 7: Extraccio de metode de classe Customer
/*
    public class Customer {
        private String firstName;
        private String lastName;

        public Customer(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFullName() {
            return firstName + " " + lastName;
        }
    }

 */
}