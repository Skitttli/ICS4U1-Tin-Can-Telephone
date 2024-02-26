import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class tinCanTelephone {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		//2000 because it can be from -1000 to 1000
		int[] lowestY=new int[2000],highestY= new int[2000];

		for(int i=0;i<2000;i++){
			lowestY[i] = -1001;
			highestY[i] = 1001;
		}

		//X coordinate of Romy's window, 0 in test case
		int xR = Integer.parseInt(st.nextToken());
	  //Y coordinate of Romy's window, 0 in test case
		int yR = Integer.parseInt(st.nextToken());
		//X coordinate of Jules window, 3 in test case
		int xJ = Integer.parseInt(st.nextToken());
		//Y coordinate of Jules window, 3 in test case
		int yJ = Integer.parseInt(st.nextToken());

		int slope = (yJ-yR)/(xJ-xR);

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
				int curX = Integer.parseInt(st.nextToken());
				int curY = Integer.parseInt(st.nextToken());

				if(lowestY[curX+1000] < curY){
					lowestY[curX+1000] = curY;
				}

				if(lowestY[curX+1000] > curY){
					highestY[curX+1000] = curY;
				}	
      }

			//Now we loop through each 

		}
	}
}
