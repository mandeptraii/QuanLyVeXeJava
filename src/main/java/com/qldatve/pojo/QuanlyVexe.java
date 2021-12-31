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
@Table(name = "quanly_vexe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QuanlyVexe.findAll", query = "SELECT q FROM QuanlyVexe q"),
    @NamedQuery(name = "QuanlyVexe.findById", query = "SELECT q FROM QuanlyVexe q WHERE q.id = :id"),
    @NamedQuery(name = "QuanlyVexe.findByGiaTien", query = "SELECT q FROM QuanlyVexe q WHERE q.giaTien = :giaTien"),
    @NamedQuery(name = "QuanlyVexe.findBySoLuong", query = "SELECT q FROM QuanlyVexe q WHERE q.soLuong = :soLuong")})
public class QuanlyVexe implements Serializable {

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
    @Column(name = "SoLuong")
    private int soLuong;
    @JoinColumn(name = "Chuyen_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private QuanlyChuyen chuyenid;
    @JoinColumn(name = "KhachHang_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private QuanlyUser khachHangid;

    public QuanlyVexe() {
    }

    public QuanlyVexe(Long id) {
        this.id = id;
    }

    public QuanlyVexe(Long id, int soLuong) {
        this.id = id;
        this.soLuong = soLuong;
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

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public QuanlyChuyen getChuyenid() {
        return chuyenid;
    }

    public void setChuyenid(QuanlyChuyen chuyenid) {
        this.chuyenid = chuyenid;
    }

    public QuanlyUser getKhachHangid() {
        return khachHangid;
    }

    public void setKhachHangid(QuanlyUser khachHangid) {
        this.khachHangid = khachHangid;
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
        if (!(object instanceof QuanlyVexe)) {
            return false;
        }
        QuanlyVexe other = (QuanlyVexe) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.qldatve.pojo.QuanlyVexe[ id=" + id + " ]";
    }
    
}
