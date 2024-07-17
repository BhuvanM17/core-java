class AgastyaTextilesRunner{
	public static void main(String []Textail){
	
	boolean isAdded=AgastyaTextiles.addMaterial("Cotton");
	System.out.println(isAdded);
	
	AgastyaTextiles.addMaterial("Wool");
	System.out.println(isAdded);
	
	AgastyaTextiles.addMaterial("Silk");
	System.out.println(isAdded);
	
	AgastyaTextiles.addMaterial("Linen");
	System.out.println(isAdded);
	
	AgastyaTextiles.addMaterial("Polyester");
	System.out.println(isAdded);
	
	AgastyaTextiles.addMaterial("Nylon");
	System.out.println(isAdded);
	
	AgastyaTextiles.addMaterial("Rayon");
	System.out.println(isAdded);
	
	AgastyaTextiles.addMaterial("Acrylic");
	System.out.println(isAdded);
	
	AgastyaTextiles.addMaterial("Lycra");
	System.out.println(isAdded);
	
	AgastyaTextiles.addMaterial("Velvet");
	System.out.println(isAdded);
	
	AgastyaTextiles.addMaterial("Denim");
	System.out.println(isAdded);
	
	AgastyaTextiles.addMaterial("pure cotton");
	System.out.println(isAdded);
	
	AgastyaTextiles.addMaterial("Fleece");
	System.out.println(isAdded);
	
	AgastyaTextiles.addMaterial("Flannel");
	System.out.println(isAdded);
	
	AgastyaTextiles.addMaterial("Chiffon");
	System.out.println(isAdded);
	
	AgastyaTextiles.getMaterialsDetails();
	
	boolean isUpdated = AgastyaTextiles.updateMaterials("pure cotton","Satin");
	
	AgastyaTextiles.getMaterialsDetails();
	
	}
}




