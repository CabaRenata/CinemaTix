package repository;

import domain.Place;
import domain.Room;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is the repository for Place class.
 */
public class PlacesRepo {
    private List<Place> places;

    /**
     * Constructor method with list of places.
     * @param places - the places which will create the new repository.
     */
    public PlacesRepo(List<Place> places) {
        this.places = places;
    }

    /**
     * Constructor method without parameters.
     * Will create a new empty repository.
     */
    public PlacesRepo(){
        this.places = new ArrayList<Place>();
    }

    /**
     * This method will return the place with the specified id.
     * @param id - String -  id of the searched place.
     * @return the place with specified id.
     */
    public Place getPlaceById(String id){
        Integer index=-1;
        for(Place place : places){
            if(place.getPlaceId().equals(id)){
                index = places.indexOf(place);
            }
        }
        if(index!=-1){
            return places.get(index);
        }
        return null;
    }

    /**
     * This method will return all places from a specified room.
     * @param roomName - String the name of the room from which we want to retrieve all the places.
     * @return a list of all the places from the specified room.
     */
    public List<Place> getAllPlacesFromRoomByRoomName(String roomName){
        List<Place> result = new ArrayList<Place>();
        for(Place place : places){
            if(place.getRoom().getName().equals(roomName)){
                result.add(place);
            }
        }
        return result;
    }

    /**
     * This method will return all places from a room based on the room's id
     * @param roomId - Integer, the room's id.
     * @return the list with all places from the given room.
     */
    public List<Place> getAllPlacesFromRoomByRoomId(Integer roomId){
        List<Place> result = new ArrayList<Place>();
        for(Place place : places){
            if(place.getRoom().getRoomId() == roomId){
                result.add(place);
            }
        }
        return result;
    }

    /**
     * This method will add a new place in the repo.
     * @param place wich will be added.
     */
    public void addPlace(Place place){
        this.places.add(place);
    }

    /**
     * This method will create a new place based on the provided information and add in to the repository.
     * @param placeId - the new place's id
     * @param room - the new place's room
     */
    public void addPlace(String placeId, Room room){
        Place place = new Place(placeId, room);
        this.addPlace(place);
    }

    /**
     * This method will remove a place based on his id.
     * @param placeId - String, the place's id which will be removed.
     */
    public void remodePlaceById(String placeId){
        Integer index=-1;
        for(Place place : places){
            if(place.getPlaceId().equals(placeId)){
                index = places.indexOf(place);
            }
        }
        if(index!=-1){
           places.remove(index);
        }
    }
}
