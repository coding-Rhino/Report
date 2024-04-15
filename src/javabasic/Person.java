package javabasic;

public class Person {
//  -필드
//      인스턴스 변수 선언
    public String name;
    public int age;
    public int height;
    public int weight;
    public String university;
    public String major;
    public int grade;

// 생성자 생성(오버로딩)
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Person(int height, int weight){
        this.height = height;
        this.weight = weight;
    }
    public Person(String university, String major, int grade){
        this.university = university;
        this.major = major;
        this.grade = grade;
    }
//  -메서드
//      인스턴스 메서드
    public void information(String name, int age){
        System.out.println("이름은 " + name + "입니다.");
        System.out.println("나이는 " + age + "입니다.");
    }
}
