package assignment5;



public class mainProblem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toMilitary("12:00:09PM");

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void toMilitary(String date) {
		String date2=" ";
		int hour;
		String minutes, seconds;
		boolean PM=false;
		String x;
		
		
		String [] splited= date.split(":");
		
		hour=Integer.parseInt(splited[0]);
		minutes=splited[1];
		x=splited[2];
		seconds=x.substring(0, 2);
		
		if(x.charAt(2)=='P')
			PM=true;
		
		
		if(PM && hour<12) {
			hour=hour+12;	
		}
		else if(!PM && hour==12) {
			hour=0;
		}
		
		
	System.out.printf("%02d:%s:%s ", hour, minutes, seconds);
		
		
		
	}
	
	
	
}



