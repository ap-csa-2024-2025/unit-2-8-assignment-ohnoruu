import java.util.Scanner;
 
public class Main
{
  public static void main(String[] args)
  {
    //Problem 1
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a positive integer: ");
    int num = sc.nextInt();
    printRandom3(num);

    //Problem 2
    System.out.println("Enter the first x-coord: ");
    double x1 = sc.nextDouble();
    System.out.println("Enter second x-coord: ");
    double x2 = sc.nextDouble();
    System.out.println("Enter the first y-coord: ");
    double y1 = sc.nextDouble();
    System.out.println("Enter the second y-coord: ");
    double y2 = sc.nextDouble();
    calcSlope(x1, y1, x2, y2);

    //Problem 3
    System.out.println("Enter two doubles: ");
    double point1 = sc.nextDouble();
    double point2 = sc.nextDouble();
    roundedDist(point1, point2);
  }

  public static void printRandom3(int n){
    int random1 = (int)(Math.random()*(n+1))+2;
    int random2 = (int)(Math.random()*(n+1))+2;
    int random3 = (int)(Math.random()*(n+1))+2;
    System.out.println("Random numbers: \n" + random1 + "\n" + random2 + "\n" + random3);
  }

  public static void calcSlope(double x1, double y1, double x2, double y2){
    double slope = (y2-y1)/(x2-x1);
    System.out.println(slope);
  }

  public static void roundedDist(double num1, double num2){
    double difference = Math.abs(num2-num1);
    int roundedDiff = (int)(difference+0.5);
    System.out.println("Distance: " + roundedDiff);
  }
}
