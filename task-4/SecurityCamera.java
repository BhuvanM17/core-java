class SecurityCamera {
	static String brand = "Ring";
        static String model = "Stick Up Cam Battery";
        static boolean batteryPowered = true;
        static boolean motionDetection = true;
        static boolean nightVision = true;
    public static void main(String[] args) {
        

        System.out.println("-------------------------------------------------");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Battery Powered: " + (batteryPowered ? "Yes" : "No"));
        System.out.println("Motion Detection: " + (motionDetection ? "Yes" : "No"));
        System.out.println("Night Vision: " + (nightVision ? "Yes" : "No"));
        System.out.println("-------------------------------------------------");
    }
}
