package Ass;

public class MaxFloat {
    public static <T> void findMax(T x, T y,T z) {
    	T max;
    	
    	if(y.compareTo(max)>0) {
    		max=y;
    	}
    	if(z.compareTo(max)>0) {
    		max=z;
    	}
    	System.out.println("max number is +"+max);
   }
    
    public static void main(String []args) {
    	Double x=100.3,y=34.5,56.6;
    	findmax(x,y,z);
    }
}
