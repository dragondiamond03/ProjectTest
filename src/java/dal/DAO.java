/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Account;
import model.MiniProfile;
import model.Profile;

/**
 *
 * @author ASUS
 */
public class DAO {

    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection cnn = null;

    public Account checkLogin(String user, String pass) {
        try {
            String query = "select * from account where username = ? "
                    + "and password = ?";
            cnn = (new DBContext()).connection;
            ps = cnn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                Account a = new Account(rs.getString(1), rs.getString(2));
                return a;
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<Profile> getAll() {
        List<Profile> list = new ArrayList<>();
        String strSelect = "select * from StudentProfile";
        try {
            cnn = (new DBContext()).connection;
            ps = cnn.prepareStatement(strSelect);
            rs = ps.executeQuery();
            while (rs.next()) {
                Profile u = new Profile(rs.getString(1), rs.getString(2),
                        rs.getString(3), rs.getString(4), rs.getInt(5),
                        rs.getString(6), rs.getString(7), rs.getString(8),
                        rs.getString(9), rs.getString(10), rs.getString(11),
                        rs.getString(12), rs.getString(13), rs.getInt(14));
                list.add(u);
            }
            cnn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public List<MiniProfile> getPart(String search) {
        List<MiniProfile> list = new ArrayList<>();
        String strSelect = "select * from MiniProfile where [fullname] like ?";
        try {
            cnn = (new DBContext()).connection;
            ps = cnn.prepareStatement(strSelect);
            ps.setString(1, "%" + search + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                MiniProfile u = new MiniProfile(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getInt(4), rs.getString(5));
                list.add(u);
            }
            cnn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public ArrayList<Profile> getDetail(String search) {
        ArrayList<Profile> list = new ArrayList<>();
        String sql = "Select * from StudentProfile \n"
                + "where StudentID = ?";
        try {
            cnn = (new DBContext()).connection;
            ps = cnn.prepareStatement(sql);
            ps.setString(1, search);
            rs = ps.executeQuery();
            while (rs.next()) {
                Profile u = new Profile(rs.getString(1), rs.getString(2),
                        rs.getString(3), rs.getString(4), rs.getInt(5),
                        rs.getString(6), rs.getString(7), rs.getString(8),
                        rs.getString(9), rs.getString(10), rs.getString(11),
                        rs.getString(12), rs.getString(13), rs.getInt(14));
                list.add(u);
            }
            cnn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public Profile getUser(String id) {
        Profile u = new Profile();
        try {
            String strSelect = "Select * from StudentProfile where StudentID = ?";
            cnn = (new DBContext()).connection;
            ps = cnn.prepareStatement(strSelect);
            ps.setString(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                u = new Profile(rs.getString(1), rs.getString(2),
                        rs.getString(3), rs.getString(4), rs.getInt(5),
                        rs.getString(6), rs.getString(7), rs.getString(8),
                        rs.getString(9), rs.getString(10), rs.getString(11),
                        rs.getString(12), rs.getString(13), rs.getInt(14));
            }
            cnn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return u;
    }

    public void insert(String studentid, String firstname, String lastname, String dateofbirth, Integer gender, String address, String email, String phone, String guardianname, String guardianphone, String admissiondate, String field_of_study, String classsection, Integer photoid) {
        String sql = "Insert into StudentProfile (StudentID, FirstName, LastName, DateOfBirth, Gender, Address, Email, Phone, GuardianName, GuardianPhone, AdmissionDate, Field_of_Study, ClassSection, PhotoID)\n"
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            cnn = (new DBContext()).connection;
            ps = cnn.prepareStatement(sql);
            ps.setString(1, studentid);
            ps.setString(2, firstname);
            ps.setString(3, lastname);
            ps.setString(4, dateofbirth);
            ps.setInt(5, gender);
            ps.setString(6, address);
            ps.setString(7, email);
            ps.setString(8, phone);
            ps.setString(9, guardianname);
            ps.setString(10, guardianphone);
            ps.setString(11, admissiondate);
            ps.setString(12, field_of_study);
            ps.setString(13, classsection);
            ps.setInt(14, photoid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void insert2(String studentid, String fullname, Integer gender, String admissiondate) {
        String sql = "INSERT INTO Miniprofile (id, FullName, gender, AdmissionDate)\n"
                + "VALUES(?,?,?,?)";
        try {
            cnn = (new DBContext()).connection;
            ps = cnn.prepareStatement(sql);
            ps.setString(1, studentid);
            ps.setString(2, fullname);
            ps.setInt(3, gender);
            ps.setString(4, admissiondate);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public Profile updateUser(String studentid, String firstname, String lastname, String dateofbirth, Integer gender, String address, String email, String phone, String guardianname, String guardianphone, String admissiondate, String field_of_study, String classsection, Integer photoid) {
        Profile u = new Profile();
        String sql = "UPDATE StudentProfile\n"
                + "   SET [StudentID] = ?\n"
                + "      ,[FirstName] = ?\n"
                + "      ,[LastName] = ?\n"
                + "      ,[DateofBirth] = ?\n"
                + "      ,[Gender] = ?\n"
                + "      ,[Address] = ?\n"
                + "      ,[Email] = ?\n"
                + "      ,[Phone] = ?\n"
                + "      ,[GuardianName] = ?\n"
                + "      ,[GuardianPhone] = ?\n"
                + "      ,[AdmissionDate] = ?\n"
                + "      ,[Field_of_study] = ?\n"
                + "      ,[ClassSection] = ?\n"
                + "      ,[PhotoID] = ?\n"
                + " WHERE StudentID = ?";
        //String sql = "INSERT INTO Users(account, password) values ('abc','xxxx')";  
        try {
            cnn = (new DBContext()).connection;
            PreparedStatement st = cnn.prepareStatement(sql);
            st.setString(1, studentid);
            st.setString(2, firstname);
            st.setString(3, lastname);
            st.setString(4, dateofbirth);
            st.setInt(5, gender);
            st.setString(6, address);
            st.setString(7, email);
            st.setString(8, phone);
            st.setString(9, guardianname);
            st.setString(10, guardianphone);
            st.setString(11, admissiondate);
            st.setString(12, field_of_study);
            st.setString(13, classsection);
            st.setInt(14, photoid);
            st.setString(15, studentid);
            st.executeUpdate();
            cnn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return u;
    }

    public Profile updateUser2(String studentid, String fullname, Integer gender, String admissiondate) {
        Profile u = new Profile();
        String sql = "UPDATE MiniProfile\n"
                + "   SET [id] = ?\n"
                + "      ,[FullName] = ?\n"
                + "      ,[Gender] = ?\n"
                + "      ,[AdmissionDate] = ?\n"
                + " WHERE id = ?";
        //String sql = "INSERT INTO Users(account, password) values ('abc','xxxx')";  
        try {
            cnn = (new DBContext()).connection;
            PreparedStatement st = cnn.prepareStatement(sql);
            st.setString(1, studentid);
            st.setString(2, fullname);
            st.setInt(3, gender);
            st.setString(4, admissiondate);
            st.setString(5, studentid);
            st.executeUpdate();
            cnn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return u;
    }

    public void delete(String id) {
        String sql = "DELETE FROM StudentProfile\n"
                + "WHERE StudentID=?";
        try {
            cnn = (new DBContext()).connection;
            PreparedStatement st = cnn.prepareStatement(sql);
            st.setString(1, id);
            st.executeUpdate();
            cnn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void delete2(String id) {
        String sql = "DELETE FROM MiniProfile\n"
                + "      WHERE id=?";
        try {
            cnn = (new DBContext()).connection;
            PreparedStatement st = cnn.prepareStatement(sql);
            st.setString(1, id);
            st.executeUpdate();
            cnn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
