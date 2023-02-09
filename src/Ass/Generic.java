package Ass;

public class Generic <T extends Comparable<T> {
   public T x,y,z;
   
   public Generic(T x, T y, Tz) {
	   this.x=x;
	   this.y=y;
	   this.z=z;
   }
   public static <T extends Compare<T> Tfindmax(T x, T y,T z){
	   T max=x;
	   if(y.compareTo(max)>0) {
		   max=y;
	   }
	   if(z.compareTo(Max)>0) {
		   max=y;
	   }
	   return max;
   }
   public void testMax() {
	   T maxVal=findMax(x,y,z);
	   System.out.println("max is"+maxVal);
   }
   
   public static void main(String []args) {
	   Generic <Integer> iInt=new Generic<Integer>(20,34,55);
	   Generic<String>sString=new Genenric<Integer>("Bihar","Bhopal","delhi");
	   Generic<float>ffloat=new Generic(13.4,45.56,66.5);
	   
	   iInt.testMax();
	   sString.testMax();
	   ffloat.test();
   }
}
