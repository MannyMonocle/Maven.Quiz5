package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {

    //Fields
    private Double studytime = 0.0;
    private Integer id;

    //Constructors
    public Student() {
        this(null);
    }

    public Student(Integer id) {
    }

    //Mutators
    public void learn(Double amountOfHours) { studytime += amountOfHours;}

    //SettersAndGetters
    public Double getTotalStudyTime() {
        return studytime;
    }
}
