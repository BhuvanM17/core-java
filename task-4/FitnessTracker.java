class FitnessTracker {
	static String brand = "Fitbit";
        static String model = "Charge 4";
        static String displayType = "OLED";
        static boolean heartRateMonitor = true;
        static boolean sleepTracker = true;
    public static void main(String[] args) {
        

        System.out.println("-------------------------------------------------");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Display Type: " + displayType);
        System.out.println("Heart Rate Monitor: " + (heartRateMonitor ? "Yes" : "No"));
        System.out.println("Sleep Tracker: " + (sleepTracker ? "Yes" : "No"));
        System.out.println("-------------------------------------------------");
    }
}
