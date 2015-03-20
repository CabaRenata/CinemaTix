package domain;

import java.util.Date;
import java.util.List;

/**
 * Created by cabar on 3/20/2015.
 */
public class Movie {
    public Integer movieId;
    public String title;
    public Date aparitionDate;
    public String director;
    public List<Actor> actors;
    public String trailer;

    public Movie(Integer movieId, String title, Date aparitionDate, String director, List<Actor> actors, String trailer) {
        this.movieId = movieId;
        this.title = title;
        this.aparitionDate = aparitionDate;
        this.director = director;
        this.actors = actors;
        this.trailer = trailer;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getAparitionDate() {
        return aparitionDate;
    }

    public void setAparitionDate(Date aparitionDate) {
        this.aparitionDate = aparitionDate;
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
}
