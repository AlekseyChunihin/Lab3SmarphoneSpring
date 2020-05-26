package dao;

import dao.SmartphoneDao;
import entity.Smartphone;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.Map;

@Component
public class DBSmartphoneDao implements SmartphoneDao {

    private Connection getConnection() {
        try {
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection("jdbc:sqlite:dbSmartphones.db");

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void save(Smartphone smartphone) {
        try {
            Connection con=getConnection();
            if(con==null) return;
            String sExecute = "Insert Into smartphone(name,model,versionOS,processor,price,diagonal,memory)Values(?,?,?,?,?,?,?)" ;
            PreparedStatement st =con.prepareStatement(sExecute);
            st.setString(1, smartphone.getName());
            st.setString(2, smartphone.getModel());
            st.setString(3, smartphone.getVersionOS());
            st.setString(4, smartphone.getProcessor());
            st.setDouble(5, smartphone.getPrice());
            st.setDouble(6, smartphone.getDiagonal());
            st.setInt(7, smartphone.getMemory());
            st.execute();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
