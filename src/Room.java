public class Room {;
    int number;
    private int cubature;
    private double temperature;
    private double desirableTemperature;
    private AirCondition airConditioner;

    public Room(int number, int cubature, double temperature, double desirableTemperature, AirCondition airConditioner) {
        this.number = number;
        this.cubature = cubature;
        this.temperature = temperature;
        this.desirableTemperature = desirableTemperature;
        this.airConditioner = airConditioner;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public double getDesirableTemperature() {
        return desirableTemperature;
    }

    public void setDesirableTemperature(double desirableTemperature) {
        this.desirableTemperature = desirableTemperature;
    }

    public AirCondition getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(AirCondition airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public String toString() {
        return "Pokój nr " + number + " o powierzchni " +
                cubature + " ma temperaturę powietrza " +
                temperature + " stopni celcjusza, korzysta z klimatyzatora " + airConditioner.toString();
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
