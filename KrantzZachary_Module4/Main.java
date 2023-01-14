public class Main {
    public static void main(String[] args) {
        Food food = new Food();
        Thread anim1 = new Thread (new Animal("Hare",9, 220, food, 200));
        Thread anim2 = new Thread (new Animal("Tortoise",5, 165, food, 125));
        anim1.start();
        anim2.start();
    }
}