class SportsMania {
     static String iplTeams[] = {"Royal Challengers Bangalore","Chennai Super Kings", "Mumbai Indians", "Kolkata Knight Riders",  "Sunrisers Hyderabad", "Rajasthan Royals", "Delhi Capitals", "Punjab Kings", "Gujarat Titans", "Lucknow Super Giants"};
    
        static String top10Batsmen[] = {"AB Devilers", "Virat Kohli", "Rohit Sharma", "Joe Root", "Kane Williamson", "Steve Smith", "David Warner", "Quinton de Kock", "Josh Butler", "Shikhar Dhawan"};

     static String top10Bowlers[] = {"Jasprit Bumrah", "Trent Boult", "Rashid Khan", "Pat Cummins", "Kagiso Rabada", "Jofra Archer", "Yuzvendra Chahal", "Mohammed siraj", "Ravichandran Ashwin", "Mohammed Shami"};

      static String top10ICCTeams[] = {"India","England",  "Australia", "New Zealand;[-", "South Africa", "Pakistan", "Bangladesh", "West Indies", "Sri Lanka", "Afghanistan"};

    public static void main(String[] cric) {
        System.out.println("---------------------------------------INTRESTING FACTS-------------------------------------------------------------");
        
	System.out.println("IPL Teams:");
		for(String iplTeam:iplTeams){
			System.out.println(iplTeam);
		}
	System.out.println("\nTop 10 Batsmen:");
		for(String b:top10Batsmen){
			System.out.println(b);
		}

	System.out.println("\nTop 10 Bowlers:");
       for(String c:top10Bowlers){
			System.out.println(c);
		}


	System.out.println("\nTop 10 ICC Teams:");
        for(String top: top10ICCTeams){
			System.out.println(top);
	}


        System.out.println("---------------------------------------------KEEP SMILING;-)------------------------------------------------------");
    }
}
