package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;

		System.out.println(p1 == p2); //false
		System.out.println(p2 == p3); //false
		System.out.println(p3 == p4); //false
		System.out.println(p4 == p1); //true - 위에서 주소를 대입하였으므로
		System.out.println(p1.equals(p2)); //false
		System.out.println(p4.equals(p1)); //true 위와 같은 이유로

		//equals는 기본 자바 오브젝트로부터 상속받은 메소드이므로 없어도 작동가능
	}

}


