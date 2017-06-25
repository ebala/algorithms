package graphs.dfs;

public class App {
	
	public static void main(String[] args) {
		
		DFSStack dfs = new DFSStack();
		System.out.println("**** Call with Stack *********");
		dfs.dfsByStack(getGraph());
		System.out.println("\n**** Call with Recursion *********");
		dfs.dfsByRecursion(getGraph());
	}
	
	private static Vertex getGraph(){
		Vertex a = new Vertex("A");
		Vertex b = new Vertex("B");
		Vertex c = new Vertex("C");
		Vertex d = new Vertex("D");
		Vertex e = new Vertex("E");
		Vertex f = new Vertex("F");
		Vertex g = new Vertex("G");
		Vertex h = new Vertex("H");
		
		a.getChildren().add(b);
		a.getChildren().add(c);
		
		c.getChildren().add(d);
		c.getChildren().add(e);
		c.getChildren().add(f);
		
		e.getChildren().add(g);
		
		f.getChildren().add(h);
		
		return a;
	}

}
