package camerarental;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CameraRentalApp {
    private List<Camera> cameraList = new ArrayList<>();
    private double walletAmount = 0.0;
    private String username = "admin";
    private String password = "admin123";

    public void displayWelcomeScreen() {
        System.out.println("======WELCOME TO CAMERA RENTAL APP==========\n");
    }

    public void login() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("PLEASE LOGIN TO CONTINUE...");
        System.out.print("USERNAME :");
        String enteredUsername = scanner.nextLine();
        System.out.print("PASSWORD :");
        String enteredPassword = scanner.nextLine();

        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            System.out.println("\nLogin successful!");
            showMainMenu(scanner);
        } else {
            System.out.println("Invalid username or password. Exiting the application.");
        }
    }

    public void showMainMenu(Scanner scanner) {
        int choice;

        do {
            System.out.println("\nMAIN MENU:");
            System.out.println("1. My Cameras");
            System.out.println("2. Rent a Camera");
            System.out.println("3. View All Cameras");
            System.out.println("4. My Wallet");
            System.out.println("5. Exit");

            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            switch (choice) {
                case 1:
                    MyCamerasMenu myCamerasMenu = new MyCamerasMenu(cameraList);
                    myCamerasMenu.handleMyCamerasMenu(scanner);
                    break;
                case 2:
                    rentCamera(scanner);
                    break;
                case 3:
                    listCameras();
                    break;
                case 4:
                    handleWalletMenu(scanner);
                    break;
                case 5:
                    System.out.println("Thank you for using the Camera Rental App. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    public void rentCamera(Scanner scanner) {
        if (cameraList.isEmpty()) {
            System.out.println("No cameras available for rent at the moment.");
            return;
        }

        System.out.println("\nAVAILABLE CAMERAS:");
        listCameras();

        System.out.print("\nEnter the camera ID you want to rent: ");
        int cameraId = scanner.nextInt();
        scanner.nextLine(); // consume newline character

        boolean cameraFound = false;
        for (Camera camera : cameraList) {
            if (camera.getId() == cameraId) {
                if (camera.isRented()) {
                    System.out.println("Camera is already rented.");
                } else {
                    double rentalAmount = camera.getRentalAmount();
                    if (rentalAmount <= walletAmount) {
                        walletAmount -= rentalAmount;
                        camera.setRented(true);
                        System.out.println("Your transaction for camera " + camera.getBrand() + " " +
                                camera.getModel() + " with rent INR " + rentalAmount + " has been successfully completed.");
                    } else {
                        System.out.println("Insufficient balance in your wallet.");
                    }
                }
                cameraFound = true;
                break;
            }
        }

        if (!cameraFound) {
            System.out.println("Invalid camera ID.");
        }
    }

    public void handleWalletMenu(Scanner scanner) {
        System.out.println("\nMY WALLET:");
        System.out.println("Your current wallet balance is INR " + walletAmount);

        System.out.print("\nDo you want to deposit more amount to your wallet? (1. Yes, 2. No): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline character

        switch (choice) {
            case 1:
                System.out.print("Enter the amount (INR): ");
                double depositAmount = scanner.nextDouble();
                scanner.nextLine(); // consume newline character
                walletAmount += depositAmount;
                System.out.println("Your wallet balance has been updated successfully. Current wallet balance: INR " + walletAmount);
                break;
            case 2:
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    public void listCameras() {
        if (cameraList.isEmpty()) {
            System.out.println("No cameras available for rent at the moment.");
        } else {
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
}

