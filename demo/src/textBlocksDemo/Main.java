package textBlocksDemo;

public class Main {
    static void main() {
//        String table = "users1";
//        String isActive = "false";
//        String sql = String.format("""
//        SELECT *
//        FROM %s
//        WHERE active = %s
//        """, table, isActive);
//        System.out.println(sql);


        String table = "users";
        String sql = """
        SELECT *
        FROM %s
        WHERE active = true
        """.formatted(table);

        System.out.println(sql);


        String name = "Alice";
        int age = 30;
            String json = """
        {
            "name": "%s",
            "age": %d
        }
        """.formatted(name, age);

        System.out.println(json);


    }
}
