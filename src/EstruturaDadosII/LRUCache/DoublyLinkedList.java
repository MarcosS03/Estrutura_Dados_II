package EstruturaDadosII.LRUCache;

public class DoublyLinkedList<k, v> {

    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        head.proximo = tail;
        tail.anterior = head;
    }

    public void addFirst(Node node) {
        node.proximo = head.proximo;
        node.anterior = head;
        head.proximo.anterior = node;
        head.proximo = node;
    }

    public void moveToFront(Node node) {
        remove(node);
        addFirst(node);
    }

    public Node removeLast() {
        if (tail.anterior == head) {
            return null;
        }
        Node node = tail.anterior;
        remove(node);
        return node;
    }

    public void remove(Node node) {
        node.anterior.proximo = node.proximo;
        node.proximo.anterior = node.anterior;
    }
}
