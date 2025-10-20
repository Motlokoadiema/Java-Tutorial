public class MountainBike extends Bicycle {
    public MountainBike(){
        handlebarKind = "Flat";
        numberChainRings = 3;
        gearRatio = 18;
        numberOfSeats = 1;
        numberHandleBarSets = 1;
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

    public byte numberOfSeats(byte numberOfSeats){
        return numberOfSeats;
    }

    public byte numberHandleBarSets(byte numberHandleBarSets){
        return numberHandleBarSets;
    }

    //Creating the object to represent the mountain bike with is states and behaviours
    MountainBike mountainBike = new MountainBike();
}
