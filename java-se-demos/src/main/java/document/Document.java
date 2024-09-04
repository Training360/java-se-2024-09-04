package document;

import java.util.List;

public class Document {

    public static void main(String[] args) {
        List<Part> document = List.of(new Header("h1"), new Paragraph("lorem"), new Paragraph("ipsum"));

        for (var item: document) {
            switch (item) {
                case Header(var title) -> System.out.println(title.toUpperCase());
                case Paragraph(var text) -> System.out.println(text);
                case Link _, Image _ -> {}
            }
        }
    }
}
