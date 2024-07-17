class ActionCamera {
    public static void main(String[] args) {
        String brand = "GoPro";
        String model = "HERO9 Black";
        String resolution = "5K";
        boolean waterproof = true;
        boolean imageStabilization = true;

        System.out.println("-------------------------------------------------");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Resolution: " + resolution);
        System.out.println("Waterproof: " + (waterproof ? "Yes" : "No"));
        System.out.println("Image Stabilization: " + (imageStabilization ? "Yes" : "No"));
        System.out.println("-------------------------------------------------");
    }
}
