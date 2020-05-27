package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        System.out.println("계산을 시작합니다");
        boolean end = false;
        do {
            System.out.print(">> ");
            String str = calc.nextLine();
            if("/q".equals(str)) {
                System.out.println("종료합니다");
                end = true;
            } else {
                str = str.trim();
                String[] strArray = str.split(" ");
                try {
                    int a = Integer.parseInt(strArray[0]);
                    int b = Integer.parseInt(strArray[2]);
                    switch (strArray[1]) {
                        case "+" :
                            Calc add = new Add();
                            add.setValue(a,b);
                            System.out.println(">> "+add.calculate());
                            break;
                        case "-" :
                            Calc sub = new Sub();
                            sub.setValue(a,b);
                            System.out.println(">> "+sub.calculate());
                            break;
                        case "*" :
                            Calc mul = new Mul();
                            mul.setValue(a,b);
                            System.out.println(">> "+mul.calculate());
                            break;
                        case "/" :
                            Calc div = new Div();
                            div.setValue(a,b);
                            System.out.println(">> "+div.calculate());
                            break;
                        default:
                            System.out.println("알수 없는 연산입니다.");
                            break;
                    }
                } catch(NumberFormatException ne) {
                    System.out.println("숫자만 입력해주세요");
                    calc = new Scanner(System.in);
                } catch(ArithmeticException ae) {
                    System.out.println("0으로는 나눌 수 없습니다");
                    calc = new Scanner(System.in);
                }
            }
        } while(!end);

        calc.close();
    }
}
