package session_17_equals_hashcode_genetics.practice.generics;

import session_17_equals_hashcode_genetics.practice.Employee;

public class Pair<K, V> {

    private K key;

    private V vale;

    public Pair(K key, V vale) {
        this.key = key;
        this.vale = vale;
    }

    public K getKey() {
        return key;
    }

    public V getVale() {
        return vale;
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Alice", 24);
        System.out.println(pair.getKey() + " " + pair.getVale());
    }
}
