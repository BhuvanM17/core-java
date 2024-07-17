class TopTenBatsmen {
    static String batsmen[] = {null, null, null, null, null, null, null, null, null, null};
    static int index;

    public static boolean addBatsman(String batsman) {
        boolean isBatsmanAdded = false;
        if (batsman != null) {
            batsmen[index] = batsman;
            index++;
            isBatsmanAdded = true;
        }
    return isBatsmanAdded;
    }

    public static void getBatsmenDetails() {
        System.out.println("Top 10 Batsmen:");
        for (int i = 0; i < batsmen.length; i++)
             System.out.println(batsmen[i]);
    }

    public static boolean updateBatsman(String oldBatsman, String newBatsman) {
        boolean isBatsmanUpdated = false;
        for (int i = 0; i < batsmen.length; i++){
            if (oldBatsman==batsmen[i]) {
                batsmen[i] = newBatsman;
                System.out.println(oldBatsman + " has been replaced with " + newBatsman);
                isBatsmanUpdated = true;
        }
    }if (isBatsmanUpdated == false) System.out.println("Batsman " + oldBatsman + " Top 10 ali irle ilapa");
        
    return isBatsmanUpdated;
    }
	public static void findBatsmans(String findBatsman){
		for(int i=0;i<batsmen.length;i++){
				if(findBatsman	==  batsmen[i]) {
					System.out.println("Batsman found : " +findBatsman);
					break;
				}else System.out.println("not found");
		}
	}
}
  

