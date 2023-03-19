package JavaBasics;

public class SecondLargest {

	public static void main(String[] args) {
		
		int[] a= {20,30,10,4,5,60,59,69,99};
		int max1= a[1], max2=0;
		
		for(int i=0; i<a.length; i++) {
			if(max1< a[i]) {
				max2= max1;
				max1= a[i];
				
			}
			if(a[i]< max1) {
				max2= a[i];
			}
			
		}
		System.out.println(max2);
		System.out.println(max1);
		
	}

}
