package model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by cabar on 3/20/2015.
 */
@Entity
@Table(name = "schedules")
public class Schedule extends BaseEntity{

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "movieId")
    private Movie movie;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "roomId")
    private Room room;

    @Column(name = "date")
    private Date date;

    public Schedule() {
    }

    public Schedule(Movie movie, Room room, Date date) {
        this.movie = movie;
        this.room = room;
        this.date = date;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Schedule)) return false;

        Schedule schedule = (Schedule) o;

        if (!date.equals(schedule.date)) return false;
        if (!movie.equals(schedule.movie)) return false;
        if (!room.equals(schedule.room)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = movie.hashCode();
        result = 31 * result + room.hashCode();
        result = 31 * result + date.hashCode();
        return result;
    }
}
