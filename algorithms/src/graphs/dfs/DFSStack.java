package graphs.dfs;

import java.util.Stack;

/**
 * Depth first Visit the complete length of a node
 * 
 * @author Bala
 *
 */
public class DFSStack {

	public void dfsByStack(Vertex graph) {

		Stack<Vertex> visitedVertices = new Stack<>();
		visitedVertices.push(graph);
		System.out.print("  " + graph.getName());

		while (!visitedVertices.isEmpty()) {

			Vertex vertex = visitedVertices.peek();
			for (Vertex child : vertex.getChildren()) {
				if (!child.isVisited()) {
					System.out.print("  " + child.getName());
					child.setVisited(true);
					child.setParent(vertex);
					vertex.setVisitedCount(vertex.getVisitedCount() + 1);
					visitedVertices.push(child);
					break;
				}
			}

			// If all children are visited, then remove
			if (vertex.getChildren().size() == vertex.getVisitedCount()
					&& visitedVertices.peek().getName().equals(vertex.getName())) {
				visitedVertices.pop();
			}

		}

	}

	public void dfsByRecursion(Vertex vertex) {
		System.out.print("  " + vertex.getName());
		for (Vertex child : vertex.getChildren()) {
			if(!child.isVisited()){
				child.setVisited(true);
				child.setParent(vertex);
				dfsByRecursion(child);
			}
		}
	}

}
