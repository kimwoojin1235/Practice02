package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수익을 입력해 주세요");
		System.out.print("금익: ");
		int point = sc.nextInt();
		double tax = 0;
		
		if (point>0) {
			if (point<=1000) {
				tax = 0.09*point;
				System.out.println("소득세는"+tax+"입니다.");
			}else if (point>1000) {
				if (point<=4000) {
					tax = (double)1000*0.09+(0.18*(point-1000));
					System.out.println("소득세는"+tax+"입니다.");
				}else if (point > 4000) {
					if (point <=8000) {
						tax = (double)1000*0.09+3000*0.18+(0.27*(point-4000));
						System.out.println("소득세는"+tax+"입니다.");
					}else if (point >=8000) {
							tax = (double)1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(point-8000);
							System.out.println("소득세는"+tax+"입니다.");
						}
					}
				}
			}else {
				System.out.println("잘못입력했습니다.");
			}		
		}
	}


