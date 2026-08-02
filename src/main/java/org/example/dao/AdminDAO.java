
import java.sql.ResultSet;

public Admin loginAdmin(String username, String password) {

    String sql = "SELECT * FROM admins WHERE username=? AND password=?";

    try (Connection conn = DBConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, username);
        stmt.setString(2, password);

        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {

            Admin admin = new Admin();

            admin.setAdminId(rs.getInt("admin_id"));
            admin.setUsername(rs.getString("username"));
            admin.setPassword(rs.getString("password"));

            return admin;

        }

    } catch (SQLException e) {

        System.out.println(e.getMessage());

    }

    return null;
}
public Admin loginAdmin(String username, String password) {

    String sql = "SELECT * FROM admins WHERE username=? AND password=?";

    try (Connection conn = DBConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, username);
        stmt.setString(2, password);

        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {

            Admin admin = new Admin();

            admin.setAdminId(rs.getInt("admin_id"));
            admin.setUsername(rs.getString("username"));
            admin.setPassword(rs.getString("password"));

            return admin;

        }

    } catch (SQLException e) {

        System.out.println(e.getMessage());

    }

    return null;
}
public Admin loginAdmin(String username, String password) {

    String sql = "SELECT * FROM admins WHERE username=? AND password=?";

    try (Connection conn = DBConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, username);
        stmt.setString(2, password);

        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {

            Admin admin = new Admin();

            admin.setAdminId(rs.getInt("admin_id"));
            admin.setUsername(rs.getString("username"));
            admin.setPassword(rs.getString("password"));

            return admin;

        }

    } catch (SQLException e) {

        System.out.println(e.getMessage());

    }

    return null;
}