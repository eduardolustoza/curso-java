package exercicios.exercicio5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountOccurrences {
	public Map<String, Integer> countOccurrences(List<String> strings) {
        Map<String, Integer> occurrences = new HashMap<String, Integer>();
        
        for (String str : strings) {
            Integer count = occurrences.get(str);
            if (count == null) {
                occurrences.put(str, 1);
            } else {
                occurrences.put(str, count + 1);
            }
        }
        
        return occurrences;
    }
    
    public static void main(String[] args) {
    	CountOccurrences stringCounter = new CountOccurrences();
        
        List<String> stringList = new ArrayList<String>();
        stringList.add("maça");
        stringList.add("banana");
        stringList.add("maça");
        stringList.add("laranja");
        stringList.add("banana");
        stringList.add("maça");
        
        Map<String, Integer> occurrences = stringCounter.countOccurrences(stringList);
        
        for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
