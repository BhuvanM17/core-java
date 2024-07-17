class AirPurifier {
	static String brand = "Dyson";
       	static String model = "Pure Cool TP04";
       	static String filterType = "HEPA";
       	static boolean wifiEnabled = true;
       	static boolean oscillationFeature = true;
    public static void main(String[] args) {
        

        System.out.println("-------------------------------------------------");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Filter Type: " + filterType);
        System.out.println("Wi-Fi Enabled: " + (wifiEnabled ? "Yes" : "No"));
        System.out.println("Oscillation Feature: " + (oscillationFeature ? "Yes" : "No"));
        System.out.println("-------------------------------------------------");
    }
}
