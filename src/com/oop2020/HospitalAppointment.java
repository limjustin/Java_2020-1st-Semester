package com.oop2020;

import javax.print.Doc;
import java.time.LocalDateTime;

public class HospitalAppointment {
    private Doctor doctor;
    private Patient patient;
    private LocalDateTime time;

    // Constructor
    public HospitalAppointment(Doctor doctor, Patient patient, LocalDateTime time) {
        this.doctor = doctor;
        this.patient = patient;
        this.time = time;
    }

    // LocalDateTime을 반환해주는 멤버 함수
    public LocalDateTime getTime() {
        return time;
    }

    public String toString() {
        return "HospitalAppointment: " + getTime() + "\n" +
                doctor.toString() + "\n" + patient.toString();
    }
}
