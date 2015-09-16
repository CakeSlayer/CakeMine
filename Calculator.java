import java.lang.*;
import javax.swing.JOptionPane;
public class Calculator
{
	public static void main(String[] args)
	{
		//Variables
		double firstNumber;
		double secondNumber;
		//Variables-Basic Math
		double sum;
		double difference;
		double product;
		double divide;
		//Variables-Extra
		double average;
		//Variables-PowersNum1
		double num1power2;
		double num1power3;
		double num1power4;
		double num1power5;
		double num1power10;
		//Variables-PowersNum2
		double num2power2;
		double num2power3;
		double num2power4;
		double num2power5;
		double num2power10;
		//Characters
		char n = '\n';
		
		//Define 2 Numbers
		firstNumber = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter a number", ">>>First Number<<<", JOptionPane.QUESTION_MESSAGE));
		secondNumber = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter another number", ">>>Second Number<<<", JOptionPane.QUESTION_MESSAGE));
		
		//Math
		sum = firstNumber + secondNumber;
		difference = firstNumber - secondNumber;
		product = firstNumber*secondNumber;
		divide = firstNumber/secondNumber;
		//Math-Extra
		average = sum/2;
		//Math-PowersNum1
		num1power2 = firstNumber*firstNumber;
		num1power3 = firstNumber*firstNumber*firstNumber;
		num1power4 = firstNumber*firstNumber*firstNumber*firstNumber;
		num1power5 = firstNumber*firstNumber*firstNumber*firstNumber*firstNumber;
		num1power10 = firstNumber*firstNumber*firstNumber*firstNumber*firstNumber*firstNumber*firstNumber*firstNumber*firstNumber*firstNumber;
		//Math-PowersNum2
		num2power2 = secondNumber*secondNumber;
		num2power3 = secondNumber*secondNumber*secondNumber;
		num2power4 = secondNumber*secondNumber*secondNumber*secondNumber;
		num2power5 = secondNumber*secondNumber*secondNumber*secondNumber*secondNumber;
		num2power10 = secondNumber*secondNumber*secondNumber*secondNumber*secondNumber*secondNumber*secondNumber*secondNumber*secondNumber*secondNumber;
		
		//GUI - Answers
		JOptionPane.showMessageDialog(null, 
		"\n>>>Basic Math<<<"
		+ n + firstNumber + " + " + secondNumber + " is " + sum 
		+ n + firstNumber + " - " + secondNumber + " is " + difference
		+ n + firstNumber + " * " + secondNumber + " is " + product
		+ n + firstNumber + " / " + secondNumber + " is " + divide
		+ n + "\n>>>Square Roots<<<"
		+ n + "The square root of " + firstNumber + " is " + Math.sqrt(firstNumber)
		+ n + "The square root of " + secondNumber + " is " + Math.sqrt(secondNumber)
		+ n + "\n>>>Extra Math<<<"
		+ n + "The average of " + firstNumber + " and " + secondNumber + " is " + average
		+ n + "\n>>>Powers - Number 1<<<"
		+ n + firstNumber + "^2 is " + num1power2
		+ n + firstNumber + "^3 is " + num1power3
		+ n + firstNumber + "^4 is " + num1power4
		+ n + firstNumber + "^5 is " + num1power5
		+ n + firstNumber + "^5 is " + num1power10
		+ n + "\n>>>Powers - Number 2<<<"
		+ n + secondNumber + "^2 is " + num2power2
		+ n + secondNumber + "^3 is " + num2power3
		+ n + secondNumber + "^4 is " + num2power4
		+ n + secondNumber + "^5 is " + num2power5
		+ n + secondNumber + "^10 is " + num2power10
		, ">>>All Answers<<<", JOptionPane.INFORMATION_MESSAGE);
	}
}
