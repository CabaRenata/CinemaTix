package repository;

import domain.Place;
import domain.Room;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is the repository for Room class.
 */
public class RoomsRepo {
    private List<Room> rooms;

    /**
     * Constructor method with list of rooms.
     * @param rooms - list of rooms which will be the repository.
     */
    public RoomsRepo(List<Room> rooms) {
        this.rooms = rooms;
    }

    /**
     * Constructor which will create an empty repository.
     */
    public RoomsRepo(){
        this.rooms = new ArrayList<Room>();
    }

    /**
     * This method will return a room based on a given roomId.
     * @param id - Integer, the id of the searched room.
     * @return the room with the given id or null if the room was not found.
     */
    public Room getRoomById(Integer id){
        Integer index=-1;
        for(Room room : rooms){
            if(room.getRoomId() == id){
                index = rooms.indexOf(room);
            }
        }
        if(index!=-1){
            return rooms.get(index);
        }
        return null;
    }

    /**
     * This method will return a room based on a given name.
     * @param name - String, the name of the searched room.
     * @return the room with the given name or null if the room was not found.
     */
    public Room getRoomByName(String name){
        Integer index=-1;
        for(Room room : rooms){
            if(room.getName().equals(name)){
                index = rooms.indexOf(room);
            }
        }
        if(index!=-1){
            return rooms.get(index);
        }
        return null;
    }

    /**
     * This method will add a given room in the repository.
     * @param room - the room which will be added.
     */
    public void addRoom(Room room){
        rooms.add(room);
    }

    /**
     * This method will create a new room and will add it in the repository.
     * @param roomId - new room's id
     * @param name - new room's name
     * @param description - new room's description.
     */
    public void addRoom(Integer roomId, String name, String description){
        Room room = new Room(roomId, name, description);
        this.addRoom(room);
    }

    /**
     * This method will remove a room from repository based on his name.
     * @param name - String, name of the room which will be deleted.
     */
    public void removePlaceByName(String name){
        Integer index=-1;
        for(Room room : rooms){
            if(room.getName().equals(name)){
                index = rooms.indexOf(room);
            }
        }
        if(index!=-1){
            rooms.remove(index);
        }
    }

    /**
     * This method will remove a room from repository based on his id.
     * @param id - Integer, id of the room which will be deleted.
     */
    public void removePlaceById(Integer id){
        Integer index=-1;
        for(Room room : rooms){
            if(room.getRoomId() == id){
                index = rooms.indexOf(room);
            }
        }
        if(index!=-1){
            rooms.remove(index);
        }
    }

}
