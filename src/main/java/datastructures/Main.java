package datastructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("f4gf4gf4tg3tg");
        hashSet.add("abv4f4trvgvrgvgregc");
        hashSet.add("hv4379vth739tvh3t9vgh35t7gv");

        System.out.println(hashSet);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("f4gf4gf4tg3tg");
        linkedHashSet.add("abv4f4trvgvrgvgregc");
        linkedHashSet.add("hv4379vth739tvh3t9vgh35t7gv");

        System.out.println(linkedHashSet);

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("f4gf4gf4tg3tg");
        treeSet.add("abv4f4trvgvrgvgregc");
        treeSet.add("hv4379vth739tvh3t9vgh35t7gv");

        System.out.println(treeSet);
    }
}
