package com.oop2020;

import java.util.Date;

public class Patient {
    private String name; // 이름
    private Date d = new Date(); // Date.getTime() Function
    private long t = d.getTime();

    // 생성자
    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 환자의 고유 아이디를 만들어서 부여하고 이를 확인할 수 있는 멤버 함수
    public String getId() {
        return t + name;
    }

    public String toString() {
        return "Patient: name: " + getName() + " id: " + getId();
    }
}
