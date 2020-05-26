package com.javaex.ex08;

public class Friend {
    private String name,phone,school;

    public Friend() {
    }

    public Friend(String name, String phone, String school) {
        this.name = name;
        this.phone = phone;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void showInfo() {
        System.out.println("이름: "+this.name+"\t핸드폰: "+this.phone+"\t학교: "+this.school);
    }
}
