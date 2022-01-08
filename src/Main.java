
import java.util.Scanner;
import java.util.Stack;


public class Main {
    
    public static void main(String[] args) {
        // Bir Cümlenin Palindrome olup olmadığını bulma
        
        // kasaylabalyasak
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cümleyi Giriniz: ");
        String cumle = scanner.nextLine();
        //cumledeki karakterlerin yarisini stacke atıp kalan karakterlerle karsılastırma yaparak girilen cumlenin palindrome olup olmadığına bakilir

        
        Stack<Character> stack = new Stack<Character>();
        
        for (int i = 0 ; i < cumle.length() / 2 ;i++) {
            //cumledeki karakterlerin yarisini stacke pushluyorum
            stack.push(cumle.charAt(i));
            
        }
        if (isPalindrome(cumle, stack)) {
            System.out.println("Bu cümle Palindromedur...");
        }
        else {
            System.out.println("Bu cümle Palindrom değildir...");
        }
        
    }
    public static boolean isPalindrome(String cumle,Stack<Character> stack) {
        for (int i = (cumle.length() / 2 ) + 1 ; i < cumle.length() ; i++) {
            
            if (cumle.charAt(i) != stack.pop()){
                //stackteki top eleman ile kalan karakterleri karsilastiriyorum
                
                return false;
            }
            
        }
        return true;
        
        
    }
    
}
