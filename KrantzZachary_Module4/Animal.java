public class Animal implements Runnable {
    private String a_name;
    private int a_position = 0;
    private int a_speed;
    private int a_restMax;
    private Food a_food;
    private int a_eatTime;
    static boolean a_winner = false;

    public Animal(String name, int speed, int restMax, Food food, int eatTime) {
        a_name = name;
        a_speed = speed;
        a_restMax = restMax;
        a_food = food;
        a_eatTime = eatTime;
    }

    public void run() {
        while (a_position <= 120 && !a_winner) {
            try {
                Thread.sleep((long) (Math.random() * a_restMax));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a_food.eat(a_eatTime,a_name);
            a_position += a_speed;
            if(a_position >= 120) {
                a_winner = true;
                System.out.println(a_name + " won the race!");
            } else {
                System.out.println(a_name + " moved to " + a_position);
            }
        }
    }
}
