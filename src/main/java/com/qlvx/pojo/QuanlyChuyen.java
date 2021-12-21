/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qldatve.pojo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "quanly_chuyen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QuanlyChuyen.findAll", query = "SELECT q FROM QuanlyChuyen q"),
    @NamedQuery(name = "QuanlyChuyen.findById", query = "SELECT q FROM QuanlyChuyen q WHERE q.id = :id"),
    @NamedQuery(name = "QuanlyChuyen.findByThoiDiemDi", query = "SELECT q FROM QuanlyChuyen q WHERE q.thoiDiemDi = :thoiDiemDi"),
    @NamedQuery(name = "QuanlyChuyen.findByThoiGianDuKien", query = "SELECT q FROM QuanlyChuyen q WHERE q.thoiGianDuKien = :thoiGianDuKien"),
    @NamedQuery(name = "QuanlyChuyen.findByDaKhoiHanh", query = "SELECT q FROM QuanlyChuyen q WHERE q.daKhoiHanh = :daKhoiHanh"),
    @NamedQuery(name = "QuanlyChuyen.findByDoanhThu", query = "SELECT q FROM QuanlyChuyen q WHERE q.doanhThu = :doanhThu")})
public class QuanlyChuyen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ThoiDiemDi")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thoiDiemDi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ThoiGianDuKien")
    private int thoiGianDuKien;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DaKhoiHanh")
    private boolean daKhoiHanh;
    @Column(name = "DoanhThu")
    private Long doanhThu;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "quanlyChuyen")
    private Collection<QuanlyDanhgia> quanlyDanhgiaCollection;
    @JoinColumns({
        @JoinColumn(name = "Tuyen_id", referencedColumnName = "id"),
        @JoinColumn(name = "Tuyen_id", referencedColumnName = "id")})
    @ManyToOne
    private QuanlyTuyen quanlyTuyen;
    @JoinColumn(name = "TaiXe_id", referencedColumnName = "id")
    @ManyToOne
    private QuanlyUser taiXeid;
    @JoinColumns({
        @JoinColumn(name = "Xe_id", referencedColumnName = "id"),
        @JoinColumn(name = "Xe_id", referencedColumnName = "id")})
    @ManyToOne
    private QuanlyXe quanlyXe;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "chuyenid")
    private Collection<QuanlyVexe> quanlyVexeCollection;

    public QuanlyChuyen() {
    }

    public QuanlyChuyen(Long id) {
        this.id = id;
    }

    public QuanlyChuyen(Long id, Date thoiDiemDi, int thoiGianDuKien, boolean daKhoiHanh) {
        this.id = id;
        this.thoiDiemDi = thoiDiemDi;
        this.thoiGianDuKien = thoiGianDuKien;
        this.daKhoiHanh = daKhoiHanh;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getThoiDiemDi() {
        return thoiDiemDi;
    }

    public void setThoiDiemDi(Date thoiDiemDi) {
        this.thoiDiemDi = thoiDiemDi;
    }

    public int getThoiGianDuKien() {
        return thoiGianDuKien;
    }

    public void setThoiGianDuKien(int thoiGianDuKien) {
        this.thoiGianDuKien = thoiGianDuKien;
    }

    public boolean getDaKhoiHanh() {
        return daKhoiHanh;
    }

    public void setDaKhoiHanh(boolean daKhoiHanh) {
        this.daKhoiHanh = daKhoiHanh;
    }

    public Long getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(Long doanhThu) {
        this.doanhThu = doanhThu;
    }

    @XmlTransient
    public Collection<QuanlyDanhgia> getQuanlyDanhgiaCollection() {
        return quanlyDanhgiaCollection;
    }

    public void setQuanlyDanhgiaCollection(Collection<QuanlyDanhgia> quanlyDanhgiaCollection) {
        this.quanlyDanhgiaCollection = quanlyDanhgiaCollection;
    }

    public QuanlyTuyen getQuanlyTuyen() {
        return quanlyTuyen;
    }

    public void setQuanlyTuyen(QuanlyTuyen quanlyTuyen) {
        this.quanlyTuyen = quanlyTuyen;
    }

    public QuanlyUser getTaiXeid() {
        return taiXeid;
    }

    public void setTaiXeid(QuanlyUser taiXeid) {
        this.taiXeid = taiXeid;
    }

    public QuanlyXe getQuanlyXe() {
        return quanlyXe;
    }

    public void setQuanlyXe(QuanlyXe quanlyXe) {
        this.quanlyXe = quanlyXe;
    }

    @XmlTransient
    public Collection<QuanlyVexe> getQuanlyVexeCollection() {
        return quanlyVexeCollection;
    }

    public void setQuanlyVexeCollection(Collection<QuanlyVexe> quanlyVexeCollection) {
        this.quanlyVexeCollection = quanlyVexeCollection;
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
        if (!(object instanceof QuanlyChuyen)) {
            return false;
        }
        QuanlyChuyen other = (QuanlyChuyen) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.qldatve.pojo.QuanlyChuyen[ id=" + id + " ]";
    }
    
}
