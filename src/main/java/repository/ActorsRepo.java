package repository;

import domain.Actor;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is the repository for Actor class.
 */
public class ActorsRepo {
    private List<Actor> actors;

    /**
     * Constructor of actors repository;
     * @param actors - a list with all actors which will be included in the repository
     */
    public ActorsRepo(List<Actor> actors) {
        this.actors = actors;
    }

    /**
     * Constructor of actor repository. No parameter specified.
     * A new empty list of actors will be created.
     */
    public ActorsRepo() {
        this.actors = new ArrayList<Actor>();
    }

    /**
     * This method will add an actor to the actor's repository.
     * @param actor - actor to be added to the repository.
     */
    public void addActor(Actor actor){
        this.actors.add(actor);
    }

    /**
     * This method will create an actor based on the information provided and will add it to the actor's repository.
     * @param actorId - new actor's Id
     * @param firstName - new actor's first name
     * @param lastName - new actor's last name
     */
    public void addActor(Integer actorId, String firstName, String lastName){
        Actor actor = new Actor(actorId,firstName,lastName);
        this.addActor(actor);
    }

    /**
     * This method will remove an actor from the repository based on his id.
     * @param id - id of the actor to be removed
     */
    public void removeActorById(Integer id){
        Integer index=-1;
        for(Actor actor: actors){
            if(actor.getActorId() == id){
                index = actors.indexOf(actor);
            }
        }
        if(index!=-1){
            actors.remove(index);
        }
    }

    /**
     * This method will remove an actor from the repository based on his first and last name.
     * @param firstName- first name of the actor to be removed
     * @param lastName- last name of the actor to be removed
     */
    public void removeActorByFirstNameAndLastName(String firstName, String lastName){
        Integer index=-1;
        for(Actor actor: actors){
            if(actor.getFirstName().equals(firstName) && actor.getLastName().equals(lastName)){
                index = actors.indexOf(actor);
            }
        }
        if(index!=-1){
            actors.remove(index);
        }
    }

}
