public class content_coupling {
  // This class resembles a Line
  Point a1, a2;
  public content_coupling(Point a1, Point a2) {
    this.a1 = a1;
    this.a2 = a2;
  }

  public float getSlope() {
    return (a1.y - a2.y) / (a1.x - a2.y);
  }

  public void changePoints() {
    this.a1.x = 0;
    this.a1.y = 0;
    this.a2.x = 0;
    this.a2.y = 0;
  }

  public static void main(String []args) {
    Point p1 = new Point(5, 3);
    Point p2 = new Point(10, 6);
    content_coupling obj = new content_coupling(p1, p2);
    System.out.println("Slope using Line class: " + obj.getSlope());
    System.out.println("Slope using Point class: " + p1.getSlope(p1, p2));
    obj.changePoints();
    System.out.println("Slope using Line class: " + obj.getSlope());

  }
}

class Point {
  float x,y;
  public Point(float x, float y) {
    this.x = x;
    this.y = y;
  }

  public float getSlope(Point p1, Point p2) {
    content_coupling obj = new content_coupling(p1, p2);
    return obj.getSlope();
  }
}
