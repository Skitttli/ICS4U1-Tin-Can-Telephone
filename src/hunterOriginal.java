import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class hunterOriginal {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    //X coordinate of Romy's window
    int xR = Integer.parseInt(st.nextToken());
    //Y coordinate of Romy's window
    int yR = Integer.parseInt(st.nextToken());
    //X coordinate of Jules window
    int xJ = Integer.parseInt(st.nextToken());
    //Y coordinate of Jules window
    int yJ = Integer.parseInt(st.nextToken());
    //Number of buildings
    int numBuildings = Integer.parseInt(br.readLine());
    //Loop through how many buildings there are
    for(int i=0;i<numBuildings;i++){
      //Redeclare stringTokenizer for a new Line
      st = new StringTokenizer(br.readLine());
      //Number of corners the current building has
      int numCorners = Integer.parseInt(st.nextToken());
      for(int j=0;j<numCorners;j++){

      }
    }

  }
  
}

//!First Though - Probably not gonna use it
//What if i get the farthest that the building goes in each direction and then compare that to points across the line

//!Second Idea - Gonna start by using this, 99% sure it's not gonna work but good for iteration table
//I'm gonna start by putting all the buildings into a giant array, and then see if there is any building between the xs of the kid's windows
//If there is then I can check if that x's corresponding y is also inbetween the y's of the kids windows
//If this is true, then remove that building from the array and do this until there is no more buildings between the kids windows
//Once this is done, print the number of buildings
//The only things this might not work for is the edge case of the line hitting the very edge of the building

//!Third Idea - Might Actually Work
//Hash Map of some kind
