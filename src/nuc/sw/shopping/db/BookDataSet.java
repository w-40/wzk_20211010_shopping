package nuc.sw.shopping.db;

import nuc.sw.shopping.entity.Book;
import nuc.sw.shopping.entity.Category;

import java.util.Scanner;

public class BookDataSet {
    private Book[] books;

    /*public BookDataSet() {
        books = new Book[4];
        Category category1 = new Category(001, "计算机", "算法");
        Category category2 = new Category(002, "小说", "名著");
        books[0] = new Book(001, "数据结构", "严蔚敏", 54.6f, 34, category1);
        books[1] = new Book(002, "算法分析与设计", "李华玲", 54.6f, 34, category1);
        books[2] = new Book(003, "西游记", "吴承恩", 78.6f, 34, category2);
        books[3] = new Book(004, "红楼梦", "曹雪芹", 90.6f, 34, category2);
    }*/
    Scanner sc = new Scanner(System.in);

    public BookDataSet() {
    }

    public BookDataSet(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void addBook() {
        System.out.print("请输入要录入的图书的数量:");
        int N = sc.nextInt();
        books = new Book[N];

        for (int i = 0; i < books.length; i++) {
            int index = i + 1;
            System.out.println("---第" + index + "本书---");
            System.out.print("请输入书籍编号:");
            int id = sc.nextInt();
            System.out.print("请输入书名:");
            String name = sc.next();
            System.out.print("请输入图书作者:");
            String author = sc.next();
            System.out.print("请输入图书价格:");
            float price = sc.nextFloat();
            System.out.print("请输入该图书的数量:");
            int number = sc.nextInt();
            Category category = new Category(id, "", "");
            System.out.print("请输入商品一级类目:");
            category.setFirstLevel(sc.next());
            System.out.print("请输入商品二级类目:");
            category.setSecondLevel(sc.next());
            Book book = new Book(id, name, author, price, number, category);
            books[i] = book;
        }
    }

    public Book queryByName(String name) {
        for (int i = 0; i < books.length; i++) {
            if (name.equals(books[i].getName())) {
                return books[i];
            }
        }
        return null;
    }

    public void modifyBook() {
        int index = 100;
        System.out.print("请输入要修改的书的编号:");
        int id = sc.nextInt();
        for (int i = 0; i < books.length; i++) {
            if (books[i].getId() == id) {
                index = i;
            }
        }
        if (index <= books.length) {
            System.out.print("请输入修改后图书名称:");
            books[index].setName(sc.next());
            System.out.print("请输入修改后的图书作者:");
            books[index].setAuthor(sc.next());
            System.out.print("请输入修改后的图书价格:");
            books[index].setPrice(sc.nextFloat());
            System.out.print("请输入修改后图书的数量:");
            books[index].setNum(sc.nextInt());
            Category category = new Category(id, "", "");
            System.out.print("请输入修改后商品一级类目:");
            String firstLevel = sc.next();
            System.out.print("请输入修改后商品二级类目:");
            String secondLevel = sc.next();
            category.setFirstLevel(firstLevel);
            category.setSecondLevel(secondLevel);

        } else {
            System.out.println("您的输入有误，图书不存在");
        }
    }

    public void printBook() {
        System.out.println("书籍情况如下：");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }
}
