import java.util.*;

public class matrixmult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int m1r,m1c,m2r,m2c;
        System.out.println("Enter the Number of Row you want in Matrix 1");
        m1r = sc.nextInt();
        System.out.println("Enter the Number of Column you want in Matrix 1");
        m1c = sc.nextInt();
        System.out.println("Enter the Number of Row you want in Matrix 2");
        m2r = sc.nextInt();
        System.out.println("Enter the Number of Column you want in Matrix 2");
        m2c = sc.nextInt();
        
        
        if (m1c == m2r) {
        	
        	int m1[][] = new int [m1r][m1c];
        	int m2[][] = new int [m2r][m2c];
        	int m3[][] = new int [m1r][m2c];
        	
        	
        	System.out.println("Enter Matrix 1 Elements");
        	for (int i=0;i<m1r;i++) {
        		for(int j=0;j<m1c;j++) {
        			m1[i][j] = sc.nextInt();
        			
        		}
        	}
        	System.out.println("Enter Matrix 1 Elements");
        	for (int i=0;i<m2r;i++) {
        		for(int j=0;j<m2c;j++) {
        			m2[i][j] = sc.nextInt();
        		}
        	}
        	System.out.println("Result of matric is :");
        	for(int i=0;i<m1r;i++) {
        		for(int j=0;j<m2c;j++) {
        			m3[i][j]=0;
        				for(int k=0;k<m1c;k++) {
        					m3[i][j] += m1[i][k]*m2[k][j];
        				}
        			System.out.print(m3[i][j]+ " ");
        			
        		}
        		System.out.println("");
        	}
        	
        	
        }
        else {
        	System.out.println("Matrix Multiplication not possible this value");
        }
	}
}

/*Reference
 * https://www.youtube.com/watch?v=ixxVlgvmEoo
 * https://www.scaler.com/topics/matrix-multiplication-in-java/
 */
