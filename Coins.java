import java.util.*;
class Coins {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("Enter amount in cents: ");
    int money = console.nextInt();
    int quarters = money / 25;
    money %= 25;
    int dimes = money / 10;
    money %= 10;
    int nickles = money / 5;
    money %= 5;
    int pennies = money;
    System.out.println("The amount of coins is:");
    System.out.println("Quarters: " + quarters);
    System.out.println("Dimes: " + dimes);
    System.out.println("Nickles: " + nickles);
    System.out.println("Pennies: " + pennies);
  }
}
