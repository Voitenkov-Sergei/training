package com.voitenkovsergei.level2.lesson18.task1;

/**
 * Создать класс Pair, параметризованный двумя параметрами K и V.
 * Класс должен хранить две переменные типов K и V соответственно.
 * У класса должен быть конструктор, принимающий 2 параметра типов K и V, а также набор соответствующих
 * геттеров/сеттеров, toString (для отображения состояния текущего объекта типа Pair)
 * <p>
 * Создать статический обобщённый метод swap в утилитном классе PairUtil
 * (утилитный класс – это класс только со статическими методами,
 * который имеет private конструктор и помечен ключевым словом final,
 * чтобы предотвратить создание объектов этого класса, а также наследоваться от него).
 * Метод должен принимать объект класса Pair и возвращать новый объект Pair,
 * в которой элементы поменяны местами.
 *
 * @param <K>
 * @param <V>
 */

public class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}