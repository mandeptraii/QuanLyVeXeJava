/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qldatve.pojos;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "vexe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vexe.findAll", query = "SELECT v FROM Vexe v"),
    @NamedQuery(name = "Vexe.findById", query = "SELECT v FROM Vexe v WHERE v.id = :id"),
    @NamedQuery(name = "Vexe.findByGiaTien", query = "SELECT v FROM Vexe v WHERE v.giaTien = :giaTien"),
    @NamedQuery(name = "Vexe.findBySoLuong", query = "SELECT v FROM Vexe v WHERE v.soLuong = :soLuong")})
public class Vexe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "GiaTien")
    private Long giaTien;
    @Column(name = "SoLuong")
    private Integer soLuong;
    @JoinColumn(name = "Chuyen_id", referencedColumnName = "id")
    @ManyToOne
    private Chuyen chuyenid;

    public Vexe() {
    }

    public Vexe(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(Long giaTien) {
        this.giaTien = giaTien;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Chuyen getChuyenid() {
        return chuyenid;
    }

    public void setChuyenid(Chuyen chuyenid) {
        this.chuyenid = chuyenid;
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
        if (!(object instanceof Vexe)) {
            return false;
        }
        Vexe other = (Vexe) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.qldatve.pojos.Vexe[ id=" + id + " ]";
    }
    
}
