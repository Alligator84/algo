package ru.oyudin.sprint2;

class Node<V> {
    public V value;
    public Node<V> next;

    public Node(V value, Node<V> next) {
        this.value = value;
        this.next = next;
    }
}

public class Solution2 {

    private static Node<String> getNodyByIndex(Node<String> head, int idx) {
        Node<String> result;
        result = head;
        for (int i = 0; i < idx; i++) {
            result = head.next;
        }
        return result;
    }

    public static Node<String> solution(Node<String> head, int idx) {
        if (idx == 0) {
            return head.next;
        }

        Node<String> previous_node = getNodyByIndex(head, idx - 1);
        previous_node.next = getNodyByIndex(head, idx).next;

        return head;
    }

    private static void test() {
        Node<String> node3 = new Node<>("node3", null);
        Node<String> node2 = new Node<>("node2", node3);
        Node<String> node1 = new Node<>("node1", node2);
        Node<String> node0 = new Node<>("node0", node1);
        Node<String> newHead = solution(node0, 1);
        // result is : node0 -> node2 -> node3
    }
}
