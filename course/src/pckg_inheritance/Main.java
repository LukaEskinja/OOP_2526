package pckg_inheritance;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Big","lion",30);
        doAnimalStuff(animal,"slow");

        Dog dog = new Dog("doggy",50,"pyramid","Straight");
        doAnimalStuff(dog,"fast");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");

    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_______");

    }
}

