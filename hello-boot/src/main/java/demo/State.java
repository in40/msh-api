package demo;

import org.springframework.stereotype.Component;

@Component

public class State{
	private int sv;
	private int temp;
	private int et;
	private int et1;
	private int it1;
	private int ut;
	private String brasenhaim;
	
	public void setstate(pidProperties props) {
		this.sv=props.getsv();
		this.temp=pidutils.getTemp(0);
		this.et=sv-temp;
		
		
		
		this.ut=(props.getcp()*et)+(it1+props.getci()*et)+(props.getcd()*et-props.getcd()*et1); 
		this.brasenhaim=calcbrasenhaim(props.getpmax(), ((this.ut/props.gethw())*100*props.getpmax()/100));
	}
	
	public int getet() {
		this.temp=pidutils.getTemp(1);
		et=this.sv-this.temp;
		return et;
	}
	public String getbrasenhaim() {
		return brasenhaim;
	}
	public String calcbrasenhaim(int pmax, int p) {
		brasenhaim="";
		int errp=pmax-p;
	//	final int x;
		for(int x=0;x<pmax;x++) {	
		if(errp<(pmax/2)) {errp=errp+pmax;brasenhaim+="1";}
		else
		{errp=errp-p;brasenhaim+="0";}
		}
		return brasenhaim;
	}
}
