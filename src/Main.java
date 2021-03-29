//Import the HashSet class
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    HashSet<Integer> randomNumber1 = new HashSet<Integer>();
    HashSet<Integer> randomNumber2 = new HashSet<Integer>();
    randomNumber1.add(5);
    randomNumber1.add(2);
    randomNumber1.add(1);
    randomNumber1.add(5);
    randomNumber1.add(20);
    /**
     * adding integers to hashset 
     * @randomNumbers2
     */
    randomNumber2.add(40);
    randomNumber2.add(5);
    randomNumber2.add(10);
    randomNumber2.add(17);
    System.out.println(randomNumber1.equals(randomNumber2));
  }
}