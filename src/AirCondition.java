import java.util.List;

public class AirCondition {

    public void changeAndPrintTemperature(List<Room> list) throws InterruptedException {
        while (!isTemperatureChanged(list)) {
            Thread.sleep(1000);
            list.forEach(x -> {
                if (x.isPro()) {
                    proAC(x);
                } else {
                    basicAC(x);
                }
                x.printRoomTemperature();
            });

            System.out.println();
        }
    }

    boolean isTemperatureChanged(List<Room> list) {
        for (Room room : list) {
            if (room.getTemperature() > room.getAcTemperature()) {
                return false;
            }
        }
        return true;
    }

    private void basicAC(Room room){
        double divideCubatureByOne = (double)1/room.getCubature();
        if (room.getTemperature()> room.getAcTemperature()) {
            room.setTemperature(room.getTemperature() - divideCubatureByOne);
        }
    }

    private void proAC(Room room){
        double divideCubatureByOne = (double)2/room.getCubature();
        if (room.getTemperature()> room.getAcTemperature()) {
            room.setTemperature(room.getTemperature() - divideCubatureByOne);
        }
    }
}