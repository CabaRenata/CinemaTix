package repository;

import domain.Movie;
import domain.Reservation;
import domain.Room;
import domain.Schedule;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is the repository for Schedule class.
 */
public class SchedulesRepo {
    List<Schedule> schedules;

    /**
     * Constructor which will create the repository based on a given list of schedules.
     * @param schedules - the schedules which will create the repository
     */
    public SchedulesRepo(List<Schedule> schedules) {
        this.schedules = schedules;
    }

    /**
     * Constructor which will create an empty repository.
     */
    public SchedulesRepo() {
        this.schedules = new ArrayList<Schedule>();
    }

    /**
     * This method will add a given schedule into repository.
     * @param schedule - the new schedule which will be added into repository
     */
    public void addSchedule(Schedule schedule){
        this.schedules.add(schedule);
    }

    /**
     * This method will create a new schedule based on the given information and will add it into repository.
     * @param scheduleId - Integer, new schedule's id
     * @param movie - Movie, new schedule's movie
     * @param room - Room, new schedule's room
     * @param date - Date, new schedule's date
     * @param hour - Integer, new schedule's hour
     * @param minute - Integer, new schedule's minute
     */
    public void addSchedule(Integer scheduleId, Movie movie, Room room, Date date, Integer hour, Integer minute){
        Schedule newSchedule = new Schedule(scheduleId, movie, room, date, hour, minute);
        this.addSchedule(newSchedule);
    }

    /**
     * This method will remove a schedule based on his id.
     * @param id - Integer, the id of the schedule which will be removed
     */
    public void removeScheduleBasedOnId(Integer id){
        for (Schedule schedule : schedules) {
            if (schedule.getScheduleId() == id) {
                schedules.remove(schedules.indexOf(schedule));
                break;
            }
        }
    }

    /**
     * This method will remove all schedules from a given date.
     * @param date - date, the date from which the schedules will be removed
     */
    public void removeScheduleBasedOnDate(Date date){
        for (Schedule schedule : schedules) {
            if (schedule.getDate().equals(date)) {
                schedules.remove(schedules.indexOf(schedule));
            }
        }
    }

    /**
     * This method will remove all schedules for a given movie.
     * @param movie - Movie, the movie for which the schedules will be removed
     */
    public void removeScheduleBasedOnMovie(Movie movie){
        for (Schedule schedule : schedules) {
            if (schedule.getMovie().equals(movie)) {
                schedules.remove(schedules.indexOf(schedule));
            }
        }
    }

    /**
     * This method will remove all schedules for a given room.
     * @param room - Room, the room for which the schedules will be removed
     */
    public void removeScheduleBasedOnRoom(Room room){
        for (Schedule schedule : schedules) {
            if (schedule.getRoom().equals(room)) {
                schedules.remove(schedules.indexOf(schedule));
            }
        }
    }

    /**
     * This method will return a schedule based on his id.
     * @param id - Integer, the desired schedule's id
     * @return the scheduled with the desired id or null if not found
     */
    public Schedule getScheduleBaseOnId(Integer id){
        for (Schedule schedule : schedules) {
            if (schedule.getScheduleId() == id) {
                return schedule;
            }
        }
        return null;
    }

    /**
     * This method will return all schedules for a given movie.
     * @param movie - Movie, the movie for which we want to retrieve all schedules
     * @return a list of all schedules for the given movie
     */
    public List<Schedule> getSchedulesBasedOnMovie(Movie movie){
        List<Schedule> results = new ArrayList<Schedule>();
        for (Schedule schedule : schedules) {
            if (schedule.getMovie().equals(movie)) {
                results.add(schedule);
            }
        }
        return results;
    }

    /**
     * This method will return all schedules for a given date.
     * @param date - Date, the date for which we want to retrieve all schedules
     * @return a list of all schedules for the given date
     */
    public List<Schedule> getSchedulesBasedOnDate(Date date){
        List<Schedule> results = new ArrayList<Schedule>();
        for (Schedule schedule : schedules) {
            if (schedule.getDate().equals(date)) {
                results.add(schedule);
            }
        }
        return results;
    }
}
