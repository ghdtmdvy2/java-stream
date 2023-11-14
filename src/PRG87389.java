import java.util.stream.IntStream;
// https://school.programmers.co.kr/learn/courses/30/lessons/87389
class PRG87389 {
    public int solution(int n) {
        return IntStream.range(2,n).filter(v -> n % v == 1).findFirst().orElseThrow();
    }
}