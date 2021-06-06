import java.math.BigInteger;
public class Solution {

    public static void main(String[] args) {
        System.out.println(perimeter(BigInteger.valueOf(7)));
        System.out.println("***");
        System.out.println(perimeter(BigInteger.valueOf(1)));
        System.out.println("***");
        System.out.println(perimeter(BigInteger.valueOf(0)));
    }


    public static BigInteger perimeter(BigInteger n) {
        BigInteger count = BigInteger.ONE;
        BigInteger sum = BigInteger.ONE;
        BigInteger x = BigInteger.ZERO;
        BigInteger y = BigInteger.ONE;
        BigInteger temp;

        if(n.compareTo(BigInteger.ZERO)<=0) return BigInteger.ZERO;
        if(n.compareTo(BigInteger.ONE)==0) return BigInteger.ONE.multiply(BigInteger.valueOf(4));

        while(count.compareTo(n)<=0){
            count = count.add(BigInteger.ONE);
            temp = x.add(y);
            x = y;
            y = temp;
            sum = sum.add(y);
            //System.out.println("x="+x+"; y="+y+"; sum="+sum);
        }

        return sum.multiply(BigInteger.valueOf(4));
    }
}
