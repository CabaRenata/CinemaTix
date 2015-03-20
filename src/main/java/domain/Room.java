package domain;

/**
 * Created by cabar on 3/20/2015.
 */
public class Room {
    public Integer roomId;
    public String name;
    public String description;

    public Room(Integer roomId, String name, String description) {
        this.roomId = roomId;
        this.name = name;
        this.description = description;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
