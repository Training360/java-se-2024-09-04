package document;

public sealed interface Part permits Header, Paragraph, Link, Image {
}
