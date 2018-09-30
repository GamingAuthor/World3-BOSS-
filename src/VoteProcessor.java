import java.util.ArrayList;

public class VoteProcessor {

	public Object calculateElectionWinner(ArrayList<String> votes) {
		int pf = 0;
		int es = 0;
		for (int i = 0; i < votes.size(); i++) {
			if (votes.get(i).equals("Pope Francis") || votes.get(i).equals("Pope francis")
					|| votes.get(i).equals("pope francis") || votes.get(i).equals("pope Francis")) {
				pf++;
			} else {
				es++;
			}
		}
		if (pf > es) {
			return "pope francis";
		} else if (pf < es) {
			return "edward snowden";
		} else {
			return "TIE";
		}

	}

}
