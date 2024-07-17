class FitnessTracker {
    public static void main(String[] args) {
        String brand = "Fitbit";
        String model = "Charge 4";
        String displayType = "OLED";
        boolean heartRateMonitor = true;
        boolean sleepTracker = true;

        System.out.println("-------------------------------------------------");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Display Type: " + displayType);
        System.out.println("Heart Rate Monitor: " + (heartRateMonitor ? "Yes" : "No"));
        System.out.println("Sleep Tracker: " + (sleepTracker ? "Yes" : "No"));
        System.out.println("-------------------------------------------------");
    }
}
