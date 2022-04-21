package constrct;

import java.util.Random;

public class TrumpList {

	private TrumpCard[] trumpCards = new TrumpCard[52];
	
	public TrumpList() {
		int trumpIdx = 0;
		
		for (int i = 0; i < 13; i++) {
			TrumpCard tr = new TrumpCard();
			tr.setShape("spade");
			tr.setNum(i+1);
			trumpCards[trumpIdx] = tr;
		}
	}
}
