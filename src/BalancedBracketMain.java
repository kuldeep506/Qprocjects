import java.util.Scanner;

public class BalancedBracketMain {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    BalancedBracket obj = new BalancedBracket(s.next());
    obj.check();

  }
}
