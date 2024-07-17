class Book {
        static String title = "To Kill a Mockingbird";
        static String author = "Harper Lee";
        static int pages = 336;
        static String genre = "Fiction";
        static boolean isFiction = true;

    public static void main(String[] args) {
        
        System.out.println("-------------------------------------------------");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Genre: " + genre);
        System.out.println("Is Fiction: " + (isFiction ? "Yes" : "No"));
        System.out.println("-------------------------------------------------");
    }
}
