import java.util.Scanner;

class LeapYear 
{
    public static void main(String args[]) 
    
    {
      int year,ex,btime;
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter a year: ");
        
         year = sc.nextInt();            

        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))	    //  quite understand 400 use for century and 4 for years and at end year divide by 
        //{ 
          System.out.println(year + " is a Leap Year.");
        //{
        else
         
          System.out.println(year + " is not a Leap Year.");
  ///  }
//// }
    }
}

 // logic behind the code is   ...
 // if we dont use the 400 years so it will no work after 2019 nad kick out hte error bit

