package com.ohgiraffers.test.uses;


public class BookDTO {
    private static int nextId = 1;
    private int id;
    private String author;
    private String title;

    public BookDTO(String author, String title){
        this.id = BookDTO.nextId++;
        this.author = author;
        this.title = title;
    }

    public BookDTO(int id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        BookDTO.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
