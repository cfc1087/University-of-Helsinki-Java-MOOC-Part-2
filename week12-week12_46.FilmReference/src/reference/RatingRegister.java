/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author Christopher
 */
public class RatingRegister {

    Map<Film, List<Rating>> filmRatings;
    Map<Person, Map<Film, Rating>> personalRatings;

    public RatingRegister() {

        filmRatings = new HashMap<Film, List<Rating>>();
        personalRatings = new HashMap<Person, Map<Film, Rating>>();
    }

    public void addRating(Film film, Rating rating) {
        if (!filmRatings.containsKey(film)) {
            List<Rating> list = new ArrayList<Rating>();
            filmRatings.put(film, list);
            filmRatings.get(film).add(rating);
        } else {
            filmRatings.get(film).add(rating);
        }
    }

    public List<Rating> getRatings(Film film) {
        if (filmRatings.containsKey(film)) {
            return filmRatings.get(film);
        } else {
            return null;
        }

    }

    public Map<Film, List<Rating>> filmRatings() {
        return this.filmRatings;
    }

    public void addRating(Person person, Film film, Rating rating) {
        if (!personalRatings.containsKey(person)) {
            Map<Film, Rating> map = new HashMap<Film, Rating>();
            personalRatings.put(person, map);
            personalRatings.get(person).put(film, rating);

        } else if (!personalRatings.get(person).containsKey(film)) {
            personalRatings.get(person).put(film, rating);
        }

        if (!filmRatings.containsKey(film)) {
            List<Rating> list = new ArrayList<Rating>();
            filmRatings.put(film, list);
            filmRatings.get(film).add(rating);
        } else {
            filmRatings.get(film).add(rating);
        }
    }

    public Rating getRating(Person person, Film film) {
        if (personalRatings.containsKey(person) && personalRatings.get(person).containsKey(film)) {
            return personalRatings.get(person).get(film);
        }
        return Rating.NOT_WATCHED;

    }

    public Map<Film, Rating> getPersonalRatings(Person person) {
        if (personalRatings.containsKey(person)) {
            return personalRatings.get(person);
        } else {
            Map<Film, Rating> map = new HashMap<Film, Rating>();
            personalRatings.put(person, map);
            return personalRatings.get(person);
        }
    }

    public List<Person> reviewers() {
        List<Person> reviewers = new ArrayList<Person>();
        for (Person p : personalRatings.keySet()) {
            reviewers.add(p);
        }
        return reviewers;

    }

}
