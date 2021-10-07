// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com

/**
 * This class contains instances of coordinates in either polar or
 * cartesian format.  It also provides the utilities to convert
 * them into the other type. It is not an optimal design, it is used
 * only to illustrate some design issues.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @version July 2000
 */
public class PointCP4
{
    //Instance variables ************************************************

    /**
     * Contains C(artesian) or P(olar) to identify the type of
     * coordinates that are being dealt with.
     */
    private char typeCoord;

    /**
     * Contains the current value of RHO.
     */
    private double xOrRho;

    /**
     * Contains the current value of THETA.
     */
    private double yOrTheta;

    /** Contains the current value of x.
     */
    private double X;

    /** Contains the current value of y.
     */
    private double Y;


    //Constructors ******************************************************

    /**
     * Constructs a coordinate object, with a type identifier.
     */
    public PointCP4(char type, double xOrRho, double yOrTheta)
    {
        if(type != 'C' && type != 'P')
            throw new IllegalArgumentException();
        typeCoord = type;
        if (typeCoord == 'P'){
            this.xOrRho = xOrRho;
            this.yOrTheta = yOrTheta;
            this.X = getX(xOrRho, yOrTheta);
            this.Y = getY(xOrRho, yOrTheta);
        } else {
            this.X = xOrRho;
            this.Y = yOrTheta;
            this.xOrRho = getRho(X, Y);
            this.yOrTheta = getTheta(X, Y);
        }
    }


    //Instance methods **************************************************

    public double getX(double xOrRho, double yOrTheta){
        return (Math.cos(Math.toRadians(yOrTheta)) * xOrRho);
    }

    public double getY(double xOrRho, double yOrTheta){
        return (Math.sin(Math.toRadians(yOrTheta)) * xOrRho);
    }

    public double getRho(double X, double Y){
        return (Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2)));
    }

    public double getTheta(double X, double Y){
        return Math.toDegrees(Math.atan2(X, Y));
    }

    public double getX()
    {
        return X;
    }

    public double getY()
    {
       return Y;
    }

    public double getRho()
    {
        return xOrRho;
    }

    public double getTheta()
    {
        return yOrTheta;
    }


    /**
     * Converts Cartesian coordinates to Polar coordinates.
     */
    public String convertStorageToPolar()
    {
        return ("The Polar coordinates stored are (" + xOrRho + ", " + yOrTheta + ")");
    }

    /**
     * Converts Polar coordinates to Cartesian coordinates.
     */
    public String convertStorageToCartesian()
    {
        return ("The Cartesian coordinates stored are (" + X + ", " + Y + ")");
    }

    /**
     * Calculates the distance in between two points using the Pythagorean
     * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
     *
     * @param //pointA The first point.
     * @param pointB The second point.
     * @return The distance between the two points.
     */
    public double getDistance(PointCP4 pointB)
    {
        // Obtain differences in X and Y, sign is not important as these values
        // will be squared later.
        double deltaX = getX() - pointB.getX();
        double deltaY = getY() - pointB.getY();

        return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
    }

    /**
     * Rotates the specified point by the specified number of degrees.
     * Not required until E2.30
     *
     * @param //point The point to rotate
     * @param rotation The number of degrees to rotate the point.
     * @return The rotated image of the original point.
     */
    public PointCP4 rotatePoint(double rotation)
    {
        double radRotation = Math.toRadians(rotation);
        double X = getX();
        double Y = getY();
        if(typeCoord=='P'){
            return new PointCP4('P', getX((Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),(Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y)), getY((Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),(Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y)));
        }
        return new PointCP4('C',
                (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
                (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
    }

    /**
     * Returns information about the coordinates.
     *
     * @return A String containing information about the coordinates.
     */
    public String toString()
    {
        if(typeCoord == 'P'){
            return ("Polar ["+getRho()+", "+getTheta()+"]");
        } else {
            return ("Cartesian ("+getX()+", "+getY()+")");
        }
    }
}
