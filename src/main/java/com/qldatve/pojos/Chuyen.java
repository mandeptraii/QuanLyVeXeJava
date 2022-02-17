/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qldatve.pojos;

import java.io.Serializable;
import java.util.Collection;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "chuyen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Chuyen.findAll", query = "SELECT c FROM Chuyen c"),
    @NamedQuery(name = "Chuyen.findById", query = "SELECT c FROM Chuyen c WHERE c.id = :id"),
    @NamedQuery(name = "Chuyen.findByThoiDiemDi", query = "SELECT c FROM Chuyen c WHERE c.thoiDiemDi = :thoiDiemDi"),
    @NamedQuery(name = "Chuyen.findByDaKhoiHanh", query = "SELECT c FROM Chuyen c WHERE c.daKhoiHanh = :daKhoiHanh"),
    @NamedQuery(name = "Chuyen.findBySoLuongVe", query = "SELECT c FROM Chuyen c WHERE c.soLuongVe = :soLuongVe"),
    @NamedQuery(name = "Chuyen.findByDoanhThu", query = "SELECT c FROM Chuyen c WHERE c.doanhThu = :doanhThu"),
    @NamedQuery(name = "Chuyen.findByTaiXeid", query = "SELECT c FROM Chuyen c WHERE c.taiXeid = :taiXeid")})
public class Chuyen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "ThoiDiemDi")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thoiDiemDi;
    @Column(name = "DaKhoiHanh")
    private Short daKhoiHanh;
    @Size(max = 45)
    @Column(name = "SoLuongVe")
    private String soLuongVe;
    @Column(name = "DoanhThu")
    private Long doanhThu;
    @Column(name = "TaiXe_id")
    private Integer taiXeid;
    @JoinColumn(name = "Tuyen_id", referencedColumnName = "Id")
    @ManyToOne
    private Tuyen tuyenid;
    @OneToMany(mappedBy = "chuyenid")
    private Collection<Vexe> vexeCollection;
    @OneToMany(mappedBy = "chuyenid")
    private Collection<Danhgia> danhgiaCollection;

    public Chuyen() {
    }

    public Chuyen(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getThoiDiemDi() {
        return thoiDiemDi;
    }

    public void setThoiDiemDi(Date thoiDiemDi) {
        this.thoiDiemDi = thoiDiemDi;
    }

    public Short getDaKhoiHanh() {
        return daKhoiHanh;
    }

    public void setDaKhoiHanh(Short daKhoiHanh) {
        this.daKhoiHanh = daKhoiHanh;
    }

    public String getSoLuongVe() {
        return soLuongVe;
    }

    public void setSoLuongVe(String soLuongVe) {
        this.soLuongVe = soLuongVe;
    }

    public Long getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(Long doanhThu) {
        this.doanhThu = doanhThu;
    }

    public Integer getTaiXeid() {
        return taiXeid;
    }

    public void setTaiXeid(Integer taiXeid) {
        this.taiXeid = taiXeid;
    }

    public Tuyen getTuyenid() {
        return tuyenid;
    }

    public void setTuyenid(Tuyen tuyenid) {
        this.tuyenid = tuyenid;
    }

    @XmlTransient
    public Collection<Vexe> getVexeCollection() {
        return vexeCollection;
    }

    public void setVexeCollection(Collection<Vexe> vexeCollection) {
        this.vexeCollection = vexeCollection;
    }

    @XmlTransient
    public Collection<Danhgia> getDanhgiaCollection() {
        return danhgiaCollection;
    }

    public void setDanhgiaCollection(Collection<Danhgia> danhgiaCollection) {
        this.danhgiaCollection = danhgiaCollection;
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
        if (!(object instanceof Chuyen)) {
            return false;
        }
        Chuyen other = (Chuyen) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.qldatve.pojos.Chuyen[ id=" + id + " ]";
    }
    
}
