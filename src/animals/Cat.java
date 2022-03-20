package animals;

public class Cat extends Animal {

    private static int countOfCats = 0;

    public Cat(String name) {
        super.setName(name);
        super.setMaxRunDistance(200);
        countOfCats++;
    }

    @Override
    public void swim(double obstacleDistance) {
        System.out.println(getName() + " не умеет плавать");
    }

    public static void getCountOfCreatedCats(){
        System.out.println("Мы создали " + countOfCats + " котов");
    }
}