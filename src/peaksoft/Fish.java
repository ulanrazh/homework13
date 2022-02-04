package peaksoft;

public class Fish {
    private String name;
    private int mass;
    private String color;

    public void showInfo() {
        System.out.printf("Fish info: \n" +
                "Fish name: %s \n" + "Fish mass: %d \n" + "Fish color: %s \n", name, mass, color);
        }
    public void swim() {
        System.out.println("Fish " + name + " can swim in ocean \n");
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
