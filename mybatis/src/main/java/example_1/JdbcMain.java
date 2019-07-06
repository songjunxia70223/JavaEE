package example_1;

public class JdbcMain {
    public static void main(String[] args) {
        HandleJdbc handleJdbc = new HandleJdbc();
        String sql = "select * from hero";
        handleJdbc.select(sql);
        handleJdbc.close();
    }
}
