
/**
 * Dylan Klingensmith
 * CH4PC8 - Running the Race
 * Period 2
 * 10/16/18
 */

import java.util.Scanner;

public class RunnersDemo
{
   public static void main(String[] args)
   {
      
       //Establish variables, scanner, and Runners object
       String nameInput;
       double timeInput;
       
       Scanner keyboard = new Scanner(System.in);
       
       Runners race = new Runners();
       
       //Get the names and times of the runners
       System.out.println("Input the names of the runners.");
       
       nameInput = keyboard.nextLine();
       race.setRunner1(nameInput);
       nameInput = keyboard.nextLine();
       race.setRunner2(nameInput);       
       nameInput = keyboard.nextLine();
       race.setRunner3(nameInput);
       
       System.out.println("Input the times of the runners.");
       
       timeInput = keyboard.nextDouble();
       race.setTime1(timeInput);
       timeInput = keyboard.nextDouble();
       race.setTime2(timeInput);
       timeInput = keyboard.nextDouble();
       race.setTime3(timeInput);
       
       //Get the runners in order from first place to third
       System.out.println("First place:\t" + race.getFirstPlace());
       System.out.println("Second place:\t" + race.getSecondPlace());
       System.out.println("Third place:\t" + race.getThirdPlace());
       
       
            
   }
}
