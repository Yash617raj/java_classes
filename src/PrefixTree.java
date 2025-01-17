import java.util.*;
public class PrefixTree {
    static class Node{
        char ch;
        ArrayList<Node> children;
        boolean ends;

        Node(char ch){
            this.ch = ch;
            children = new ArrayList<>();
        }
    }
    public static void main(String[] args){
        var start = new Node('0');
        String[] arr = {
                "abcd","abxy","abdf","ab","acd"
        };

        for(var el: arr){
            var curr = start;
            for(var ch: el.toCharArray()){
                Node next = null;
                for(var child: curr.children){
                    if(child.ch == ch) next = child;
                }
                if(next == null){
                    next = new Node(ch);
                    curr.children.add(next);
                }
                curr = next;
            }
            curr.ends = true;
        }
    }
}
