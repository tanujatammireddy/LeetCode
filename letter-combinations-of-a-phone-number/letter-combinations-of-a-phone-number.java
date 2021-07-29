class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> returnList = new ArrayList();
        if(digits=="") return returnList;
        Map<Integer, List<Character>> map = new HashMap<>();
        map.put(2, Arrays.asList('a', 'b', 'c'));
        map.put(3, Arrays.asList('d', 'e', 'f'));
        map.put(4, Arrays.asList('g', 'h', 'i'));
        map.put(5, Arrays.asList('j', 'k', 'l'));
        map.put(6, Arrays.asList('m', 'n', 'o'));
        map.put(7, Arrays.asList('p', 'q', 'r', 's'));
        map.put(8, Arrays.asList('t', 'u', 'v'));
        map.put(9, Arrays.asList('w', 'x', 'y', 'z'));
        
        for(Character ch: digits.toCharArray()){
           addCharacters(Character.getNumericValue(ch),returnList,map); 
        }
        System.gc();
        return returnList;
    }
    public void addCharacters(int digit,List<String> returnList, Map<Integer,List<Character>> map ){
        
        List<Character> temp = map.get(digit);
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
