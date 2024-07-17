class ElectricKettle {
    public static void main(String[] args) {
        String brand = "Breville";
        String model = "the Compact Kettle Pure";
        int capacityInLiters = 1;
        boolean variableTemperatureControl = true;
        String color = "Brushed Stainless Steel";

        System.out.println("-------------------------------------------------");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Capacity: " + capacityInLiters + " liters");
        System.out.println("Variable Temperature Control: " + (variableTemperatureControl ? "Yes" : "No"));
        System.out.println("Color: " + color);
        System.out.println("-------------------------------------------------");
    }
}
