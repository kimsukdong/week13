package week13;
import java.util.*;

public class Member {
	public static void main(String[] args) {
		String id,passwd;

		try{
			Scanner sc = new Scanner(System.in);

			System.out.print("ID 입력: ");
			id = sc.next();
			if(id.equals("0")) throw new NotExistIDException();
			
			System.out.print("Password 입력: ");
			passwd = sc.next();
			if(passwd.equals("0")) throw new WrongPasswordException();

		}

		catch (NotExistIDException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		catch (WrongPasswordException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
}

class NotExistIDException extends Exception{
	public NotExistIDException() {
		super("ID가 없음");
	}
}
class WrongPasswordException extends Exception{
	public WrongPasswordException() {
		super("Password가 잘못됨");
	}
}