import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
     int a, b, c, ch;
      System.out.println("Enter any two number");
      Scanner s = new Scanner(System.in);
      a = s.nextInt();
      b = s.nextInt();
      System.out.print("Enter your choice");
      ch = s.nextInt();
      switch (ch)
      {
          case 1: c=a+b;
          System.out.print("Addition" +c);
          break;
          case 2: c=a-b;
          System.out.print("Subtraction" +c);
          break;
          case 3: c=a*b;
          System.out.print("Mulitplication" +c);
          break;
          case 4: c=a/b;
          System.out.print("Divison" +c);
          break;
          case 5: c=a%b;
          System.out.print("Remainder" +c);
          break;
          Default: 
          System.out.print("Invaid choice");

      }
    }
}
