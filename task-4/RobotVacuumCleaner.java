class RobotVacuumCleaner {
	static String brand = "iRobot";
        static String model = "Roomba i7+";
        static boolean wifiConnectivity = true;
        static boolean selfEmptyingBin = true;
        static String color = "Black";
    public static void main(String[] args) {
        

        System.out.println("-------------------------------------------------");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Wi-Fi Connectivity: " + (wifiConnectivity ? "Yes" : "No"));
        System.out.println("Self-Emptying Bin: " + (selfEmptyingBin ? "Yes" : "No"));
        System.out.println("Color: " + color);
        System.out.println("-------------------------------------------------");
    }
}
