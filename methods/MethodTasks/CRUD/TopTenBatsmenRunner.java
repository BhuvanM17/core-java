class TopTenBatsmenRunner {
    public static void main(String []batsmans) {
        boolean isAdded = TopTenBatsmen.addBatsman("Virat Kohli");
        System.out.println(isAdded);

        TopTenBatsmen.addBatsman("Joe Root");
        System.out.println(isAdded);

        TopTenBatsmen.addBatsman("Kane Williamson");
        System.out.println(isAdded);

        TopTenBatsmen.addBatsman("Steve Smith");
        System.out.println(isAdded);

        TopTenBatsmen.addBatsman("Babar Azam");
        System.out.println(isAdded);

        TopTenBatsmen.addBatsman("Rohit Sharma");
        System.out.println(isAdded);

        TopTenBatsmen.addBatsman("David Warner");
        System.out.println(isAdded);

        TopTenBatsmen.addBatsman("Quinton de Kock");
        System.out.println(isAdded);

        TopTenBatsmen.addBatsman("Jonny Bairstow");
        System.out.println(isAdded);

        TopTenBatsmen.addBatsman("Aaron Finch");
        System.out.println(isAdded);

        TopTenBatsmen.getBatsmenDetails();

    boolean isUpdated = TopTenBatsmen.updateBatsman("Aaron Finch", "Chris Gayle");
	TopTenBatsmen.getBatsmenDetails();
	TopTenBatsmen.findBatsmans("Virat Kohli");
    }
}