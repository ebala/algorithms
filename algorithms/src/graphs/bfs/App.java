package graphs.bfs;

public class App {
	
	public static void main(String[] args) {
		
		BFSStack bfs = new BFSStack();
		System.out.println("**** Call with Queue *********");
		bfs.bfsByStack(getGraph());
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
