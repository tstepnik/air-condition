import java.util.ArrayList;
import java.util.List;

public class Building {

    private List<Room> rooms = new ArrayList<>();

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void add(Room room){
        rooms.add(room);
    }
}
