public class Earth extends Planet {

    public Earth(int s) {
        super(s);
    }

    @Override
    public String toString() {
        return ("Earth with size of " + this.size);
    }
}
