package camerarental;

import java.util.List;
import java.util.Scanner;

public class MyCamerasMenu {
    private List<Camera> cameraList;

    public MyCamerasMenu(List<Camera> cameraList) {
        this.cameraList = cameraList;
    }

    public void handleMyCamerasMenu(Scanner scanner) {
        int choice;

        do {
            System.out.println("\nMY CAMERAS MENU:");
            System.out.println("1. Add Camera");
            System.out.println("2. Remove Camera");
            System.out.println("3. View My Cameras");
            System.out.println("4. Go to Previous Menu");

            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            switch (choice) {
                case 1:
                    addCamera(scanner);
                    break;
                case 2:
                    removeCamera(scanner);
                    break;
                case 3:
                    viewMyCameras();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    private void addCamera(Scanner scanner) {
        System.out.print("\nEnter the camera brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter the camera model: ");
        String model = scanner.nextLine();
        System.out.print("Enter the per day price (INR): ");
        double rentalAmount = scanner.nextDouble();
        scanner.nextLine(); // consume newline character

        Camera camera = new Camera(brand, model, rentalAmount);
        cameraList.add(camera);

        System.out.println("Your camera has been successfully added to the list.");
    }

    private void removeCamera(Scanner scanner) {
        System.out.println("\nMY CAMERAS:");
        viewMyCameras();

        System.out.print("Enter the camera ID to remove: ");
        int cameraId = scanner.nextInt();
        scanner.nextLine(); // consume newline character

        boolean cameraRemoved = false;
        for (Camera camera : cameraList) {
            if (camera.getId() == cameraId) {
                cameraList.remove(camera);
                cameraRemoved = true;
                break;
            }
        }

        if (cameraRemoved) {
            System.out.println("Camera successfully removed from the list.");
        } else {
            System.out.println("Invalid camera ID.");
        }
    }

    private void viewMyCameras() {
        System.out.println("\nMY CAMERAS:");
        System.out.println("==================================================================");
        System.out.println("CAMERA ID    BRAND         MODEL          PRICE (PER DAY)      STATUS");
        System.out.println("==================================================================");
        for (Camera camera : cameraList) {
            System.out.printf("%-13d%-14s%-16s%-22.2f%s\n",
                    camera.getId(), camera.getBrand(), camera.getModel(), camera.getRentalAmount(),
                    camera.isRented() ? "Rented" : "Available");
        }
        System.out.println("==================================================================");
    }
}

