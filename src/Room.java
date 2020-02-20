public class Room {
    private int cubature;
    private double temperature;
    private String name;
    private boolean pro;
    private double acTemperature;

    public Room(int cubature, double temperature, String name, boolean pro, double acTemperature) {
        this.cubature = cubature;
        this.temperature = temperature;
        this.name = name;
        this.pro = pro;
        this.acTemperature = acTemperature;
    }

    public int getCubature() {
        return cubature;
    }

    public void setCubature(int cubature) {
        this.cubature = cubature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = round(temperature,2);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPro() {
        return pro;
    }

    public void setPro(boolean pro) {
        this.pro = pro;
    }

    public double getAcTemperature() {
        return acTemperature;
    }

    public void setAcTemperature(double acTemperature) {
        this.acTemperature = acTemperature;
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    public void printRoomTemperature(){
        System.out.println("Temperatura w " + name + " wynosi " + round(temperature,1));
    }
}
