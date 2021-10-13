public abstract class PointCP5 {

    private char typeCoord;

    public PointCP5(char typeCoord){
        this.typeCoord = typeCoord;
    }

    public abstract double getX();

    public abstract double getY();

    public abstract double getRho();

    public abstract double getTheta();

    public abstract double getDistance(PointCP5 pointB);

    public abstract PointCP5 rotatePoint(double rotation);

    public abstract String toString();

    public String convertCartesian(){
        return ("Returned as Cartesian Coordinates ("+getX()+", "+getY()+")");
    }

    public String convertPolar(){
        return ("Returned as Polar Coordinates ("+getRho()+", "+getTheta()+")");
    }
}
