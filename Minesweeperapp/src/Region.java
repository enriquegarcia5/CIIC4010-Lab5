import java.awt.Color;
import java.awt.Component;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
public class Region {

	public void flag(Color arrayColor[][],int coorX,int coorY){
		if(arrayColor[coorX][coorY].equals(Color.GRAY)){
			arrayColor[coorX][coorY]=Color.RED; }
		else{
			if(arrayColor[coorX][coorY].equals(Color.RED)){
				arrayColor[coorX][coorY]=Color.GRAY; }
		}
	}
	public void bombGenerator(int region[][]){
		Random generator = new Random();
		int i=0, Bomb=0; 
		Bomb = region[generator.nextInt(9)+1][generator.nextInt(9)+1];
		for(i=1;i<=10;i++){
			do{
				region[generator.nextInt(9)+1][generator.nextInt(9)+1]=1;
			}while(Bomb==1); 
		}
	}
		public void bombViewer(int region[][]){
			for(int i=0;i<11;i++){
				for(int j=0;j<11;j++){
					System.out.print(region[j][i]);
			}
				System.out.println();
		}
	}
		
	public void closeNeighbors(int region[][]){
		for(int coorX=1;coorX<=9;coorX++){
			for(int coorY=1;coorY<=9;coorY++){
				if(region[coorX][coorY] ==1){
					if(region[coorX-1][coorY-1] == 1){ //top left
						region[coorX-1][coorY-1] =1; 
					}else region[coorX-1][coorY-1]=5; //change number
					
					if(region[coorX-1][coorY+1] ==1){ //top right 
						region[coorX-1][coorY+1]=1; 
					}else region[coorX-1][coorY+1]=5; 
					
					if(region[coorX][coorY-1]==1){//middle bottom 
						region[coorX][coorY-1]=1;
					}else region[coorX][coorY-1]=5;
					}
				if(region[coorX][coorY+1]==1){ //middle top 
					region[coorX][coorY+1]=1; 
				}else region[coorX][coorY+1]=5; 
				
				if(region[coorX+1][coorY-1] == 1){  //bottom left
					region[coorX+1][coorY-1]=1;
				}else region[coorX+1][coorY-1]=5; 
				
				if(region[coorX+1][coorY+1] ==1){ //bottom right 
					region[coorX+1][coorY+1]=1;
				}else region[coorX+1][coorY+1]=5; 
				
				if(region[coorX-1][coorY] == 1){ //middle left
					region[coorX-1][coorY]=1;
				}else region[coorX-1][coorY]=5; 
				
				if(region[coorX+1][coorY] ==1){ //middle right          
					region[coorX+1][coorY]=1;
				}else region[coorX+1][coorY]=5; 
				
				}
			}
		}
}