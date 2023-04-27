package com.felix.spring6.iocxml.di;

/**
 * ClassName:Book
 * Package:com.felix.spring6.iocxml.di
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/20 9:27
 * @Version 1.0
 */
public class Book {
    private String bName;
    private String author;
    private String others;

    public Book() {
    }

    public Book(String bName, String author) {
        this.bName = bName;
        this.author = author;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bName='" + bName + '\'' +
                ", author='" + author + '\'' +
                ", others='" + others + '\'' +
                '}';
    }
}
