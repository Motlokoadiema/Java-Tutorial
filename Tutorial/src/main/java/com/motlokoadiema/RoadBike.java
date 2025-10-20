public class RoadBike extends Bicycle{
    public RoadBike(){
        handlebarKind = "Drop";
        numberChainRings = 3;
        gearRatio = ;
        numberOfSeats = 1;
        numberHandleBarSets = 1;
    }

    public byte getNumberChainRings(byte numberChainRings){
        return numberChainRings;
    }

    public byte getNumberOfSeats(byte numberOfSeats){
        return numberOfSeats;
    }

    public byte numberHandleBarSets(byte numberHandleBarSets){
        return numberHandleBarSets;
    }

    public byte getGearRatio(byte gearRatio){
        return gearRatio;
    }

    public byte getHandleBarKind(byte handleBarKind){
        return handleBarKind;
    }

    RoadBike roadBike = new RoadBike();
}
