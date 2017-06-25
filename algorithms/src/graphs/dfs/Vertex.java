package graphs.dfs;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String name;
	
	private boolean isVisited;
	
	private List<Vertex> children;
	
	private Vertex parent;
	
	
	private int visitedCount;

	
	public Vertex(String name) {
		this.visitedCount =0;
		this.children = new ArrayList<>();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
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

	public int getVisitedCount() {
		return visitedCount;
	}

	public void setVisitedCount(int visitedCount) {
		this.visitedCount = visitedCount;
	}
	

}
