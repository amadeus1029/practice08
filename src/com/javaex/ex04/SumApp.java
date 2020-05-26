package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

    public static void main(String[] args) {

        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 공백으로 구분해서 입력하세요");

        //코드를 작성하세요
		boolean end = false;
		do {
			String numLine = sc.nextLine();
			String[] numArray = numLine.split(" ");

			try {
				for (int i = 0; i < numArray.length; i++) {
					sum += Integer.parseInt(numArray[i]);
				}
				System.out.println("합:" + sum);
				end = true;
			} catch (NumberFormatException e) {
				sum = 0;
				System.out.println("숫자만 입력해주세요");
				sc = new Scanner(System.in);
			}
		} while(!end);


        sc.close();
    }

}
