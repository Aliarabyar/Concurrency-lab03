/* 
 * Field Program: Class Flags.java (monitor class)
 * 
 * Name: Ali
 * Surname: Arabyarmohammadi
 * 
 * Name: Genís
 * Surname: Martí Manresa
 * 
 */

public class Flags {
	
	//a and b thread's flag state.
	private boolean flag_alice;
	private boolean flag_bob;
	
	public Flags() {
		//flag initialization, flags are down.
		flag_alice = false;
		flag_bob = false;
	}
	
	//query_flag returns boolean indicating the state of the neighbor's flag.
	public synchronized boolean query_flag(String s) {
		//no condition synchronization is needed
		if(s.equals("alice")) return flag_bob;
		return flag_alice;
	}
	
	//set_true sets the indicated flag state to true
	public synchronized void set_true(String s) {
		//no condition synchronization is needed
		if(s.equals("alice")) {flag_alice = true;}
		else {flag_bob = true;}
	}
	
	//set_true sets the indicated flag state to false
	public synchronized void set_false(String s) {
		//no condition synchronization is needed
				if(s.equals("alice")) {flag_alice = false;}
				else {flag_bob = false;}
	}
}
