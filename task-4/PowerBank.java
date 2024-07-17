class PowerBank {
	static String brand = "Anker";
        static String model = "PowerCore 26800mAh";
        static int capacitymAh = 26800;
        static int numberOfPorts = 3;
        static boolean fastChargingSupported = true;
    public static void main(String[] args) {
       

        System.out.println("-------------------------------------------------");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Capacity: " + capacitymAh + " mAh");
        System.out.println("Number of Ports: " + numberOfPorts);
        System.out.println("Fast Charging Supported: " + (fastChargingSupported ? "Yes" : "No"));
        System.out.println("-------------------------------------------------");
    }
}
