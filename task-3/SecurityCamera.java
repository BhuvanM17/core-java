class SecurityCamera {
    public static void main(String[] args) {
        String brand = "Ring";
        String model = "Stick Up Cam Battery";
        boolean batteryPowered = true;
        boolean motionDetection = true;
        boolean nightVision = true;

        System.out.println("-------------------------------------------------");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Battery Powered: " + (batteryPowered ? "Yes" : "No"));
        System.out.println("Motion Detection: " + (motionDetection ? "Yes" : "No"));
        System.out.println("Night Vision: " + (nightVision ? "Yes" : "No"));
        System.out.println("-------------------------------------------------");
    }
}
