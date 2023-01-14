public class Jupiter extends Planet {
    public Jupiter(int s) {
        super(s);
    }

    @Override
    public String toString() {
        return ("Jupiter with size of " + this.size);
    }
}
