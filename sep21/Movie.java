package com.ivy.sep21;
//The class Movie is started below. An instance of class Movie represents a film. This class has the following three class variables:
//title, which is a String representing the title of the movie
//studio, which is an String representing the studio that made the movie
//rating, which is a String representing the rating of the movie (i.e. PG-13, R, etc)
//Write a constructor for the class Movie, which takes a String representing the title of the movie, a String representing the studio, and a String representing the rating as its arguments, and sets the respective class variables to these values.
//
//Write a second constructor for the class Movie, which takes a String representing the title of the movie and a String representing the studio as its arguments, and sets the respective class variables to these values, while the class variable rating is set to “PG”.
//
//Write a method getPg, which takes an array of base type Movie as its argument, and returns a new array of only those movies in the input array with a rating of “PG”. You may assume that the input array is full of Movie instances. The returned array need not be full.
//
//Write a piece of code that creates an instance of the class Movie with the title “Casino Royale”, the studio “Eon Productions”, and the rating “PG-13”
import java.util.ArrayList;
public class Movie  {
    private String title;
    private String studio;
    private String rating;
    public Movie(String title, String studio, String rating)
    {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }
    public Movie(String title, String studio)
    { 		this.title = title;
        this.studio = studio;
        rating = "PG"; 	}
    public Movie[] getPG(Movie[] movies) 	{
        Movie[] pg_movies = new Movie[movies.length];
        int count = 0;
        for(Movie movie : movies) 		{
            if(movie.rating.equals("PG")) 			{
                pg_movies[count++] = movie;
            } 		}
        return pg_movies; 	}
    public ArrayList<Movie> getPGAL(Movie[] movies) 	{
        ArrayList<Movie> pg_movies = new ArrayList<>();
        for(Movie movie : movies) 		{
            if(movie.rating.equals("PG"))
            {
                pg_movies.add(movie);
            }
        }
        return pg_movies;
    }
    public String toString()
    {
        return "Title  : "+ title + "\nStudio : " + studio + "\nRating : " + rating + "\n";
    }
    public static void main(String[] args)  	{
        Movie movie = new Movie("House of Dragon", "HBO", "8.1");
        System.out.println(movie);
    }
}
