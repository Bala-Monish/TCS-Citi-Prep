interface Addition{
    public int add(int x, int y);
}
public class lme4{
    public static void main(String[] args) {
       /* Addition a1 = (x,y) -> (x+y);
        System.out.println(a1.add(10,20));
    */
    Addition a1=(a,b)->(a+b);  
    System.out.println(a1.add(10,20));
}
}