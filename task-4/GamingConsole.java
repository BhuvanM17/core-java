class GamingConsole {
	static String brand = "Sony";
        static String model = "PlayStation 5";
        static String storageCapacity = "825 GB SSD";
        static String maxResolution = "4K";
        static boolean rayTracingSupport = true;
    public static void main(String[] games) {
        
        
        System.out.println("-------------------------------------------------");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Storage Capacity: " + storageCapacity);
        System.out.println("Max Resolution: " + maxResolution);
        System.out.println("Ray Tracing Support: " + (rayTracingSupport ? "Yes" : "No"));
        System.out.println("-------------------------------------------------");
    }
}
