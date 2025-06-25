package Homework9.Exercise3;

import java.util.*;
import java.util.stream.Collectors;


public class MovieStreamExample {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Inception", 9.3, 2010),
                new Movie("The Godfather", 9.2, 1972),
                new Movie("The Dark Knight", 9.0, 2008),
                new Movie("Interstellar", 8.6, 2014),
                new Movie("Fight Club", 8.4, 1999),
                new Movie("The Prestige", 8.5, 2006)
        );

        List<Movie> filteredSorted = movies.stream()
                .filter(m -> m.getRating() >= 8.5)
                .sorted(
                        Comparator.comparing(Movie::getYear)
                                .thenComparing(Comparator.comparing(Movie::getRating).reversed())
                )
                .collect(Collectors.toList());

        filteredSorted.forEach(System.out::println);
    }
}
