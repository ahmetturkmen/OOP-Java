import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class DircMovie {
	private String []  names = new String[17]; // According to number of strings in movie.txt file
	private String temp = "";
	int i =0;
	


	/* 	IMPORTANT 
	 * <------- FOR WINDOWS PCS-------------->
	  
	 * Paths.get must be used in the given format otherwise it could not read info from that movies.txt file
	 * Simply write-down the path of movies.txt file according to your PC. 
	 * Let say that your PC info like this and movies.txt file in your computer desktop 
	 * Your user-name in PC : dell 
	 * location of txt file : Desktop 
	 * then the path must be 
	 * "C:/Users/dell/Desktop/movies.txt"
	
	<--------------MAC OS PCS-------------------------->
	
        /Users/dell/Desktop/movies.txt   (for Mac systems )
  	

        **** if those path method not applied program can give error, hence please implement them properly.***
	*/
	
	
	{
		 /* Indeed, we are reading data from files we can do either
        try/catch block  or we can use "throws IOException" for main method to prevent unwanted errors
     */
		try
		
		{
			Scanner sc = new Scanner(Paths.get("C:/Users/DELL/Desktop/movies.txt"));
			while (sc.hasNextLine()) {
				temp = sc.nextLine();
				System.out.println("");
				names[i]=temp;
				i++;
			}

		}catch(
		IOException e)
		{
			e.printStackTrace();
		}
	}
	public String getName(int index ){
		String name = names[index];
		return name;
	}
	
}
