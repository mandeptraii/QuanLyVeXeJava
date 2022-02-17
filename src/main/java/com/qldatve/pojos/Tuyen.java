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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "tuyen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tuyen.findAll", query = "SELECT t FROM Tuyen t"),
    @NamedQuery(name = "Tuyen.findById", query = "SELECT t FROM Tuyen t WHERE t.id = :id"),
    @NamedQuery(name = "Tuyen.findByGiaTien", query = "SELECT t FROM Tuyen t WHERE t.giaTien = :giaTien")})
public class Tuyen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "GiaTien")
    private Long giaTien;
    @OneToMany(mappedBy = "tuyenid")
    private Collection<Chuyen> chuyenCollection;
    @JoinColumn(name = "NoiDen_id", referencedColumnName = "idBenXe")
    @ManyToOne
    private Benxe noiDenid;
    @JoinColumn(name = "NoiKhoiHanh_id", referencedColumnName = "idBenXe")
    @ManyToOne
    private Benxe noiKhoiHanhid;

    public Tuyen() {
    }

    public Tuyen(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(Long giaTien) {
        this.giaTien = giaTien;
    }

    @XmlTransient
    public Collection<Chuyen> getChuyenCollection() {
        return chuyenCollection;
    }

    public void setChuyenCollection(Collection<Chuyen> chuyenCollection) {
        this.chuyenCollection = chuyenCollection;
    }

    public Benxe getNoiDenid() {
        return noiDenid;
    }

    public void setNoiDenid(Benxe noiDenid) {
        this.noiDenid = noiDenid;
    }

    public Benxe getNoiKhoiHanhid() {
        return noiKhoiHanhid;
    }

    public void setNoiKhoiHanhid(Benxe noiKhoiHanhid) {
        this.noiKhoiHanhid = noiKhoiHanhid;
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
        if (!(object instanceof Tuyen)) {
            return false;
        }
        Tuyen other = (Tuyen) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.qldatve.pojos.Tuyen[ id=" + id + " ]";
    }
    
}
