public class Trie{
    // define trie node structure
    static class Node{
        Node[] links  = new Node[26];
        boolean flag = false;

        // function to check if node contains specific char
        boolean containsKey(char ch){
            return links[ch-'a']!=null;
        }

        // function to insert new node with char into trie
        void put(char ch, Node node){
            links[ch-'a']=node;
        }

        //  to get (returns) node w/specific char from tire;
        Node get(char ch){
            return links[ch-'a'];
        }

        //  Sets current node flag to true to mark its end
        void setEnd(){
            flag = true;
        }

        // to check if the current node is the end or not 
        boolean isEnd(){
            return flag;
        }
    }
    private Node root;

    // constructor to initialize trie with empty root 
    public Trie(){
        root= new Node();
    }
    
    //   function to insert char into trie
    public void insert(String word){
        Node node =root;
        for(int i=0; i<word.length(); i++){
            // if char not present
            // create new node and insert char to it
            if(!node.containsKey(word.charAt(i))){
                node.put(word.charAt(i), new Node());
            }
            // Move to next node
            node = node.get(word.charAt(i));
        }
        node.setEnd();
    }

    //  function to check if word present in the trie
    public boolean search(String word){
        Node node =root;
        for(int i=0; i<word.length(); i++){
            if(!node.containsKey(word.charAt(i))){
                return false;
            }
            // Move to next node
            node = node.get(word.charAt(i));
        }
        // checks for flag in the last node 
        // word if found only if its the end
        return node.isEnd();
    }

    //  function to check if word starts with specific prefix
    public boolean startsWith(String prefix){
        Node node = root;
        for(int i=0; i<prefix.length(); i++){
            if(!node.containsKey(prefix.charAt(i))){
                return false;
            }
            node = node.get(prefix.charAt(i));
        }
        return true;
    }

    public static void main(String[] args){
        Trie trie = new Trie();
        trie.insert("merun");
        trie.insert("mern");
        //  SO onn...


        // To search if a word exists in trie
        System.out.println(trie.search("merf")? "True": "False");
        //  To check if a word in trie starts with given prefix
        System.out.println(trie.startsWith("mer")? "True": "False");

    }
    
}

