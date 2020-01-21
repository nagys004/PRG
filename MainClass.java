

public class MainClass {

    public static void main(String[] args) {

        System.out.println("This is application for make CREATE SQL statement");

        CreateTableBooks ctb = new CreateTableBooks();
        ctb.setTableName("Books");
        ctb.setName("NAME");
        ctb.setAuthor("AUTHOR");


        System.out.println(ctb.print());

    }

}
