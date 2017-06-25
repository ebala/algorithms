package graphs.dijkstra;

import java.util.Collections;
import java.util.List;

public class Dijkstra {

	public void dijkstra(Vertex graph) {

		// Start path as 0
		graph.setShortestRoute(0);

		Vertex next = graph;
		while (null != next) {
			Vertex parent = next;
			List<Vertex> children = parent.getChildren();
			
			for (Vertex cVertex : children) {
				// [parent]->[value] eg: A to B is 6, and in B vertex it is
				// represented as [A]->[6]
				int pathDistance = 0;
				if(!cVertex.getFromPaths().isEmpty() && cVertex.getFromPaths().containsKey(parent.getName())){
					pathDistance = cVertex.getFromPaths().get(parent.getName());
				}
				// Calculate the total path to reach this vertex
				pathDistance = parent.getShortestRoute() + pathDistance;
				// set the shortest path
				if (pathDistance < cVertex.getShortestRoute()) {
					cVertex.setShortestRoute(pathDistance);
					cVertex.setParent(parent);
//					System.out.println(parent.getName() + "  to   " + cVertex.getName() + " ==> "+ cVertex.getShortestRoute());
				}
				cVertex.getVisitedVertices().add(parent.getName());
			}
			
			if(!children.isEmpty()){
				Collections.sort(children);
				next = children.get(0);
//				System.out.println("Next Vertex --------------------------->  " + next.getName());
			}else{
				next = null;
			}
		}

	}

}
