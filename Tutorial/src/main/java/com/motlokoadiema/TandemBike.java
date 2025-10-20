public class TandemBike {
    public TandemBike(){
        numberOfSeats = 2;
        numberHandleBarSets = 2;
        handlebarKind = "Flat";
        numberChainRings = 6;
        gearRatio = 3;
        numberOfSeats = 2;
        numberHandleBarSets = 2;
    }

    public byte getNumberOfSeats(byte numberOfSeats){
        return numberOfSeats;
    }

    public byte getNumberHandleBarSets(byte numberHandleBarSets){
        return numberHandleBarSets;
    }

    public byte getNumberChainRings(byte numberChainRings){
        return numberChainRings;
    }

    public byte getGearRatio(byte gearRatio){
        return gearRatio;
    }

    public byte getHandleBarKind(byte handleBarKind){
        return handleBarKind;
    }

    TandemBike tandemBike = new TandemBike();
}
