class Solution {
    public int minMutation(String start, String end, String[] bank) {
        
        Set<String> geneBank = new HashSet();
        for(int i=0;i< bank.length;i++){
            geneBank.add(bank[i]);
        }
        if(!geneBank.contains(end)) return -1;
        
        int count = 0;
        Queue<String> queue = new LinkedList();
        queue.add(start);
        while(!queue.isEmpty()){
            
            int size = queue.size();
            count++;
            for(int i=0; i< size;i++){
                
                //System.out.println(queue);
                String current = queue.poll();
                if(current.equals(end))
                    return count-1;
                List<String> mutations = generateMutation(current);
        
                for(String mutation :mutations){
                    if(geneBank.contains(mutation)){
                        geneBank.remove(mutation);
                        queue.add(mutation);
                    }
                }
                
            }
        }
        
       return -1;   
    }
    
    public List<String>  generateMutation(String geneString){
        
        List<String> mutations = new ArrayList();
        List<Character> genes = new ArrayList();
        genes.add('A');
        genes.add('C');
        genes.add('G');
        genes.add('T');
        
        char[] charArray = geneString.toCharArray(); 
        for(int i=0 ;i<geneString.length();i++){
            char temp =  charArray[i];
            for(char ch: genes){
                charArray[i]= ch;
                String newGeneString = String.valueOf(charArray);
                
                mutations.add(newGeneString);
            }
            charArray[i]= temp;
        }
        
        return mutations;
    }
}