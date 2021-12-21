/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qldatve.pojo;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "quanly_xevaghe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QuanlyXevaghe.findAll", query = "SELECT q FROM QuanlyXevaghe q"),
    @NamedQuery(name = "QuanlyXevaghe.findById", query = "SELECT q FROM QuanlyXevaghe q WHERE q.id = :id"),
    @NamedQuery(name = "QuanlyXevaghe.findByGiaTien", query = "SELECT q FROM QuanlyXevaghe q WHERE q.giaTien = :giaTien"),
    @NamedQuery(name = "QuanlyXevaghe.findByDaDat", query = "SELECT q FROM QuanlyXevaghe q WHERE q.daDat = :daDat")})
public class QuanlyXevaghe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "GiaTien")
    private Long giaTien;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DaDat")
    private boolean daDat;
    @JoinColumns({
        @JoinColumn(name = "Ghe_id", referencedColumnName = "id"),
        @JoinColumn(name = "Ghe_id", referencedColumnName = "id")})
    @ManyToOne(optional = false)
    private QuanlyGhe quanlyGhe;
    @JoinColumns({
        @JoinColumn(name = "Xe_id", referencedColumnName = "id"),
        @JoinColumn(name = "Xe_id", referencedColumnName = "id")})
    @ManyToOne(optional = false)
    private QuanlyXe quanlyXe;

    public QuanlyXevaghe() {
    }

    public QuanlyXevaghe(Long id) {
        this.id = id;
    }

    public QuanlyXevaghe(Long id, boolean daDat) {
        this.id = id;
        this.daDat = daDat;
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

    public boolean getDaDat() {
        return daDat;
    }

    public void setDaDat(boolean daDat) {
        this.daDat = daDat;
    }

    public QuanlyGhe getQuanlyGhe() {
        return quanlyGhe;
    }

    public void setQuanlyGhe(QuanlyGhe quanlyGhe) {
        this.quanlyGhe = quanlyGhe;
    }

    public QuanlyXe getQuanlyXe() {
        return quanlyXe;
    }

    public void setQuanlyXe(QuanlyXe quanlyXe) {
        this.quanlyXe = quanlyXe;
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
        if (!(object instanceof QuanlyXevaghe)) {
            return false;
        }
        QuanlyXevaghe other = (QuanlyXevaghe) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.qldatve.pojo.QuanlyXevaghe[ id=" + id + " ]";
    }
    
}
