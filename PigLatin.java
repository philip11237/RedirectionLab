import java.util.Scanner;
public class PigLatin{
  public static String pigLatinSimple(String s){
    if (s.charAt(0)='a'||s.charAt(0)='e'||s.charAt(0)='i'||s.charAt(0)='o'||s.charAt(0)='u'){
      return s+"hay";
    }

    else{
      return s.substring(1)+s.charAt(0)+"ay";
    }
  }
  public static String pigLatin(String s){
    String list[]= {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};

    for (int i=0;i<list.length;i++){
    if(s.substring(0,2).equals(list[i])){
      return s.substring(2)+list[i]+"ay";
    }
  }
    if (s.charAt(0)='a'||s.charAt(0)='e'||s.charAt(0)='i'||s.charAt(0)='o'||s.charAt(0)='u'){
      return s+"hay";
    }

    else{
      return s.substring(1)+s.charAt(0)+"ay";
    }




  }
}
