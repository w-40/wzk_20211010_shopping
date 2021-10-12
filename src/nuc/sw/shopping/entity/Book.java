package nuc.sw.shopping.entity;

public class Book {
    private int id;
    private String name;
    private String author;
    private float price;
    private int num;
    private Category category;

    public Book(int id, String name, String author, float price, int num, Category category) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
        this.num = num;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", num=" + num +
                ", category=" + category +
                '}';
    }
}
