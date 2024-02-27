import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
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

		boolean vertical=false;
		
		int counter=0,slope,yInt;
		if(xJ==xR){
			vertical=true;
			slope=0;
			yInt=0;
		}else{
			slope = (yJ-yR)/(xJ-xR);
			yInt = yJ-slope*xJ;
		}

		//Number of buildings, 1 in test case
		int numBuildings = Integer.parseInt(br.readLine());

	 	//Loop through how many buildings there are
		for (int i = 0; i < numBuildings; i++) {
			HashMap<Integer,Integer> lowestY=new HashMap<>(),highestY=new HashMap<>();

			// Redeclare stringTokenizer for a new Line
			st = new StringTokenizer(br.readLine());
			// Number of corners the current building has
			int numCorners = Integer.parseInt(st.nextToken());
			int maxX = -1001, minX = 1001;

			//For loop for the number of corners
			for(int j=0;j<numCorners;j++){
				int curX = Integer.parseInt(st.nextToken());
				int curY = Integer.parseInt(st.nextToken());

				if(curX>maxX)	maxX=curX;
				else if(curX<minX)minX=curX;

				if(!lowestY.containsKey(curX)){
					lowestY.put(curX, curY);
				}else{
					if(lowestY.get(curX) > curY){
						lowestY.replace(curX, curY);
					}
				}

				if(!highestY.containsKey(curX)){
					highestY.put(curX, curY);
				}else{
					if(highestY.get(curX) < curY){
						highestY.replace(curX, curY);
					}
				}
      }

			//Now we loop through each y between the two points
			if(vertical){
					if(xR>=maxX&&xR<=minX){
						counter++;
					}
			}
			for(int j = -1000;j<1000;j++){
				int curY = slope*j+yInt;

				if(lowestY.containsKey(j)&&highestY.containsKey(j)){
					if(curY<=highestY.get(j)&&curY>=lowestY.get(j)){
						counter++;
						break;
					}
				}
			}
		}
		System.out.println(counter);
	}
}
