import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TestNullability {

    public static Integer testCommonCase(String name) {
        return name.length();
    }

    public static Integer testNotNull(@NotNull String name) {
        return name.length();
    }
    public static Integer testNullable(@Nullable String name) {
        return name.length();
    }

    public static void main(String[] args) {
        Integer i0 = testCommonCase(null);

        Integer i1 = testNotNull("Ivan");
        Integer i2 = testNotNull(null);

        Integer i3 = testNullable("Ivan");
        Integer i4 = testNullable(null);
    }
}
