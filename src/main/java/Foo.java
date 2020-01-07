import org.checkerframework.checker.nullness.qual.*;

public class Foo {
    interface Consumer<@NonNull T> {
        void accept(T t);
    }

    static abstract class A {
        abstract void f(@Nullable String x);

        void bad() {
            Consumer<String> c = this::f;
            //            c.accept(null);
        }
    }
}
