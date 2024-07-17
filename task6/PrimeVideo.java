class PrimeVideo {
    static String top10Movies[] = {"Interstellar", "The Shawshank Redemption", "Inception", "The Dark Knight", "Pulp Fiction", "Fight Club","Forrest Gump", "The Matrix", "Goodfellas", "Schindler's List"};
    
      static String kannadaMovies[] = {"KOTEE", "Kirik Party", "Ulidavaru Kandanthe", "Mungaru Male", "Raajakumara", "Rangitaranga", "Dia", "Avane Srimannarayana", "Lucia", "Love Mocktail", "Gantumoote", "Aa Karaala Ratri", "Thithi", "KGF chapter 2", "Bell Bottom", "Simple Agi Ondh Love Story", "Lucia", "Chowka", "Dia", "Kirik Party"};

     static String englishMovies[] = {"Avengers: Endgame", "Titanic", "Avatar", "Jurassic Park", "Avatar", "The Godfather", "Forrest Gump", "Titanic", "The Lion King", "Spider-Man: No Way Home", "Jaws", "Black Panther", "Harry Potter and the Philosopher's Stone", "Home Alone", "Transformers: Dark of the Moon", "Madagascar", "Spider-Man: Far From Home", "Spider-Man: Homecoming", "The Dark Knight Rises", "Captain America: The Winter Soldier", "Deadpool", "Pirates of the Caribbean: The Curse of the Black Pearl", "Jurassic Park"};

       static String hindiMovies[] = {"Dilwale Dulhania Le Jayenge", "Sholay", "Kabhi Khushi Kabhie Gham", "3 Idiots", "Lagaan", "Andaz Apna Apna", "Hum Aapke Hain Koun..!", "Dil Chahta Hai", "Border", "Kuch Kuch Hota Hai", "Swades", "Kal Ho Naa Ho", "Zindagi Na Milegi Dobara", "Gangs of Wasseypur", "Jab We Met", "PK", "Bajrangi Bhaijaan", "Barfi!", "Om Shanti Om", "Bhaag Milkha Bhaag"};

     static String malayalamMovies[] = {"Drishyam", "Premam", "Bangalore Days", "Njan Prakashan", "Charlie", "Kumbalangi Nights", "Uyare", "Moothon", "Kammatipaadam", "Maheshinte Prathikaaram", "Thondimuthalum Driksakshiyum", "Ee.Ma.Yau", "Angamaly Diaries", "Sudani From Nigeria", "Jallikattu", "Pathemari", "Varane Avashyamund", "Kali", "Ayyappanum Koshiyum"
    };

    public static void main(String[] movies) {
        System.out.println("---------------------------------------PrimeVideo Movie Categories------------------------------------------------------");
        
        System.out.println("Top 10 Movies:");
		for(String top10Movie:top10Movies){
			 System.out.println(top10Movie);
		}
     
        System.out.println("\nKannada Movies:");
       	for(String kannadaMovie:kannadaMovies){
			 System.out.println(kannadaMovie);
		}
        System.out.println("\nEnglish Movies:");
        for(String englishMovie:englishMovies){
			 System.out.println(englishMovie);
		}
        System.out.println("\nHindi Movies:");
		for(String hindiMovie:hindiMovies){
			 System.out.println(hindiMovie);
		}
        System.out.println("\nMalayalam Movies:");
		for(String malayalamMovie:malayalamMovies){
			 System.out.println(malayalamMovie);
		}
        System.out.println("------------------------------------------------------THANK YOU:-)------------------------------------------------------");
    }
}
