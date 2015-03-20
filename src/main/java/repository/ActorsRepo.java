package repository;

import domain.Actor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cabar on 3/20/2015.
 */
public class ActorsRepo {
    private List<Actor> actors;

    public ActorsRepo(List<Actor> actord) {
        this.actors = actord;
    }

    public ActorsRepo() {
        this.actors = new ArrayList<Actor>();
    }

    public void addActor(Actor actor){
        this.actors.add(actor);
    }

    public void addActor(Integer actorId, String firstName, String lastName){
        Actor actor = new Actor(actorId,firstName,lastName);
        this.addActor(actor);
    }

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
