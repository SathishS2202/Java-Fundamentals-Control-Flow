import java.util.*;
public class Main
{
    public static void main(String[] args)
    {

        // Getting number from the user :
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        // Checking whether the number is positive,negative or zero :
        if(number>0)
        {
            System.out.println("Positive");
        }
        else if (number<0)
        {
            System.out.println("Negative");
        }
        else
        {
            System.out.println("Zero");
        }

        // Weekbased on the number :
        switch (number) {
            case 1:
                System.out.println("Sunday");    
                break;
            case 2:
                System.out.println("Monday");    
                break;
            case 3:
                System.out.println("Tuesday");
                 break;
            case 4:
                 System.out.println("Wednesday");
                  break;
            case 5:
                  System.out.println("Thursday");
                   break;
            case 6:
                  System.out.println("Friday");
                  break;
            case 7:
                  System.out.println("Saturday");
                  break;
            default:
                  System.out.println("Enter a valid number");
                  break;
        }

        //Printing Numbers from 1 to users number :
            for(int i=0;i<=number;i++)
            {
                System.out.println(i);
            }

        // Printing the numbers as down from the users number :
            while(number!=0)
            {
                System.out.println(number);
                number--;
            }
            
        // Block of code can be executed at least once :
            int j=1;
            do{
                System.out.println(j);
                j++;
            } while(j<=3);
          
            sc.close();
        }
    }