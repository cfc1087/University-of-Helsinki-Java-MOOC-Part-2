package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) throws IllegalArgumentException {
        if (age > 120 || age < 0) {
            throw new IllegalArgumentException();

        }
        if (name == null || name.length() > 40||name.equals("")) {
            throw new IllegalArgumentException();
        }

        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
