package repository;

import domain.Actor;
import domain.Movie;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by cabar on 3/20/2015.
 */
public class MoviesRepo {

    private List<Movie> movies;

    public MoviesRepo(List<Movie> movies) {
        this.movies = movies;
    }

    public MoviesRepo() {
        this.movies = new ArrayList<Movie>();
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public Movie getMovieById(Integer id){
        for(Movie movie:movies){
            if(movie.getMovieId()== id){
                return movie;
            }
        }
        return null;
    }

    public Movie getMovieByTitle(String title){
        for(Movie movie:movies){
            if(movie.getTitle().equals(title)){
                return movie;
            }
        }
        return null;
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }

    public void addMovie(Integer movieId, String title, Date aparitionDate, String director, List<Actor> actors, String trailer){
        Movie movie = new Movie(movieId,title,aparitionDate,director,actors,trailer);
        this.addMovie(movie);
    }

    public void removeMovieById(Integer id){
        Integer index = -1;
        for(Movie movie:movies){
            if(movie.getMovieId() == id){
                index = movies.indexOf(movie);
            }
        }
        if(index!=-1){
            movies.remove(index);
        }
    }

    public void removeMovieByTitle(String title){
        Integer index = -1;
        for(Movie movie:movies){
            if(movie.getTitle().equals(title)){
                index = movies.indexOf(movie);
            }
        }
        if(index!=-1){
            movies.remove(index);
        }
    }
}
