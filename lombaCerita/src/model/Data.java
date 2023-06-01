/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
//import java.sql;
//import koneksi.connector;
/**
 *
 * @author PC PRAKTIKUM
 */
public class Data {
    private String judul;
    private double alur, orisinalitas, pemilihanKata, nilai;

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public double getAlur() {
        return alur;
    }

    public void setAlur(double alur) {
        this.alur = alur;
    }

    public double getOrisinalitas() {
        return orisinalitas;
    }

    public void setOrisinalitas(double orisinalitas) {
        this.orisinalitas = orisinalitas;
    }

    public double getPemilihanKata() {
        return pemilihanKata;
    }

    public void setPemilihanKata(double pemilihanKata) {
        this.pemilihanKata = pemilihanKata;
    }

    public double getNilai() {
        nilai = (this.getAlur()+this.getOrisinalitas()+this.getPemilihanKata())/3;
        return nilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }

   
    
}
