class WirelessMouse {
	static String brand = "Logitech";
        static String model = "MX Master 3";
        static boolean bluetoothEnabled = true;
        static boolean ergonomicDesign = true;
        static String color = "Graphite";
    public static void main(String[] args) {
        

        System.out.println("-------------------------------------------------");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Bluetooth Enabled: " + (bluetoothEnabled ? "Yes" : "No"));
        System.out.println("Ergonomic Design: " + (ergonomicDesign ? "Yes" : "No"));
        System.out.println("Color: " + color);
        System.out.println("-------------------------------------------------");
    }
}
