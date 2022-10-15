package lv.tsi.animals;

public class Dog implements Animal, Domestic {
    private String name = "";

    Dog() {
    }

    Dog(String str) {
        name = str;
    }

    @Override
    public void animalSound() {
        System.out.println("Bark");
    }

    @Override
    public void printName() {
        System.out.println("Dog's name is " + name);
    }
}
