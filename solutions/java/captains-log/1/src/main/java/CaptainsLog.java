import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
        
    }

    char randomPlanetClass() {
        int index = random.nextInt(PLANET_CLASSES.length);
        return PLANET_CLASSES[index];
    }

    String randomShipRegistryNumber() {
        int cae = 1000+ random.nextInt(9000);
        StringBuilder s = new StringBuilder();
        s.append("NCC-");
        s.append(cae);
        return s.toString();
            
    }

    double randomStardate() {
        double c = 41000.0 + 1000.0 *random.nextDouble();
        return c;
    }
}
