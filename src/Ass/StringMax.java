package Ass;

public class StringMax {
     public static String compareTo(String x,String y,String z) {
    	 int a=x.compareTo(y);
    	 int b=x.compareTo(z);
    	 int c=y.compareTo(z);
    	 
    	 if(a>b && a>c) {
    		 return x;
    	 }else if(b>c) {
    		 return y;
    	 }else {
    		 
    	 
		return z;
     }
     }
     public static void main(String args[]) {
    	 StringMax m=new StringMax();
    	 System.out.println("max Number of 1 st test case="+m.compareTo("shlok", "shlokmihsra", "shlokku"));
    	 System.out.println("max Number of 2nd test case ="+m.compareTo("ajit", "mishra", "ajitmishra"));
    	 System.out.println("max number of 3 rd test case="+m.compareTo("karmaul", "ajitkumar ","mishra ajit"));
     }
}
