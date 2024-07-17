class Blender {
    public static void main(String[] args) {
        String brand = "Vitamix";
        String model = "5200";
        int capacityInLiters = 2;
        boolean variableSpeedControl = true;
        boolean pulseFeature = true;
        
        System.out.println("-------------------------------------------------");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Capacity: " + capacityInLiters + " liters");
        System.out.println("Variable Speed Control: " + (variableSpeedControl ? "Yes" : "No"));
        System.out.println("Pulse Feature: " + (pulseFeature ? "Yes" : "No"));
        System.out.println("-------------------------------------------------");
    }
}
