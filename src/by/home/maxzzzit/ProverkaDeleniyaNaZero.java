package by.home.maxzzzit;

import java.util.Scanner;

public class ProverkaDeleniyaNaZero {
	public static void main(String[]args) {
		Scanner scn = new Scanner(System.in);
		double a,b;
		System.out.print("Введите первое число - ");
		a=scn.nextDouble();
		System.out.print("Введите второе число - ");
		b=scn.nextDouble();
		if (b==0) {
			System.out.println("Деление на ноль невозможно!");
//			return;
//			System.exit(1);
		}
		else System.out.println("a = "+a+"\nb = "+b+"\na / b = "+a/b);
	}
}
