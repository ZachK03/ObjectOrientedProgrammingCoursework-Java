public class FMRadioStation {
    private String r_callsign;
    private float r_freq;
    public FMRadioStation (String callsign, float freq) {
        try {
            checkStationData(callsign,freq);

            r_callsign = callsign;
            r_freq = freq;
            System.out.println("Station creation succeeded: " + toString());
        } catch (FMRadioStationException fmrse) {}
    }

    private boolean checkStationData(String callsign, float freq) throws FMRadioStationException {
        if(callsign.length() != 4) {
            throw new FMRadioStationException(callsign, freq, 0);
        }
        char ch = callsign.charAt(0);
        if(ch != 'A' && ch != 'K' && ch != 'N' && ch != 'W') {
            throw new FMRadioStationException(callsign,freq, 1);
        }

        boolean isOkay = true;
        for(int i = 0; i < callsign.length(); i++) {
            ch = callsign.charAt(i);
            if(!(Character.isUpperCase(ch))) {
                throw new FMRadioStationException(callsign,freq, 2);
            }
        }
        if(freq < 88.0 || freq > 108.0) {
            throw new FMRadioStationException(callsign,freq, 3);
        }
        return isOkay;
    }

    @Override
    public String toString() {
        String out = "Station " + r_callsign + " is live on " + r_freq + "!";
        return out;
    }
}
