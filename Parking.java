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

public class ParkingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Car[] parking = new Car[5]; // 5 parking slots

        while (true) {

            System.out.println("\n1. Park Car");
            System.out.println("2. Remove Car");
            System.out.println("3. Show Cars");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Car ID: ");
                    int id = sc.nextInt();

                    boolean parked = false;

                    for (int i = 0; i < parking.length; i++) {
                        if (parking[i] == null) {
                            parking[i] = new Car(id);
                            System.out.println("Car parked at slot " + (i + 1));
                            parked = true;
                            break;
                        }
                    }

                    if (!parked) {
                        System.out.println("Parking Full!");
                    }
                    break;

                case 2:
                    System.out.print("Enter Car ID to remove: ");
                    int removeId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < parking.length; i++) {
                        if (parking[i] != null && parking[i].id == removeId) {
                            parking[i] = null;
                            found = true;
                            System.out.println("Car Removed");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Car Not Found");
                    }
                    break;

                case 3:
                    System.out.println("\nParked Cars:");

                    boolean empty = true;

                    for (int i = 0; i < parking.length; i++) {
                        if (parking[i] != null) {
                            System.out.print("Slot " + (i + 1) + " -> ");
                            parking[i].display();
                            empty = false;
                        }
                    }

                    if (empty) {
                        System.out.println("Parking Empty");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
