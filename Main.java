import java.util.*;
class Main {
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.print(" Enter a filename: ");
    String name = input.next();
    CreateFile creater = new CreateFile ( name );
    input.nextLine();
    System.out.println( "What text would you like to add?");
    String text = input.nextLine();
    WriteToFile writer = new WriteToFile( name, text );
    System.out.println("Here is everything in that file:");
    ReadFile reader = new ReadFile( name );
  }
}