package homeWork8;

public class Book {
    private String author;
    private String name;
    private int catalogNumber;
    private int siteQuantity;
    private boolean used;

    public Book(String author, String name) {
        this.author = author;
        this.name = name;
        catalogNumber=0;
        siteQuantity=0;
    }

    public Book(String author, String name, int catalogNumber, int siteQuantity, boolean used) {
        this.author = author;
        this.name = name;
        this.catalogNumber = catalogNumber;
        this.siteQuantity = siteQuantity;
        this.used = used;
    }
    public void bookInfo(){
        System.out.println("Author :"+author);
        System.out.println("Author :"+name);
        System.out.println("The book have :"+siteQuantity+" sites");
        System.out.println("The number of catalog is :"+catalogNumber);
        if(used) {
            System.out.println("The book is in library");
        }else{
            System.out.println("The book being used by an user");
        }
    }

    public void changeInfo(int sites,int cNumber, boolean use){
        siteQuantity=sites;
        catalogNumber=cNumber;
        used=use;
    }
}
