package gauss5;

import java.util.Arrays;
import java.util.Random;

public class GausKonrad {
	
		
		public void Oblicz()
		{
			int n = 4;
			int g = 1;
			//Random los = new Random ();
			
			float[][] A = new float[n+n][n+1];
      		//float[][] B=new float[g][n];
	
		
		for (int w = 0; w < A.length/2; w++){
		      for (int k = 0; k < A[w].length; k++){
		        //  A[w][k] = los.nextInt(10);
		    	  A[0][0] = 3; A[0][1] = -4; A[0][2] = 4; A[0][3] = -4; A[0][4] = -9;
		    	  A[1][0] = (float) 1.5; A[1][1] = -1; A[1][2] = 2; A[1][3] = -2; A[1][4] = (float) -3.5;
		    	  A[2][0] = (float) 1.5; A[2][1] = (float) -0.5; A[2][2] = 0; A[2][3] = -3; A[2][4] = -2;
		    	  A[3][0] = (float) 4.5; A[3][1] = (float) -5.5; A[3][2] = 4; A[3][3] = -9; A[3][4] = -14;
		    	  
		          System.out.print((A[w][k]) + " | ");
		      }
		      System.out.println();
		  }   
		for (int w = 4; w < A.length; w++){
		      for (int k = 0; k < A[w].length; k++){
		         if(k==w-n) {
		    	  A[w][k] = -1;
		         }
		         else { 
		        	 A[w][k] = 0;
		         }
		          System.out.print((A[w][k]) + " | ");
		      }
		      System.out.println();
		  }   

			
	/*	for (int w = 0; w < B.length; w++){
		      for (int k = 0; k < B[w].length; k++){
		          B[w][k] = los.nextInt(10);
		          System.out.print((B[w][k]) + " X ");
		      }
		      System.out.println();
		      System.out.println();
		  } 	*/	
		
		float[][] M = new float[n+n][n+1];
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n+i+1;j++)
		{  
		    M[j][i] = -A[j][i]/A[i][i];
		    System.out.println(M[j][i]+"M");
		    System.out.println(A[j][i] );
		    System.out.println(A[i][i] );
		    System.out.println( );
		}
		    
			for(int j = i+1; j<n+i+1; j++) {
				for(int k = i+1; k<n+g ;k++ )
				{
					A[j][k]= A[j][k]+M[j][i]*A[i][k];
					System.out.println((A[j][k]));
				}
				System.out.println(" ");
			}
			
		}
		}


}

