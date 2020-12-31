import java.io.*;
import java.util.*;

public class Graph {
	public int V;
	public int E;
	public Set<Edge>[] edgesOf;
	public int[] indegree;

	public Graph(int v, int e) {
		V = v;
		E = e;
	}

	public Graph(Scanner in) throws Exception {
		V = in.nextInt();
		indegree = new int[V];
		edgesOf = (Set<Edge>[]) new HashSet[V];
		for (int v = 0; v < V; v++) {
			edgesOf[v] = new HashSet<Edge>();
		}

		E = in.nextInt();
		for (int i = 0; i < E; i++) {
			int v = in.nextInt();
			int w = in.nextInt();
			double weight = in.nextDouble();
			edgesOf[v].add(new Edge(v, w, weight));
			indegree[w]++;
		}
	}

	public void add(Edge e) {
		edgesOf[e.from()].add(e);
	}

	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(V + " " + E + "\n");
		for (int v = 0; v < V; v++) {
			s.append(v + ": ");
			for (Edge e : edgesOf[v]) {
				s.append(e + "  ");
			}
			s.append("\n");
		}
		return s.toString();
	}

	
	public void main(String[] args) throws Exception {
		Graph G = new Graph(new Scanner(new File("graph1.txt")));
		
		System.out.println(G);
		
	}
}