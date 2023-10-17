import com.sun.org.apache.bcel.internal.classfile.Code;

import java.text.BreakIterator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        City city = new City();
        city.setName("Amantur");
        city.setName("Suerov");
        city.setName("55");
        city.setCode("5");
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(55);
        treeSet.add(555);
        treeSet.add(5555);
        treeSet.add(55555);
        System.out.println(treeSet);
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext());
}}