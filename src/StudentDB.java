public class StudentDB {

    enum FindGPAParam {
        LOWER_THAN, HIGHER_THAN;
    }

    Student[] students;
    int index = 0;

    // 생성자
    StudentDB() {
        students = new Student[3];
    }

    // 이 부분도 어려웠음
    void add(Student student) { // 첫 번째 학생
        students[index++] = student;
    }

    // 이 부분 좀 어려웠는데 나중에 한번 다시 봐보기
    void add(String name, int number, double gpa) { // 나머지 학생
        Student student = new Student(name, number, gpa);
        students[index++] = student;
    }

    Student findBy(String name) {
        for(int i = 0; i < 3; i++) {
            if(students[i].getName() == name) {
                return students[i];
            }
        }
        return null;
    }

    Student findBy(int number) {
        for(int i = 0; i < 3; i++) {
            if(students[i].getNumber() == number) {
                return students[i];
            }
        }
        return null;
    }

    Student findBy(double gpa) {
        for(int i = 0; i < 3; i++) {
            if(students[i].getGPA() == gpa) {
                return students[i];
            }
        }
        return null;
    }

    Student findBy(FindGPAParam param, double gpa) {
        if(param == FindGPAParam.HIGHER_THAN) {
            for(int k = 0; k < 3 ; k++) {
                if(students[k].getGPA() > gpa) {
                    return students[k];
                }
            }
        } else if (param == FindGPAParam.LOWER_THAN) {
            for(int k = 0; k < 3; k++) {
                if(students[k].getGPA() < gpa) {
                    return students[k];
                }
            }
        } else {
            System.out.println("There is no students about this search");
        }
        return null;
    }
}
