class RunningShoes {
	static String brand = "Nike";
        static String model = "Air Zoom Pegasus 38";
        static String color = "Black/White";
        static String size = "US 10";
        static boolean cushioning = true;
    public static void main(String[] args) {
        
        
        System.out.println("-------------------------------------------------");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Cushioning: " + (cushioning ? "Yes" : "No"));
        System.out.println("-------------------------------------------------");
    }
}
