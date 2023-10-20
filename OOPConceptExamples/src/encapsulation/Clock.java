package encapsulation;

public class Clock {
     private int hr;
	 private int min;
	 private int sec;
	 
	public int getHr() {
		return hr;
	}
	public void setHr(int hr) {
		if(hr>=1&&hr<=12) {
		this.hr = hr;
		}
		else {
			System.out.println("enter correct hr...");
		}
	}
	
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		if(min>=1&&min<=60) {
		this.min = min;
		}
		else {
			System.out.println("enter the correct min.....");
		}
	}
	
	public int getSec() {
		return sec;
	}
	public void setSec(int sec) {
		if(sec>=1&&sec<=60) {
		this.sec = sec;
		}
		else {
			System.out.println("enter the correct sec......");
		}
	}
	public void display() {
		System.out.println("Time is: "+this.hr+":"+this.min+":"+this.sec);
	}
	 

}
