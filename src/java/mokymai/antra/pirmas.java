package java.mokymai.antra;

public class pirmas {
    private static final String PALINDROME_1 = "Kol einu sunie lok";
    private static final String PALINDROME_2 = "argi ten ne tigra";
    private static final String PALINDROME_3 = "sedek uzu kedes";
    public static void main(String[] args) {

        String[] palindromeMas = {PALINDROME_1, PALINDROME_2, PALINDROME_3};

        for(String p : palindromeMas){
            if (isWordIsPalindrom(p.replaceAll(" ", ""))){
                System.out.print("Palindromas");
            }else{
                System.out.print("Nepalindromas");
            }
        }

        boolean isPalindrome = isWordIsPalindrom("kol einu sunie lok".replaceAll(" ",""));
        if(isPalindrome){
            System.out.print("Tai yra polindromas");
        }else {
            System.out.print("Tai nera polindromas");
        }
    }
    private static boolean isWordIsPalindrom(String word) {
        boolean isPalindrom = true;
        for (int i =0; i < word.length(); i++){
            char a = word.charAt(i);
            char b = word.charAt(word.length()-1 -i);
            if(a!=b){
                isPalindrom = false;
                break;
            }
        }
        return isPalindrom;
    }
}
