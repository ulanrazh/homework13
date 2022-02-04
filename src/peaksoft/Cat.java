package peaksoft;

public class Cat {
    private String name;
    private String color;
    private byte age;

    public void showInfo() {
        System.out.printf("Cat info: \n" + "Cat name: %s \n" + "Cat color: %s \n" + "Cat age: %d \n", name, color, age);
    }
    public void play() {
        System.out.println("Cat " + name + " play game \n");
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
