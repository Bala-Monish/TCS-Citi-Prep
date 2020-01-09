import java.util.*;
public class Test7{
public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(111);

        list.add(222);

        list.add(333);

        list.add(444);

        list.add(555);

        list.add(666);

        System.out.println(list);



        List<Integer> subList = list.subList(1, 4);

        System.out.println(subList);



        list.set(2, 000);



        System.out.println(subList);



        subList.set(2, 000);



        System.out.println(list);
    }
    }