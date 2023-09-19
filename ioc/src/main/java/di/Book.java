package di;

public class Book {
    private String name;
    private String author;
    private Integer price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.setName("Java");
        book.setAuthor("James Gosling");
        book.setPrice(100);
        System.out.println(book.getName());
        System.out.println(book.getAuthor());
        System.out.println(book.getPrice());

        Book book2 = new Book("C++", "zsy", 500);
        System.out.println(book2.getName());
        System.out.println(book2.getAuthor());
        System.out.println(book2.getPrice());
    }

    public Book(String name, String author, Integer price) {
        System.out.println("有参数构造执行了。。。");
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book() {
        System.out.println("无参数构造");
    }
}
