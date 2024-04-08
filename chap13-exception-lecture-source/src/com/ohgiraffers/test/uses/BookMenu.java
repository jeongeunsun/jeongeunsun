package com.ohgiraffers.test.uses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMenu {

    private BookManager bookManager = new BookManager();
    private Scanner sc = new Scanner(System.in);

    public void mainMenu() {

        mainMenu:
        while (true) {
            System.out.println("========== 메뉴 ==========");
            System.out.println("1. 책 추가");
            System.out.println("2. 책 전체 조회");
            System.out.println("3. 정렬하여 조회");
            System.out.println("4. 저자명으로 검색");
            System.out.println("5. 제목명으로 검색");
            System.out.println("6. 책 정보 수정");
            System.out.println("7. 책 삭제");
            System.out.println("0. 프로그램 종료");


            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    addList();
                    break;
                case 2:
                    selectList();
                    break;
                case 3:
                    sortMenu();
                    break;
                case 4:
                    searchAuthor();
                    break;
                case 5:
                    searchTitle();
                    break;
                case 6:
                    updateBook();
                    break;
                case 7:
                    removeBook();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break mainMenu;
                default:
                    System.out.println("잘못 선택하셨습니다. 번호를 다시 입력해주세요.");
                    break;
            }
        }

    }

    public void addList() {
        System.out.println("===== 책 추가 =====");
        System.out.print("저자 입력 : ");
        String author = sc.nextLine();
        System.out.print("제목 입력 : ");
        String title = sc.nextLine();

        bookManager.addList(new BookDTO(author, title));
    }

    public void selectList() {
        System.out.println("===== 책 전체 조회 =====");
        List<BookDTO> bookList = bookManager.selectList();

        if (!bookList.isEmpty()) {
            for (BookDTO book : bookList) {
                System.out.println(book);
            }
        } else {
            System.out.println("목록이 존재하지 않습니다.");
        }
    }

    public void sortMenu() {
        System.out.println("===== 정렬 메뉴 =====");
        System.out.println("1. 저자명 오름차순 정렬");
        System.out.println("2. 제목명 오름차순 정렬");
        System.out.println("3. 저자명 내림차순 정렬");
        System.out.println("4. 제목명 내림차순 정렬");
        System.out.print("메뉴 선택 : ");
        int menu = sc.nextInt();

        ascDesc(menu);
    }

    public void ascDesc(int menu) {
        System.out.println("===== 정렬하여 조회 =====");
        List<BookDTO> bookList = bookManager.selectList();

        if (bookList.isEmpty()) {
            System.out.println("목록이 존재하지 않습니다.");
            return;
        }

        List<BookDTO> sortList = new ArrayList<>();
        sortList.addAll(bookList);

        if (menu == 1) {
            sortList.sort(new AscAuthor());
        } else if (menu == 2) {
            sortList.sort(new AscTitle());
        } else if (menu == 3) {
            sortList.sort(new DescAuthor());
        } else {
            sortList.sort(new DescTitle());
        }

        for (int i = 0; i < sortList.size(); i++) {
            System.out.println(sortList.get(i));
        }
    }


    public void searchAuthor() {
        System.out.println("===== 저자명으로 검색 =====");
        System.out.print("저자명 입력 : ");
        List<BookDTO> searchList = bookManager.searchAuthor(sc.nextLine());

        if (!searchList.isEmpty()) {
            for (int i = 0; i < searchList.size(); i++) {
                System.out.println(searchList.get(i));
            }
        } else {
            System.out.println("검색 결과가 없습니다.");
        }
    }

    public void searchTitle() {
        System.out.println("===== 제목명으로 검색 =====");
        System.out.print("제목명 입력 : ");
        List<BookDTO> searchList = bookManager.searchTitle(sc.nextLine());

        if (!searchList.isEmpty()) {
            for (int i = 0; i < searchList.size(); i++) {
                System.out.println(searchList.get(i));
            }
        } else {
            System.out.println("검색 결과가 없습니다.");
        }
    }


    public void updateBook() {
        System.out.println("===== 책 정보 수정 =====");
        System.out.print("수정할 책의 id : ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("수정할 저자명 입력 : ");
        String updateAuthor = sc.nextLine();
        System.out.print("수정할 제목명 입력 : ");
        String updateTitle = sc.nextLine();

        BookDTO updateBook = new BookDTO(id, updateAuthor, updateTitle);

        if (bookManager.updateBook(updateBook)) {
            System.out.println("성공적으로 수정되었습니다.");
        } else {
            System.out.println("수정할 책을 찾지 못했습니다.");
        }
    }

    public void removeBook() {
        System.out.println("===== 책 삭제 =====");
        System.out.print("삭제할 책의 id : ");
        if (bookManager.removeBook(sc.nextInt())) {
            System.out.println("성공적으로 삭제 되었습니다.");
        } else {
            System.out.println("삭제할 책을 찾지 못했습니다.");
        }
        sc.nextLine();
    }
}
