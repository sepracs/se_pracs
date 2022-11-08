// Replace the class name functional_cohesion with CreateShape
// also replace the program name from functional_cohesion.java to CreateShape.java
// Run the program using 

// javac CreateShape.java
// java CreateShape
public class functional_cohesion {
  private final float length;
  private final float breadth;
  
  public functional_cohesion(float length, float breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  public String toString() {
    return "Length: " + this.length + "\n" + "Breadth: " + this.breadth;
  }

  public float getLength() {
    return this.length;
  }

  public float getBreadth() {
    return this.breadth;
  }

  public static void main(String []args) {
  functional_cohesion obj = new functional_cohesion(5, 4);
  Area areaObj = new Area();
  Perimter perimterObj = new Perimter();
  System.out.println("Area: " + areaObj.areaOfShape(obj.getLength(), obj.getBreadth()));
  System.out.println("Perimter: " + perimterObj.perimeterOfShape(obj.getLength(), obj.getBreadth()));
}
}

class Area {
  public float areaOfShape(float length, float breadth) {
    return length * breadth;
  }
}

class Perimter {
  public float perimeterOfShape(float length, float breadth) {
    return 2 * (length + breadth);
  }
}


