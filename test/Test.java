
import dal.DAO;
import java.util.List;
import model.MiniProfile;
import model.Profile;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Test {
    public static void main(String[] args) {
        DAO dao = new DAO();
        List<Profile> list = dao.getDetail("0003");
        Profile p = dao.getUser("0003");
        for(Profile o: list){
            System.out.println(o);
        }
        System.out.println(p);
        dao.insert("2020", "Ava", "Smith", "2002-12-28", 0, "543 Maplewood Ave", "ava.smith@example.com", "9876543210", "William Smith", "1234567890", "2021-12-15", "English Literature", "ENG201", 30);
        dao.delete("1234");
    }
}
