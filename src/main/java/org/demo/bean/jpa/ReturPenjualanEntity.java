/*
 * Created on 25 Jul 2021 ( Time 02:07:33 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
// This Bean has a basic Primary Key (not composite) 

package org.demo.bean.jpa;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;

import java.util.Date;

import javax.persistence.*;

/**
 * Persistent class for entity stored in table "retur_penjualan"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="retur_penjualan", catalog="bengkel_nirwana" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="ReturPenjualanEntity.countAll", query="SELECT COUNT(x) FROM ReturPenjualanEntity x" )
} )
public class ReturPenjualanEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="idretur_penjualan", nullable=false)
    private Integer    idreturPenjualan ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="harga", nullable=false)
    private Double     harga        ;

    @Column(name="jumlah", nullable=false)
    private Integer    jumlah       ;

    @Column(name="nama_barang", nullable=false, length=45)
    private String     namaBarang   ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="tanggal", nullable=false)
    private Date       tanggal      ;

    @Column(name="total", nullable=false)
    private Double     total        ;

	// "penjualanHeader" (column "penjualan_header") is not defined by itself because used as FK in a link 


    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @ManyToOne
    @JoinColumn(name="penjualan_header", referencedColumnName="id_penjualan_header")
    private PenjualanHeaderEntity penjualanHeader2;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public ReturPenjualanEntity() {
		super();
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setIdreturPenjualan( Integer idreturPenjualan ) {
        this.idreturPenjualan = idreturPenjualan ;
    }
    public Integer getIdreturPenjualan() {
        return this.idreturPenjualan;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : harga ( DOUBLE ) 
    public void setHarga( Double harga ) {
        this.harga = harga;
    }
    public Double getHarga() {
        return this.harga;
    }

    //--- DATABASE MAPPING : jumlah ( INT ) 
    public void setJumlah( Integer jumlah ) {
        this.jumlah = jumlah;
    }
    public Integer getJumlah() {
        return this.jumlah;
    }

    //--- DATABASE MAPPING : nama_barang ( VARCHAR ) 
    public void setNamaBarang( String namaBarang ) {
        this.namaBarang = namaBarang;
    }
    public String getNamaBarang() {
        return this.namaBarang;
    }

    //--- DATABASE MAPPING : tanggal ( DATETIME ) 
    public void setTanggal( Date tanggal ) {
        this.tanggal = tanggal;
    }
    public Date getTanggal() {
        return this.tanggal;
    }

    //--- DATABASE MAPPING : total ( DOUBLE ) 
    public void setTotal( Double total ) {
        this.total = total;
    }
    public Double getTotal() {
        return this.total;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    public void setPenjualanHeader2( PenjualanHeaderEntity penjualanHeader2 ) {
        this.penjualanHeader2 = penjualanHeader2;
    }
    public PenjualanHeaderEntity getPenjualanHeader2() {
        return this.penjualanHeader2;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(idreturPenjualan);
        sb.append("]:"); 
        sb.append(harga);
        sb.append("|");
        sb.append(jumlah);
        sb.append("|");
        sb.append(namaBarang);
        sb.append("|");
        sb.append(tanggal);
        sb.append("|");
        sb.append(total);
        return sb.toString(); 
    } 

}
