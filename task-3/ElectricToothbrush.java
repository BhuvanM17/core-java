class ElectricToothbrush {
    public static void main(String[] args) {
        String brand = "Philips Sonicare";
        String model = "DiamondClean 9000";
        String color = "White";
        boolean pressureSensor = true;
        boolean smartTimer = true;

        System.out.println("-------------------------------------------------");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Pressure Sensor: " + (pressureSensor ? "Yes" : "No"));
        System.out.println("Smart Timer: " + (smartTimer ? "Yes" : "No"));
        System.out.println("-------------------------------------------------");
    }
}
