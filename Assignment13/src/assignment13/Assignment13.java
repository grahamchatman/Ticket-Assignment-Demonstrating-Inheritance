
package assignment13;

import java.util.Scanner;

public class Assignment13 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        String tag = "";
        String make = "";
        String model = "";
        String color = "";
        
        int ticketType = 0;
        
        
        System.out.printf("%s" , "Enter the tag: ");
        tag = input.nextLine();
                
        System.out.printf("%s" , "Enter the make: ");
        make = input.nextLine();
                
        System.out.printf("%s" , "Enter the model: ");
        model = input.nextLine();
                
        System.out.printf("%s" , "Enter the color: ");
        color = input.nextLine();
        
        System.out.printf("%s%n" , "What type of ticket would you like to write up? Enter a number from 1 - 3. " );
        ticketSelection();
        ticketType = input.nextInt();
      
        switch (ticketType)
        {
            case 1:
                TimeExpired ticket1 = new TimeExpired (tag, make, model, color);
                
                System.out.printf("%s%n%s%s%n%s%s%n%s%s%n%s%s%n%s%d%n", "Ticket: Time Expired." 
                                            , "Tag: " , ticket1.getTag() 
                                            , "Make: " , ticket1.getMake()
                                            , "Model: " , ticket1.getModel()
                                            , "Color: " , ticket1.getColor()
                                            , "Your fine is: $" , ticket1.getFine());
                break;
             
            case 2:
                Handicap ticket2 = new Handicap (tag, make, model, color);
                System.out.printf("%s%n%s%s%n%s%s%n%s%s%n%s%s%n%s%d%n", "Ticket: Handicapped." 
                                            , "Tag: " , ticket2.getTag() 
                                            , "Make: " , ticket2.getMake()
                                            , "Model: " , ticket2.getModel()
                                            , "Color: " , ticket2.getColor()
                                            , "Your fine is: $" , ticket2.getFine());
                break;
            
            case 3:
                FireLane ticket3 = new FireLane (tag, make, model, color);
                System.out.printf("%s%n%s%s%n%s%s%n%s%s%n%s%s%n%s%d%n", "Ticket: Fire Lane." 
                                            , "Tag: " , ticket3.getTag() 
                                            , "Make: " , ticket3.getMake()
                                            , "Model: " , ticket3.getModel()
                                            , "Color: " , ticket3.getColor()
                                            , "Your fine is: $" , ticket3.getFine());
                break;
        }
    }
    
    public static void ticketSelection()
    {
        System.out.printf("%s%n%s%n%s%n", " 1 : Time Expired Ticket"
                                        , " 2 : Handicapped Ticket"
                                        , " 3 : Fire Lane Ticket");
    }
    
}
