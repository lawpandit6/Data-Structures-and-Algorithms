package in.law.graph;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class GraphRepresentation {

	LinkedList<Integer>[] adjList;

	public GraphRepresentation(int vertex) {
		adjList = new LinkedList[vertex];
		for (int i = 0; i < vertex; i++) {
			adjList[i] = new LinkedList<Integer>();
		}
	}

	public void add(int vertex, int adjVertex) {
		adjList[vertex].add(adjVertex);
	}

	// BFS , in BFS we use queue
	public void BFS(int vertex) {
		Queue<Integer> q = new LinkedList<>();
		q.add(vertex);
		Set<Integer> s = new HashSet<>();
		while (!q.isEmpty()) {
			Integer ver = q.poll();// consider as a visit vertex
			s.add(ver);
			System.out.print(ver + " ");

			LinkedList<Integer> l = adjList[ver];
			Iterator<Integer> itr = l.iterator();
			while (itr.hasNext()) {
				Integer integer = itr.next();
				if (!s.contains(integer)) {
					q.add(integer);
					s.add(integer);
				}
			}
		}

	}

	// DFS ,in DFS we use stack
	public void DFS(int vertex) {
		Stack<Integer> q = new Stack<>();
		q.add(vertex);
		Set<Integer> s = new HashSet<>();
		while (!q.isEmpty()) {
			Integer ver = q.pop();// consider as a visit vertex
			s.add(ver);
			System.out.print(ver + " ");

			LinkedList<Integer> l = adjList[ver];
			Iterator<Integer> itr = l.iterator();
			while (itr.hasNext()) {
				Integer integer = itr.next();
				if (!s.contains(integer)) {
					q.add(integer);
					s.add(integer);
				}
			}
		}

	}

	public static void main(String[] args) {
		GraphRepresentation g = new GraphRepresentation(5);
		g.add(0, 1);// from 0 you can go to 1
		g.add(0, 2);// from 0 you can go to 2
		g.add(1, 0);
		g.add(1, 3);
		g.add(1, 4);
		g.add(2, 0);// from 2 you can go to 0
		g.add(2, 3);
		g.add(3, 1);// from 3 you can go to 1
		g.add(3, 2);
		g.add(3, 4);
		g.add(4, 1);
		g.add(3, 1);
		System.out.println("BFS===========");
		g.BFS(0);
		System.out.println("\nDFS===========");
		g.DFS(0);

	}
}
