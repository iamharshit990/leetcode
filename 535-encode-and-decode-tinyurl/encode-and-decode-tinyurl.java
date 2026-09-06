public class Codec {
    HashMap<String,String> map = new HashMap<>();
    int id=0;
   
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        id++;
        String s = Integer.toString(id);
        map.put(s,longUrl);
        return s;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String s=map.get(shortUrl);
        return s;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));