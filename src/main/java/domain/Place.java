package domain;

/**
 * Created by cabar on 3/20/2015.
 */
public class Place {
    private String placeId;
    private Room room;
    private Boolean isReserved;


    public Place(String placeId, Room room) {
        this.placeId = placeId;
        this.room = room;
        this.isReserved = false;
    }

    public Place(String placeId, Room room, Boolean isReserved) {
        this.placeId = placeId;
        this.room = room;
        this.isReserved = isReserved;
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Boolean getIsReserved() { return isReserved; }

    public void setIsReserved(Boolean isReserved) {
        this.isReserved = isReserved;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Place)) return false;

        Place place = (Place) o;

        if (placeId != null ? !placeId.equals(place.placeId) : place.placeId != null) return false;
        if (!room.equals(place.room)) return false;

        return true;
    }

}
