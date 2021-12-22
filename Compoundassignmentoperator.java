public class Compoundassignmentoperator {
 public static void main(String[] args) {
  byte bt = 24;
  System.out.println("bt: " + bt);
  bt += 10;
  System.out.println("bt: " + bt);
  bt -= 2;
  System.out.println("bt: " + bt);
  bt *= 2;
  System.out.println("bt: " + bt);
  bt /= 2;
  System.out.println("bt: " + bt);
  bt %= 7;
  System.out.println("bt: " + bt);
  bt <<= 3;
  System.out.println("bt: " + bt);
  bt >>= 4;
  System.out.println("bt: " + bt);
  bt >>>= 1;
  System.out.println("bt: " + bt);
  bt &= 4;
  System.out.println("bt: " + bt);
  bt ^= 4;
  System.out.println("bt: " + bt);
  bt |= 4;
  System.out.println("bt: " + bt);
 }
}