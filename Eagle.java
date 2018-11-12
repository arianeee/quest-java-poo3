public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

 
    public String sing() {
        return "Screech!";
    }
  
   

	
	public void takeoff() {
		System.out.println( this.getName()+"   "+
	this.getAltitude()+" Ouille");
		
	}

	
	
	public int descend(int meters) {
		meters=this.getAltitude();
		if (meters<0) {}
    	System.out.println(this.getName()+"  "+ meters+" pas youpi ");   
    	return meters;
	}

	
	public void land() {
		System.out.println( this.getName()+" Aie");
		
	}


	public int ascend(int meters) {
		meters=this.getAltitude();
		if (meters>0) {}
    	System.out.println( this.getName()+"  "+ meters+" youpi ");   
    	return meters;
		
	}

}

