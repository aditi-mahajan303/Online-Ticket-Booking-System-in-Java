import java.util.Scanner;

public class JavaApplication37 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int[] SeatNo = new int[30];
    
    int Seats=0;
    int YesOrNo = 1;
    String CustomerName;
    int sum=0;
    int[] seat=new int[30];
    int Seat;
    

      System.out.print("Welcome to Nitara Booking!\nWhat is your name?\n");
      CustomerName = input.nextLine();
      
      System.out.println("Welcome "+CustomerName);
      while( YesOrNo==1)
      {
      System.out.println("Please have a look at the seating plan");
      System.out.println();

      for (int i = 1; i <= 34; i++)
      {
        System.out.print("*");
      }
      System.out.println();

      System.out.print("       SEATING PLAN");
      System.out.println();

      for (int j = 1; j <= 34; j++)
      {
        System.out.print("*");
      }
      System.out.println();

      for (int SeatCounter = 1; SeatCounter <= SeatNo.length; SeatCounter++) 
      {
        System.out.printf(SeatCounter + "\t");

       if(SeatCounter%5==0)
       {
           System.out.println();
       }
           
      }
      for (int k = 1; k <= 44; k++)
      {
        System.out.print("*");
      }
      System.out.println();
      
      System.out.println("*NOTE*");
      System.out.println("The SILVER class includes seats from 1 to 10 and the cost of each seat is 150 rupees.");
      System.out.println("The GOLD class includes seats from 11 to 20 and the cost of each seat is 200 rupees.");
      System.out.println("The PLATINUM class includes seats from 21 to 30 and the cost of each seat is 250 rupees.");
      

      System.out.print("Which seat would you like to book? ");
      Seats = input.nextInt();

      while (Seats < 1 || Seats > 30)
      {
        System.out.println("Only 1 - 30 seats are allowed to book. Please try again: ");
        Seats = input.nextInt();
      }


          while(YesOrNo==1)
          {
      for ( int SeatCounter = 1; SeatCounter <= SeatNo.length; SeatCounter++)
      {
        if (SeatCounter == Seats) 
        {
           
          System.out.println("Seat " + Seats + " is successfully booked.");
          
          
          System.out.println(
              "Thanks for booking!\n\nWould you like to make next booking? (Type 1 = Yes; Type 2 = No)");
          YesOrNo = input.nextInt();
          
          
          
          while(YesOrNo==1)
          {
              int i=0;
              System.out.println("Which seat would you like to book");
              int seat1= input.nextInt();
             seat[i]=seat1;
             if(seat[i]==Seats)
             
                     while(Seats==seat[i])
            
             {
                 System.out.println("The seat is already booked");
                 System.out.println("Please book some other seat");
                 i++;
             
             

             
             
            
             }
             
        
                System.out.println(
              "Thanks for booking!\n\nWould you like to make next booking? (Type 1 = Yes; Type 2 = No)");
          YesOrNo = input.nextInt();
          
      
      }}}}
                                 System.out.println("The seat is successfully booked");

         
          
          
          if (YesOrNo == 2) 
          {
            System.out.println("Thank you for using this program.");
          }
        
      }
      
      
      
        if(Seats>=1 && Seats<=10)
        {
            sum=sum+150;
            System.out.println("The amount to be paid is rupees "+sum);
            
        }
        
         if(Seats>=11 && Seats<=20)
        {
            sum=sum+200;
            System.out.println("The amount to be paid is rupees "+sum);
        }
        
        if(Seats>=21 && Seats<=30)
        {
            sum=sum+250;
            System.out.println("The amount to be paid is rupees "+sum);
        }
          
          System.out.println("THANK YOU!!!...");
          
          
    
      while (YesOrNo != 1 && YesOrNo != 2) {
        System.out.println("Invalid input.");
        System.out.println("Type 1 = Continue booking; Type 2 = Exit the program");
        YesOrNo = input.nextInt();

        if (YesOrNo == 2) {
          System.out.println("Thank you for using this program.");
          
           
        }
      }
    }
  }

