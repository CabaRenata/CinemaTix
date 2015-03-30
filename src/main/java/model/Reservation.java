package model;

import javax.persistence.*;

/**
 * Created by cabar on 3/20/2015.
 */
@Entity
@Table(name = "reservations")
public class Reservation extends BaseEntity {

    private static final long serialVersionUID = 3518638232653077482L;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "scheduleId")
    private Schedule schedule;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "placeId")
    private Place place;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId")
    private User user;

    public Reservation() {
    }

    public Reservation( Schedule schedule, Place place, User user) {
        this.schedule = schedule;
        this.place = place;
        this.user = user;
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
        int result = schedule.hashCode();
        result = 31 * result + place.hashCode();
        result = 31 * result + user.hashCode();
        return result;
    }
}
