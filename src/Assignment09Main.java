public class Assignment09Main {
    public static void main(String[] args) {

        // 데이터베이스에 학생 정보 추가하기
        Student s1 = new Student("김지우", 201911111, 4.01);

        StudentDB sdb = new StudentDB();

        sdb.add(s1);
        sdb.add("이민준", 201922222, 3.85);
        sdb.add("박서윤", 201933333, 3.90);

        System.out.println("김지우를 검색해서 반환된 값을 출력");
        System.out.println(sdb.findBy("김지우"));
        System.out.println("학번 201922222을 검색해서 반환된 값을 출력");
        System.out.println(sdb.findBy(201922222));
        System.out.println("평점 3.90을 검색해서 반환된 값을 출력");
        System.out.println(sdb.findBy(3.90));
        System.out.println("평점이 3.95보다 낮은 학생을 검색해서 반환된 값을 출력");
        System.out.println(sdb.findBy(StudentDB.FindGPAParam.LOWER_THAN, 3.95));
        System.out.println("평점이 3.95보다 높은 학생을 검색해서 반환된 값을 출력");
        System.out.println(sdb.findBy(StudentDB.FindGPAParam.HIGHER_THAN, 3.95));

    }
}

// Class Student (String name, int number, double gpa)
// Student 생성자 / 각각의 함수 / 출력형식 맞춰서 출력하는 함수

// Class StudentDB
// 생성자에는 배열 생성