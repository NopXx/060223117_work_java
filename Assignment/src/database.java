import java.sql.*;

public class database {
    private Connection c;

    public database() {
    }
    public Connection getConnection() {
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/accessory", "root", "");
        } catch (SQLException ex) {
//            Logger.getLogger(RoomForm.class.getName()).log(Level.SEVERE, null, ex);
            // JOptionPane.showMessageDialog(this, ex, "error", JOptionPane.ERROR_MESSAGE);
        }
        return c;
    }
}
