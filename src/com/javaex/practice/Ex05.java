package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("키와몸무게를 입력해주세요");
		System.out.print("키: ");
		int key =sc.nextInt();
		System.out.print("몸무게: ");
		int weight = sc.nextInt();
		
		double  Norm = (key - 100)*0.9;
		if (weight<Norm) {
			System.out.println("저체중입니다.");
		}else if (weight==Norm) {
			System.out.println("표준입니다.");
		}else if (weight>Norm){
			System.out.println("과체중입니다.");
		}
		System.out.println("표준체중: "+Norm);
	}

}
