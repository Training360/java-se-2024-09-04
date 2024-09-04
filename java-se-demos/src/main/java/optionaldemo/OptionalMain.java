package optionaldemo;

public class OptionalMain {

    public static void main(String[] args) {
        var result = switch (getOptional()) {
            case Optional.EmptyOptional _ -> "empty";
            case Optional.PresentOptional(var value)  -> value;
        };
        System.out.println(result);
    }

    public static Optional getOptional() {
        return new Optional.PresentOptional("foo");
    }
}
