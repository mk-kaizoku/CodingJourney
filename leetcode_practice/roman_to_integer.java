public class roman_to_integer {
    class Solution {
        public int romanToInt(String s) {
            int result=0;
            
            for(int i=s.length()-1; i>=0; i--){
                int num=getnum(s.charAt(i));
                
                // decide to subtract or keep adding 
                //  IX =9 but if we keep adding as per loop it would become 10 + 1 =11 
                //  hence we use multiply factor *4 with current char integer to decide 
                //  if 4*ch> result we add but if less we subtract dry run for better understanding
                if(num*4<result)    result=result-num;
                else    result+=num;
            }
            return result;
        }
        public int getnum(char ch){
            int num=0;
            switch(ch){
                    case 'I':
                        num=1;
                        break;
                    case 'V':
                        num=5;
                        break;
                    case 'X':
                        num=10;
                        break;
                    case 'L':
                        num=50;
                        break;
                    case 'C':
                        num=100;
                        break;
                    case 'D':
                        num=500;
                        break;
                    case 'M':
                        num=1000;
                        break;
                }
                return num;
        }
    }
}
