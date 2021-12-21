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
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
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
@Table(name = "quanly_xe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QuanlyXe.findAll", query = "SELECT q FROM QuanlyXe q"),
    @NamedQuery(name = "QuanlyXe.findById", query = "SELECT q FROM QuanlyXe q WHERE q.id = :id"),
    @NamedQuery(name = "QuanlyXe.findByDaKhoiHanh", query = "SELECT q FROM QuanlyXe q WHERE q.daKhoiHanh = :daKhoiHanh"),
    @NamedQuery(name = "QuanlyXe.findByBienSoXe", query = "SELECT q FROM QuanlyXe q WHERE q.bienSoXe = :bienSoXe"),
    @NamedQuery(name = "QuanlyXe.findByGheDaDat", query = "SELECT q FROM QuanlyXe q WHERE q.gheDaDat = :gheDaDat")})
public class QuanlyXe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DaKhoiHanh")
    private boolean daKhoiHanh;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "BienSoXe")
    private String bienSoXe;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GheDaDat")
    private int gheDaDat;
    @JoinColumns({
        @JoinColumn(name = "BenXe_id", referencedColumnName = "id"),
        @JoinColumn(name = "BenXe_id", referencedColumnName = "id")})
    @ManyToOne(optional = false)
    private QuanlyBenxe quanlyBenxe;
    @OneToMany(mappedBy = "quanlyXe")
    private Collection<QuanlyXebaotri> quanlyXebaotriCollection;
    @OneToMany(mappedBy = "quanlyXe")
    private Collection<QuanlyChuyen> quanlyChuyenCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "quanlyXe")
    private Collection<QuanlyXevaghe> quanlyXevagheCollection;

    public QuanlyXe() {
    }

    public QuanlyXe(Long id) {
        this.id = id;
    }

    public QuanlyXe(Long id, boolean daKhoiHanh, String bienSoXe, int gheDaDat) {
        this.id = id;
        this.daKhoiHanh = daKhoiHanh;
        this.bienSoXe = bienSoXe;
        this.gheDaDat = gheDaDat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean getDaKhoiHanh() {
        return daKhoiHanh;
    }

    public void setDaKhoiHanh(boolean daKhoiHanh) {
        this.daKhoiHanh = daKhoiHanh;
    }

    public String getBienSoXe() {
        return bienSoXe;
    }

    public void setBienSoXe(String bienSoXe) {
        this.bienSoXe = bienSoXe;
    }

    public int getGheDaDat() {
        return gheDaDat;
    }

    public void setGheDaDat(int gheDaDat) {
        this.gheDaDat = gheDaDat;
    }

    public QuanlyBenxe getQuanlyBenxe() {
        return quanlyBenxe;
    }

    public void setQuanlyBenxe(QuanlyBenxe quanlyBenxe) {
        this.quanlyBenxe = quanlyBenxe;
    }

    @XmlTransient
    public Collection<QuanlyXebaotri> getQuanlyXebaotriCollection() {
        return quanlyXebaotriCollection;
    }

    public void setQuanlyXebaotriCollection(Collection<QuanlyXebaotri> quanlyXebaotriCollection) {
        this.quanlyXebaotriCollection = quanlyXebaotriCollection;
    }

    @XmlTransient
    public Collection<QuanlyChuyen> getQuanlyChuyenCollection() {
        return quanlyChuyenCollection;
    }

    public void setQuanlyChuyenCollection(Collection<QuanlyChuyen> quanlyChuyenCollection) {
        this.quanlyChuyenCollection = quanlyChuyenCollection;
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
        if (!(object instanceof QuanlyXe)) {
            return false;
        }
        QuanlyXe other = (QuanlyXe) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.qldatve.pojo.QuanlyXe[ id=" + id + " ]";
    }
    
}
