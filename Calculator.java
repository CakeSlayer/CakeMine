import java.lang.Math
public class Calculator
{
  public static void main(String[] args)
  {
    double firstNumber;
    double secondNumber;
    double sum;
    double difference;
    double average;
    double product;
    
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter a number >> ");
    firstNumber = input.nextDouble();
    System.out.print("Please enter another number >> ");
    secondNumber = input.nextDouble();
    
    sum = firstNumber + secondNumber;
    difference = firstNumber - secondNumber;
    average = sum/2;
    product = firstNumber*secondNumber;
    
    System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
    System.out.println(firstNumber + " - " + secondNumber + " is " + difference);
    System.out.println(firstNumber + " * "+ secondNumber + " is " + product);
    System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);
  }
}
