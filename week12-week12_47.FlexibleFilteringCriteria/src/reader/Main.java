package reader;

import reader.criteria.AllLines;
import reader.criteria.AtLeastOne;
import reader.criteria.Criterion;
import reader.criteria.ContainsWord;
import reader.criteria.EndsWithQuestionOrExclamationMark;

public class Main {

    public static void main(String[] args) {
    Criterion criterion = new AtLeastOne(new ContainsWord("maito"), new ContainsWord("vesi") );
        System.out.println(criterion.complies("vesi vanhin voitehista"));
    }
}
