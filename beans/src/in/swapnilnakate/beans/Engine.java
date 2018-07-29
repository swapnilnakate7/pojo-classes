package in.swapnilnakate.beans;

public class Engine {
    private Double bhp;
    private String type;
    private String make;
    private String fuelType;

    public Engine(Double bhp, String type, String make, String fuelType) {
        this.bhp = bhp;
        this.type = type;
        this.make = make;
        this.fuelType = fuelType;
    }

    public Double getBhp() {
        return bhp;
    }

    public void setBhp(Double bhp) {
        this.bhp = bhp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "bhp=" + bhp +
                ", type='" + type + '\'' +
                ", make='" + make + '\'' +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}
