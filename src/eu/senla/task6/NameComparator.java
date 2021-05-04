package eu.senla.task6;

import eu.senla.task3.Cat;

import java.util.Comparator;


public class NameComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
