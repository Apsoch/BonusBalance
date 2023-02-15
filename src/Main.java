public class Main {
  public static void main(String[] args) {
    int balance = 100;
    int transferAmount = 1300;

    // Написание через if/else
  /*      int bonus;
        if (transferAmount > 1000) {
            bonus = transferAmount / 100;
        } else {
            bonus = 0;
        }*/

//Укороченное написание
    int bonus = transferAmount > 1000 ? transferAmount / 100 : 0;
    int finalBalans = balance + transferAmount + bonus;
    System.out.println("Бонус: " + bonus);
    System.out.println("Итого на балансе: " + finalBalans);
  }
}