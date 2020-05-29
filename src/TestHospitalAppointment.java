import com.oop2020.Doctor;
import com.oop2020.HospitalAppointment;
import com.oop2020.Patient;

import java.time.LocalDateTime;

public class TestHospitalAppointment {
    public static void main(String[] args) {
        Doctor d = new Doctor(10, "Dr. Lim");
        Patient p = new Patient("cho");
        LocalDateTime d1 = LocalDateTime.of(2020, 5,
                20, 13, 30, 0);
        LocalDateTime d2 = LocalDateTime.of(2020, 6,
                20, 13, 30, 0);
        LocalDateTime d3 = LocalDateTime.of(2020, 7,
                20, 13, 30, 0);

        // 병원 약속 객체들을 배열에 추가
        HospitalAppointment[] has = new
                HospitalAppointment[3];
        has[0] = new HospitalAppointment(d, p, d1);
        has[1] = new HospitalAppointment(d, p, d2);
        has[2] = new HospitalAppointment(d, p, d3);
        // 화면에 출력
        for (HospitalAppointment apnt : has) {
            System.out.println(apnt);
        }

    }
}
