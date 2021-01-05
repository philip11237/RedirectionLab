import java.util.Scanner;
public class MakeStars{
  public static void main (String args[]){
    Scanner scan=new Scanner(System.in);
    while (scan.hasNextLine()){
      String line=scan.nextLine();
      for (int i=0; i<line.length();i++){
        if (line.charAt(i)!=' '){
          System.out.print('*' );
        }
        else{
          System.out.print(' ');
        }
      }System.out.println();
    }
  }
}
