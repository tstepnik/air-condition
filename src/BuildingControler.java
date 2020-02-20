import java.util.List;

public class BuildingControler {

    Building building = new Building();
    AcBasic basic = new AcBasic();
    AcPro pro = new AcPro();

    public void changeTemperature() throws InterruptedException {

        building.add(new Room(1, 10, 30, 23, basic));
        building.add(new Room(2, 14, 28, 25, pro));

        while (!isTemperatureChanged(building.getRooms())) {

            building.getRooms().forEach(x -> {
                double temp = x.getTemperature();
                double desirableTemp = x.getDesirableTemperature();
                double cubature = x.getCubature();
                double averageColing = x.getAirConditioner().lowerTemperature(temp,cubature);

                if (temp > desirableTemp) {

                    x.setTemperature(Room.round(averageColing,2));
                }
                System.out.println(x.toString());
            });
            System.out.println();
            Thread.sleep(1000);
        }
        building.getRooms().forEach(x ->
        {
            x.setTemperature(x.getDesirableTemperature());
            System.out.println(x.toString());
        });

    }

    boolean isTemperatureChanged(List<Room> rooms) {
        for (Room room : rooms) {
            if (room.getTemperature() > room.getDesirableTemperature()) {
                return false;
            }
        }
        return true;
    }
}
