/*  Program: MaxValue

*   Programmer: Jacob Hartzell

*   Date: 9/9/26

*   Purpose: Code pulls in user input as a integer and finds the largest number and checks the 
number of times the user enters that number and displays results when the number 0 is inputed

*/
import java.util.Scanner;
public class MaxValue {
    public static void main(String[] args) {    
        System.out.print("Enter in an integer:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int count = 0;
        int max = number;
        
        if (number == 0){
            System.out.println("No numbers were entered except 0.");
            input.close();
            return;
        }
        while (max != 0){
            number = input.nextInt();
            if (number == 0 ){
                break;
            }
            else if (max < number){
                max = number;
                count = 1;
            }
            else if (max == number){
                count++;
            }
        }
        System.out.print("The largest number is " + max + " and it occurs " + count + " times.");
        input.close();
    }
}