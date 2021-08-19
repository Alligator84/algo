package ru.oyudin.sprint2.opposite;

import ru.oyudin.sprint2.mother.Solution2;

public class Test {

    public static void main(String[] args) {
        Node<String> node3 = new Node<>("node3", null, null);
        Node<String> node2 = new Node<>("node2", node3, null);
        Node<String> node1 = new Node<>("node1", node2, null);
        Node<String> node0 = new Node<>("node0", node1, null);

        node1.prev = node0;
        node2.prev = node1;
        node3.prev = node2;

        Node<String> newNode = Solution.solution(node0);

        while (newNode.next != null) {
            System.out.print(newNode.value + " ");
            newNode = newNode.next;
        }
        System.out.print(newNode.value);

    }



}
