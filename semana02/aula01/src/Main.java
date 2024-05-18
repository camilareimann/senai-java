import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // //fabrica de forma//interface   //classe/forma             
        // ArrayList<String> collection = new ArrayList(); // lista de strings

        // collection.add("A");
        // collection.add("B");
        // collection.add("C");

        // System.out.println(collection.get(1));


        // int[] array = new int[10]; // lista de primitivos = imutavel
        // array[0] = 1;
        // array[1] = 10;
        // array[2] = 3;
        
        // System.out.println(array[1]);

                LinkedList<String> pilha = new LinkedList<>();
        
                // Add elements to the front of the LinkedList
                pilha.addFirst("ItemA");
                pilha.addFirst("ItemB");
                pilha.addFirst("ItemC");
                pilha.addFirst("ItemD");
        
                // Print initial state
                System.out.println(pilha);
                System.out.println("LIFO - Last In First Out");
        
                // Remove elements in LIFO order
                int tamanhoOriginal = pilha.size();
                for(int i = 0; i < tamanhoOriginal; i++){
                    System.out.println(pilha.pop()); // pop() retrieves and removes the head (first element)
                }
            
        
        


        // int tamanhoOriginal = linkedList.size();
        // for(int i = 0; i < tamanhoOriginal; i++){
        //     System.out.println(linkedList.pollLast()); // poll() retrieves and removes the head (first element)
        // }


        // System.out.println("LIFO - First In First Out");
        // while (!linkedList.isEmpty()) {
        //     System.out.println(linkedList.pollLast()); // pollLast() retrieves and removes the last element
        // }

        // System.out.println("FIFO - First In First Out");
        // System.out.println("Initial LinkedList: " + linkedList);

        // // Ordem fifo = first in first out
        // while (!linkedList.isEmpty()) {
        //     System.out.println(linkedList.pollFirst()); // pollFirst() retrieves and removes the head (first element)
        // }
        


    }
}
