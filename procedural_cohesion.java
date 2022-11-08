public class procedural_cohesion {
  private String data = "";

  procedural_cohesion(String data) {
    this.data = data;
  }

  public String getData() {
    return this.data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public void deleteData() {
    this.data = "";
  }

  public static void main(String []args) {
    procedural_cohesion obj = new procedural_cohesion("Name: Wesley Lewis");
    System.out.println("Output: " + obj.getData());
    obj.setData("Name: Lewis Wesley");
    System.out.println("Output: " + obj.getData());
    obj.deleteData();
    System.out.println("Output: " + obj.getData());
  }
}
