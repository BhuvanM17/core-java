class ElectricToothbrush {
	static String brand = "Philips Sonicare";
        static String model = "DiamondClean 9000";
        static String color = "White";
        static boolean pressureSensor = true;
        static boolean smartTimer = true;
    public static void main(String[] tooth) {
        

        System.out.println("-------------------------------------------------");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Pressure Sensor: " + (pressureSensor ? "Yes" : "No"));
        System.out.println("Smart Timer: " + (smartTimer ? "Yes" : "No"));
        System.out.println("-------------------------------------------------");
    }
}
