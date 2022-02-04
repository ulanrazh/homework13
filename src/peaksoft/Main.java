package peaksoft;

public class Main {

    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.setName("Dolphin");
        fish.setMass(150);
        fish.setColor("Dark");
        fish.showInfo();
        fish.swim();

        Cat cat = new Cat();
        cat.setName("Barron");
        cat.setColor("Grey");
        cat.setAge((byte) 5);
        cat.showInfo();
        cat.play();

        Dog dog = new Dog();
        dog.setName("Sharik");
        dog.setWeight(15);
        dog.setColor("White");
        dog.setAge((byte) 8);
        dog.showInfo();
        dog.bark();

        Parrot parrot = new Parrot();
        parrot.setName("Kesha");
        parrot.setColor("Purple");
        parrot.setAge((byte) 6);
        parrot.showInfo();
        parrot.talk();
	// write your code here
    }
}
