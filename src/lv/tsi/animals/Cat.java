package lv.tsi.animals;

public class Cat implements Animal, Domestic {
    private String name = "";

    Cat() {
    }
    Cat(String str) {
        name = str;
    }

    @Override
    public void animalSound() {
        System.out.println("Meow");
    }

    @Override
    public void printName() {
        System.out.println("Cat's name is " + name);
    }
}
