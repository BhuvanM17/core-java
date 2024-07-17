class Blender {
	static String brand = "Vitamix";
        static String model = "5200";
        static int capacityInLiters = 2;
        static boolean variableSpeedControl = true;
        static boolean pulseFeature = true;
    public static void main(String[] rot) {
        
        
        System.out.println("-------------------------------------------------");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Capacity: " + capacityInLiters + " liters");
        System.out.println("Variable Speed Control: " + (variableSpeedControl ? "Yes" : "No"));
        System.out.println("Pulse Feature: " + (pulseFeature ? "Yes" : "No"));
        System.out.println("-------------------------------------------------");
    }
}
