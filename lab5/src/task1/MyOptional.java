package task1;
import java.util.Optional;

public class MyOptional<T> {
    private final Optional<T> optional;

    private MyOptional (T value){
        optional = Optional.ofNullable(value);
    }
    public static <T> MyOptional<T> of(T value) {
        return new MyOptional<> (value);
    }

    public boolean isPresent() {
        return optional.isPresent();
    }

    public T get() {
        return optional.get();
    }
}
