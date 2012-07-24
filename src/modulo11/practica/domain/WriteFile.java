package modulo11.practica.domain;

import java.io.*;

public class WriteFile {
public static void main (String[] args) {
// Create file
File file = new File(args[0]);
try {
// Create a buffered reader to read each line from standard in.
 InputStreamReader isr  = new InputStreamReader(System.in);
 BufferedReader in  = new BufferedReader(isr);
 // Create a print writer on this file.
 PrintWriter out  = new PrintWriter(new FileWriter(file));
 String s;
 System.out.print("Enter file text. ");
 System.out.println("[Type Type ctrl-z to stop.]");

 // Read each input line and echo it to the screen.
 while ((s = in.readLine()) != null) {
 out.println(s);
 }

 // Close the buffered reader and the file print writer.
 in.close();
 out.close();

 } catch (IOException e) {
 // Catch any IO exceptions.
 e.printStackTrace();
 }
}
}