package EstruturaDadosII.LRUCache;

import EstruturaDadosII.tabelaHash.TabelaHash;



public class LRUCache {

    private int capacidadeCache = 3;
    private TabelaHash tabelaHash= new TabelaHash();

    private DoublyLinkedList<Integer, String> dll;

    //função de hash utilizando ometodo da divisão
    private int hashFunction(int key) {
        return key % capacidadeCache;
    }

    public String get(Integer key) {
        if (tabelaHash.search(key) != null) {
            String node = tabelaHash.search(key);
            Node n = Node.class.cast(node);
            dll.moveToFront(n);
            return node;
        }
        return null;
    }

    public void put(int key, String value) {
        int index = hashFunction(key);
        if (tabelaHash.search(index) != null){
            String node = tabelaHash.search(key);

            Node n = Node.class.cast(node);
            n.value = value;
            dll.moveToFront(n);
        } else{
            if (tabelaHash.getSize() >= capacidadeCache) {
                Node lru = dll.removeLast();

            }
            Node newNode = new Node.NoBuild().Key(key).Value(value).build();
            dll.addFirst(newNode);

        }
    }

    public void setCapacidadeCache(int capacidadeCache) {
        this.capacidadeCache = capacidadeCache;
    }

//    public static void main(String[] args) {
//        LRUCache cache = new LRUCache();
//        cache.capacidadeCache = 3;
//
//        cache.put(1, "one");
//        cache.put(2, "two");
//        cache.put(3, "three");
//
//        System.out.println(cache.get(1)); // Output: one
//        cache.put(4, "four");
//
//        System.out.println(cache.get(2)); // Output: null (2 foi removido)
//        System.out.println(cache.get(3)); // Output: three
//        System.out.println(cache.get(4)); // Output: four
//    }


}
