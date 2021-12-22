public class Variable {
 int salary; 

 public void show() {
  int value = 2; 
  value = value + 10;
  System.out.println("The Value is : " + value);
  salary = 10000;
  System.out.println("The salary is : " + salary);
 }

 public static void main(String args[]) {
  Variable eg = new Variable();
  eg.show();
 }
}