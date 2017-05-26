package HackerRank.DataStructures.Trie.Contacts;

import java.util.Scanner;

/**
 * Created by kaima on 5/23/17.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Node node = new Node();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if(op.equals("add"))
                node.add(contact);
            else if(op.equals("find"))
                System.out.println(node.count(contact, 0));
        }
    }

    public static class Node{
        Node[] children = new Node[26];
        int size = 0;

        private static int getCharInd(char c)
        {
            return c - 'a';
        }

        private Node getNode(char c)
        {
            return children[getCharInd(c)];
        }

        private void setNode(char c, Node n)
        {
            children[getCharInd(c)] = n;
        }

        public void add(String s)
        {
            add(s, 0);
        }

        private void add(String s, int i)
        {
            size++;
            if(i == s.length())
                return;
            char cur = s.charAt(i);
            int code = getCharInd(cur);

            Node child = getNode(cur);
            if(child == null)
            {
                child = new Node();
                setNode(cur, child);
            }
            child.add(s, i + 1);
        }

        public int count(String s, int i)
        {
            if(i == s.length())
                return size;
            Node child = getNode(s.charAt(i));
            if(child == null)
                return 0;
            return child.count(s, i + 1);
        }
    }
}
