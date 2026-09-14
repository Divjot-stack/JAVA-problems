public class librarybook {
    String title;
    String author;
    double price;

    public static void main(String[] args) {
        librarybook b = new librarybook();

        b.title = "Java Programming";
        b.author = "James Gosling";
        b.price = 599.50;

        System.out.println("Book Details");
        System.out.println("Title : " + b.title);
        System.out.println("Author : " + b.author);
        System.out.println("Price : Rs. " + b.price);
    }
}