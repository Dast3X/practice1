package lv.tsi.animals;

public class Fox implements Animal, Wild {
    private String name = "";

    Fox() {
    }
    Fox(String str) {
        name = str;
    }

    @Override
    public void animalSound() {
        System.out.println("Wa-pow");
    }
    @Override
    public void printName()
    {
        System.out.println("Fox's name is " + name);
    }

    @Override
    public void eat() {
        System.out.println("*Eating*");
    }
}
