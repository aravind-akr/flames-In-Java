import java.util.Scanner;

public class Flames {

  public static void main(String[] args){
      Scanner s=new Scanner(System.in);
      System.out.println("Enter first Name");
      String name1=s.nextLine();
      System.out.println("Enter second Name");
      String name2=s.nextLine();
      String s1=name1;
      String s2=name2;

      for(int i=0;i<name1.length();i++){
          for(int j=0;j<name2.length();j++){
              if(name1.charAt(i) == name2.charAt(j)) {
                   name1 = name1.replaceFirst(String.valueOf(name1.charAt(i)),"#");
                   name2 = name2.replaceFirst(String.valueOf(name2.charAt(i)),"#");
              }
          }
      }


    String result=name1+name2;
      result=result.replaceAll("#","");
      int len=result.length();
      String flames= "flames";
      char flameResult=0;
      String temp;

      if(len>0) {
          while (flames.length() != 1) {
              System.out.println("Present condition = "+flames);
              int tmplen= len % flames.length();
              if(tmplen !=0){
                  temp=flames.substring(tmplen)+flames.substring(0,tmplen-1);
              }
              else{
                  temp=flames.substring(0,flames.length()-1);
              }
              flames=temp;
          }
          flameResult=flames.charAt(0);

      }
      System.out.print("The relation between " + s1 + " and "+ s2 + " is " );
      switch (flameResult){
          case 'f':
              System.out.print("Friends");
              break;
          case 'l':
              System.out.print("Love");
              break;
          case 'a':
              System.out.print("Affection");
              break;
          case 'm':
              System.out.print("Marriage");
              break;
          case 'e':
              System.out.print("Enemies");
              break;
          case 's':
              System.out.print("Sibling");
              break;

      }
  }



}
