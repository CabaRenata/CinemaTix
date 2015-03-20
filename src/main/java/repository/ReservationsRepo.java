package repository;

import domain.Place;
import domain.Reservation;
import domain.Schedule;
import domain.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is the repository for Reservation class.
 */
public class ReservationsRepo {
    private List<Reservation> reservations;

    /**
     * Constructor based on a list of reservations.
     * @param reservations - the list of reservations which will be in the repository.
     */
    public ReservationsRepo(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    /**
     * Constructor which will create an empty repository.
     */
    public ReservationsRepo() {
        this.reservations = new ArrayList<Reservation>();
    }

    /**
     * This method will add a new reservation into repository.
     * @param reservation - new reservation which will be added into repository.
     */
    public void addReservation(Reservation reservation) {
        this.reservations.add(reservation);
    }

    /**
     * This method will create a new reservation based on the provided information and will add it into repository.
     * @param reservationId - Integer, new reservation's id
     * @param schedule      - Schedule, new reservation's schedule
     * @param place         -Place, new reservation's place
     * @param user          - User, new reservation's user
     */
    public void addReservation(Integer reservationId, Schedule schedule, Place place, User user) {
        Reservation newReservation = new Reservation(reservationId, schedule, place, user);
        this.addReservation(newReservation);
    }

    /**
     * This method will remove a reservation based on the reservation's id
     * @param id - Integer, the reservation's id.
     */
    public void removeReservationBasedOnId(Integer id) {
        for (Reservation reservation : reservations) {
            if (reservation.getReservationId() == id) {
                reservations.remove(reservations.indexOf(reservation));
                break;
            }
        }
    }

    /**
     * This method will remove reservations based on the user's id
     * @param id - Integer, the user's id.
     */
    public void removeReservationBasedOnUserId(Integer id) {
        for (Reservation reservation : reservations) {
            if (reservation.getUser().getUserId() == id) {
                reservations.remove(reservations.indexOf(reservation));
            }
        }
    }

    /**
     * This method will remove reservations based on the user's username
     * @param username - String, the user's username.
     */
    public void removeReservationBasedOnUserUsername(String username) {
        for (Reservation reservation : reservations) {
            if (reservation.getUser().getUsername().equals(username)) {
                reservations.remove(reservations.indexOf(reservation));
            }
        }
    }

    /**
     * This method will remove reservations based on the schedule's id
     * @param id - Integer, the schedule's username.
     */
    public void removeReservationBasedOnUserScheduleId(Integer id) {
        for (Reservation reservation : reservations) {
            if (reservation.getSchedule().getScheduleId() == id) {
                reservations.remove(reservations.indexOf(reservation));
            }
        }
    }

    /**
     * This method will return a reservation based on his id
     * @param id - Integer, reservation's id
     * @return the reservation with the given id or null if the reservation is not found in repository.
     */
    public Reservation getReservationBasedOnReservationId(Integer id){
        for (Reservation reservation : reservations) {
            if (reservation.getSchedule().getScheduleId() == id) {
                return reservation;
            }
        }
        return  null;
    }

    /**
     * This method will return a reservation based on the date for which the reservations were made.
     * @param date - Date, the desired date
     * @return a list of reservations made for the given date
     */
    public List<Reservation> getReservationBasedOnDate(Date date){
        List<Reservation> results = new ArrayList<Reservation>();
        for (Reservation reservation : reservations) {
            if (reservation.getSchedule().getDate().equals(date)) {
                results.add(reservation);
            }
        }
        return results;
    }

    /**
     * This method will return a reservation based on the user's username
     * @param username - String, the desired username
     * @return a list of reservations made for the given username
     */
    public List<Reservation> getReservationBasedOnUsername(String username){
        List<Reservation> results = new ArrayList<Reservation>();
        for (Reservation reservation : reservations) {
            if (reservation.getUser().getUsername().equals(username)) {
                results.add(reservation);
            }
        }
        return results;
    }
}

