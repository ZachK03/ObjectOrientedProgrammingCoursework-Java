public class Main {
    public static void main(String[] args) {
        int index1 = indexFinder(new Integer[]{1, 2, 3, 4, 5},3);
        int index2 = indexFinder(new String[]{"Hello","Zach"},"Hello");
        int index3 = indexFinder(new Double[]{1.1,2.2,3.3,4.4},1.0);

        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);

        Earth e1 = new Earth(2);
        Jupiter j1 = new Jupiter(4);
        System.out.println(greaterThan(e1,j1));
    }

    private static <T> int indexFinder (T[] array, T value) {
        /******
         * Finds index based position of value in given array
         * If not found returns -1
         */
        int out = 0;
        for (T val : array) {
            if(val == value)
                return out;
            out++;
        }
        return -1;
    }

    private static <T extends Planet> Planet greaterThan(T o1, T o2) {
        if(o1.returnValue() > o2.returnValue()) {
            return o1;
        }
        return o2;
    }
}