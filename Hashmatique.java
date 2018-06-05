import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
	public static void main(String[] args) {
		HashMap<String, String> tracklistMap = new HashMap<String, String>();
		tracklistMap.put("Lift Yourself", "Lift yourself upon your feet, let's get it on");
		tracklistMap.put("Father Stretch My Hands Pt. 1", "Beautiful mornin', you're the sun in my mornin', babe");
		tracklistMap.put("Blessings", "I live the life I deserve, blessed");
		tracklistMap.put("No Church in the Wild", "What's a god to a non-believer who don't believe in anything?");

		Set<String> keys = tracklistMap.keySet();
		for(String key : keys) {
			System.out.println(key + " - " + tracklistMap.get(key));
			// System.out.println(tracklistMap.get(key));
		}
	}
}