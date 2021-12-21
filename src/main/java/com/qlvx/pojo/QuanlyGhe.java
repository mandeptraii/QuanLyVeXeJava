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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "quanly_ghe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QuanlyGhe.findAll", query = "SELECT q FROM QuanlyGhe q"),
    @NamedQuery(name = "QuanlyGhe.findById", query = "SELECT q FROM QuanlyGhe q WHERE q.id = :id"),
    @NamedQuery(name = "QuanlyGhe.findByTenGhe", query = "SELECT q FROM QuanlyGhe q WHERE q.tenGhe = :tenGhe")})
public class QuanlyGhe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Size(max = 10)
    @Column(name = "TenGhe")
    private String tenGhe;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "quanlyGhe")
    private Collection<QuanlyXevaghe> quanlyXevagheCollection;

    public QuanlyGhe() {
    }

    public QuanlyGhe(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTenGhe() {
        return tenGhe;
    }

    public void setTenGhe(String tenGhe) {
        this.tenGhe = tenGhe;
    }

    @XmlTransient
    public Collection<QuanlyXevaghe> getQuanlyXevagheCollection() {
        return quanlyXevagheCollection;
    }

    public void setQuanlyXevagheCollection(Collection<QuanlyXevaghe> quanlyXevagheCollection) {
        this.quanlyXevagheCollection = quanlyXevagheCollection;
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
        if (!(object instanceof QuanlyGhe)) {
            return false;
        }
        QuanlyGhe other = (QuanlyGhe) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.qldatve.pojo.QuanlyGhe[ id=" + id + " ]";
    }
    
}
