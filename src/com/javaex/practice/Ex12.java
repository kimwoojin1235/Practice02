package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호: ");
		String num1 = sc.nextLine();
		System.out.print("숫자1: ");
		int num2 = sc.nextInt();
		System.out.print("숫자2: ");
		int num3 = sc.nextInt();

		switch (num1) {
		case "+": double num4 = num2+num3;
			System.out.println("결과는:"+num4);
			break;
		case "-": double num5 = num2-num3;
		System.out.println("결과는:"+num5);
		break;
		case "*": double num6 = num2*num3;
		System.out.println("결과는:"+num6);
		break;
		case "/":
		if (num3==0) {
			System.out.println("계산할수 없습니다.");
		}else {
			 double num7 = num2/num3;
				System.out.println("결과는:"+num7);
		}
		break;
		default:
			System.out.println("계산할수 없는 분모입니다.");
			break;
		}
		sc.close();
	}

}
