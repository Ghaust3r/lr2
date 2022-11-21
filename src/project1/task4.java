package project1;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {	
			Scanner in=new Scanner(System.in);
		System.out.println("Введите число");
		int число=in.nextInt();

		if(число>=5 && число<=10) {
		System.out.println("Число удовлетворяет критериям");
		}
		else System.out.println("Все плохо");
		in.close();
			}
			}