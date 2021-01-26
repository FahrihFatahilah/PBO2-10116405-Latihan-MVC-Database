package fahrihfatahilah.latihanmvcjdbc.main;

import fahrihfatahilah.latihanmvcjdbc.database.KingBarbershopDatabase;
import fahrihfatahilah.latihanmvcjdbc.entity.Pelanggan;
import fahrihfatahilah.latihanmvcjdbc.error.PelangganException;
import fahrihfatahilah.latihanmvcjdbc.service.PelangganDao;
import fahrihfatahilah.latihanmvcjdbc.view.MainViewPelanggan;
import static java.nio.file.Files.list;
import java.sql.SQLException;
import static java.util.Collections.list;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.Query;
import javax.swing.SwingUtilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * NIM : 10116405
 * NAMA : Fahrih Fatahilah
 * KELAS : PBO-2 / IF-2
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new  MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (PelangganException ex) {
                } catch (SQLException ex) {
                    Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
}
