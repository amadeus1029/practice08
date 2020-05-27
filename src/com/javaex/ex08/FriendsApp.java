package com.javaex.ex08;

import java.util.Scanner;

public class FriendsApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("친구를 3명 등록해주세요");

        Friend[] friends = new Friend[3];


        for(int i=0;i<3;i++) {
            friends[i] = new Friend();
            String friendInfo = sc.nextLine();
            String[] friendInfoArray = friendInfo.split(" ");
            friends[i].setName(friendInfoArray[0]);
            friends[i].setPhone(friendInfoArray[1]);
            friends[i].setSchool(friendInfoArray[2]);
        }

        for(int i=0;i<friends.length;i++) {
            friends[i].showInfo();
        }

        sc.close();
    }
}
