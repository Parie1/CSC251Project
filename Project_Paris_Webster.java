import java.util.Scanner;

public class Project_Paris_Webster
{
   public static void main(String[] args)
   {
      double testPolicyNumber;
      String testProviderName;
      String testFirstName;
      String testLastName;
      double testAge;
      String testSmokerStats;
      double testHeight;
      double testWeight;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter the provider's name: ");
      testProviderName = keyboard.nextLine();
      
      System.out.print("Enter the policy holder's first name: ");
      testFirstName = keyboard.nextLine();
      
      System.out.print("Enter the policy holder's last name: ");
      testLastName = keyboard.nextLine();
            
      System.out.print("Enter the policy holder's smoking status (Smoker/NonSmoker): ");
      testSmokerStats = keyboard.nextLine();
      
      System.out.print("Enter the policy number: ");
      testPolicyNumber = keyboard.nextDouble();
      
      System.out.print("Enter the policy holder's age: ");
      testAge = keyboard.nextDouble();
      
      System.out.print("Enter the policy holder's height in inches: ");
      testHeight = keyboard.nextDouble();
      
      System.out.print("Enter the policy holder's weight in pounds: ");
      testWeight = keyboard.nextDouble();
      
      
      Policy testProject_Paris_Webster = new Policy(testPolicyNumber, testProviderName, testFirstName, testLastName, testAge, testSmokerStats, testHeight, testWeight);
            
      System.out.println();
      System.out.println("Policy holder's information:");
      System.out.println("Policy Number: " + testProject_Paris_Webster.getPolicyNumber());
      System.out.println("Provider Name: " + testProject_Paris_Webster.getProviderName());
      System.out.println("First Name: " + testProject_Paris_Webster.getFirstName());
      System.out.println("Last Name: " + testProject_Paris_Webster.getLastName());
      System.out.println("Age: " + testProject_Paris_Webster.getAge());
      System.out.println("Smoker Stats: " + testProject_Paris_Webster.getSmokerStats());
      System.out.println("Height: " + testProject_Paris_Webster.getHeight());
      System.out.println("Weight: " + testProject_Paris_Webster.getWeight());
      System.out.printf("BMI: %.2f", testProject_Paris_Webster.getBMI());




   }
}