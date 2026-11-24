import java.util.Scanner;
public class averageNumber {
    public static void main(String...args) {
        Scanner scanner = new Scanner(System.in);
        
        double sum = 0;
        int count = 0;
        
        System.out.println("Enter a numbers or (enter -1 to stop):");
        
        while (true) { 
       
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();
            
          
            if (number == -1) {
                System.out.println("Program stopped.");
                break;
            }
            
            sum += number;
            count++;
            
            
            double average = sum / count;
            System.out.printf("Current running average: %.2f%n", average);
        }
       
    }
}

