class Treadmill {
	static String brand = "NordicTrack";
        static String model = "Commercial 1750";
        static double motorPowerHP = 3.75;
        static boolean inclineFeature = true;
        static boolean foldingDesign = true;
    public static void main(String[] args) {
        

        System.out.println("-------------------------------------------------");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Motor Power: " + motorPowerHP + " HP");
        System.out.println("Incline Feature: " + (inclineFeature ? "Yes" : "No"));
        System.out.println("Folding Design: " + (foldingDesign ? "Yes" : "No"));
        System.out.println("-------------------------------------------------");
    }
}
