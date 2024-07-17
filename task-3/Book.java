class Book {
    public static void main(String[] args) {
        String title = "To Kill a Mockingbird";
        String author = "Harper Lee";
        int pages = 336;
        String genre = "Fiction";
        boolean isFiction = true;

        System.out.println("-------------------------------------------------");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Genre: " + genre);
        System.out.println("Is Fiction: " + (isFiction ? "Yes" : "No"));
        System.out.println("-------------------------------------------------");
    }
}
