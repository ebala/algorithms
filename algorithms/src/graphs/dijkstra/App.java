package graphs.dijkstra;


public class App {
	
	
	public static void main(String[] args) {
		
		Vertex a = new Vertex("A");
		
		Vertex b = new Vertex("B");
		b.getFromPaths().put("A", 6);
		b.getFromPaths().put("D", 2);
		b.getFromPaths().put("E", 2);
		
		Vertex c = new Vertex("C");
		c.getFromPaths().put("B", 5);
		c.getFromPaths().put("E", 5);
		
		Vertex d = new Vertex("D");
		d.getFromPaths().put("A", 1);
		
		Vertex e = new Vertex("E");
		e.getFromPaths().put("D", 1);
		e.getFromPaths().put("B", 2);
		
		
		a.getChildren().add(b);
		a.getChildren().add(d);
		
		b.getChildren().add(c);
		
		d.getChildren().add(b);
		d.getChildren().add(e);
		
		e.getChildren().add(c);
		e.getChildren().add(b);
		
		Dijkstra dijkstra = new Dijkstra();
		dijkstra.dijkstra(a);
		
		Vertex target = e;
		System.out.println("The target set is -> " + target.getName());
		System.out.println("*********************************************************************");
		System.out.println("The Shortest path is : " + target.getShortestRoute() + "\n");
		while(target !=null){
			System.out.print(" " + target.getName());
			target = target.getParent();
		}
		System.out.println("\n*********************************************************************");
	}
	
	

}
