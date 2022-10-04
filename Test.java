package ders0;

public class Test {
	
	static String[] dizim1 = {"0" , "1" , "2", "3" , "4" , "5" , "6" , "7" , "8" , "9"};
	
	public static void main(String[] args) throws InterruptedException{
		
		int secL=5, secR=5, minL=5 , minR=9 , hrsL=2, hrsR=3;

		for(int i=0;i<8;i++) {   // Sonsuz döngüde de sorunsuz çalışmaktadır.
			
			secR++;
			
			if(secR == 10) { 
				secR -=10; 
				secL++; 
			}
			
			if(secL == 6) {                    
				secL -= 6;
				minR++;
			}
			
			if(minR == 10) {
				minR -= 10;
				minL++;
			}
			
			if(minL == 6) {
				minL -= 6;
				hrsR++;
			}
			
			if(hrsR == 10) {
				hrsR -= 10;
				hrsL++;
			}
			
			if(hrsR == 4 && hrsL == 2) {
				hrsR -= 4;
				hrsL -= 2;
			}
			
			System.out.println("Time : " + dizim1[hrsL] + dizim1[hrsR] + " : " + dizim1[minL] + dizim1[minR] + " : " + dizim1[secL] + dizim1[secR]);
			
			Thread.sleep(1000);

		}
	
		
	}

}
