/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qldatve.pojo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
 * @author Admin
 */
@Entity
@Table(name = "quanly_benxe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QuanlyBenxe.findAll", query = "SELECT q FROM QuanlyBenxe q"),
    @NamedQuery(name = "QuanlyBenxe.findById", query = "SELECT q FROM QuanlyBenxe q WHERE q.id = :id"),
    @NamedQuery(name = "QuanlyBenxe.findByDiaDiem", query = "SELECT q FROM QuanlyBenxe q WHERE q.diaDiem = :diaDiem")})
public class QuanlyBenxe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "DiaDiem")
    private String diaDiem;
    @OneToMany(mappedBy = "quanlyBenxe")
    private Collection<QuanlyTuyen> quanlyTuyenCollection;
    @OneToMany(mappedBy = "quanlyBenxe1")
    private Collection<QuanlyTuyen> quanlyTuyenCollection1;
    @OneToMany(mappedBy = "benXeid")
    private Collection<QuanlyUser> quanlyUserCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "quanlyBenxe")
    private Collection<QuanlyXe> quanlyXeCollection;

    public QuanlyBenxe() {
    }

    public QuanlyBenxe(Long id) {
        this.id = id;
    }

    public QuanlyBenxe(Long id, String diaDiem) {
        this.id = id;
        this.diaDiem = diaDiem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }

    @XmlTransient
    public Collection<QuanlyTuyen> getQuanlyTuyenCollection() {
        return quanlyTuyenCollection;
    }

    public void setQuanlyTuyenCollection(Collection<QuanlyTuyen> quanlyTuyenCollection) {
        this.quanlyTuyenCollection = quanlyTuyenCollection;
    }

    @XmlTransient
    public Collection<QuanlyTuyen> getQuanlyTuyenCollection1() {
        return quanlyTuyenCollection1;
    }

    public void setQuanlyTuyenCollection1(Collection<QuanlyTuyen> quanlyTuyenCollection1) {
        this.quanlyTuyenCollection1 = quanlyTuyenCollection1;
    }

    @XmlTransient
    public Collection<QuanlyUser> getQuanlyUserCollection() {
        return quanlyUserCollection;
    }

    public void setQuanlyUserCollection(Collection<QuanlyUser> quanlyUserCollection) {
        this.quanlyUserCollection = quanlyUserCollection;
    }

    @XmlTransient
    public Collection<QuanlyXe> getQuanlyXeCollection() {
        return quanlyXeCollection;
    }

    public void setQuanlyXeCollection(Collection<QuanlyXe> quanlyXeCollection) {
        this.quanlyXeCollection = quanlyXeCollection;
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
        if (!(object instanceof QuanlyBenxe)) {
            return false;
        }
        QuanlyBenxe other = (QuanlyBenxe) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.qldatve.pojo.QuanlyBenxe[ id=" + id + " ]";
    }
    
}
