class ElectricKettle {
	static String brand = "Breville";
        static String model = "the Compact Kettle Pure";
        static int capacityInLiters = 1;
        static boolean variableTemperatureControl = true;
        static String color = "Brushed Stainless Steel";
    public static void main(String[] args) {
    

        System.out.println("-------------------------------------------------");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Capacity: " + capacityInLiters + " liters");
        System.out.println("Variable Temperature Control: " + (variableTemperatureControl ? "Yes" : "No"));
        System.out.println("Color: " + color);
        System.out.println("-------------------------------------------------");
    }
}
