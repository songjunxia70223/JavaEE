package example_1;

import java.sql.*;

class HandleJdbc {
    private Connection c = null;
    private Statement s = null;

    public HandleJdbc() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?serverTimezone=Asia/Shanghai&characterEncoding=UTF-8",
                    "root",
                    "ilikeshe2");
            s = c.createStatement();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        if (s != null) {
            try {
                s.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (c != null) {
            try {
                c.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    void insert(String sql) {
        if (!sql.startsWith("insert")) {
            return;
        }
        try {
            s.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void select(String sql) {
        if (!sql.startsWith("select")) {
            return;
        }
        try {
            ResultSet res = s.executeQuery(sql);
            while (res.next()) {
                int id = res.getInt("id");
                String name = res.getString(2);
                float hp = res.getFloat("hp");
                int damage = res.getInt(4);
                System.out.printf("%d\t%s\t%.2f\t%d\n", id, name, hp, damage);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void delete(String sql) {
        if (!sql.startsWith("delete")) {
            return;
        }
        try {
            s.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void update(String sql) {
        if (!sql.startsWith("update")) {
            return;
        }
        try {
            s.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
