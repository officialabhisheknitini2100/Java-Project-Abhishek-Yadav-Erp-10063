import java.util.Scanner;

class Car {
    int id;


    Car(int id) {
        this.id = id;
    }
}

public class Parking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Car c = null;

        while (true) {
            System.out.println("\n1. Park Car");
            System.out.println("2. Remove Car");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            if (choice == 1) {
                if (c == null) {
                    System.out.print("Enter Car ID: ");
                    int id = sc.nextInt();
                    c = new Car(id);
                    System.out.println("Car parked");
                } else {
                    System.out.println("Parking already occupied!");
                }
            }

            else if (choice == 2) {
                if (c != null) {
                    System.out.println("Car " + c.id + " removed");
                    c = null;
                } else {
                    System.out.println("No car to remove!");
                }
            }

            else if (choice == 3) {
                break;
            }

            else {
                System.out.println("Invalid choice!");
            }
        }
    }
}