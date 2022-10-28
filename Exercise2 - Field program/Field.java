/* 
 * Field Program: Class Field.java (main class)
 * 
 * Name: Ali
 * Surname: Arabyarmohammadi
 * 
 * Name: Genís
 * Surname: Martí Manresa
 * 
 */

public class Field {

	public static void main(String args[]) {
		
		//Flags monitor class is instantiated
		Flags flags = new Flags();
		
		//Neighbor's Thread class instances a and b are created
		Thread a = new Neighbor(flags);
		Thread b = new Neighbor(flags);
		
		//Threads are named
		a.setName("alice");
		b.setName("bob");
		
		//Threads are started
		a.start();
		b.start();
	}
}
