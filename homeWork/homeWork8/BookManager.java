package homeWork8;

import classes.UserInput;

public class BookManager {
    UserInput ui=new UserInput();

    public Book newBook(){
        return new Book(ui.inputText("Enter author`s name"),ui.inputText("Enter name of the book"));
    }
    public Book newBookFullInfo(){
        return new Book(ui.inputText("Enter author`s name"),
                ui.inputText("Enter name of the book"),
                ui.inputInt("Enter the number of catalog"),
                ui.inputInt("Enter the number of pages"),
                ui.inputBool("Is book in library"));
    }
    public void bookInfo(Book book){
        book.bookInfo();
    }
    public void newInfo(Book book){
        book.changeInfo(ui.inputInt("Enter the number of catalog"),
                ui.inputInt("Enter the number of pages"),
                ui.inputBool("Is book in library"));
    }

}
