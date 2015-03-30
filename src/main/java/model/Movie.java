package model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by cabar on 3/20/2015.
 */
@Entity
@Table(name = "movies")
public class Movie extends BaseEntity {

    private static final long serialVersionUID = 3518638232653077482L;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "released_date")
    private Date releasedDate;

    @Column(name = "director")
    private String director;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "movie_actors",
            joinColumns = {@JoinColumn(name = "movieId")},
            inverseJoinColumns = {@JoinColumn(name = "actorId")}
    )
    private List<Actor> actors;

    @Column(name = "trailer")
    private String trailer;

    public Movie() {
    }

    public Movie( String title, Date releasedDate, String director, List<Actor> actors, String trailer) {
        this.title = title;
        this.releasedDate = releasedDate;
        this.director = director;
        this.actors = actors;
        this.trailer = trailer;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getAparitionDate() {
        return releasedDate;
    }

    public void setAparitionDate(Date aparitionDate) {
        this.releasedDate = aparitionDate;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;

        Movie movie = (Movie) o;

        if (!actors.equals(movie.actors)) return false;
        if (!director.equals(movie.director)) return false;
        if (!releasedDate.equals(movie.releasedDate)) return false;
        if (!title.equals(movie.title)) return false;
        if (!trailer.equals(movie.trailer)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + releasedDate.hashCode();
        result = 31 * result + director.hashCode();
        result = 31 * result + actors.hashCode();
        result = 31 * result + trailer.hashCode();
        return result;
    }
}
