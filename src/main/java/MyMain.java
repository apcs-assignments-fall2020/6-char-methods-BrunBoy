import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if (65<=ch && ch<=90){
            ch=(char) (ch+32);
        }
        else{
            ch=(char) (ch+0);
        }
        return(ch);
    }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
        char murk=0;
        String meerkat="";
        for (int i=0; i<str.length(); i++){
            murk=str.charAt(i);
            if (65<=murk && murk<=90){
                murk=(char) (murk+32);
            }
            else{
                murk=(char) (murk+0);
            }
            meerkat+=murk;
        }
        return meerkat;
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
        if (97<=ch && ch<=122){
            ch=(char) (ch-32);
        }
        else{
            ch=(char) (ch+0);
        }
        return(ch);
    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
        char murk=0;
        String meerkat="";
        for (int i=0; i<str.length(); i++){
            murk=str.charAt(i);
            if (97<=murk && murk<=122){
                murk=(char) (murk-32);
            }
            else{
                murk=(char) (murk+0);
            }
            meerkat+=murk;
        }
        return meerkat;
    }


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a String");
        String str=scan.nextLine();
        System.out.println("What would you like to make your string lowercase or uppercase?");
        String min=scan.nextLine();
        if(min.equals("lowercase")){
            System.out.println("Here is you string in lowercase: "+myToLowerCase(str));
        }
        else{
            System.out.println("Here is you string in uppercase: "+myToUpperCase(str));
        }

        
    }
}
