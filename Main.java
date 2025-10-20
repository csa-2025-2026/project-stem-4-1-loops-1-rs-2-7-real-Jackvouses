import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here
    //int baubau = 3;
    //while (baubau <= 25)
    //{
      //System.out.println(baubau);
      //baubau += 2;
    //}
    
    
    Scanner wawa = new Scanner(System.in);
    //Problem 1:
    int sum = 0;
    int largest = 0;
    System.out.println("Enter any numbers (Enter -1 to stop)");
    int s = wawa.nextInt();
    while(s>=0)
    {
      sum += s;
      largest = Math.max(s, largest);
      s = wawa.nextInt();
    }
    System.out.println("Sum is " + sum);

    //Problem 2:
    System.out.println("The largest score is " + largest);
    wawa.nextLine();

    //Problem 3:
    System.out.println("Input a word:");
    String kon = wawa.nextLine();
    String ui = "";
    int owo = 0;
    while(owo<kon.length())
    {
      ui += kon.substring(owo, Math.min(kon.length(), owo+2));
      owo += 3;
    }
    System.out.println(ui);

  }
}
