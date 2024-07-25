package EstruturaDadosII.LRUCache;

import EstruturaDadosII.tabelaHash.TabelaHash;

public class LRUCache {

    private int capacidadeCache;
    private TabelaHash tabelaHash;
    private DoublyLinkedList<Integer, String> dll;



    public String get(Integer key ) {
        if (tabelaHash.search(key).) {
            String node = tabelaHash.search(key);
            dll.moveToFront(node);
            return node.value;
        }
        return null;
    }

    public void put(K key, V value) {
        if (map.containsKey(key)) {
            Node<K, V> node = map.get(key);
            node.value = value;
            dll.moveToFront(node);
        } else {
            if (map.size() >= capacity) {
                Node<K, V> lru = dll.removeLast();
                map.remove(lru.key);
            }
            Node<K, V> newNode = new Node<>(key, value);
            dll.addFirst(newNode);
            map.put(key, newNode);
        }
    }


//    public static void main(String[] args) {
//        LRUCache<Integer, String> cache = new LRUCache<>(3);
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
