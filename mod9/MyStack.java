import java.util.Arrays;
import java.util.Objects;

public class MyStack<E>
    implements Listable<E>,ListExt<E> {

        static {
        System.out.println("I`m ready to create Stack! Give me something.");
    }

        private E[] valueArr = (E[]) (new Object[2]);

        private void extendingLength () {
        this.valueArr = Arrays.copyOf(valueArr, (int) (valueArr.length * 1.66));
    }


        @Override
        public void push (Object value){
        if (valueArr[valueArr.length - 2] != null) {
            extendingLength();
        }
        for (int p = 0; p < valueArr.length - 1; p++) {
            if (this.valueArr[p] == null) {
                this.valueArr[p] = (E) value;
                break;
            }
        }
    }

        @Override
        public void remove ( int index){
        if (index != valueArr.length - 1) {
            for (int l = 0; l < valueArr.length - 1; l++) {
                if (l == index) {
                    valueArr[l] = null;
                }
            }
        } else {
            System.out.println("Sorry, out of range!");
        }
    }

        @Override
        public void clear () {
       // Якщо потрібно тільки видалити зміст треба використовувати алгоритм нижче, а активний метод закоментувати
        /*for (int j = 0; j < valueArr.length - 1; j++) {
            valueArr[j] = null;
        }*/
            valueArr = (E[]) (new Object[2]);
    }

        @Override
        public int size () {
        return valueArr.length - 1;
    }

        @Override
        public String peek () {
        if (valueArr.length > 0) {
            for (int k = valueArr.length-1; k > 0; ) {
                if (Objects.equals(valueArr[k], null)) {
                    k--;
                } else {
                    return valueArr[k].toString();
                }
            }
        }
        return "It`s empty!";
    }

        @Override
        public String pop () {
        if (valueArr.length > 0) {
            for (int k = valueArr.length-1; k > 0; ) {
                if (Objects.equals(valueArr[k], null)) {
                    k--;
                } else {
                    String temp = valueArr[k].toString();
                    remove(k);
                    return temp;
                }
            }
        }
        return "It`s empty!";
    }
}

