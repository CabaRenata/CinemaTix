package domain;

/**
 * Created by cabar on 3/20/2015.
 */
public class Place {
    public Integer placeId;
    public Room room;


    public Place(Integer placeId, Room room) {
        this.placeId = placeId;
        this.room = room;
    }

    public Integer getPlaceId() {
        return placeId;
    }

    public void setPlaceId(Integer placeId) {
        this.placeId = placeId;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
