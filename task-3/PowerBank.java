class PowerBank {
    public static void main(String[] args) {
        String brand = "Anker";
        String model = "PowerCore 26800mAh";
        int capacitymAh = 26800;
        int numberOfPorts = 3;
        boolean fastChargingSupported = true;

        System.out.println("-------------------------------------------------");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Capacity: " + capacitymAh + " mAh");
        System.out.println("Number of Ports: " + numberOfPorts);
        System.out.println("Fast Charging Supported: " + (fastChargingSupported ? "Yes" : "No"));
        System.out.println("-------------------------------------------------");
    }
}
