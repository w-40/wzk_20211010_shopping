package nuc.sw.shopping;

import nuc.sw.shopping.db.BookDataSet;
import nuc.sw.shopping.entity.Book;

import java.util.Scanner;

public class TestBookDataSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookDataSet bookDatabase = new BookDataSet();
        Book[] books = bookDatabase.getBooks();

        while (true) {
            System.out.println("------电商购物平台------");
            System.out.println("1 录入商品");
            System.out.println("2 修改商品");
            System.out.println("3 查看商品");
            System.out.println("4 查询商品");
            System.out.println("请输入您的选择");

            String choice = sc.next();

            switch (choice) {
                case "1":
                    bookDatabase.addBook();
                    break;
                case "2":
                    bookDatabase.modifyBook();
                    break;
                case "3":
                    bookDatabase.printBook();
                    break;
                case "4":
                    System.out.println("请输入你想查找的书籍名称：");
                    String name = sc.next();
                    Book b = bookDatabase.queryByName(name);
                    if (b != null) {
                        System.out.println(b);
                    } else {
                        System.out.println("查无此书!");
                    }
                    break;
                default:
                    System.out.println("您的输入有误");
            }
        }
    }
}
