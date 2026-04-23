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
		for (int i=0; i<numTour; i++)
			score+=tours[i];
		return score;
	}
}
