/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qldatve.pojos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "danhgia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Danhgia.findAll", query = "SELECT d FROM Danhgia d"),
    @NamedQuery(name = "Danhgia.findById", query = "SELECT d FROM Danhgia d WHERE d.id = :id"),
    @NamedQuery(name = "Danhgia.findByThoiGian", query = "SELECT d FROM Danhgia d WHERE d.thoiGian = :thoiGian"),
    @NamedQuery(name = "Danhgia.findByNoiDung", query = "SELECT d FROM Danhgia d WHERE d.noiDung = :noiDung"),
    @NamedQuery(name = "Danhgia.findBySoSao", query = "SELECT d FROM Danhgia d WHERE d.soSao = :soSao")})
public class Danhgia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "ThoiGian")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thoiGian;
    @Size(max = 50)
    @Column(name = "NoiDung")
    private String noiDung;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SoSao")
    private Double soSao;
    @JoinColumn(name = "Chuyen_id", referencedColumnName = "id")
    @ManyToOne
    private Chuyen chuyenid;

    public Danhgia() {
    }

    public Danhgia(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(Date thoiGian) {
        this.thoiGian = thoiGian;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public Double getSoSao() {
        return soSao;
    }

    public void setSoSao(Double soSao) {
        this.soSao = soSao;
    }

    public Chuyen getChuyenid() {
        return chuyenid;
    }

    public void setChuyenid(Chuyen chuyenid) {
        this.chuyenid = chuyenid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Danhgia)) {
            return false;
        }
        Danhgia other = (Danhgia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.qldatve.pojos.Danhgia[ id=" + id + " ]";
    }
    
}
