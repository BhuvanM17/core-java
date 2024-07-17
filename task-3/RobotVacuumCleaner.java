class RobotVacuumCleaner {
    public static void main(String[] args) {
        String brand = "iRobot";
        String model = "Roomba i7+";
        boolean wifiConnectivity = true;
        boolean selfEmptyingBin = true;
        String color = "Black";

        System.out.println("-------------------------------------------------");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Wi-Fi Connectivity: " + (wifiConnectivity ? "Yes" : "No"));
        System.out.println("Self-Emptying Bin: " + (selfEmptyingBin ? "Yes" : "No"));
        System.out.println("Color: " + color);
        System.out.println("-------------------------------------------------");
    }
}
