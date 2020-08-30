import java.util.Scanner;
public class ticketInputs
{
  void inputValues(int n)
  {
    Scanner in=new Scanner(System.in);
    if(n==1)
    {
    System.out.println("Enter name");
    String name=in.nextLine();
    System.out.println("Enter number");
    String number=in.nextLine();
    System.out.println("Enter timings");
    int timing=in.nextInt();
    }
    else
    return
  }
  
  public static void main(String args[])
  { 
   int n=1;
   inputValues(n);
  }
}