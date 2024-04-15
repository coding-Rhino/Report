package javabasic;

public class Book {
//  -필드
//      인스턴스 변수 선언
    public String title;
    public String author;
    public int price;
    public String publisher;
    public double rating;
    public int page;
    public int weight;
//  생성자 생성(오버로딩)
    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public Book(String publisher, double rating){
        this.publisher = publisher;
        this.rating = rating;
    }
    public Book(int page, int weight){
        this.page = page;
        this.weight = weight;
    }
//  -메서드
//      인스턴스 메서드
    public void bookInfo(String title, String author, int price){
        System.out.println("이 책의 제목은 " + title + " 입니다.");
        System.out.println("이 책의 작가는 " + author + " 입니다.");
        System.out.println("이 책의 가격은 " + price + "원 입니다.");
    }
}
