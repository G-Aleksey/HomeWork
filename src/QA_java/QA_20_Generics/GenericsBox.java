package QA_java.QA_20_Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsBox<T1, T2 > {

    private List<T1> items = new ArrayList<>();
    private T2 boxSize;

    public List<T1> getItems() {
        return items;
    }

    public T2 getBoxSize() {
        return boxSize;
    }

    public void setItems(T1 item) {
        this.items.add(item);
    }

    public void setBoxSize(T2 boxSize) {
        this.boxSize = boxSize;
    }
}
