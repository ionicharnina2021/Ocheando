package teoriaInterfacesFuncionales00;

@FunctionalInterface
public interface Converter<T,F> {
	T convert(F f);
}
