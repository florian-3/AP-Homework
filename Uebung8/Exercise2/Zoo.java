package Uebung8.Exercise2;

import java.util.HashMap;
import java.util.Map;

public class Zoo{
    Map<Mammal, Integer> zooInhabitants = new HashMap<>();

    void addAnimal (Mammal m){
        if (zooInhabitants.containsKey(m)) {
            zooInhabitants.put(m, zooInhabitants.get(m) + 1);
        }
        else{
            zooInhabitants.put(m, 1);
        }
    }

}
