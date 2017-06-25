package graphs.dijkstra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Vertex implements Comparable<Vertex>{
	
	private String name;
	
	private List<Vertex> children;
	
	private Vertex parent;
	
	private Integer shortestRoute;
	
	private List<String> visitedVertices;
	
	// from [parent] to reach this node is [value]. Eg: [A]->[6]
	private Map<String, Integer> fromPaths;
	
	public Vertex(String name) {
		// initialize to max value
		this.visitedVertices = new ArrayList<>();
		this.shortestRoute = Integer.MAX_VALUE;
		this.fromPaths = new HashMap<>();
		this.children = new ArrayList<>();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Vertex> getChildren() {
		return children;
	}

	public void setChildren(List<Vertex> children) {
		this.children = children;
	}

	public Vertex getParent() {
		return parent;
	}

	public void setParent(Vertex parent) {
		this.parent = parent;
	}
	
	@Override
	public String toString() {
		return this.name;
	}

	public Integer getShortestRoute() {
		return shortestRoute;
	}

	public void setShortestRoute(Integer shortestRoute) {
		this.shortestRoute = shortestRoute;
	}

	public Map<String, Integer> getFromPaths() {
		return fromPaths;
	}

	public void setFromPaths(Map<String, Integer> fromPaths) {
		this.fromPaths = fromPaths;
	}

	public List<String> getVisitedVertices() {
		return visitedVertices;
	}

	public void setVisitedVertices(List<String> visitedVertices) {
		this.visitedVertices = visitedVertices;
	}

	@Override
	public int compareTo(Vertex o) {
		return this.shortestRoute.compareTo(o.getShortestRoute());
	}
	

}
