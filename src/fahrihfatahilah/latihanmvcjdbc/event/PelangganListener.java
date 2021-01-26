/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrihfatahilah.latihanmvcjdbc.event;

import fahrihfatahilah.latihanmvcjdbc.entity.Pelanggan;
import fahrihfatahilah.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * NIM : 10116405
 * NAMA : Fahrih Fatahilah
 * KELAS : PBO-2 / IF-2
 */
public interface PelangganListener {
     public void onChange(PelangganModel model);

    public void onInsert(Pelanggan pelanggan);

    public void onDelete();

    public void onUpdate(Pelanggan pelanggan);
 
}
