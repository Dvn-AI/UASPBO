/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbouas;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author DAGH
 */
@Entity
@Table(name = "mahasiswa")
@NamedQueries({
    @NamedQuery(name = "Mahasiswa_1.findAll", query = "SELECT m FROM Mahasiswa_1 m"),
    @NamedQuery(name = "Mahasiswa_1.findByNim", query = "SELECT m FROM Mahasiswa_1 m WHERE m.nim = :nim"),
    @NamedQuery(name = "Mahasiswa_1.findByNama", query = "SELECT m FROM Mahasiswa_1 m WHERE m.nama = :nama"),
    @NamedQuery(name = "Mahasiswa_1.findByAlamat", query = "SELECT m FROM Mahasiswa_1 m WHERE m.alamat = :alamat"),
    @NamedQuery(name = "Mahasiswa_1.findByAsalSma", query = "SELECT m FROM Mahasiswa_1 m WHERE m.asalSma = :asalSma"),
    @NamedQuery(name = "Mahasiswa_1.findByNamaOrangtua", query = "SELECT m FROM Mahasiswa_1 m WHERE m.namaOrangtua = :namaOrangtua")})
public class Mahasiswa_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nim")
    private String nim;
    @Column(name = "nama")
    private String nama;
    @Column(name = "alamat")
    private String alamat;
    @Column(name = "asal_sma")
    private String asalSma;
    @Column(name = "nama_orangtua")
    private String namaOrangtua;

    public Mahasiswa_1() {
    }

    public Mahasiswa_1(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAsalSma() {
        return asalSma;
    }

    public void setAsalSma(String asalSma) {
        this.asalSma = asalSma;
    }

    public String getNamaOrangtua() {
        return namaOrangtua;
    }

    public void setNamaOrangtua(String namaOrangtua) {
        this.namaOrangtua = namaOrangtua;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nim != null ? nim.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mahasiswa_1)) {
            return false;
        }
        Mahasiswa_1 other = (Mahasiswa_1) object;
        if ((this.nim == null && other.nim != null) || (this.nim != null && !this.nim.equals(other.nim))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pbouts.Mahasiswa_1[ nim=" + nim + " ]";
    }
    
}
