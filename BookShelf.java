package Hw4;

import java.util.ArrayList;

public class BookShelf {
    private char shelf_letter;
    private ArrayList<Book> books;

    public BookShelf(char letter){
        shelf_letter = letter;
        books = new ArrayList<Book>(8);
    }

    public char getShelf_letter(){
        return shelf_letter;
    }
    public ArrayList<Book> getBooks(){
        return books;
    }
    public void setShelf_letter(char l){
        shelf_letter = l;
    }
    public void setBooks(ArrayList<Book> b){
        books = b;
    }

    public void addBook(Book b){
        if(b.toString().charAt(0) == shelf_letter){
            books.add(b);
        }
        return;
    }

    public void removeBook(Book book){
        books.remove(book);
    }

    public String toString(){
        if(books.isEmpty()){
            return "Empty";
        }
        String temp = "";
        for(Book book : books){
            temp = temp + book + "   ";
        }
        return temp;
    }

}
