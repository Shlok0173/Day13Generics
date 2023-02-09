package Ass;

public class MaxInteger {
      public static <T>void findMax(T x, T y,T z){
    	  T max=x;
    	  if(y.compareTo(max)>0) {
    		  max=y;
    	  }
    	  if(z.compareTo(max)>0) {
    		  max=z;
    	  }
    	  System.out.pritnln(max);
      }
      
      public static void main(String []args) {
    	  Integer x=10,y=20,z=30;
    	  findmax(x,y,z);
      }
}
