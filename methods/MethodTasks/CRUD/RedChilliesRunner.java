class RedChilliesRunner {

	public static void main(String[] entratainment) {
		
		boolean isActorAdded = RedChilliesEntertainment.addMovieActors("Bhuvan");
		System.out.println("Actor added: " + isActorAdded);

		isActorAdded = RedChilliesEntertainment.addMovieActors("Devendra Singh ");
		System.out.println("Actor added: " + isActorAdded);

		isActorAdded = RedChilliesEntertainment.addMovieActors("Kiran");
		System.out.println("Actor added: " + isActorAdded);

		isActorAdded = RedChilliesEntertainment.addMovieActors("Goutham Raj");
		System.out.println("Actor added: " + isActorAdded);

		isActorAdded = RedChilliesEntertainment.addMovieActors("Bharath");
		System.out.println("Actor added: " + isActorAdded);

		isActorAdded = RedChilliesEntertainment.addMovieActors("Tejas");
		System.out.println("Actor added: " + isActorAdded);

		isActorAdded = RedChilliesEntertainment.addMovieActors("Govind");
		System.out.println("Actor added: " + isActorAdded);

		isActorAdded = RedChilliesEntertainment.addMovieActors("Gagan");
		System.out.println("Actor added: " + isActorAdded);

		isActorAdded = RedChilliesEntertainment.addMovieActors("Kruthika dornal");
		System.out.println("Actor added: " + isActorAdded);
		
		isActorAdded = RedChilliesEntertainment.addMovieActors("Champana");
		System.out.println("Actor added: " + isActorAdded);

		RedChilliesEntertainment.getMovieActors();
		
		boolean isActorUpdated = RedChilliesEntertainment.updateMovieActor("Bhuvan","Rocky Bhai Bhuvan");
		RedChilliesEntertainment.getMovieActors();
	}
}
