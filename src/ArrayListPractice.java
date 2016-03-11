import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<String> favoriteThings = new ArrayList<String>();
		String favorite = "";
		System.out.println("Input favorite movies or books, type \'stop\' to stop entry.");
		while(!favorite.equalsIgnoreCase("stop"))
		{	
			favorite = sc.nextLine();
			if(!favorite.equalsIgnoreCase("stop"))
			{
				favoriteThings.add(favorite);
			}
		}
		System.out.println("\nSorted\n");
		Collections.sort(favoriteThings);
		for(String thing: favoriteThings)
		{
			System.out.println(thing);
		}
	}
}
