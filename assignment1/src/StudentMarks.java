import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maths;
		int physics;
		int chemistry;
		Scanner sc=new Scanner(System.in);
		maths=sc.nextInt();
		physics=sc.nextInt();
		chemistry=sc.nextInt();
		if((maths>60 && physics>60 && chemistry>60)) {
			System.out.println("passed");
			}
		else if((maths>60 && physics>60)||(maths>60 && chemistry>60)||(physics>60 && chemistry>60)) {
			System.out.println("promoted");
		}
		else if(((maths>60)||(physics>60 && chemistry>60 && maths>60))||((physics>60)||(maths>60 && physics>60 && chemistry>60))||((chemistry>60)||(maths>60 && physics>60 && chemistry>60))) {
			System.out.println("failed");
			sc.close();
		}
		}

	}



