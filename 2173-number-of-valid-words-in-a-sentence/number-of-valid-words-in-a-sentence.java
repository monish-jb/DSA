class Solution {
    public boolean isvalid(String word){
        if (word.isEmpty()) return false;
        
        int hyphenCount = 0;
        int len = word.length();
        
        for (int i = 0; i < len; i++) {
            char c = word.charAt(i);
            
            if (c >= '0' && c <= '9') return false;
            
            if (c == '-') {
                hyphenCount++;
                if (hyphenCount > 1 || i == 0 || i == len - 1) return false;
                if (word.charAt(i - 1) < 'a' || word.charAt(i - 1) > 'z') return false;
                if (word.charAt(i + 1) < 'a' || word.charAt(i + 1) > 'z') return false;
            } else if (c == '!' || c == '.' || c == ',') {
                if (i != len - 1) return false;
            } else if (c != '-' && (c < 'a' || c > 'z')) {
                return false;
            }
        }
        return true;
    }
    
    public int countValidWords(String sentence) {
        String[] a = sentence.trim().split("\\s+");
        int count = 0;
        for(int i = 0; i < a.length; i++){
            if(isvalid(a[i])) count++;
        }
        return count;
    }
}
