package peaksoft;

public class Parrot {
    private String name;
    private String color;
    private byte age;

    public void showInfo() {
        System.out.printf("Parrot info: \n" + "Parrot name: %s \n" + "Parrot color: %s \n" + "Parrot age: %d \n", name, color, age);
    }
    public void talk () {
        System.out.println("Parrot " + name + " can talk \n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }
}
