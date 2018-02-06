
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Christopher
 */
public class Hand implements Comparable<Hand> {

    private ArrayList<Card> hand = new ArrayList<Card>();

    public void add(Card card) {

        hand.add(card);
    }

    public void print() {
        if (hand != null) {
            for (Card card : hand) {
                System.out.println(card.toString());
            }
        }
    }

    public void sort() {
        if (hand != null) {
            Collections.sort(hand);
        }
    }

    @Override
    public int compareTo(Hand t) {
        int value = 0;
        int tValue = 0;
        for (int i = 0; i < this.hand.size() ; i++) {
            value += this.hand.get(i).getValue();
           

        }
         for (int i = 0; i < t.hand.size() ; i++) {
            
            tValue += t.hand.get(i).getValue();

        }
        if (value > tValue) {
            return 1;
        } else if (value < tValue) {
            return -1;
        } else if (value == tValue) {
            return 0;
        }
        return 0;
    }

    public void sortAgainstSuit() {

        Collections.sort(hand, new SortAgainstSuitAndValue());

    }
}
