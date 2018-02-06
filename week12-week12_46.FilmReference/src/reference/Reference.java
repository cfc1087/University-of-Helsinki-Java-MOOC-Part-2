/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import reference.comparator.FilmComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author Christopher
 */
public class Reference {

    private RatingRegister register;

    public Reference(RatingRegister register) {
        this.register = register;
    }

    public Film recommendFilm(Person person) {
        
        Map<Film, Rating> personalRatings = register.getPersonalRatings(person);
        Map<Film, List<Rating>> filmRatings = register.filmRatings();
        List<Film> filmList = new ArrayList<Film>();
        for (Film f : filmRatings.keySet()) {
            filmList.add(f);
        }
       System.out.println("The films before sorting: " + filmList);

    Collections.sort(filmList, new FilmComparator(filmRatings));
    System.out.println("The films after sorting: " + filmList);
        ArrayList<Film> rec = new ArrayList<Film>();

        for (Film f : filmList) {
            if (!personalRatings.containsKey(f)) {
                rec.add(f);
            }else if(personalRatings.isEmpty()){
                return f;
            }
        }
        Collections.sort(rec, new FilmComparator(filmRatings));
        if(rec.isEmpty()){
            return null;
        }
        return rec.get(0);
    }

}
