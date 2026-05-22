package string;
//STRING FORMULA'S  
public class string {
  public static void main(String[] args) {

    String s = "RiyaKOSTa";
    System.out.println(s);
    String name= s.toLowerCase();
    System.out.println(name);
    String you= s.toUpperCase();
    System.out.println(you);
    System.out.println(s.trim());
    System.out.println(s.substring(1));
     System.out.println(s.substring(3,9));
     System.out.println(s.replace('R','p'));
     System.out.println(name.startsWith("Ri"));
     System.out.println(name.endsWith("ta"));
     System.out.println(name.charAt(2));
     System.out.println(name.indexOf('a'));// first occurance of the index "jo pahli baar repeat hoga vo print krega"
    System.out.print("my name is riya\tkosta");// create tab by \t known as {escape squence letters}
   if (name.contains("a") || name.contains("i") || 
    name.contains("o") || name.contains("u")) {
    System.out.println("Contains vowel");
    String s = "Java";
System.out.println(s.concat("World"));

}

  }
}