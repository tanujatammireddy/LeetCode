class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> returnList = new ArrayList();
        if(digits=="") return returnList;
        Map<Integer,Set<Character>> map =new HashMap();
        Set<Character> set1 = new HashSet();
        set1.add('a'); set1.add('b');  set1.add('c');
        map.put(2,set1); 
        
        Set<Character> set2 = new HashSet();
        set2.add('d'); set2.add('e'); set2.add('f');
        map.put(3,set2);
        
        Set<Character> set3 = new HashSet();
        set3.add('g'); set3.add('h'); set3.add('i');
        map.put(4,set3);
        
        Set<Character> set4 = new HashSet();
        set4.add('j'); set4.add('k'); set4.add('l');
        map.put(5,set4);
        
        Set<Character> set5 = new HashSet();
        set5.add('m'); set5.add('n'); set5.add('o');
        map.put(6,set5);
        
        Set<Character> set6 = new HashSet();
        set6.add('p'); set6.add('q'); set6.add('r'); set6.add('s');
        map.put(7,set6);
        
        Set<Character> set7 = new HashSet();
        set7.add('t'); set7.add('u'); set7.add('v');
        map.put(8,set7);
        
        Set<Character> set8 = new HashSet();
        set8.add('w'); set8.add('x'); set8.add('y'); set8.add('z');
        map.put(9,set8);
        
        for(Character ch: digits.toCharArray()){
           addCharacters(Character.getNumericValue(ch),returnList,map); 
        }
        
        return returnList;
    }
    public void addCharacters(int digit,List<String> returnList, Map<Integer,Set<Character>> map ){
        
        Set<Character> temp = map.get(digit);
        //Parsing first Digit
        if(returnList.isEmpty()){
            for(Character ch:temp) returnList.add(Character.toString(ch));
        }
        else //Parsing other digits
        {
        List<String> tempList = new ArrayList();
        tempList.addAll(returnList);
        returnList.clear();
        for(String str:tempList){
            for(Character ch:temp){
                returnList.add(str+Character.toString(ch));
        }
        }
         
        }
        
        
    }
}