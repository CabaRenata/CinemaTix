package domain;

/**
 * Created by cabar on 3/20/2015.
 */
public class Actor {
    private Integer actorId;
    private String firstName;
    private String lastName;

    public Actor(Integer actorId, String firstName, String lastName) {
        this.actorId = actorId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Actor)) return false;

        Actor actor = (Actor) o;

        if (!actorId.equals(actor.actorId)) return false;
        if (!firstName.equals(actor.firstName)) return false;
        if (!lastName.equals(actor.lastName)) return false;

        return true;
    }

}
