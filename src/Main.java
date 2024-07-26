

import EstruturaDadosII.LRUCache.LRUCache;
import EstruturaDadosII.tabelaHash.TabelaHash;


public class Main {
    public static void main(String[] args) {
        TabelaHash hashTable = new TabelaHash();
        hashTable.tamanhoTable(6);
        hashTable.insert(5, "apple");
        hashTable.insert(15, "banana");
        hashTable.insert(25, "cherry");

        System.out.println(hashTable.search(25)); // Output: banana

        hashTable.remove(15);
        System.out.println(hashTable.search(15)); // Output: null


        LRUCache cache = new LRUCache();
        cache.setCapacidadeCache(3);
    }
}