package homeWork8;

public class BookDemo {
    public static void main(String[] args) {
        BookManager bm=new BookManager();

        System.out.println("Create book with name of thr book and author`s name: ");
        Book b1=bm.newBook();

        System.out.println("Create book with full info: ");
        Book b2=bm.newBookFullInfo();

        System.out.println("Change info of the book: ");
        bm.newInfo(b1);

        System.out.println("Print info of the book: ");
        bm.bookInfo(b1);
    }
}
