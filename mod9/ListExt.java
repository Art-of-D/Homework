public interface ListExt<E> {

    default void push(Object value){
        System.out.println("I can`t do it for this class");
    };

    String peek(); //повертає перший елемент стеку

    default String pop(){
       return "I can`t do it for this class";
    }; //повертає перший елемент стеку та видаляє його з колекції

    default String poll(){
        return "I can`t do it for this class";
    }; //повертає перший елемент з черги і видаляє його з колекції

}
