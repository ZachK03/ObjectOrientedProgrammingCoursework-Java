public class Food {
    public Food() {

    }

    synchronized public void eat(int eatTime, String name){
        System.out.println(name + " has started eating.");
        try {
            Thread.sleep(eatTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " has finished eating.");
    }
}
