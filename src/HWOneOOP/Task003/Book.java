package HWOneOOP.Task003;

public class Book {

    private Author author;
    private Title title;
    private Content content;

    public Book(Author author, Title title, Content content) {
        this.author = author;
        this.title = title;
        this.content = content;
    }

    public void showInfo() {
        System.out.printf("Данные по книге:\n%s\n%s\n%s", author.getSomeAuthor(), title.getSomeTitle(), content.getSomeContent());
    }

    public static void main(String[] args) {

        Author author = new Author();
        Title title = new Title();
        Content content = new Content();

        author.setSomeAuthor("1) Автор - Эрих Мария Ремарк.");
        title.setSomeTitle("2) Название - \"Три товарища\".");
        content.setSomeContent("3) Кратко - Роман про послевоенную жизнь в Германии.");

        Book book = new Book(author, title, content);
        book.showInfo();
    }
}
