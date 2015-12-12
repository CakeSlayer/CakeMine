import java.lang.*;
import javax.swing.*;
import java.awt.*;
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
		//Characters/Other
		char n = '\n';
		int add5 = 5;
		int add10 = 10;
		double plus5num1;
		double plus10num1;
		double plus5num2;
		double plus10num2;
		String message1;
		String message2;
		//Titles
		String titleNum1 = ">>>First Number<<<";
		String titleNum2 = ">>>Second Number<<<";
		String titleAllAnswers = ">>>All Answers<<<";
		//String Variables
		String titleString1 = ">>>First String<<<";
		String titleString2 = ">>>Second String<<<";
		String titleStringAnswers = ">>>String Answers<<<";
		String firstString;
		String secondString;
		
		//Load Via Loop & Count
		loadingMethod();
		
		//Define 2 Numbers
		firstNumber = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter a number", titleNum1, JOptionPane.QUESTION_MESSAGE));
		secondNumber = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter another number", titleNum2, JOptionPane.QUESTION_MESSAGE));
		
		//Define Names
		firstString = (JOptionPane.showInputDialog(null, "Please enter a string", titleString1, JOptionPane.QUESTION_MESSAGE));
		secondString = (JOptionPane.showInputDialog(null, "Please enter another string", titleString2, JOptionPane.QUESTION_MESSAGE));
		
		//Plus5&Plus10
		plus5num1 = firstNumber + add5;
		plus10num1 = firstNumber + add10;
		plus5num2 = secondNumber + add5;
		plus10num2 = secondNumber + add10;
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
		
		//First number greater than 50?
		if(firstNumber > 50)
			message1 = "Yes";
		else
			message1 = "No";
		//Second number greater than 50?
		if(secondNumber > 50)
			message2 = "Yes";
		else
			message2 = "No";
		
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
		+ n + "\n>>>Plus 5 & Plus 10 - Number 1<<<"
		+ n + firstNumber + " plus 5 is " + plus5num1
		+ n + firstNumber + " plus 10 is " + plus10num1
		+ n + "\n>>>Plus 5 & Plus 10 - Number 2<<<"
		+ n + secondNumber + " plus 5 is " + plus5num2
		+ n + secondNumber + " plus 10 is " + plus10num2
		+ n + "\n>>>Is the number greater than 50? - Number 1<<<"
		+ n + message1
		+ n + "\n>>>Is the number greater than 50? - Number 2<<<"
		+ n + message2
		, titleAllAnswers, JOptionPane.INFORMATION_MESSAGE);
		
		StringCompare(firstString, secondString, titleStringAnswers, n);
	}
	
	//String compare method
	public static void StringCompare(String firstString, String secondString, String titleStringAnswers, char n)
	{
		int firstStringLength = firstString.length();
		int secondStringLength = secondString.length();
		String compareLengthMessage;
		
		//Test if messages are same length
		if(firstStringLength == secondStringLength)
			compareLengthMessage = "Yes";
		else
			compareLengthMessage = "No";
		
		//Display Pop Up
		JOptionPane.showMessageDialog(null, 
		"\n>>>Strings Entered<<<"
		+ n + "String 1 is " + firstString
		+ n + "String 2 is " + secondString
		+ n + "\n>>>String Lengths<<<"
		+ n + "The length of " + firstString + " is " + firstString.length() + " characters"
		+ n + "The length of " + secondString + " is " + secondString.length() + " characters"
		+ n + "\n>>>String Compares<<<"
		+ n + "Are both strings the same? "
		+ n + firstString.regionMatches(true, 0 , secondString, 0, 4)
		+ n + n + "Are both strings the same length? "
		+ n + compareLengthMessage
		, titleStringAnswers, JOptionPane.INFORMATION_MESSAGE);
	}
	
	//Loading method
	public static void loadingMethod()
	{
		int count = 10;
		
		//Start loading
		while(count == count && count < 110)
		{
		System.out.println("Loading... " + count + "% Done"); 
		
		//Wait 1sec
		try {
            Thread.sleep(1000);
        } catch (Exception e) {}
		
		//Add 10%
		count = count + 10;
		}
	}
}
