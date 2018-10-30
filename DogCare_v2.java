import java.util.*;
import java.io.*;
public class DogCare_v2{

   public static void main(String[] args) throws FileNotFoundException{
   
      int i = 0;
      int number = 1;
      int test = 0;
      int antalHundeOver = 0;
      File A = new File("Dog.txt");
      Scanner s = new Scanner(System.in);
      PrintStream outPrint = new PrintStream(new FileOutputStream(A, true));
      Scanner sA = new Scanner(A);
   
   
      
      System.out.println("Type 1 for creating a dog and 2 for finding a dog and leave for leaveing");
      String imp = s.nextLine();
      
      if(imp.equals("1")){
         
         System.out.println("Type the dogs name: ");
         String name = s.nextLine();
         
         System.out.println("Type the dogs race: ");
         String race = s.nextLine();
         
         System.out.println("Type the dogs age: ");
         int age = s.nextInt();
         
         System.out.println("Type the dogs color: ");
         String bla = s.nextLine();
         String color = s.nextLine();
         
         outPrint.println(number + " " + name + " " + race + " " + age + " " + color);  
         number = number + 1;
      }
         
      else if(imp.equals("2")){
         
         do{
            int rNumber = sA.nextInt();
            String rName = sA.next();
            String rRace = sA.next();
            int rAge = sA.nextInt();
            if(rAge >= 5){
               test = 1;
               antalHundeOver = antalHundeOver +1;
            }
            String rColor = sA.next();
            if(test == 1){
               System.out.println(rNumber + " " + rName + " " + rRace + " " + rAge + " " + rColor);
            }
            test = 0;
         }  while(sA.hasNextInt());
         System.out.println("\nThere is " + antalHundeOver + " older then 5");
      }
      
      else if(imp.equals("leave")){
         i = 100;
         System.out.println("See you next time!");
      }
      
      
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   }




}