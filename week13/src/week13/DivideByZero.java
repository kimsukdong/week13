package week13;
import java.util.*;

public class DivideByZero {
   public static void main(String[] args) {
      int number1, number2, result;

		
      Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수: ");
		number1 = sc.nextInt();
		  
		System.out.print("두번째 정수: ");
		number2 = sc.nextInt();
		
		result = number1/number2;
		System.out.println(result);
		
		sc.close();

   }
}