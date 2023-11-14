import java.util.stream.IntStream;

class PRG12928 {
    public int solution(int n) {
        return IntStream.rangeClosed(1,n).filter(v -> n % v == 0).sum();
    }
}
