package dailytask;
import java.util.Arrays;
import java.util.Scanner;

public class Dailytask {

    public static void main(String[] args) {
        calculateBill();
    }

    //get the numbers from user through console
    public static void getNumbers() {
    	int suma=0;
    	Scanner input = new Scanner(System.in);
    	System.out.print("Enter the first number");
    	int firstNumber = input.nextInt();
    	System.out.print("Enter the second number");
    	int secondNumber = input.nextInt();
    	suma=firstNumber+secondNumber; 
    	System.out.print("The sum of the two numbers is"+suma);
    }
    public static void calculateBill() {
    	int difb=0;
    	int bilb=0;
    	Scanner input = new Scanner(System.in);
    	System.out.print("Enter the previous electricity expenditure");
    	int previousNumber = input.nextInt();
    	System.out.print("Enter the current electricity expenditure");
    	int currentNumber = input.nextInt();
    	int range1=(23/10);
    	int range2=(35/10);
    	int range3=(46/10);
    	difb = currentNumber-previousNumber;
    	if (difb<=30){
    		  bilb=difb*range1;
    	} else if ((difb>30)&&(difb<=100)) {
    		bilb=((difb-30)*range2)+30*range1;
    	} else {
    		bilb=((difb-100)*range3)+30*range1+70*range2;
    	}
    	System.out.print("total bill is"+bilb);
    }	

}

