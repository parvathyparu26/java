class Publisher {
    private String name;

    public Publisher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Books {
    private String title;
    private String author;
    private Publisher publisher;

    public Books(String title, String author, Publisher publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Publisher getPublisher() {
        return publisher;
    }
}

class Literature extends Books {
    private String genre;

    public Literature(String title, String author, Publisher publisher, String genre) {
        super(title, author, publisher);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}

class Fiction extends Books {
    private String subgenre;

    public Fiction(String title, String author, Publisher publisher, String subgenre) {
        super(title, author, publisher);
        this.subgenre = subgenre;
    }

    public String getSubgenre() {
        return subgenre;
    }
}

public class BookDetails {
    public static void main(String[] args) {
        // Creating instances of publishers
        Publisher penguinBooks = new Publisher("Penguin Books");
        Publisher vintageClassics = new Publisher("Vintage Classics");
        Publisher bloomsbury = new Publisher("Bloomsbury");
        Publisher doubleday = new Publisher("Doubleday");

        // Creating instances of books
        Literature book1 = new Literature("To Kill a Mockingbird", "Harper Lee", penguinBooks, "Classic");
        Literature book2 = new Literature("Pride and Prejudice", "Jane Austen", vintageClassics, "Romance");
        Fiction book3 = new Fiction("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", bloomsbury, "Fantasy");
        Fiction book4 = new Fiction("The Da Vinci Code", "Dan Brown", doubleday, "Mystery");

        // Creating an array of all books
        Books[] allBooks = { book1, book2, book3, book4 };

        // Printing literature books
        System.out.println("Literature Books:");
        printBooksByCategory(allBooks, Literature.class);

        // Printing fiction books
        System.out.println("Fiction Books:");
        printBooksByCategory(allBooks, Fiction.class);
    }

    public static void printBooksByCategory(Books[] booksArray, Class<?> category) {
        for (Books book : booksArray) {
            if (category.isInstance(book)) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Publisher: " + book.getPublisher().getName());

                if (category == Literature.class) {
                    Literature literatureBook = (Literature) book;
                    System.out.println("Genre: " + literatureBook.getGenre());
                } else if (category == Fiction.class) {
                    Fiction fictionBook = (Fiction) book;
                    System.out.println("Subgenre: " + fictionBook.getSubgenre());
                }

                System.out.println();
            }
        }
    }
}
