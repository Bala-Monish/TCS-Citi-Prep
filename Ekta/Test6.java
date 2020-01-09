import java.util.*;
public class Test6
{
public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();

        list.add("AAA");

        list.add("BBB");

        list.add("ccc");

        list.add("DDD");

        list.add("e");

        System.out.println(list);



        list.remove(2);

        System.out.println(list);



        list.remove(3);

        System.out.println(list);
        list.clear();

        System.out.println(list);
    }
    }