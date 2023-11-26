package AlgorithmDesign.fuck05;

import java.util.*;

public class Nibonacci {
	public static void main(String[] args) {
		int n = 26;
		int[] fib = new int[n]; // n为字符的数量
		fib[0] = fib[1] = 1;
		for (int i = 2; i < n; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}

		PriorityQueue<Node> pq = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
			pq.add(new Node(fib[i], (char) ('a' + i)));
		}

		while (pq.size() != 1) {
			Node left = pq.poll();
			Node right = pq.poll();
			Node parent = new Node(left.freq + right.freq, '$');
			parent.left = left;
			parent.right = right;
			pq.add(parent);
		}

		Node huffmanTree = pq.poll();
		printCodes(huffmanTree, "");
	}

	private static void printCodes(Node node, String str) {
		if (node == null) return;
		if (node.ch != '$') System.out.println(node.ch + "->" + str);
		printCodes(node.left, str + "0");
		printCodes(node.right, str + "1");
	}
}