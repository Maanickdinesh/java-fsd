package camerarental;

public class Camera {
    private static int nextId = 1;

    private int id;
    private String brand;
    private String model;
    private double rentalAmount;
    private boolean rented;

    public Camera(String brand, String model, double rentalAmount) {
        this.id = nextId++;
        this.brand = brand;
        this.model = model;
        this.rentalAmount = rentalAmount;
        this.rented = false;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getRentalAmount() {
        return rentalAmount;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }
}
