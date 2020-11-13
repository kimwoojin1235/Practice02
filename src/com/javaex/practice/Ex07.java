package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자2개를 입력하세요");
		System.out.print("숫자1: ");
		int num1 = sc.nextInt();
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
		
		if (num1<num2) {
			int num3 = num2/num1;
			int num4 = num2%num1;
			System.out.println("몫:"+num3);
			System.out.println("나머지: "+num4);
		}else if (num1>num2) {
			int num3 = num1/num2;
			int num4 = num1%num2;
			System.out.println("몫:"+num3);
			System.out.println("나머지: "+num4);
		}else if (num1==num2) {
			int num3 = num1/num2;
			int num4 = num1%num2;
			System.out.println("몫:"+num3);
			System.out.println("나머지: "+num4);
			}
		sc.close();
	}

	}
