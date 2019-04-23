package in.mgp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class TestForEach {

    public static void main(String[] args) {
       // consider an integer list
        List<Integer> intList = new ArrayList<>();
        for(int i =0; i < 10; i++) intList.add(i);

        // just using iterator old fashion before java8
        Iterator<Integer> intIter = intList.iterator();
        while(intIter.hasNext()) {
            System.out.println("From iterator "+intIter.next());
        }

        // traversing using foreah method present in the Iterable interface
        intList.forEach(integer -> System.out.println("foreach anonymous "+ integer));
        NanConsumer inAction = new NanConsumer();
        intList.forEach(inAction);
    }
}

class NanConsumer implements Consumer<Integer> {

    @Override
    public void accept(Integer integer) {
        System.out.println("Consumer impl Value::"+integer);
    }
}
