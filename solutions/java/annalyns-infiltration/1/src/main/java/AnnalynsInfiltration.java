class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        if (knightIsAwake){
            return false;
        }
        return true;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if (knightIsAwake || archerIsAwake ||prisonerIsAwake){
            return true;
        }
        return false;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if (archerIsAwake){
            return false;
        }
        else if(prisonerIsAwake){
            return true;
        }
        return false;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if (archerIsAwake){
            return false;
        }
        if (knightIsAwake){
            if (petDogIsPresent){
                return true;
            }
            return false;
        }
        
        if (prisonerIsAwake){
            return true;
        }
        if (petDogIsPresent){
            return true;
        }
        return false;


    }
}
