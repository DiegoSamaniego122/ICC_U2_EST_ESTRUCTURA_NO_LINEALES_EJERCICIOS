package structures.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import models.Person;

public class Sets {
    public Set<String> construirHashSet(){
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");
        hashSet.add("aghagdsgdhagdh");
        return hashSet;
    }

    public Set<String> construirLinkedHashSet(){

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("C");
        linkedHashSet.add("A");
        linkedHashSet.add("D");
        linkedHashSet.add("wefbdakjghask");
        linkedHashSet.add("sabasbvosvbbdosbi");
        linkedHashSet.add("chkvvuwvewvr");
        linkedHashSet.add("fuivbewbuiv");
        linkedHashSet.add("iowehieve");
        
        return linkedHashSet;
    }

    public Set<String> construirTreeSet(){
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("D");
        treeSet.add("A");
        treeSet.add("E");
        treeSet.add("I");
        treeSet.add("O");
        treeSet.add("B");
        treeSet.add("a");
        return treeSet;
    }

    public Set<String> construirTreeSetComparador(){
        Set<String> treeSet = new TreeSet<>(
            (pal1, pal2) -> pal1.compareToIgnoreCase(pal2)
        );
        treeSet.add("D");
        treeSet.add("A");
        treeSet.add("E");
        treeSet.add("I");
        treeSet.add("O");
        treeSet.add("B");
        treeSet.add("a");
        return treeSet;
    }

    public Set<Person> personsTreeSet(){
        Set<Person> treePersons = new TreeSet<>(
            (p1, p2) -> {
                //int cmp = Integer.compare(p1.getAge(), p2.getAge());
                //return cmp;
                //return p2.getName().compareToIgnoreCase(p1.getName());
                int comN = p2.getName().compareTo(p1.getName());
                if(comN != 0) 
                return comN;
                int comE = Integer.compare(p2.getAge(), p1.getAge());
                return comE;
            }
        );
        treePersons.add(new Person("Carlos", 23));
        treePersons.add(new Person("Ana", 30));
        treePersons.add(new Person("Luis", 18));
        treePersons.add(new Person("Ana", 20));
        treePersons.add(new Person("Andres", 23));
        treePersons.add(new Person("Luis", 18));
        
        return treePersons;
    }
    
}