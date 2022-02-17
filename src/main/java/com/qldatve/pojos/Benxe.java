/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qldatve.pojos;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "benxe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Benxe.findAll", query = "SELECT b FROM Benxe b"),
    @NamedQuery(name = "Benxe.findByIdBenXe", query = "SELECT b FROM Benxe b WHERE b.idBenXe = :idBenXe"),
    @NamedQuery(name = "Benxe.findByDiaChi", query = "SELECT b FROM Benxe b WHERE b.diaChi = :diaChi")})
public class Benxe implements Serializable {

    @OneToMany(mappedBy = "noiDenid")
    private Collection<Tuyen> tuyenCollection;
    @OneToMany(mappedBy = "noiKhoiHanhid")
    private Collection<Tuyen> tuyenCollection1;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idBenXe")
    private Integer idBenXe;
    @Size(max = 45)
    @Column(name = "DiaChi")
    private String diaChi;

    public Benxe() {
    }

    public Benxe(Integer idBenXe) {
        this.idBenXe = idBenXe;
    }

    public Integer getIdBenXe() {
        return idBenXe;
    }

    public void setIdBenXe(Integer idBenXe) {
        this.idBenXe = idBenXe;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBenXe != null ? idBenXe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Benxe)) {
            return false;
        }
        Benxe other = (Benxe) object;
        if ((this.idBenXe == null && other.idBenXe != null) || (this.idBenXe != null && !this.idBenXe.equals(other.idBenXe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.qldatve.pojos.Benxe[ idBenXe=" + idBenXe + " ]";
    }

    @XmlTransient
    public Collection<Tuyen> getTuyenCollection() {
        return tuyenCollection;
    }

    public void setTuyenCollection(Collection<Tuyen> tuyenCollection) {
        this.tuyenCollection = tuyenCollection;
    }

    @XmlTransient
    public Collection<Tuyen> getTuyenCollection1() {
        return tuyenCollection1;
    }

    public void setTuyenCollection1(Collection<Tuyen> tuyenCollection1) {
        this.tuyenCollection1 = tuyenCollection1;
    }
    
}
