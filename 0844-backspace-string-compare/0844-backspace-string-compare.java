class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                s1.push(s.charAt(i));
            }else{
                if(s1.isEmpty()) continue;
                s1.pop();
            }
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)!='#'){
                s2.push(t.charAt(i));
            }else{
                if(s2.isEmpty()) continue;
                s2.pop();
            }
        }
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        while (!s1.isEmpty()) {
            sb1.append(s1.pop());
        }
        while (!s2.isEmpty()) {
            sb2.append(s2.pop());
        }

        String str1 = sb1.toString();
        String str2 = sb2.toString();
        if(str1.equals(str2)){
            return true;
        }else{
            return false;
        }
        

    }
}