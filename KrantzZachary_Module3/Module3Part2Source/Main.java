public class Main {
    public static void main(String[] args) {
        /***************************************
            CAN START WITH A K N W
            MUST BE CAPITAL
            BETWEEN 88.0 AND 108.0
        ****************************************/

        FMRadioStation[] stations = new FMRadioStation[8];
        stations[0] = new FMRadioStation("AWTL", (float) 103.3);
        stations[1] = new FMRadioStation("WALTE", (float) 95.9);
        stations[2] = new FMRadioStation("FTLW", (float) 90.5);
        stations[3] = new FMRadioStation("Nwal", (float) 89.7);
        stations[4] = new FMRadioStation("KLAW", (float) 109.3);
        stations[5] = new FMRadioStation("KLTW", (float) 108.0);
        stations[6] = new FMRadioStation("ATPL", (float) 88.0);
        stations[7] = new FMRadioStation("KWLT", (float) 103.7);

        for (FMRadioStation s : stations) {
            System.out.println(s);
        }
    }
}