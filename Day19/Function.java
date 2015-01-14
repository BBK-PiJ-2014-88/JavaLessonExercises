import java.util.List;
public interface Function<T, R>{
	public List<R> apply(T element1, R element2);
}