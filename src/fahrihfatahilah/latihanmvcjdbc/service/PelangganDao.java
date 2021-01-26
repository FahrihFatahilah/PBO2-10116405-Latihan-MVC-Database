/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrihfatahilah.latihanmvcjdbc.service;

import fahrihfatahilah.latihanmvcjdbc.entity.Pelanggan;
import fahrihfatahilah.latihanmvcjdbc.error.PelangganException;
import java.util.List;

/**
 *
 * NIM : 10116405
 * NAMA : Fahrih Fatahilah
 * KELAS : PBO-2 / IF-2
 */
public interface PelangganDao {
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;
     public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;
     public void deletePelanggan(Integer id) throws PelangganException;
    public Pelanggan getPelanggan(Integer id) throws PelangganException;
    public Pelanggan getelanggan(String email) throws PelangganException;    
    
    public List<Pelanggan> selectAllPelanggan() throws PelangganException;
    
}
