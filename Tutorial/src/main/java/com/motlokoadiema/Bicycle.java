public class Bicycle {
    protected byte currentGear;
    protected byte currentCadence;
    protected short currentSpeed;
    protected byte numberChainRings;
    protected byte gearRatio;
    protected String handlebarKind;
    protected byte numberOfSeats;
    protected byte numberHandleBarSets;

    public Bicycle(){
        currentGear = 1;
        currentCadence = 0;
        currentSpeed = 0;
    }

    public byte getCurrentGear(byte currentGear){
        return currentGear;
    }

    public byte getCurrentCadence(byte currentCadence){
        return currentCadence;
    }

    public short getCurrentSpeed(short currentSpeed){
        return currentSpeed;
    }
}
