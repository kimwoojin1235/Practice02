package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자: ");
		int num1 = sc.nextInt();
		
		if(num1 <= 0) {
			double result = Math.pow(num1, 3) - 9 * num1 + 2;
			System.out.println("계산결과는 " + result + "입니다.");		
		}else {
			double result = 7 * num1 + 2;
			System.out.println("계산결과는 " + result + "입니다.");
		}

	}

}
