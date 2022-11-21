package project1;

import java.util.Scanner;
public class task2 {

	public static void main(String[] args) {
	
	Scanner in=new Scanner(System.in);
System.out.println("Введите число");
int число=in.nextInt();

if(число%5==2) {
System.out.println("При делении на 5 остаток 2");
}
else System.out.println("никак");
if (число%7==1) {
	System.out.println("При делении на 7 остаток 1");
}
else System.out.println("никак");
in.close();
	}
	}