package ru.oyudin.sprint2;

public class Test {

    public static void main(String[] args) {
        Node<String> node3 = new Node<>("node3", null);
        Node<String> node2 = new Node<>("node2", node3);
        Node<String> node1 = new Node<>("node1", node2);
        Node<String> node0 = new Node<>("node0", node1);
        Node<String> newHead = Solution2.solution(node0, 3);

        while (newHead.next != null) {
            System.out.print(newHead.value + " ");
            newHead = newHead.next;
        }
        System.out.print(newHead.value);

    }



}
