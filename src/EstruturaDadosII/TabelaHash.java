package EstruturaDadosII;

import java.util.LinkedList;

public class TabelaHash {

    private LinkedList<Entry>[] table;
    private int size;

    //criação da tabela com lista encadeada, e informa seu tamanho
    public void tamanhoTable(int size) {
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    //função de hash utilizando ometodo da divisão
    private int hashFunction(int key) {
        return key % size;
    }

    //adicionando metodo pela chave e valor
    public void insert(int key, String value) {
        int index = hashFunction(key);
        table[index].add(new Entry(key, value));
    }


    public String search(int key) {
        int index = hashFunction(key);
        for (Entry entry : table[index]) {
            if (entry.key == key) {
                return entry.value;
            }
        }
        return null;
    }

    public void remove(int key) {
        int index = hashFunction(key);
        LinkedList<Entry> list = table[index];
        for (Entry entry : list) {
            if (entry.key == key) {
                list.remove(entry);
                return;
            }
        }
        throw new IllegalArgumentException("Key not found");
    }

    //classe com metodo de entrada, para criar uma chave e seu valor.
    private static class Entry {
        int key;
        String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
