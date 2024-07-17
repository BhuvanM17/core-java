class AgastyaTextiles{
static String materials[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
static int index;
	public static boolean addMaterial(String material){
	boolean isMaterialAdded  = false;
	if(material != null && material != materials[index]){
		materials[index] = material;
		index++;
		isMaterialAdded = true;
		}
	return isMaterialAdded;
	}
	
	public static void getMaterialsDetails(){
	for(int i=0;i<materials.length;i++) 
		System.out.println("the materials available are");
		System.out.println(materials[i]);
	
	}
	
	public static boolean updateMaterials(String oldMaterial,String newMaterial){
	boolean isMaterialUpdated = false;
	for(int i=0;i<materials.length;i++){
		if(oldMaterial == materials[i]){
			materials[i]=newMaterial;
			System.out.println(oldMaterial+"has been replaced with"+newMaterial);
			isMaterialUpdated = true;
		}
	}if(isMaterialUpdated == false ) System.out.println("nin athra aa metrial ilve ila guru");
	
	return isMaterialUpdated;
	}
}