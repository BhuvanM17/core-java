import java.util.*;
class Gym{

	static String gymEquipments[] = {null, null, null, null, null, null, null, null};
	static int index = 0;

	public static boolean createGymEquipment(String equipmentName){

		boolean isEquipmentCreated = false;
		if(equipmentName != null){
			gymEquipments[index] = equipmentName;
			index++;
			isEquipmentCreated = true;
		}
		else {
			System.out.println("Invalid equipment name Added");
		}
	return isEquipmentCreated;
	}

	public static void getEquipments(){
		System.out.println("The gym equipments available are:");
		for(String equipment  :  gymEquipments){
			if(equipment != null) System.out.println(equipment);
			
		}
}
	public static boolean updateGymEquipments(String oldEquipment,String newEquipment){
		boolean isEquipmentUpdated = false;
		for(int i=0;i<gymEquipments.length;i++){
			if(oldEquipment == gymEquipments[i]){
					gymEquipments[i] =	newEquipment;
					System.out.println(oldEquipment+" has been replaced with "+newEquipment);
					isEquipmentUpdated = true;
				
			}
		}if(isEquipmentUpdated == false) System.out.println("Equipmentee ila guru nin athraaa");
		
	return isEquipmentUpdated;	
	}
	public static boolean deleteGymEquipnment(String gymEquipmentToBeDeleted){
		System.out.println("deleteGymEquipnment Started");
		boolean isGymEquipmentDeleted=false;
		int newIndex , oldIndex;
		for(newIndex=0, oldIndex=0;oldIndex<gymEquipments.length;oldIndex++)
		{
			if(gymEquipments[oldIndex]!=gymEquipmentToBeDeleted)
			{
				gymEquipments[newIndex]=gymEquipments[oldIndex];
				newIndex++;
			}
		}
		gymEquipments=Arrays.copyOf(gymEquipments,newIndex);
		if(gymEquipments!=null)
		{
			isGymEquipmentDeleted=true;
		}
		if(isGymEquipmentDeleted==false)
		{
			System.out.println(gymEquipmentToBeDeleted+"not found");
		}
		System.out.println("delete gymEquipment ended");
		return isGymEquipmentDeleted;
	}


}



