public class PallindromeNumber{
  public static void main(String args[]){
      int number=121;
      boolean checkPalindrome=checkPallindrome(number);
      System.out.println("The given number is pallindrome "+checkPalindrome);
  }

  public static boolean checkPallindrome(int number){
    int tempt=number;
    int reverseNumber=0, rem=0;
    while(tempt>0){
        rem=tempt%10;
        reverseNumber=reverseNumber*10+rem;
        tempt=tempt/10;
    }
    return (number==reverseNumber)?true:false;
  }  
  public boolean check(){
    return false;
  }
}
