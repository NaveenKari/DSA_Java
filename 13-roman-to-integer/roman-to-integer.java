class Solution {
    public int romanToInt(String s) {
        int res = 0,track = 0;
        Map<Character,Integer> table = new HashMap<>();
        table.put('I',1);
        table.put('V',5);
        table.put('X',10);
        table.put('L',50);
        table.put('C',100);
        table.put('D',500);
        table.put('M',1000);

        if(s.length()==1) return table.get(s.charAt(0));

        for(int i = 0; i<s.length()-1;i++){
            char t = s.charAt(i);

            if(t == 'I'){
                if(s.charAt(i+1)=='V'){
                    i = i+1;
                    res+= 4;
                }else if(s.charAt(i+1)=='X'){
                    i = i+1;
                    res+= 9;
                }else{
                res+=table.get(t);
            }
            }else if(t == 'X'){
                if(s.charAt(i+1)=='L'){
                    i = i+1;
                    res+= 40;
                }else if(s.charAt(i+1)=='C'){
                    i = i+1;
                    res+= 90;
                }else{
                res+=table.get(t);
            }
            }else if(t == 'C'){
                if(s.charAt(i+1)=='D'){
                    i = i+1;
                    res+= 400;
                }else if(s.charAt(i+1)=='M'){
                    i = i+1;
                    res+= 900;
                }else{
                res+=table.get(t);
            }
            }else{
                res+=table.get(t);
            }
            track = i;
            
        }
        if(track == s.length()-1) return res;
        res+=table.get(s.charAt(s.length()-1));
        return res;
    }
}