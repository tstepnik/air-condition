import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        AirCondition ac = new AirCondition();
        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room(10, 30, "dining room", true,20));
        rooms.add(new Room(12, 28, "living room", true,20));
        rooms.add(new Room(13, 25, "family room", false,22));
        rooms.add(new Room(15, 32, "bedroom", false,23));

        ac.changeAndPrintTemperature(rooms);
    }
}
