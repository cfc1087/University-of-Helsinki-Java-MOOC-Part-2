/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

/**
 *
 * @author Christopher
 */
public class FilmComparator implements Comparator<Film> {

    Map<Film, List<Rating>> ratings;

    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings = ratings;
    }

    public int getAvgRating(Film f) {
        int sum = 0;
        for (Rating r : ratings.get(f)) {
            sum += r.getValue();
        }
        int avg = sum / ratings.get(f).size();

        return avg;
    }

    @Override
    public int compare(Film o1, Film o2) {
        int film1 = getAvgRating(o1);
        int film2 = getAvgRating(o2);
       
        if (film1 > film2) {
            return -1;
        } else if (film1 < film2) {
            return 1;
        } else {
            return 0;
        }
    }
}
