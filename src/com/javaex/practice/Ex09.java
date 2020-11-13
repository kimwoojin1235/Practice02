package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자2개를 입력하세요");
		System.out.print("숫자1: ");
		int num1 = sc.nextInt();
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
		
		if (num1%num2==0) {
			System.out.println(num2+"은"+num1+"의 약수입니다.");
		}else if (num2%num1==0) {
			System.out.println(num1+"은"+num2+"의 약수입니다.");
		}else if (num1%num2!=0) {
			System.out.println(num2+"은"+num1+"의 약수가아닙니다.");
		}else if (num2%num1!=0) {
			System.out.println(num2+"은"+num1+"의 약수가아닙니다.");
		}

	}

}
