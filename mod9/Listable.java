
interface Listable<E> {

    // додає елемент в кінець
    default void add(Object value){
        System.out.println("I can`t do it for this class");
    };

    // видаляє елемент із вказаним індексом
    default void remove(int index){
        System.out.println("I can`t do it for this class");
    };

    // очищає колекцію
    default void clear(){
        System.out.println("I can`t do it for this class");
    };

    // повертає розмір колекції
    default int size(){
        return 0;
    };

    //повертає елемент за індексом або за ключем
    default String get(int index){
        return "I can`t do it for this class";
    }

}