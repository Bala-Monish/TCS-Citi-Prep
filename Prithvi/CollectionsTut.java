import java.util.*;
public class CollectionsTut{
    public static void main(String[] args) {
        String[] names = { "Rashford", "Martial", "Greenwood", "James"};
        ArrayList <String> list1 = new ArrayList <String>();

        //adding array items to the list
        for(String x: names){
            list1.add(x);
        }
        
        String[] strikers = { "Martial", "Greenwood"};
        ArrayList <String> list2 = new ArrayList <String>();
        
        for(String y: strikers){
            list2.add(y);
        }
        
        // Printing list 1
        for (int i =0; i<list1.size();i++){
            System.out.printf("%s ", list1.get(i));
        }

        editlist(list1,list2);

        for (int i =0; i<list1.size();i++){
            System.out.printf("\n%s ", list1.get(i));
        }
    }


    public static void editlist(Collection<String> l1, Collection<String> l2){
        Iterator<String> itr = l1.iterator();
        while(itr.hasNext()){
            if(l2.contains(itr.next())){
                itr.remove();
            }
        }
    }
}