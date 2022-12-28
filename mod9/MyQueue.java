import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Objects;

public class MyQueue<E>
        implements Listable<E>, ListExt<E> {
    static {
        System.out.println("I`m ready to create Queue! Give me something.");
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
        for (int p = 0; p < valueArr.length - 1; p++) {
            if (this.valueArr[p] == null) {
                this.valueArr[p] = (E) value;
                break;
            }
        }
    }

    @Override
    public void clear(){
        /*for (int j = 0; j < valueArr.length - 1; j++) {
            valueArr[j] = null;
        }*/
        valueArr = (E[]) (new Object[2]);
    }

    @Override
    public int size(){
        return valueArr.length-1;
    }



    @Override
    public String peek() {
        if (valueArr.length > 0) {
            for (int k = 0; k < valueArr.length-1; ) {
                if (Objects.equals(valueArr[k], null)) {
                    k++;
                } else {
                    return valueArr[k].toString();
                }
            }
        }
        return "It`s empty!";
    }

    @Override
    public String poll() {
        if (valueArr.length > 0) {
            for (int k = 0; k < valueArr.length-1; ) {
                if (Objects.equals(valueArr[k], null)) {
                    k++;
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
