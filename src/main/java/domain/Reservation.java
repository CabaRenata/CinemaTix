package domain;

/**
 * Created by cabar on 3/20/2015.
 */
public class Reservation {
    private Integer reservationId;
    private Schedule schedule;
    private Place place;
    private User user;

    public Reservation(Integer reservationId, Schedule schedule, Place place, User user) {
        this.reservationId = reservationId;
        this.schedule = schedule;
        this.place = place;
        this.user = user;
    }

    public Integer getReservationId() {
        return reservationId;
    }

    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reservation)) return false;

        Reservation that = (Reservation) o;

        if (!place.equals(that.place)) return false;
        if (!schedule.equals(that.schedule)) return false;
        if (!user.equals(that.user)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = reservationId != null ? reservationId.hashCode() : 0;
        result = 31 * result + schedule.hashCode();
        result = 31 * result + place.hashCode();
        result = 31 * result + user.hashCode();
        return result;
    }
}
