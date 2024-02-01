package selenium;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		System.out.println("Enter some Number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		try {
			int ans = num/0;
			System.out.println(ans);
		}
//		}catch (ArithmeticException e) {
//			System.err.println("Divisible by 0 is not possible");
//		}
//		catch(InputMismatchException e) {
//			System.out.println(e);
//		}
		catch(Exception e) {
			System.out.println("Anyway its Work");
		}finally {
			sc.close();
		}
		System.out.println("Its Done");
		}
	}

