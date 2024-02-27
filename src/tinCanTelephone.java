import java.io.*;
import java.util.*;

public class tinCanTelephone {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		//X & Y coordinates of Romy's window
		int xR = Integer.parseInt(st.nextToken()), yR = Integer.parseInt(st.nextToken());
		//X & Y coordinate of Jules window
		int xJ = Integer.parseInt(st.nextToken()), yJ = Integer.parseInt(st.nextToken());

		//Vertical and False booleans for edge cases
		boolean vertical=false, horizontal=false;
		
		//Intercept counter
		int counter=0;

		//Slope & Y Intercept variables for calculations
		int slope,yInt;

		//Vertical Checker
		if(xJ==xR){
			vertical=true;
			slope=0;
			yInt=0;
		//Horizontal Checker
		} else if(yJ==yR){
			horizontal=true;
			slope=0;
			yInt=0;
		//Normal Case
		}else{
			slope = (yJ-yR)/(xJ-xR);
			yInt = yJ-slope*xJ;
		}

		//Number of buildings
		int numBuildings = Integer.parseInt(br.readLine());

	 	//Loop through how many buildings there are
		for (int i = 0; i < numBuildings; i++) {
			//Hashmaps for storing highest and lowest y of each column
			HashMap<Integer,Integer> lowestY=new HashMap<>(),highestY=new HashMap<>();

			// Redeclare stringTokenizer for a new Line
			st = new StringTokenizer(br.readLine());

			// Number of corners the current building has
			int numCorners = Integer.parseInt(st.nextToken());

			//Max/Min X & Y variables for vertical and horizontal edge cases
			int maxX = -1001, minX = 1001,maxY = -1001, minY = 1001;

			//For loop for the number of corners
			for(int j=0;j<numCorners;j++){
				//Coordinates of the corner currently being checked
				int curX = Integer.parseInt(st.nextToken());
				int curY = Integer.parseInt(st.nextToken());

				//Set the max and min X
				if(curX>maxX)	maxX=curX;
				else if(curX<minX)minX=curX;

				//Set the max and min Y
				if(curY>maxY) maxY=curY;
        else if(curY<minY)minY=curY;

				//Check if the hashmap already has an X on the column of the current corner
				if(!lowestY.containsKey(curX)){
					//If it doesn't then add it
					lowestY.put(curX, curY);
				}else{
					//If if does then check if the current corner is lower
					if(lowestY.get(curX) > curY){
						//If it is then replace the old value with the new one
						lowestY.replace(curX, curY);
					}
				}

				//Same as X Checker but for Y
				if(!highestY.containsKey(curX)){
					highestY.put(curX, curY);
				}else{
					if(highestY.get(curX) < curY){
						highestY.replace(curX, curY);
					}
				}
      }

			//Check if the kids are directly inline with eachother vertically
			if(vertical){
				//If they are then check if there is a building between them
					if(xR<=maxX&&xR>=minX){
						counter++;
					}

			//If they aren't inline vertically, check if they are inline horizontally
			}else if(horizontal){
				//If they are then check if there is a building between them
				if(yR<=maxY&&yR>=minY){
					counter++;
				}

			//If both edge cases are false, run the normal loop
			}else{

				//Now loop through each y on the grid
				for(int j = -1000;j<1000;j++){
					//Get the y of the current x coordinate that is being checked using the equation of a line
					int curY = slope*j+yInt;

					//Check if there is a wall on the current column
					if(lowestY.containsKey(j)&&highestY.containsKey(j)){

						//Check if the wall is between the two kids, therefore intercepting their line
						if(curY<=highestY.get(j)&&curY>=lowestY.get(j)){
							counter++;
							//Break because a building can't intercept more then once
							break;
						}

					}

				}
				
			}
		}
		//Print the number of intercepts
		System.out.println(counter);
	}
}
