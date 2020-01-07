package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable<String> {

    //Fields
    private ArrayList<String> group = new ArrayList<>();

    //Constructor
    public SimpleStringGroup() { }

    //Methods
    public Integer count() { return group.size(); }

    public void insert(String string) { group.add(string); }

    public Boolean has(String string) {
        return group.contains(string);
    }

    public String fetch(int indexOfValue) {
        return group.get(indexOfValue);
    }

    public void delete(String string) { group.remove(string); }

    public void clear() { group.clear(); }

    //Implement Methods


    @Override
    public Iterator<String> iterator() {
        return group.iterator();
    }

    @Override
    public void forEach(Consumer<? super String> action) {
        group.forEach(action);
    }

    @Override
    public Spliterator<String> spliterator() {
        return group.spliterator();
    }
}
