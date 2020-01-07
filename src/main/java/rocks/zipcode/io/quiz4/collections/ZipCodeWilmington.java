package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {

    //Fields
    private HashMap<Student, Double> studyMap = new HashMap<>();

    //Methods
    public void enroll(Student student) { studyMap.put(student, 0.0); }

    public Boolean isEnrolled(Student student) { return studyMap.containsKey(student); }

    public void lecture(double numberOfHours) {
        for(Student kid : studyMap.keySet()){ kid.learn(numberOfHours); }
    }

    public Map<Student, Double> getStudyMap() { return studyMap; }
}
