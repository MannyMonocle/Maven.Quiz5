package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    private String delim;
    private String str = "";

    public StringAssembler(Character delimeter) {
        this.delim = delimeter.toString();
    }

    public StringAssembler append(String str) {
        this.str += delim + str;
        return this;
    }

    public String assemble() {
        return str;
    }
}
