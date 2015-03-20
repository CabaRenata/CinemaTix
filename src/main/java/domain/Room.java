package domain;

/**
 * Created by cabar on 3/20/2015.
 */
public class Room {
    private Integer roomId;
    private String name;
    private String description;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room)) return false;

        Room room = (Room) o;

        if (!description.equals(room.description)) return false;
        if (!name.equals(room.name)) return false;

        return true;
    }
}
