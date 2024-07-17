class RedChilliesEntertainment {

	static String movieActors[] = {null, null, null, null, null, null, null, null, null,null};
	static int index = 0;

	public static boolean addMovieActors(String actorName){

		boolean isActorAdded = false;
		if(actorName != null){
			movieActors[index] = actorName;
			index++;
			isActorAdded = true;
		}
		else {
			System.out.println("Invalid actor name Added");
		}
		
	return isActorAdded;
	}

	public static void getMovieActors(){
		System.out.println("The movie actors available are:");
		for(String actor : movieActors){
			if(actor != null){
				System.out.println(actor);
			}
		}
}
	public static boolean updateMovieActor(String oldActor,String newActor){
		boolean isActorUpdated = false;
		for(int i=0;i<movieActors.length;i++){
			if(oldActor == movieActors[i]){
					movieActors[i]	= newActor;
					System.out.println(oldActor+" has been replaced with "+newActor);
					isActorUpdated = true;
			}	
		}
		if(isActorUpdated == false) System.out.println("guru ee hero nin kade ila ");
		
		
	return isActorUpdated;	
	}
	
}
