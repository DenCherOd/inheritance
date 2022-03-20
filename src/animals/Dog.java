package animals;

public class Dog extends Animal {

    private static int countOfDogs = 0;

    public Dog(String name) {
        super.setName(name);
        super.setMaxRunDistance(500);
        super.setMaxSwimDistance(10);
        countOfDogs++;
    }

    public static void getCountOfCreatedDogs(){
        System.out.println("Мы создали " + countOfDogs + " собак");
    }
}