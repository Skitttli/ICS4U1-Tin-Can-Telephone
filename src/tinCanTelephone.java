import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class tinCanTelephone {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int xR = Integer.parseInt(st.nextToken());
		int yR = Integer.parseInt(st.nextToken());
		int xJ = Integer.parseInt(st.nextToken());
		int yJ = Integer.parseInt(st.nextToken());
		int numBuildings = Integer.parseInt(br.readLine());
		for (int i = 0; i < numBuildings; i++) {
			// Redeclare stringTokenizer for a new Line
			st = new StringTokenizer(br.readLine());
			// Number of corners the current building has
			int numCorners = Integer.parseInt(st.nextToken());
		}
	}
}
