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
@Table(name = "quanly_xebaotri")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QuanlyXebaotri.findAll", query = "SELECT q FROM QuanlyXebaotri q"),
    @NamedQuery(name = "QuanlyXebaotri.findById", query = "SELECT q FROM QuanlyXebaotri q WHERE q.id = :id"),
    @NamedQuery(name = "QuanlyXebaotri.findByThoiDiem", query = "SELECT q FROM QuanlyXebaotri q WHERE q.thoiDiem = :thoiDiem")})
public class QuanlyXebaotri implements Serializable {

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
    @JoinColumns({
        @JoinColumn(name = "Xe_id", referencedColumnName = "id"),
        @JoinColumn(name = "Xe_id", referencedColumnName = "id")})
    @ManyToOne
    private QuanlyXe quanlyXe;

    public QuanlyXebaotri() {
    }

    public QuanlyXebaotri(Long id) {
        this.id = id;
    }

    public QuanlyXebaotri(Long id, Date thoiDiem) {
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
        if (!(object instanceof QuanlyXebaotri)) {
            return false;
        }
        QuanlyXebaotri other = (QuanlyXebaotri) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.qldatve.pojo.QuanlyXebaotri[ id=" + id + " ]";
    }
    
}
