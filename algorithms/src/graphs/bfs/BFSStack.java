package graphs.bfs;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Breadth first Visit all the children
 * 
 * @author Bala
 *
 */
public class BFSStack {

	public void bfsByStack(Vertex graph) {

		Queue<Vertex> visitedVertices = new ArrayBlockingQueue<>(20);
		visitedVertices.offer(graph);
		System.out.print("  " + graph.getName());

		while (!visitedVertices.isEmpty()) {
			Vertex vertex = visitedVertices.peek();
			for (Vertex child : vertex.getChildren()) {
				if (!child.isVisited()) {
					System.out.print("  " + child.getName());
					child.setVisited(true);
					child.setParent(vertex);
					vertex.setVisitedCount(vertex.getVisitedCount() + 1);
					visitedVertices.offer(child);
				}
			}

			// If all children are visited, then remove
			if (vertex.getChildren().size() == vertex.getVisitedCount()
					&& visitedVertices.peek().getName().equals(vertex.getName())) {
				visitedVertices.poll();
			}

		}

	}

}
