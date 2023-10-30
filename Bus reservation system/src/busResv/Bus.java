package busResv;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;  //need get and set methods
	
	Bus(int no, boolean ac, int cap){
		this.busNo = no;
		this.ac = ac;
		this.capacity = cap;
	}
	
	public int getBusNo(){  //accessor method
		return busNo;
	}
	
	public int isAc(){  //accessor method
		return ac;package busResv;

public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;  // need get and set methods

    Bus(int no, boolean ac, int cap) {
        this.busNo = no;
        this.ac = ac;
        this.capacity = cap;
    }

    public int getBusNo() {  // accessor method
        return busNo;
    }

    public boolean isAc() {  // accessor method, should return boolean
        return ac;
    }

    public int getCapacity() {  // accessor method
        return capacity;
    }

    public void setAc(boolean val) {
        ac = val;
    }

    public void setCapacity(int cap) {  // mutator
        capacity = cap;
    }
}

	}
	
	
	public int getCapacity(){  //accessor method
		return capacity;
	}
	
	
	public void setAc(boolean val) {
		ac = val;
	}
	
	public void setCapacity(int cap) {  //mutator
		capacity = cap;
	}
	
	public void displayBusInfo(){
		System.out.println("Bus NO:" + busNo + "AC:" + ac + " Total Capacity:" + capacity);
	}

}
