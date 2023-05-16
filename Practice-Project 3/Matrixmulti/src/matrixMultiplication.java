
import java.util.*;
public class matrixMultiplication{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=3;
	
	int[][] a=new int[n][n];
	int[][] b=new int[n][n];
	int[][] c=new int[n][n];
	
	
 System.out.println("Matrix A:");
 for(int i=0;i<n;i++) {
	 for( int j=0;j<n;j++) {
		 a[i][j]=sc.nextInt();
 }
	 
 }
 
 System.out.println("Matrix B:");
 for(int i=0;i<n;i++) {
	 for( int j=0;j<n;j++) {
		 b[i][j]=sc.nextInt();
 
	 }
	
 }
 for(int i=0;i<n;i++) {
	 for( int j=0;j<n;j++) {
       for(int k=0;k<n;k++) {
        	
         c[i][j] =c[i][j] + a[i][k] * b[k][j];
		
       }   
	 }
 }
   

System.out.println("the product of two matrics is:");
    for(int i=0;i<n;i++) {
	 for( int j=0;j<n;j++) {
		 System.out.print(c[i][j]+"  ");
 
	 }
	 System.out.println();
 }
 
}	 
 
}

/*
output
Matrix A:
	 5 7 8
	6 7 8
	7 8 9
	Matrix B:
	4 5 8
	4 6 8
	3 5 6
	the product of two matrics is:
	72  107  144  
	76  112  152  
	87  128  174  
*/