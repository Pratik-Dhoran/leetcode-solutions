class Solution {
    public boolean isPalindrome(String s) {
        
        String str = new String() ;

        for(int i = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i) ;

            if((ch >= 'a' && ch <= 'z') || (ch >='A' && ch <= 'Z') || ch >= '0' && ch <= '9')
            {
                str = str + ch ;
            }
        }

        str = str.toLowerCase() ;

        return palindrome(str) ;
    }

    public boolean palindrome(String s)
    {
        int i = 0 ;
        int j = s.length() - 1 ;

        while(i < j)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                return false ;
            }
            i++ ;
            j-- ;
        }

        return true ;
    }
}
