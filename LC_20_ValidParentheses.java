class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stc = new Stack<>() ;

        for(int i = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i) ;

            if(ch == '(' || ch == '[' || ch == '{')
            {
               stc.push(ch) ;
            }
            else
            {
                if(stc.isEmpty()) return false ;

                if((stc.peek() == '(' && ch == ')') || (stc.peek() == '[' && ch == ']') || (stc.peek() == '{' &&  ch == '}'))
                {
                    stc.pop() ;
                }
                else
                {
                    return false ;
                }
            }
            
        }

        return stc.isEmpty() ;
    }
}
