
class TrieNode {
    TrieNode[] children;
    boolean isEndOfWord;
    public TrieNode(){
        children = new TrieNode[26];
        isEndOfWord = false;
    }
}

class Trie {
    TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode cur = root;
        for(int i = 0; i< word.length();i++){
            char k = word.charAt(i);
            if(cur.children[k - 'a'] == null){
                TrieNode newNode = new TrieNode();
                cur.children[k-'a'] = newNode;
            }
            cur = cur.children[k-'a'];
        }
        cur.isEndOfWord = true;
    }
    
    public boolean search(String word) {
        TrieNode cur = root;
        for(int i = 0; i<word.length();i++){
            char k = word.charAt(i);
            if(cur.children[k-'a'] == null) return false;
            cur = cur.children[k-'a'];
        }
        return cur.isEndOfWord;
    }
    
    public boolean startsWith(String word) {
        TrieNode cur = root;
        for(int i = 0; i<word.length();i++){
            char k = word.charAt(i);
            if(cur.children[k-'a'] == null) return false;
            cur = cur.children[k-'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */