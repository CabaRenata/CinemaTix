package domain;

import java.util.Date;

/**
 * Created by cabar on 3/20/2015.
 */
public class Schedule {
    public Integer scheduleId;
    public Movie movie;
    public Room room;
    public Date date;

    public Schedule(Integer scheduleId, Movie movie, Room room, Date date) {
        this.scheduleId = scheduleId;
        this.movie = movie;
        this.room = room;
        this.date = date;
    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
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
}
