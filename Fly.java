
public interface Fly {
	
	void takeoff();
	
	int ascend ();
	
	int descend ();
	
	void land();
	
	default void glide() {
		System.out.println("It glides into the air");
		
	}

}
