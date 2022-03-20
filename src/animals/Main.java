package animals;

public class Main {
    public static void main(String[] args) {
        Cat catBarsik = new Cat("Барсик");
        catBarsik.run(200);
        catBarsik.swim(10);

        Dog dogMax = new Dog("Макс");
        dogMax.run(50);
        dogMax.swim(11);

        Dog dogMax1 = new Dog("Макс1");
        dogMax1.run(500);
        dogMax1.swim(10);

        Cat.getCountOfCreatedCats();
        Dog.getCountOfCreatedDogs();

        Dog dogMax2 = new Dog("Макс2");
        dogMax2.run(501);
        dogMax2.swim(11);

        Cat.getCountOfCreatedCats();
        Dog.getCountOfCreatedDogs();
    }
}