import java.util.Scanner;
public class Metric {
    public static void main(String[] args){
        double kg, lbs, cm, in, m, km, L, qt; 
        int num = 0; 
        Scanner input = new Scanner(System.in); 
           System.out.println("Welcome to the Metric Converter!");
           System.out.println("Select the conversion to perform by entering the corresponding number, the calculator will keep accepting inputs until you exit. To make another conversion, just keep selecting from the table using the corresponding number. After making a selection from the table, you will be prompted to input which of the two conversions to make. Select the number that corresponds to the desired conversion. For instance, to convert kg to lbs you would select 1, and then 1 again before you input the amount in kg to convert. \n1. kg to lbs or vice versa\n2. cm to in or vice versa\n3. km to miles or vice versa\n4. L to qt or vice versa\n5. exit");
          while (num != 5 ) {           
            num = input.nextInt(); 
           while (num < 1 || num > 5) {
                System.out.println("Please enter a valid input"); 
                 num = input.nextInt();
           }
           switch (num) {
                case 1: 
                int mass; 
                System.out.println("Select either kg(1) or lbs(2) to convert:"); 
                mass = input.nextInt(); 
               while (mass != 1 && mass != 2 ){
                    System.out.println("Please enter a valid input:");
                    mass = input.nextInt(); 
                }
                if (mass == 1){
                System.out.println("Amount in kg:");
                 kg = input.nextDouble(); 
                 lbs = kg * 2.205; 
                 System.out.println("The amount in lbs is: " + lbs);
                }
                else {
                    System.out.println("Amount in lbs:"); 
                    lbs = input.nextDouble();
                    kg = lbs * .454; 
                    System.out.println("The amount in kg is: " + kg);
                }
                 break; 
                case 2:
                int length; 
                System.out.println("Select either in(1) or cm(2) to convert:"); 
                length = input.nextInt(); 
                while (length != 1 && length != 2 ){
                    System.out.println("Please enter a valid input:");
                    length = input.nextInt(); 
                }
                if (length == 1){
                System.out.println("Amount in inches:");
                 in = input.nextDouble(); 
                 cm = in * 2.54; 
                 System.out.println("The amount in cm is: " + cm);
                }
                else {
                    System.out.println("Amount in cm:"); 
                    cm = input.nextDouble();
                    in = cm * .394; 
                    System.out.println("The amount in inches is: " + in);
                }
                break; 
                case 3: 
                int length2; 
                System.out.println("Select either km(1) or miles(2) to convert:");
                length2 = input.nextInt(); 
                while (length2 != 1 && length2 != 2 ){
                    System.out.println("Please enter a valid input:");
                    length2 = input.nextInt(); 
                }
                if (length2 == 1){
                System.out.println("Distance in km:");
                 km = input.nextDouble(); 
                 m = km * .621;  
                 System.out.println("The distance in miles is: " + m);
                }
                else {
                    System.out.println("Distance in miles:"); 
                    m = input.nextDouble();
                    km = m * 1.609; 
                    System.out.println("The distance in km is: " + km);
                }
                break; 
                case 4:
                int volume; 
                System.out.println("Select either L(1) or qt(2) to convert:");
                volume = input.nextInt(); 
                while (volume != 1 && volume != 2 ){
                    System.out.println("Please enter a valid input:");
                    volume = input.nextInt(); 
                }
                if (volume == 1){
                System.out.println("Amount in L:");
                 L = input.nextDouble(); 
                 qt = L * 1.057; 
                 System.out.println("The amount in quarts is: " + qt);
                }
                else {
                    System.out.println("Amount in quarts:"); 
                    qt = input.nextDouble();
                    L = qt * .946; 
                    System.out.println("The amount in L is: " + L);
                }
                break;
                case 5: 
                System.out.println("Bye, have a nice day!");
                System.exit(0);           
           }

       
        }
           
           
            
    
            

           
    }
}
