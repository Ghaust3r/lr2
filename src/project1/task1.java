package project1;
import java.util.Scanner;
public class task1 {

	public static void main(String[] args) {
	
	Scanner in=new Scanner(System.in);
System.out.println("Введите число");
int число=in.nextInt();
if(число % 3 == 0) {
System.out.println("Число кратно 3");
}
else System.out.println("Число не делится на 3");
in.close();
	}
	}
