package demo;

public class pidutils {
	private static float temp;
	
//	public pidutils(){
//		pidutils.temp=44;
//	}
	
	public static int getTemp(int increment){
		pidutils.temp=65.3565f+increment;
		return Math.round(pidutils.temp);	
	}
	
	public static int getET(int currtemp, int settemp) {
		return (settemp-currtemp);
	}
	
	public static int getPT(int cp, int et) {
		return (cp*et);
	}
	public static int getIT(int itprev, int ci, int et) {
		return (itprev+ci*et);
	}
	
}