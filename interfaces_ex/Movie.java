package interfaces_ex;

import java.util.*;
import java.lang.Comparable;;

public class Movie implements Comparable<Movie> {

    private double rating;
    private String name;
    private int year;

    public Movie(double rating, String name, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int compareTo(Movie m) {
        return this.year - m.year;
    }

    class Main {
        public static void main(String args[]) {
            ArrayList<Movie> movie = new ArrayList<>();

            movie.add(new Movie(4.5, "pushpa", 2021));
            movie.add(new Movie(3.5, "Salaar", 2023));

            Collections.sort(movie);

            for (Movie m : movie) {
                System.out.println(m.getName() + " " + m.getRating() + " " + m.getRating());
            }

        }
    }

}
