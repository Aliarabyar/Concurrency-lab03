/* 
 * Field Program: Class Neighbor.java (thread class)
 * 
 * Name: Ali
 * Surname: Arabyarmohammadi
 * 
 * Name: Genís
 * Surname: Martí Manresa
 * 
 */

public class Neighbor extends Thread {
	private Flags flags;
	
	public Neighbor(Flags flags) {
		this.flags = flags;
	}
	
	public void run() {
		while(true) {
			try {
				String name = Thread.currentThread().getName();
				System.out.println("try again, my name is: " + name);
				
				//Thread.sleep((int)(200*Math.random())); This sleep in this position instead of below gets us the normal model
				flags.set_true(name);
				Thread.sleep((int)(200*Math.random()));//This sleep in this position instead of above gets us the greedy model
				
				//if the other neighbor's flag is NOT raised, then this neighbor can enter and pick berries.
				if(!flags.query_flag(name)) {
					System.out.println(name + " enters");
					Thread.sleep(400);
					System.out.println(name + " exits");
				}
				
				Thread.sleep((int)(200*Math.random()));
				flags.set_false(name);
			}
			catch (InterruptedException e) {};
		}
	}
}
