import java.util.Scanner;
public class Cuibased {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String username;
		String password;
		int count =0;
		while(count<3) {
			username = sc.nextLine();
			password = sc.nextLine();
			if(username.equals("charitha") && password.equals("12cherry")) {
			System.out.println("welcome" + username);
			break;
			}
			else {
				++count;
				System.out.println("attempts left" + (3- count));
			}
		}
		if (count ==3) {
			System.out.println("contact admin");			
			}
			
		}

	}


