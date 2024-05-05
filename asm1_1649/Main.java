package asm1_1649;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.*;

class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    // Phương thức để hiển thị thông tin sách
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("--------------------");
    }
}

// Lớp quản lý đơn hàng
class OrderProcessingSystem {
    private LinkedList<Book> orderQueue;

    public OrderProcessingSystem() {
        orderQueue = new LinkedList<>();
    }

    // Thêm đơn hàng vào hàng đợi
    public void placeOrder(Book book) {
        orderQueue.add(book);
        System.out.println("Order placed for: " + book.getTitle());
    }

    // Xử lý đơn hàng tiếp theo trong hàng đợi
    public void processOrder() {
        if (!orderQueue.isEmpty()) {
            Book nextOrder = orderQueue.poll();
            System.out.println("Processing order for: " + nextOrder.getTitle());
            nextOrder.displayInfo();
        } else {
            System.out.println("No orders to process.");
        }
    }

    // Sắp xếp đơn hàng theo tiêu chí
    public void sortOrders(java.util.List<Book> books, String criteria) {
        switch (criteria) {
            case "title":
                Collections.sort(books, Comparator.comparing(Book::getTitle));
                break;
            case "author":
                Collections.sort(books, Comparator.comparing(Book::getAuthor));
                break;
            case "price":
                Collections.sort(books, Comparator.comparing(Book::getPrice));
                break;
            default:
                System.out.println("Invalid sorting criteria.");
        }
    }

    // Tìm kiếm sách theo tiêu chí
    public java.util.List<Book> searchBooks(java.util.List<Book> books, String keyword) {
        java.util.List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                    book.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }
}

// Lớp Main để kiểm tra hệ thống
public class Main {
    public static void main(String[] args) {
        // Khởi tạo hệ thống quản lý đơn hàng
        OrderProcessingSystem orderSystem = new OrderProcessingSystem();

        // Thêm sách vào hệ thống
        Book book1 = new Book("Java Programming", "John Smith", 29.99);
        Book book2 = new Book("Data Structures and Algorithms", "Alice Johnson", 39.99);
        Book book3 = new Book("Design Patterns", "Michael Chan", 49.99);

        // Đặt hàng
        orderSystem.placeOrder(book1);
        orderSystem.placeOrder(book2);
        orderSystem.placeOrder(book3);

        // Xử lý đơn hàng
        System.out.println("Processing orders:");
        orderSystem.processOrder();
        orderSystem.processOrder();
        orderSystem.processOrder();
        orderSystem.processOrder(); // Không có đơn hàng để xử lý

        // Tạo danh sách sách để sắp xếp và tìm kiếm
        java.util.List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        // Sắp xếp sách theo tiêu chí
        System.out.println("\nSorting books by title:");
        orderSystem.sortOrders(books, "title");
        for (Book book : books) {
            book.displayInfo();
        }

        // Tìm kiếm sách theo từ khóa
        System.out.println("\nSearching books by keyword 'Java':");
        java.util.List<Book> searchResults = orderSystem.searchBooks(books, "Java");
        for (Book book : searchResults) {
            book.displayInfo();
        }
    }
}
