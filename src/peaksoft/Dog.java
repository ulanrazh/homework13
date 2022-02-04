package peaksoft;

public class Dog {
    private String name;
    private String color;
    private double weight;
    private int age;

    public void showInfo() {
        System.out.printf("Dog info: \n" + "Dog name: %s \n" + "Dog color: %s \n" +
                "Dog weight: %f \n" + "Dog age: %d \n", name, color, weight, age);
    }
    public void bark() {
        System.out.println("Dog " + name +" can bark \n");
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
