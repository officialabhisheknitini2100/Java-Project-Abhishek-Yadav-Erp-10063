import java.util.Scanner;

abstract class Vehicle {
    int id;

    Vehicle(int id) {
        this.id = id;
    }

    abstract void display();
}

class Car extends Vehicle {

    Car(int id) {
        super(id);
    }

    void display() {
        System.out.println("Car ID: " + id);
    }
}

public class ParkingSystem1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Vehicle[] parking = new Vehicle[3];

        while (true) {

            System.out.println("\n1. Park Car");
            System.out.println("2. Remove Car");
            System.out.println("3. Show Cars");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter Car ID: ");
                int id = sc.nextInt();

                for (int i = 0; i < 3; i++) {
                    if (parking[i] == null) {
                        parking[i] = new Car(id);
                        System.out.println("Car Parked");
                        break;
                    }
                }

            } else if (choice == 2) {

                System.out.print("Enter Car ID: ");
                int id = sc.nextInt();

                for (int i = 0; i < 3; i++) {
                    if (parking[i] != null && parking[i].id == id) {
                        parking[i] = null;
                        System.out.println("Car Removed");
                        break;
                    }
                }

            } else if (choice == 3) {

                for (int i = 0; i < 3; i++) {
                    if (parking[i] != null) {
                        parking[i].display();
                    }
                }

            } else if (choice == 4) {

                break;

            } else {

                System.out.println("Invalid Choice");
            }
        }
    }
}
