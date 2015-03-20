package domain;

import java.util.Date;
import java.util.List;

/**
 * Created by cabar on 3/20/2015.
 */
public class Movie {
    private Integer movieId;
    private String title;
    private Date aparitionDate;
    private String director;
    private List<Actor> actors;
    private String trailer;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;

        Movie movie = (Movie) o;

        if (!actors.equals(movie.actors)) return false;
        if (!aparitionDate.equals(movie.aparitionDate)) return false;
        if (!director.equals(movie.director)) return false;
        if (!title.equals(movie.title)) return false;
        if (!trailer.equals(movie.trailer)) return false;

        return true;
    }
}
