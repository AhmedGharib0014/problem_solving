public class codec {
    HashMap<String,String> map =null;
    Codec(){
        map = new  HashMap<String,String> ();
    }
        
    
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int hashedKey = longUrl.hashCode();
        map.put(Integer.toString(hashedKey),longUrl);
        return  "http://tinyurl.com/"+hashedKey;
    }
    
    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String kashKey=shortUrl.substring(19,shortUrl.length());
        return  map.get(kashKey);
    }
    
}
