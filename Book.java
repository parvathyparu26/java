import java.util.*;
class Publisher {
    private String name;

    public Publisher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


class Book {
    private String title;
    private int year;
    private Publisher publisher;

    public Book(String title, int year, Publisher publisher) {
        this.title = title;
        this.year = year;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
        System.out.println("Publisher: " + publisher.getName());
    }
}


class LiteratureBook extends Book {
    private String author;

    public LiteratureBook(String title, int year, Publisher publisher, String author) {
        super(title, year, publisher);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

   
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Author: " + author);
        System.out.println("Category: Literature");
    }
}


class FictionBook extends Book {
    private String genre;

    public FictionBook(String title, int year, Publisher publisher, String genre) {
        super(title, year, publisher);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Genre: " + genre);
        System.out.println("Category: Fiction");
    }
}

 class Mains {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
System.out.println("enter the publishername");
 String pname =sc.nextLine();
        Publisher publisher = new Publisher(pname);
System.out.println("enter the literaturename");
        String lname =sc.nextLine();
System.out.println("enter the year");
int yr=sc.nextInt();
sc.nextLine();
System.out.println("enter the authorname");
String auth=sc.nextLine();
        LiteratureBook literatureBook = new LiteratureBook(lname,yr,publisher,auth);
System.out.println("enter the fictionname");

String tl=sc.nextLine();
System.out.println("enter the year");

int yer=sc.nextInt();
sc.nextLine();
System.out.println("enter the genre");

String gen=sc.nextLine();

        
        FictionBook fictionBook = new FictionBook(tl,yer,publisher,gen);

        
        System.out.println("Literature Book Details:");
        literatureBook.displayDetails();
        System.out.println();

        
        System.out.println("Fiction Book Details:");
        fictionBook.displayDetails();
    }
}
