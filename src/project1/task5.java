package project1;

import java.util.Scanner;

public class task5 {
//Задание5
		public static void main(String[] args) {	
			Scanner in=new Scanner(System.in);
		System.out.println("Введите число");
		int число=in.nextInt();
		int x;
		x=число%1000;
		x/=1000;
		число/=1000;
		число-=x;
		System.out.println("Число содержит "+Math.round(число)+ " тысяч(и)");
		in.close();
			}
			}