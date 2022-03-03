
package circlewithexception;



public class CircleWithException {
    
  /** The radius of the circle */
  private double radius;
  private double perimeter;

  /** The number of the objects created */
  private static int numberOfObjects = 0;

  /** Construct a circle with radius 1 */
  public CircleWithException() {
    this(1.0,4.0);
  }

  /** Construct a circle with a specified radius */
  public CircleWithException(double newRadius, double newPerimeter) {
    setRadius(newRadius);
    setPerimeter(newPerimeter);
    numberOfObjects++;
  }

  /** Return radius */
  public double getRadius() {
    return radius;
  }
  /** return perimeter */
public double getPerimeter(){
    return perimeter;
}
  /** Set a new radius */
  public void setRadius(double newRadius)
      throws IllegalArgumentException {
    if (newRadius >= 0)
      radius = newRadius;
    else
      throw new IllegalArgumentException( "Radius cannot be negative");
  }
  /** set new perimeter */
  public void setPerimeter(double newPerimeter)
          throws IllegalArgumentException{
      if (newPerimeter >= 1)
          perimeter = newPerimeter;
      else 
          throw new IllegalArgumentException("Perimeter must start from 1");
  }

  /** Return numberOfObjects */
  public static int getNumberOfObjects() {
    return numberOfObjects;
  }

  /** Return the area of this circle */
  public double findArea() {
    return radius * radius * 3.14159;
  }
}