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
import java.util.List;

import javax.persistence.*;

/**
 * Persistent class for entity stored in table "pembelian_header"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="pembelian_header", catalog="bengkel_nirwana" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="PembelianHeaderEntity.countAll", query="SELECT COUNT(x) FROM PembelianHeaderEntity x" )
} )
public class PembelianHeaderEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id_pembelian", nullable=false)
    private Integer    idPembelian  ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="tanggal", nullable=false)
    private Date       tanggal      ;

    @Column(name="supplier", nullable=false, length=100)
    private String     supplier     ;

    @Column(name="total", nullable=false)
    private Double     total        ;



    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @OneToMany(mappedBy="pembelianHeader2", targetEntity=PembelianDetailEntity.class)
    private List<PembelianDetailEntity> listOfPembelianDetail;

    @OneToMany(mappedBy="pembelianHeader2", targetEntity=ReturPembelianEntity.class)
    private List<ReturPembelianEntity> listOfReturPembelian;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public PembelianHeaderEntity() {
		super();
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setIdPembelian( Integer idPembelian ) {
        this.idPembelian = idPembelian ;
    }
    public Integer getIdPembelian() {
        return this.idPembelian;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : tanggal ( DATETIME ) 
    public void setTanggal( Date tanggal ) {
        this.tanggal = tanggal;
    }
    public Date getTanggal() {
        return this.tanggal;
    }

    //--- DATABASE MAPPING : supplier ( VARCHAR ) 
    public void setSupplier( String supplier ) {
        this.supplier = supplier;
    }
    public String getSupplier() {
        return this.supplier;
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
    public void setListOfPembelianDetail( List<PembelianDetailEntity> listOfPembelianDetail ) {
        this.listOfPembelianDetail = listOfPembelianDetail;
    }
    public List<PembelianDetailEntity> getListOfPembelianDetail() {
        return this.listOfPembelianDetail;
    }

    public void setListOfReturPembelian( List<ReturPembelianEntity> listOfReturPembelian ) {
        this.listOfReturPembelian = listOfReturPembelian;
    }
    public List<ReturPembelianEntity> getListOfReturPembelian() {
        return this.listOfReturPembelian;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(idPembelian);
        sb.append("]:"); 
        sb.append(tanggal);
        sb.append("|");
        sb.append(supplier);
        sb.append("|");
        sb.append(total);
        return sb.toString(); 
    } 

}
