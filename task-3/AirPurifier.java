class AirPurifier {
    public static void main(String[] args) {
        String brand = "Dyson";
        String model = "Pure Cool TP04";
        String filterType = "HEPA";
        boolean wifiEnabled = true;
        boolean oscillationFeature = true;

        System.out.println("-------------------------------------------------");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Filter Type: " + filterType);
        System.out.println("Wi-Fi Enabled: " + (wifiEnabled ? "Yes" : "No"));
        System.out.println("Oscillation Feature: " + (oscillationFeature ? "Yes" : "No"));
        System.out.println("-------------------------------------------------");
    }
}
