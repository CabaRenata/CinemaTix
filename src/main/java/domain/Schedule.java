package domain;

import java.util.Date;

/**
 * Created by cabar on 3/20/2015.
 */
public class Schedule {
    private Integer scheduleId;
    private Movie movie;
    private Room room;
    private Date date;
    private Integer hour;
    private Integer minute;

    public Schedule(Integer scheduleId, Movie movie, Room room, Date date, Integer hour, Integer minute) {
        this.scheduleId = scheduleId;
        this.movie = movie;
        this.room = room;
        this.date = date;
        this.hour = hour;
        this. minute = minute;
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

    public Integer getHour() { return hour; }

    public void setHour(Integer hour) { this.hour = hour; }

    public Integer getMinute() { return minute; }

    public void setMinute(Integer minute) { this.minute = minute; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Schedule)) return false;

        Schedule schedule = (Schedule) o;

        if (!date.equals(schedule.date)) return false;
        if (!hour.equals(schedule.hour)) return false;
        if (!minute.equals(schedule.minute)) return false;
        if (!movie.equals(schedule.movie)) return false;
        if (!room.equals(schedule.room)) return false;

        return true;
    }
}
