/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrihfatahilah.latihanmvcjdbc.database;


import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import fahrihfatahilah.latihanmvcjdbc.impl.PelangganDaoImpl;
import fahrihfatahilah.latihanmvcjdbc.service.PelangganDao;
import java.sql.SQLException;
import java.sql.Connection;

/**
 *
 * NIM : 10116405
 * NAMA : Fahrih Fatahilah
 * KELAS : PBO-2 / IF-2
 */
public class KingBarbershopDatabase {
    private static Connection connection;
    private static PelangganDao pelangganDao;
    
    public static Connection getConnection() throws  SQLException{
     if (connection == null){
         MysqlDataSource dataSource = new MysqlDataSource();
         dataSource.setURL("jdbc:mysql://localhost:3306/babershop");
         dataSource.setUser("root");
         dataSource.setPassword("");
         connection = dataSource.getConnection();
         
         
        
    }
    return connection;
    
}
   public static PelangganDao getPelangganDao() throws SQLException {
        if (pelangganDao==null) {
            pelangganDao = new PelangganDaoImpl(getConnection());
        }
        return pelangganDao;
    }
}


