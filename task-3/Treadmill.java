class Treadmill {
    public static void main(String[] args) {
        String brand = "NordicTrack";
        String model = "Commercial 1750";
        double motorPowerHP = 3.75;
        boolean inclineFeature = true;
        boolean foldingDesign = true;

        System.out.println("-------------------------------------------------");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Motor Power: " + motorPowerHP + " HP");
        System.out.println("Incline Feature: " + (inclineFeature ? "Yes" : "No"));
        System.out.println("Folding Design: " + (foldingDesign ? "Yes" : "No"));
        System.out.println("-------------------------------------------------");
    }
}
