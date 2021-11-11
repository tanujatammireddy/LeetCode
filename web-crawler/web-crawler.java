/**
 * // This is the HtmlParser's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface HtmlParser {
 *     public List<String> getUrls(String url) {}
 * }
 */

class Solution {
    
    public String getDomain (String url) {
        
        String[] str = url.split ("/");
        return str[0]+"//"+str[2];
        
    }
    public List<String> crawl(String startUrl, HtmlParser htmlParser) {
        
       
        Set<String> set = new HashSet();
        set.add(startUrl);
        helper(getDomain(startUrl), startUrl,htmlParser,set);
        
        return new ArrayList<>(set);
        
    }
    public void helper(String domain, String url,HtmlParser htmlParser,Set<String> set){
        
        for(String currentURL: htmlParser.getUrls(url)){
            if(currentURL.startsWith(domain) && !set.contains(currentURL)){
                set.add(currentURL);
                helper(domain, currentURL,htmlParser,set);
            }
        }
    }
}