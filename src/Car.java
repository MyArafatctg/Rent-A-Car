public class Cars {
    private String model;
    private double rentalRate;
    private boolean available;

    private Cars(String model, double rentalRate){
        this.model = model;
        this.rentalRate = rentalRate;
        this.available = true;
    }

    public String getModel() {
        return model;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

}
