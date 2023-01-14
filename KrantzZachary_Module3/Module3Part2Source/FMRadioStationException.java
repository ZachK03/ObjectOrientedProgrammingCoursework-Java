public class FMRadioStationException extends Exception {
    public FMRadioStationException(String callsign, float freq, int type) {
        String errorMessage = "Station object creation failed: Error " + type + ", ";
        switch (type) {
            case 0:
                System.out.println(errorMessage + "station callsign must be four letters.");
                break;
            case 1:
                System.out.println(errorMessage + "invalid beginning character.");
                break;
            case 2:
                System.out.println(errorMessage + "station callsign must be all capital letters.");
                break;
            case 3:
                System.out.println(errorMessage + "station frequency must be between 88.0 and 108.0 MHz.");
                break;
        }
    }
}
