package EstruturaDadosII.LRUCache;

public class Node {
    int key;
    String value;
    Node proximo;
    Node anterior;


    public Node() {
    }

    private Node(Integer key, String value, Node proximo, Node anterior) {
        this.key = key;
        this.value = value;
        this.proximo = proximo;
        this.anterior = anterior;
    }

    public static class NoBuild {
        private int key;
        private String value;
        private Node proximo;
        private Node anterior;


        public NoBuild Key(int key) {
            this.key = key;
            return this;
        }

        public NoBuild Value(String value) {
            this.value = value;
            return this;
        }

        public NoBuild Proximo(Node proximo) {
            this.proximo = proximo;
            return this;
        }

        public NoBuild Anterior(Node anterior) {
            this.anterior = anterior;
            return this;
        }
        public Node build() {
            return new Node(key, value, proximo, anterior);
        }
    }
}
