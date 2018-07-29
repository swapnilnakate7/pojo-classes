package in.swapnilnakate.beans;

public class Vehicle {
    private Integer numberOfWheels;
    private String name;
    private String type;
    private String color;
    private String make;

    public Vehicle(Integer numberOfWheels, String name, String make) {
        this.numberOfWheels = numberOfWheels;
        this.name = name;
        this.make = make;
    }

    public Integer getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(Integer numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "numberOfWheels=" + numberOfWheels +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", make='" + make + '\'' +
                '}';
    }
}
