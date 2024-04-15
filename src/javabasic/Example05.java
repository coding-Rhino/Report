package javabasic;

public class Example05 {
    public static void main(String[] args) {
//      1
//      Person 클래스를 생성하고, 이름(name)과 나이(age)를 필드로 가지게 하세요.
//      해당 클래스에는 이름과 나이를 설정할 수 있는 생성자와, 이를 출력할 수 있는 메서드를 포함하세요.
        Person person = new Person("방승욱", 25);
        person.information(person.name, person.age);
//      2
//      Book 클래스를 만들고,
//      제목(title), 저자(author), 가격(price)을 필드로 정의하세요. 모든 필드를 초기화하는 생성자와, 필드 값을 출력하는 메서드를 포함하세요.
        Book book = new Book("객체지향의 사실과 오해", "조영호", 18000);
        book.bookInfo(book.title, book.author, book.price);
//      3
//      Person 객체를 두 개 생성하고,
//      각 객체에 대한 정보를 출력하세요. 이어서 Book 객체를 생성하고, 그 정보를 출력하세요.
        Person bodyInfo = new Person(172, 100);
        System.out.println(person.name + "의 키와 몸무게는 " +
                        bodyInfo.height + "cm, " + bodyInfo.weight + "kg 입니다.");
        Person highestEducationLevel = new Person("경기대학교", "전자공학과", 4);
        System.out.println(person.name + "의 최종학력은 " +
                highestEducationLevel.university + ", " +
                highestEducationLevel.major + ", " +
                highestEducationLevel.grade + "학년 입니다.");
        Book additionalInfo1 = new Book("위키북스", 9.4);
        System.out.println(book.title + "의 출판사는 "+
                additionalInfo1.publisher + " 입니다.");
        System.out.println(book.title + "의 평점은 "+
                additionalInfo1.rating + "점 입니다.");
        Book additionalInfo2 = new Book(260, 590);
        System.out.println(book.title + "의 페이지는 "+
                additionalInfo2.page + "쪽 입니다.");
        System.out.println(book.title + "의 무게는 "+
                additionalInfo2.weight + "g 입니다.");
    }
}

