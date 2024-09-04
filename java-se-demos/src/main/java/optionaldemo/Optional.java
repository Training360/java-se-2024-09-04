package optionaldemo;

public sealed interface Optional {

    record EmptyOptional() implements Optional {}

    record PresentOptional(String value) implements Optional {}
}
