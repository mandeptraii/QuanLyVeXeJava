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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "quanly_chitieu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QuanlyChitieu.findAll", query = "SELECT q FROM QuanlyChitieu q"),
    @NamedQuery(name = "QuanlyChitieu.findById", query = "SELECT q FROM QuanlyChitieu q WHERE q.id = :id"),
    @NamedQuery(name = "QuanlyChitieu.findByThoiDiem", query = "SELECT q FROM QuanlyChitieu q WHERE q.thoiDiem = :thoiDiem")})
public class QuanlyChitieu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ThoiDiem")
    @Temporal(TemporalType.DATE)
    private Date thoiDiem;
    @JoinColumn(name = "NhanVienBanVe_id", referencedColumnName = "id")
    @ManyToOne
    private QuanlyUser nhanVienBanVeid;
    @JoinColumn(name = "TaiXe_id", referencedColumnName = "id")
    @ManyToOne
    private QuanlyUser taiXeid;

    public QuanlyChitieu() {
    }

    public QuanlyChitieu(Long id) {
        this.id = id;
    }

    public QuanlyChitieu(Long id, Date thoiDiem) {
        this.id = id;
        this.thoiDiem = thoiDiem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getThoiDiem() {
        return thoiDiem;
    }

    public void setThoiDiem(Date thoiDiem) {
        this.thoiDiem = thoiDiem;
    }

    public QuanlyUser getNhanVienBanVeid() {
        return nhanVienBanVeid;
    }

    public void setNhanVienBanVeid(QuanlyUser nhanVienBanVeid) {
        this.nhanVienBanVeid = nhanVienBanVeid;
    }

    public QuanlyUser getTaiXeid() {
        return taiXeid;
    }

    public void setTaiXeid(QuanlyUser taiXeid) {
        this.taiXeid = taiXeid;
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
        if (!(object instanceof QuanlyChitieu)) {
            return false;
        }
        QuanlyChitieu other = (QuanlyChitieu) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.qldatve.pojo.QuanlyChitieu[ id=" + id + " ]";
    }
    
}
