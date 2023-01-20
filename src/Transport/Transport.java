package Transport;

public class Transport {

    private String brand;
    private String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {

        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.setColour(color);
        this.setMaxSpeed(maxSpeed);
    }

    public void setColour(String colour) {
        this.color = (colour == null || colour.isBlank()) ? "Белый" : colour;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = (maxSpeed <= 0) ? 10 : maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String toString() {
        return '\n' + brand + " " + model + '\n' + "\t цвет - " + color + ".\n" + "\t год выпуска - " + productionYear
                + " г.\n" + "\t страна сборки - " + productionCountry + ".";

    }
}
