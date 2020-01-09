// to demonstrate Bounded Type Parameters

public class BoundedTypeParameters{
    public static <T extends Comparable<T>> T maximum( T x, T y, T z){
        T max = x;
        if(y.compareTo(max)>0){
            max = y;
        }
        if(z.compareTo(max)>0){
            max = z;
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.printf("Maximum of the following three is %d \n", maximum(10, 15, 25));
        System.out.printf("Maximum of the following three is %s \n", maximum("Ole", "Martial","Rashford"));
    }
}