package missions.programming;

import java.util.Scanner;

public class Level1
	{

		public static void main( String args[] )
			{
			System.out.println( "HTS-Programming-Level1: This program will unscrable words using a wordlist." );
			body();
			System.out.println( "End of Program." );
			}

		public static void body()
			{
			@SuppressWarnings( "resource" )
			Scanner input = new Scanner( System.in ).useDelimiter( "Answer:" );

			System.out.println( "Please paste scrambled words.  Include all text from \'List of scrambled words\' to ...word9,word10)" );
			String words = input.next();
			input.close();
			System.out.println( words );
			System.out.println( "End of Body." );
			}

	} // end class Level1
