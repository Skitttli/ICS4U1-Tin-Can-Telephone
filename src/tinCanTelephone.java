import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class tinCanTelephone {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		//X coordinate of Romy's window, 0 in test case
		int xR = Integer.parseInt(st.nextToken());
	  //Y coordinate of Romy's window, 0 in test case
		int yR = Integer.parseInt(st.nextToken());
		//X coordinate of Jules window, 3 in test case
		int xJ = Integer.parseInt(st.nextToken());
		//Y coordinate of Jules window, 3 in test case
		int yJ = Integer.parseInt(st.nextToken());
		//Number of buildings, 1 in test case
		int numBuildings = Integer.parseInt(br.readLine());
	 	//Loop through how many buildings there are
		for (int i = 0; i < numBuildings; i++) {
			// Redeclare stringTokenizer for a new Line
			st = new StringTokenizer(br.readLine());
			// Number of corners the current building has
			int numCorners = Integer.parseInt(st.nextToken());
			//For loop for the number of corners
			for(int j=0;j<numCorners;j++){
				
      }
		}
	}
}
