package bowling;

public class Game {
	static int NB_MAX_TOURS = 21;
	private int[] tours = new int[NB_MAX_TOURS];
	private int numTour = 1;
	
	public void roll(int nbQuilles) {
		tours[numTour-1] = nbQuilles;
		numTour++;
	}
	
	public int score() {
		int score = 0;
		int i=0;
		while (i<numTour-1) {
			int tour1 = tours[i];
			int tour2 = tours[i+1];
			score+=tour1+tour2;
			if (tour1==10) { //strike
				score+=tours[i+2];
				i++;
			}
			else if (tour1+tour2==10){  //spare
				score+=tours[i+2];
				i+=2;
			}
			else {  //coup nul
				i+=2;
			}
		}
		return score;
	}
}
