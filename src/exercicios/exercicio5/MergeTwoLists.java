package exercicios.exercicio5;

import java.util.LinkedList;

public class MergeTwoLists {
    public LinkedList<Integer> mergeTwoLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> mergedList = new LinkedList<>();
        
        while (!list1.isEmpty() && !list2.isEmpty()) {
            if (list1.getFirst() <= list2.getFirst()) {
                mergedList.add(list1.removeFirst());
            } else {
                mergedList.add(list2.removeFirst());
            }
        }
        
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        
        return mergedList;
    }
    
    public static void main(String[] args) {
    	MergeTwoLists mergeTwoLists = new MergeTwoLists();
        
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(3);
        list2.add(4);
        
        LinkedList<Integer> mergedList = mergeTwoLists.mergeTwoLists(list1, list2);
        
        System.out.println("Lista mesclada: " + mergedList);
    }
}
