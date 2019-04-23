package in.mgp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestTheStream {
    public static void main(String[] args) {
        // we have two types of stream
        // stream and parallel stream
        // stream is basically a sequential where as parallel stream is actually parallel

        List<Integer> hugeList = new ArrayList<>();
        for(int i = 0 ; i < 1000; i++) hugeList.add(i);

        Stream<Integer> seqStream = hugeList.stream();

        Stream<Integer> parallelStream  = hugeList.parallelStream();

        // filter those greater than 990
        Stream<Integer> opStream = parallelStream.filter(p-> p > 980);
        opStream.forEach(num -> System.out.println("Huge num "+ num));

        // lets see what happens when the seqStream is considered

        Stream<Integer> seqOp = seqStream.filter(sp -> sp> 980);
        seqOp.forEach(nu -> System.out.println("Seq huge num " + nu));
    }
}
