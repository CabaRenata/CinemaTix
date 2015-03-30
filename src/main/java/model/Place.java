package model;

import javax.persistence.*;

/**
 * Created by cabar on 3/20/2015.
 */
@Entity
@Table(name = "places")
public class Place extends BaseEntity {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "roomId")
    private Room room;

    @Column(name = "is_reserved")
    private Boolean isReserved;

    public Place() {
    }

    public Place(Room room) {
        this.room = room;
        this.isReserved = false;
    }

    public Place(Room room, Boolean isReserved) {
        this.room = room;
        this.isReserved = isReserved;
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

        if (!room.equals(place.room)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = room.hashCode();
        result = 31 * result + isReserved.hashCode();
        return result;
    }
}
