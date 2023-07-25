public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11221));
        System.out.println("----------");
        System.out.println(isPerfectNumber(6));  // true
        System.out.println(isPerfectNumber(28)); // true
        System.out.println(isPerfectNumber(5));  // false
        System.out.println(isPerfectNumber(-1)); // false
        System.out.println("-----------");
        System.out.println(numberToWords(123));   // "One Two Three"
        System.out.println(numberToWords(1010));  // "One Zero One Zero"
        System.out.println(numberToWords(-12));   // "Invalid Value"
    }

    public static boolean isPalindrome(int num) {
        int numAbs = Math.abs(num) ;
        int originalNum = numAbs;
        int reverse = 0;

      while (numAbs > 0) {
          int remainder = numAbs%10;
          reverse= reverse*10+remainder ;
          numAbs = numAbs/10 ;
      }
     return  originalNum  == reverse ;
    }

    public static boolean isPerfectNumber(int num) {
        if(num <= 0 ) {
            return  false;
        }

        int sum = 0 ;
        for(int i = 1 ; i < num ; i++) {
            if(num%i == 0 ) {
                sum = sum + i ;
            }
        }
        return num == sum ;

    }

    public static String numberToWords(int num) {
         if(num < 0 ) {
             return "İnvalid Value";
         }
         String str = String.valueOf(num) ;
         String result = "" ;
         for(String s : str.split("")) {
             switch (s) {
                 case "1":
                     result +=" one";break;
                 case "2":
                     result +=" two";break;
                 case "3":
                     result +=" three" ;break;
                 case "4":
                     result +=" four";break;
                 case "5":
                     result +=" five";break;
                 case "6":
                     result +=" six" ;break;
                 case "7":
                     result +=" seven";break;
                 case "8":
                     result +=" eight";break;
                 case "9":
                     result +=" nine" ;break;
                 case "0" :
                     result += " zero" ;
                     break;
             }
         }
         return  result.trim() ;
    }
}