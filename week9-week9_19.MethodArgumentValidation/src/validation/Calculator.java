package validation;

public class Calculator {

    public int multiplication(int fromInteger)throws IllegalArgumentException {
        int multiplication = 1;
        if (fromInteger >= 0) {

            for (int i = 1; i <= fromInteger; i++) {
                multiplication *= i;
            }

        }else{
            throw new IllegalArgumentException();
        }
        return multiplication;
    }

    public int binomialCoefficient(int setSize, int subsetSize)throws IllegalArgumentException {
        if(setSize<0||subsetSize<0){
            throw new IllegalArgumentException();
        }else if(subsetSize>setSize){
            throw new IllegalArgumentException();
        }
        int numerator = multiplication(setSize);
        int denominator = multiplication(subsetSize) * multiplication(setSize - subsetSize);

        return numerator / denominator;
    }
}
