package AlgorithmDesign.fuck05;

import java.util.PriorityQueue;

class Node implements Comparable<Node> {
	int freq;
	char ch;
	Node left, right;

	Node(int freq, char ch) {
		this.freq = freq;
		this.ch = ch;
		left = right = null;
	}

	public int compareTo(Node other) {
		return this.freq - other.freq;
	}
}

public class Fibonacci {
	public static void main(String[] args) {
		int[] fib = new int[8];
		fib[0] = fib[1] = 1;
		for (int i = 2; i < 8; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}

		PriorityQueue<Node> pq = new PriorityQueue<>();
		for (int i = 0; i < 8; i++) {
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