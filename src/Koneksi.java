
import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Koneksi {

    private static Connection Go() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 if(validasiInput() == true){
        try {
              Connection con = Koneksi.Go();
        Statement s = con.createStatement();
        String sql = "SELECT * FROM login WHERE(username='"+f_username.getText()+"') AND password='"+f_password.getText()+"'";
        
            ResultSet rs;
            rs = s.executeQuery(sql);
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Login Sukses");
            }else{
                 JOptionPane.showMessageDialog(null, "Paswword Salah");
                 f_password.requestFocus();
            }
        } catch (Exception e) {
}
}   

    private static class f_password {

        private static void requestFocus() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public f_password() {
        }
    }

    private static class ResultSet {

        public ResultSet() {
        }

        private boolean next() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    private static class f_username {

        private static String getText() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public f_username() {
        }
    }
}
