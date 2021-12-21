/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qldatve.pojo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "quanly_tuyen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QuanlyTuyen.findAll", query = "SELECT q FROM QuanlyTuyen q"),
    @NamedQuery(name = "QuanlyTuyen.findById", query = "SELECT q FROM QuanlyTuyen q WHERE q.id = :id"),
    @NamedQuery(name = "QuanlyTuyen.findByGiaTien", query = "SELECT q FROM QuanlyTuyen q WHERE q.giaTien = :giaTien")})
public class QuanlyTuyen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "GiaTien")
    private Long giaTien;
    @JoinColumns({
        @JoinColumn(name = "NoiDen_id", referencedColumnName = "id"),
        @JoinColumn(name = "NoiDen_id", referencedColumnName = "id")})
    @ManyToOne
    private QuanlyBenxe quanlyBenxe;
    @JoinColumns({
        @JoinColumn(name = "NoiKhoiHanh_id", referencedColumnName = "id"),
        @JoinColumn(name = "NoiKhoiHanh_id", referencedColumnName = "id")})
    @ManyToOne
    private QuanlyBenxe quanlyBenxe1;
    @OneToMany(mappedBy = "quanlyTuyen")
    private Collection<QuanlyChuyen> quanlyChuyenCollection;

    public QuanlyTuyen() {
    }

    public QuanlyTuyen(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(Long giaTien) {
        this.giaTien = giaTien;
    }

    public QuanlyBenxe getQuanlyBenxe() {
        return quanlyBenxe;
    }

    public void setQuanlyBenxe(QuanlyBenxe quanlyBenxe) {
        this.quanlyBenxe = quanlyBenxe;
    }

    public QuanlyBenxe getQuanlyBenxe1() {
        return quanlyBenxe1;
    }

    public void setQuanlyBenxe1(QuanlyBenxe quanlyBenxe1) {
        this.quanlyBenxe1 = quanlyBenxe1;
    }

    @XmlTransient
    public Collection<QuanlyChuyen> getQuanlyChuyenCollection() {
        return quanlyChuyenCollection;
    }

    public void setQuanlyChuyenCollection(Collection<QuanlyChuyen> quanlyChuyenCollection) {
        this.quanlyChuyenCollection = quanlyChuyenCollection;
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
        if (!(object instanceof QuanlyTuyen)) {
            return false;
        }
        QuanlyTuyen other = (QuanlyTuyen) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.qldatve.pojo.QuanlyTuyen[ id=" + id + " ]";
    }
    
}
