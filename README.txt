In order for this program to work properly:
You need to have Java installed, the program was written in Java 13 but should run with any version of java from v8+ installed and the proper PATH variables set.

Make sure you place the iG_URL_Swap folder on the Desktop or else it won't launch properly.

You will need to modify the files inside the iG_URL_Swap folder called "userCredentials.txt" and "webURLs.txt"

In "userCredentials.txt" the first line must be your username and the second line must be your password.

In "webURLs.txt" the correct syntax is one entry per line, as many lines as youd like, with each line having the syntax 
						time;url-to-change-to-at-that-time
						   00:00;https://exampleSite1.com
		There are no spaces in each line before or after the semi-colon and be sure to ENTER YOUR TIME VALUES IN A 24 HOUR FORMAT
	The program rebuilds the list each time it runs (every 1 minute) so you are capable of editing the "webURLs.txt" file while the program is running.
			The times do not have to be in any specific order, the program will catch it no matter where it is on the list

After your two .txt files are set up,
Double click the contained .jar file to launch the program. It will open up an automated browser and log you in to instagram.



*front end coming soon*
