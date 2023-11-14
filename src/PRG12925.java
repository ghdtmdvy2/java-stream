import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// https://school.programmers.co.kr/learn/courses/30/lessons/12925
class PRG12925 {
    public boolean solution(String n) {

        long pCount = Arrays.stream(n.split("")).filter(v -> v.equals("p") || v.equals("P"))
                .count();
        long yCount = Arrays.stream(n.split("")).filter(v -> v.equals("y") || v.equals("Y"))
                .count();
        return pCount == yCount;
    }
}