package com.ohgiraffers.test.uses;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<BookDTO> bookList = new ArrayList<>();

    /* 책 추가 */
    public void addList(BookDTO book) {

        bookList.add(book);

    }
    /* 책 목록 조회 */
    public List<BookDTO> selectList() {
        return bookList;
    }


    /* 저자명으로 검색 */
    public List<BookDTO> searchAuthor(String author) {
        List<BookDTO> searchList = new ArrayList<>();

        for(BookDTO book : bookList) {
            if(book.getAuthor().contains(author)) {
                searchList.add(book);
            }
        }

        return searchList;
    }

    /* 제목명으로 검색 */
    public List<BookDTO> searchTitle(String title) {
        List<BookDTO> searchList = new ArrayList<>();
        for(BookDTO book : bookList) {
            if(book.getTitle().contains(title)) {
                searchList.add(book);
            }
        }

        return searchList;
    }

    /* 책 수정 */
    public boolean updateBook(BookDTO updateBook) {

        BookDTO original = null;

        for(int i = 0; i < bookList.size(); i++) {
            if(bookList.get(i).getId() == updateBook.getId()) {
                original = bookList.set(i, updateBook);
            }
        }

        return original != null;
    }

    /* 책 삭제 */
    public boolean removeBook(int id) {

        BookDTO original = null;

        for(int i = 0; i < bookList.size(); i++) {
            if(bookList.get(i).getId() == id) {
                original = bookList.remove(i);
            }
        }

        return original != null;
    }

}
