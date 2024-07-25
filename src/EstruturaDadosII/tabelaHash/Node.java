package EstruturaDadosII.tabelaHash;

public class Node<k, v> {
    k key;
    v value;
    Node proximo;
    Node anterior;

    public Node(k key, v value) {
        this.key = key;
        this.value = value;
    }
}
