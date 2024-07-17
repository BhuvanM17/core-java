class SmartSpeaker {
    public static void main(String[] args) {
        String brand = "Amazon";
        String model = "Echo Dot (4th Gen)";
        String assistant = "Alexa";
        boolean bluetoothEnabled = true;
        boolean wifiEnabled = true;
        
        System.out.println("-------------------------------------------------");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Assistant: " + assistant);
        System.out.println("Bluetooth Enabled: " + (bluetoothEnabled ? "Yes" : "No"));
        System.out.println("WiFi Enabled: " + (wifiEnabled ? "Yes" : "No"));
        System.out.println("-------------------------------------------------");
    }
}
