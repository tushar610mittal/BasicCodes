package JavaBasics;

public class ArraySort {

	public static void main(String[] args) {

		int a[] = new int[] { 99, 100, 44, 55, 101, 101, 200 };
		//int max = a[0];
		int temp;
		for (int i = 0; i < a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println();
		int scndlarg= a[1];
		System.out.println(scndlarg);
		

	}
}
