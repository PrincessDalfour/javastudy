package AlgorithmDesign.fuck05;

/**
 * 对于2艘船的情形，贪心算法同样不能保证产生最优解
 * 因为两艘船的承载能力不同，物品的装载顺序也会影响到最后的结果
 * 因此，需要通过其他算法来求解最优装载问题，比如动态规划算法
 */
public class dp {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int n = a.length;
		int[] A = new int[100];
		int[] B = new int[100];
		int sumA = 0;
		int sumB = 0;
		int posA = 0, posB = 0;
		A[posA] = a[0];
		sumA += A[posA++];
		B[posB] = a[1];
		sumB += B[posB++];
		for (int i = 2; i < n; i++) {
			if (sumA >= sumB) {
				B[posB] = a[i];
				sumB += B[posB];
				posB++;
			} else {
				A[posA] = a[i];
				sumA += A[posA];
				posA++;
			}
		}
	}
}