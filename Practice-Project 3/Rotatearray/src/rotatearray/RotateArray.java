package rotatearray;
public class RotateArray {

	public static void main(String[] args) {
		int []array=new int [] {5,3,2,8,1};
		int n=3;
		System.out.println("Array");
		for(int i=0;i<array.length;i++){
		System.out.println(array[i]+"");
		
	}
	for(int i=0;i<n;i++){
	int j,last;
	last = array[array.length-1];
	for(j=array.length-1;j>0;j--) {
		array[j]=array[j-1];
	}
	array[0]=last;
	}
	System.out.println();
	System.out.println("Rotate Array");
	for(int i=0;i<array.length;i++) {
		System.out.println(array[i]+"");
	}
	
}

}