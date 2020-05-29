package com.oop2020;

public class Doctor {
    private String name; // 이름
    private int id; // 아이디

    // 생성자
   public Doctor(int id, String name) {
       this.id = id;
       this.name = name;
   }

   // 이름 속성 확인 멤버 함수
   public String getName() {
       return name;
   }

   // 아이디 속성 확인 멤버 함수
   public int getId() {
       return id;
   }

   public String toString() {
       return "Doctor name: " + getName() + " id: " + getId();
   }

}
