package Ass;

 class refact<T extends comparable<T>>{
T[] arr;
refact(T[] n){
	arr=n;

}
public T max() {
	T max=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i].compareTo(max)>0)
			max=arr[i];
		return max;
	}
}
	public static void main(String args[]) {
		
		integer iNum[]= {10,2,5};
		String sString[]= {"shlok","kumar","mishra"};
		Double ffloat[]= {20.4,45.5,45.7};
		
		refact<Integer>iobj=new refact<Integer>(inum);
		refact<String>sobj=new refact<String>(sString);
		refact<Double>fobj=new refact<Double>(ffloat);
		
		System.out.println("Max value in inums:"+obj.max());
		System.out.println("Max value in chs:"+sobj.max());
		System,out.println"Max value in chs:"+fobj.max());
		

}
}
