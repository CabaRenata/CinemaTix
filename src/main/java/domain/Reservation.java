package domain;

/**
 * Created by cabar on 3/20/2015.
 */
public class Reservation {
    public Integer reservationId;
    public Schedule schedule;
    public Place place;
    public User user;

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
}
