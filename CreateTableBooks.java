

public class CreateTableBooks {

    public String tableName = "Books";

    public String name;

    public String author;

    public CreateTableBooks(String tableName, String name, String author) {
        this.tableName = tableName;
        this.name = name;
        this.author = author;
    }

    public CreateTableBooks() {
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String print() {
        return "CREATE TABLE " + getTableName() + "(" + getName() + " " + "STRING," + getAuthor() + " " + "STRING" + ");";
    }

}
