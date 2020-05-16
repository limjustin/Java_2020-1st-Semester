public class Student {

    // 변수 선언
    String name;
    int number = 0;
    double gpa = 0.0;

    // 생성자에서는 변수 초기화
    Student(String name, int number, double gpa) {
        this.name = name;
        this.number = number;
        this.gpa = gpa;
    }

    String getName() {
        return name;
    }

    int getNumber() {
        return number;
    }

    double getGPA() {
        return gpa;
    }

    // 이거 좀 생각해보기!! 왜??
    @Override
    public String toString() {
        // 새로운 문자열 형태를 만들어서 반환하는 함수
        String s;
        s = "Name: " + getName() + ", Number: " + getNumber() + ", GPA: " + getGPA();
        return s;
    }
}
