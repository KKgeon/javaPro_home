package javaPro;

import java.util.Arrays;

/*
 * 
2. 아래 1차원 배열 m 의 값을 2차원 배열 n에 채워넣는 변환코딩을 하세요.

 */
public class Sample3 {
	public static void main(String[] args) {
		int [] m = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12  };
		int [][] n = new int[6][2]; 
		int col = n[0].length;
		for (int i = 0; i < m.length; i++) {
			n[i/col][i%col] = m[i];
		}
		
System.out.println(Arrays.deepToString(n));

		/*
		 * m0 = n0 0
		 * m1 = n0 1
		 * m2 = n0 2
		 * m3 = n0 3
		 * m4 = n0 4
		 * m5 = n0 5
		 * 
		 * m6 = n1 0
		 * m7 = n1 1
		 * m8 = n1 2
		 * m9 = n1 3
		 * m10 = n1 4
		 * m11 = n1 5
		 * 
		 */

	}//m
}//c
