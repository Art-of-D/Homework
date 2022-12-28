public interface ListHs<K, V> {
    V put(Object key, Object value); //додає пару ключ + значення
    V remove(Object key); //видаляє пару за ключем
    V get(Object key); //повертає значення (Object value) за ключем
    void clear(); // очищає колекцію
    // повертає розмір колекції
    default int size(){
        return 0;
    };
}
