/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qldatve.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "quanly_danhgia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QuanlyDanhgia.findAll", query = "SELECT q FROM QuanlyDanhgia q"),
    @NamedQuery(name = "QuanlyDanhgia.findById", query = "SELECT q FROM QuanlyDanhgia q WHERE q.id = :id"),
    @NamedQuery(name = "QuanlyDanhgia.findByThoiGian", query = "SELECT q FROM QuanlyDanhgia q WHERE q.thoiGian = :thoiGian"),
    @NamedQuery(name = "QuanlyDanhgia.findBySoSao", query = "SELECT q FROM QuanlyDanhgia q WHERE q.soSao = :soSao")})
public class QuanlyDanhgia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "ThoiGian")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thoiGian;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "NoiDung")
    private String noiDung;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SoSao")
    private double soSao;
    @JoinColumns({
        @JoinColumn(name = "Chuyen_id", referencedColumnName = "id"),
        @JoinColumn(name = "Chuyen_id", referencedColumnName = "id")})
    @ManyToOne(optional = false)
    private QuanlyChuyen quanlyChuyen;
    @JoinColumn(name = "NguoiDung_id", referencedColumnName = "id")
    @ManyToOne
    private QuanlyUser nguoiDungid;

    public QuanlyDanhgia() {
    }

    public QuanlyDanhgia(Long id) {
        this.id = id;
    }

    public QuanlyDanhgia(Long id, String noiDung, double soSao) {
        this.id = id;
        this.noiDung = noiDung;
        this.soSao = soSao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public double getSoSao() {
        return soSao;
    }

    public void setSoSao(double soSao) {
        this.soSao = soSao;
    }

    public QuanlyChuyen getQuanlyChuyen() {
        return quanlyChuyen;
    }

    public void setQuanlyChuyen(QuanlyChuyen quanlyChuyen) {
        this.quanlyChuyen = quanlyChuyen;
    }

    public QuanlyUser getNguoiDungid() {
        return nguoiDungid;
    }

    public void setNguoiDungid(QuanlyUser nguoiDungid) {
        this.nguoiDungid = nguoiDungid;
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
        if (!(object instanceof QuanlyDanhgia)) {
            return false;
        }
        QuanlyDanhgia other = (QuanlyDanhgia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.qldatve.pojo.QuanlyDanhgia[ id=" + id + " ]";
    }
    
}
