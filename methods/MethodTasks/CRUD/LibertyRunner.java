class LibertyRunner{

public static void main(String []shoes){

boolean addShoe = Liberty.addShoeBrands("Nike");
System.out.println(addShoe);

addShoe = Liberty.addShoeBrands("Adidas");
System.out.println(addShoe);

addShoe = Liberty.addShoeBrands("Puma");
System.out.println(addShoe);

addShoe = Liberty.addShoeBrands("Reebok");
System.out.println(addShoe);

addShoe = Liberty.addShoeBrands("Converse");
System.out.println(addShoe);

addShoe = Liberty.addShoeBrands("Vans");
System.out.println(addShoe);

addShoe = Liberty.addShoeBrands("Skechers");
System.out.println(addShoe);

addShoe = Liberty.addShoeBrands("New Balance");
System.out.println(addShoe);

addShoe = Liberty.addShoeBrands("ASICS");
System.out.println(addShoe);

addShoe = Liberty.addShoeBrands("Timberland");
System.out.println(addShoe);

addShoe = Liberty.addShoeBrands("Clarks");
System.out.println(addShoe);

addShoe = Liberty.addShoeBrands("Dr. Martens");
System.out.println(addShoe);

addShoe = Liberty.addShoeBrands("Brooks");
System.out.println(addShoe);

addShoe = Liberty.addShoeBrands("Under Armour");
System.out.println(addShoe);
addShoe = Liberty.addShoeBrands("Salomon");
System.out.println(addShoe);
Liberty.getShoeBrands();
boolean updateShoe =  Liberty.updateShoeBrand("ASICS", "Campus sutra");


System.out.println("the available shoe brands are");
Liberty.getShoeBrands();

}
}








