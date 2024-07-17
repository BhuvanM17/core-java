class GamingConsole {
    public static void main(String[] args) {
        String brand = "Sony";
        String model = "PlayStation 5";
        String storageCapacity = "825 GB SSD";
        String maxResolution = "4K";
        boolean rayTracingSupport = true;
        
        System.out.println("-------------------------------------------------");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Storage Capacity: " + storageCapacity);
        System.out.println("Max Resolution: " + maxResolution);
        System.out.println("Ray Tracing Support: " + (rayTracingSupport ? "Yes" : "No"));
        System.out.println("-------------------------------------------------");
    }
}
