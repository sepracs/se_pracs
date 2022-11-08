import java.util.Scanner;

public class temporal_cohesion {
  private int number;
  temporal_cohesion(int number) {
    this.number = number;
  }

  public void displayError() {
    System.out.println("The value of your input cannot be less than 1!!!");
  }

  public boolean isPrime() {
    if (number <= 1) {
      displayError();
      System.exit(0);
    }
    for(int i = 2; i < this.number; i++) {
      if(this.number % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String []args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int input = scanner.nextInt();
    scanner.close();
    temporal_cohesion obj = new temporal_cohesion(input);
    System.out.println("The number " + input + " is prime?: " + obj.isPrime());
  }
}
