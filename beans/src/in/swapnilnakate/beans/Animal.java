package in.swapnilnakate.beans;

public class Animal {
    private String type;
    private Boolean canFly;
    private Boolean canRun;
    private Boolean canWalk;
    private String name;

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getCanFly() {
        return canFly;
    }

    public void setCanFly(Boolean canFly) {
        this.canFly = canFly;
    }

    public Boolean getCanRun() {
        return canRun;
    }

    public void setCanRun(Boolean canRun) {
        this.canRun = canRun;
    }

    public Boolean getCanWalk() {
        return canWalk;
    }

    public void setCanWalk(Boolean canWalk) {
        this.canWalk = canWalk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", canFly=" + canFly +
                ", canRun=" + canRun +
                ", canWalk=" + canWalk +
                ", name='" + name + '\'' +
                '}';
    }
}
