package maze;

public class ViewMaze {

	private int[][] mazeArr;

	public ViewMaze(int[][] mazeArr){
		this.mazeArr = mazeArr;
	}

	
	public void viewMazePath(){
		
		for(int i=0; i<mazeArr.length; i++)
		{
			for(int j=0; j<mazeArr[0].length; j++)
			{
				switch(mazeArr[i][j]){
				case 0:
					System.out.println("◻︎"); //길
					break;
				case 1:
					System.out.println("◼︎"); //벽
					break;
				case 2:
					System.out.println("-"); //통
				}
				
			}
			System.out.println();
			
		}
		System.out.println();
	}
}
