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
		for (int i=0; i<numTour-1; i+=2) {
			int tour1 = tours[i];
			int tour2 = tours[i+1];
			score+=tour1+tour2;
			if (tour1==10) { //strike
				score+=tour2+tours[i+2];
			}
			if (tour1+tour2==10) { //spare
				score+=tours[i+2];
			}
			
		}
		return score;
	}
}
