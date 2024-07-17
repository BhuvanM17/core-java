class SmartSpeaker {
	static String brand = "Amazon";
        static String model = "Echo Dot (4th Gen)";
        static String assistant = "Alexa";
        static boolean bluetoothEnabled = true;
        static boolean wifiEnabled = true;
    public static void main(String[] args) {
        
        
        System.out.println("-------------------------------------------------");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Assistant: " + assistant);
        System.out.println("Bluetooth Enabled: " + (bluetoothEnabled ? "Yes" : "No"));
        System.out.println("WiFi Enabled: " + (wifiEnabled ? "Yes" : "No"));
        System.out.println("-------------------------------------------------");
    }
}
