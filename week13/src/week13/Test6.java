package week13;

import java.util.Scanner;

public class Test6 {
	 public static void main(String[] args) {
	      int sum = 0, count;

	    try {
			Scanner sc = new Scanner(System.in);
			  System.out.print("정수의 개수: ");
			  count = sc.nextInt();

			  for(int i=0; i<count; i++){
				  int score;
				  System.out.print("정수를 입력하시오: ");
				  score = sc.nextInt();
				  if(score <0) throw new NegativeNumberException();
				  sum+=score;
			  }
			  System.out.println("평균은 "+ sum/count);
		} 
	    catch (ArithmeticException e) {
			System.out.println(e+" 산술 오류");
		}
		catch (NegativeNumberException e) {
			System.err.println(e+" 음수 입력 오류");
		}
	   }
	}

	class NegativeNumberException extends Exception {
		public NegativeNumberException() {
			super();
		}
	}