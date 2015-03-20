package repository;

import domain.Actor;
import domain.Movie;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * This class is the repository for Movie class.
 */
public class MoviesRepo {

    private List<Movie> movies;

    /**
     * Constructor method for movie's repository.
     * @param movies -  a list of movies which will create the repository.
     */
    public MoviesRepo(List<Movie> movies) {
        this.movies = movies;
    }

    /**
     * Constructor method for movie's repository. A new empty repository is created.
     */
    public MoviesRepo() {
        this.movies = new ArrayList<Movie>();
    }

    /**
     * Getter for movie's repository.
     * @return a list of movies
     */
    public List<Movie> getMovies() {
        return movies;
    }

    /**
     * Setter for movie's repository.
     * @param movies - all movies which will be set in the repository.
     */
    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    /**
     * This method will return the movie with the specified id.
     * @param id - integer, id of the searched movie
     * @return the movie with the specified id
     */
    public Movie getMovieById(Integer id){
        for(Movie movie:movies){
            if(movie.getMovieId()== id){
                return movie;
            }
        }
        return null;
    }

    /**
     * This method will return the movie with the specified title.
     * @param title - String, title of the searched movie.
     * @return the movie with the specified title.
     */
    public Movie getMovieByTitle(String title){
        for(Movie movie:movies){
            if(movie.getTitle().equals(title)){
                return movie;
            }
        }
        return null;
    }

    /**
     * This method will add a new movie to the repository.
     * @param movie - new movie which will be added.
     */
    public void addMovie(Movie movie){
        movies.add(movie);
    }

    /**
     * This method will create a new movie based on the specified information and add in into the repository.
     * @param movieId - new movie's id
     * @param title - new movie's title
     * @param aparitionDate - new movie's apparition date
     * @param director -  new movie's director
     * @param actors -  new movie's list of most important actors
     * @param trailer -  new movie's link to trailer
     */
    public void addMovie(Integer movieId, String title, Date aparitionDate, String director, List<Actor> actors, String trailer){
        Movie movie = new Movie(movieId,title,aparitionDate,director,actors,trailer);
        this.addMovie(movie);
    }

    /**
     * This method will delete the movie with the specified id.
     * @param id - integer, id of the searched movie
     */
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

    /**
     *  This method will delete the movie with the specified title.
     * @param title - String, title of the searched movie
     */
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
