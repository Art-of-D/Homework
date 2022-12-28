import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<E> implements Listable<E> {
    static {
        System.out.println("I`m ready to create ArrayList! Give me something.");
    }

    private E[] valueArr = (E[])(new Object[2]);

    private void extendingLength(){
        this.valueArr = Arrays.copyOf(valueArr, (int) (valueArr.length * 1.66));
    }


    @Override
    public void add(Object value) {
        if (valueArr[valueArr.length-2] != null){
            extendingLength();
        }
        for (int p = 0; p < valueArr.length - 1;p++) {
            if (this.valueArr[p] == null) {
                this.valueArr[p] = (E) value;
                break;
            }
        }
    }

    @Override
    public void remove(int index) {
        if (index != valueArr.length-1){
            for (int l = 0; l < valueArr.length-1; l++){
                if (l == index){
                    valueArr[l] = null;
                }
            }
        } else {System.out.println("Sorry, out of range!");}
    }

    @Override
    public void clear(){
        for (int j = 0; j < valueArr.length-1; j++){
            valueArr[j] = null;
        }
    }

    @Override
    public int size(){
        return valueArr.length-1;
    }

    @Override
    public String get(int index){
        for (int k = 0; k < valueArr.length-1; k++){
            if (k == index){
                if (Objects.equals(valueArr[k], null)) {
                    return "null";
                } else {
                    return valueArr[k].toString();
                }
            }
        }
        return "Sorry, It`s out of array";
    }

}
