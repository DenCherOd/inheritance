package animals;

public class Animal {
    private String name;
    private int maxRunDistance;
    private int maxSwimDistance;

    public void setMaxRunDistance(int maxRunDistance) {
        this.maxRunDistance = maxRunDistance;
    }

    public void setMaxSwimDistance(int maxSwimDistance) {
        this.maxSwimDistance = maxSwimDistance;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void run(double obstacleDistance){
        if (obstacleDistance <= maxRunDistance) {
            System.out.println(getName() + " пробежал " + obstacleDistance + " м.");
        } else System.out.println(getName() + " может пробежать до " + maxRunDistance + " м.");
    }

    protected void swim(double obstacleDistance){
        if (obstacleDistance <= maxSwimDistance) {
            System.out.println(getName() + " проплыл " + obstacleDistance + " м.");
        } else System.out.println(getName() + " может проплыть до " + maxSwimDistance + " м.");
    }
}