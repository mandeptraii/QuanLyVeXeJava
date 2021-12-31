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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "quanly_user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QuanlyUser.findAll", query = "SELECT q FROM QuanlyUser q"),
    @NamedQuery(name = "QuanlyUser.findById", query = "SELECT q FROM QuanlyUser q WHERE q.id = :id"),
    @NamedQuery(name = "QuanlyUser.findByPassword", query = "SELECT q FROM QuanlyUser q WHERE q.password = :password"),
    @NamedQuery(name = "QuanlyUser.findByLastLogin", query = "SELECT q FROM QuanlyUser q WHERE q.lastLogin = :lastLogin"),
    @NamedQuery(name = "QuanlyUser.findByIsSuperuser", query = "SELECT q FROM QuanlyUser q WHERE q.isSuperuser = :isSuperuser"),
    @NamedQuery(name = "QuanlyUser.findByUsername", query = "SELECT q FROM QuanlyUser q WHERE q.username = :username"),
    @NamedQuery(name = "QuanlyUser.findByFirstName", query = "SELECT q FROM QuanlyUser q WHERE q.firstName = :firstName"),
    @NamedQuery(name = "QuanlyUser.findByLastName", query = "SELECT q FROM QuanlyUser q WHERE q.lastName = :lastName"),
    @NamedQuery(name = "QuanlyUser.findByEmail", query = "SELECT q FROM QuanlyUser q WHERE q.email = :email"),
    @NamedQuery(name = "QuanlyUser.findByIsStaff", query = "SELECT q FROM QuanlyUser q WHERE q.isStaff = :isStaff"),
    @NamedQuery(name = "QuanlyUser.findByIsActive", query = "SELECT q FROM QuanlyUser q WHERE q.isActive = :isActive"),
    @NamedQuery(name = "QuanlyUser.findByDateJoined", query = "SELECT q FROM QuanlyUser q WHERE q.dateJoined = :dateJoined"),
    @NamedQuery(name = "QuanlyUser.findByNamSinh", query = "SELECT q FROM QuanlyUser q WHERE q.namSinh = :namSinh"),
    @NamedQuery(name = "QuanlyUser.findByAvatar", query = "SELECT q FROM QuanlyUser q WHERE q.avatar = :avatar"),
    @NamedQuery(name = "QuanlyUser.findByTienLuong", query = "SELECT q FROM QuanlyUser q WHERE q.tienLuong = :tienLuong"),
    @NamedQuery(name = "QuanlyUser.findByDiemUyTin", query = "SELECT q FROM QuanlyUser q WHERE q.diemUyTin = :diemUyTin"),
    @NamedQuery(name = "QuanlyUser.findByThuViec", query = "SELECT q FROM QuanlyUser q WHERE q.thuViec = :thuViec"),
    @NamedQuery(name = "QuanlyUser.findByChuyenDaLai", query = "SELECT q FROM QuanlyUser q WHERE q.chuyenDaLai = :chuyenDaLai"),
    @NamedQuery(name = "QuanlyUser.findByDoThanThiet", query = "SELECT q FROM QuanlyUser q WHERE q.doThanThiet = :doThanThiet"),
    @NamedQuery(name = "QuanlyUser.findBySoVeDaDat", query = "SELECT q FROM QuanlyUser q WHERE q.soVeDaDat = :soVeDaDat")})
public class QuanlyUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "password")
    private String password;
    @Column(name = "last_login")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLogin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_superuser")
    private boolean isSuperuser;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "first_name")
    private String firstName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "last_name")
    private String lastName;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_staff")
    private boolean isStaff;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_active")
    private boolean isActive;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_joined")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateJoined;
    @Column(name = "NamSinh")
    @Temporal(TemporalType.DATE)
    private Date namSinh;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "avatar")
    private String avatar;
    @Column(name = "TienLuong")
    private Long tienLuong;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DiemUyTin")
    private Double diemUyTin;
    @Column(name = "ThuViec")
    private Boolean thuViec;
    @Column(name = "ChuyenDaLai")
    private Integer chuyenDaLai;
    @Column(name = "DoThanThiet")
    private Integer doThanThiet;
    @Column(name = "SoVeDaDat")
    private Integer soVeDaDat;
    @OneToMany(mappedBy = "nguoiDungid")
    private Collection<QuanlyDanhgia> quanlyDanhgiaCollection;
    @JoinColumn(name = "BenXe_id", referencedColumnName = "id")
    @ManyToOne
    private QuanlyBenxe benXeid;
    @OneToMany(mappedBy = "nhanVienBanVeid")
    private Collection<QuanlyChitieu> quanlyChitieuCollection;
    @OneToMany(mappedBy = "taiXeid")
    private Collection<QuanlyChitieu> quanlyChitieuCollection1;
    @OneToMany(mappedBy = "taiXeid")
    private Collection<QuanlyChuyen> quanlyChuyenCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "khachHangid")
    private Collection<QuanlyVexe> quanlyVexeCollection;

    public QuanlyUser() {
    }

    public QuanlyUser(Long id) {
        this.id = id;
    }

    public QuanlyUser(Long id, String password, boolean isSuperuser, String username, String firstName, String lastName, String email, boolean isStaff, boolean isActive, Date dateJoined, String avatar) {
        this.id = id;
        this.password = password;
        this.isSuperuser = isSuperuser;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.isStaff = isStaff;
        this.isActive = isActive;
        this.dateJoined = dateJoined;
        this.avatar = avatar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public boolean getIsSuperuser() {
        return isSuperuser;
    }

    public void setIsSuperuser(boolean isSuperuser) {
        this.isSuperuser = isSuperuser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getIsStaff() {
        return isStaff;
    }

    public void setIsStaff(boolean isStaff) {
        this.isStaff = isStaff;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public Date getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(Date dateJoined) {
        this.dateJoined = dateJoined;
    }

    public Date getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Date namSinh) {
        this.namSinh = namSinh;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Long getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(Long tienLuong) {
        this.tienLuong = tienLuong;
    }

    public Double getDiemUyTin() {
        return diemUyTin;
    }

    public void setDiemUyTin(Double diemUyTin) {
        this.diemUyTin = diemUyTin;
    }

    public Boolean getThuViec() {
        return thuViec;
    }

    public void setThuViec(Boolean thuViec) {
        this.thuViec = thuViec;
    }

    public Integer getChuyenDaLai() {
        return chuyenDaLai;
    }

    public void setChuyenDaLai(Integer chuyenDaLai) {
        this.chuyenDaLai = chuyenDaLai;
    }

    public Integer getDoThanThiet() {
        return doThanThiet;
    }

    public void setDoThanThiet(Integer doThanThiet) {
        this.doThanThiet = doThanThiet;
    }

    public Integer getSoVeDaDat() {
        return soVeDaDat;
    }

    public void setSoVeDaDat(Integer soVeDaDat) {
        this.soVeDaDat = soVeDaDat;
    }

    @XmlTransient
    public Collection<QuanlyDanhgia> getQuanlyDanhgiaCollection() {
        return quanlyDanhgiaCollection;
    }

    public void setQuanlyDanhgiaCollection(Collection<QuanlyDanhgia> quanlyDanhgiaCollection) {
        this.quanlyDanhgiaCollection = quanlyDanhgiaCollection;
    }

    public QuanlyBenxe getBenXeid() {
        return benXeid;
    }

    public void setBenXeid(QuanlyBenxe benXeid) {
        this.benXeid = benXeid;
    }

    @XmlTransient
    public Collection<QuanlyChitieu> getQuanlyChitieuCollection() {
        return quanlyChitieuCollection;
    }

    public void setQuanlyChitieuCollection(Collection<QuanlyChitieu> quanlyChitieuCollection) {
        this.quanlyChitieuCollection = quanlyChitieuCollection;
    }

    @XmlTransient
    public Collection<QuanlyChitieu> getQuanlyChitieuCollection1() {
        return quanlyChitieuCollection1;
    }

    public void setQuanlyChitieuCollection1(Collection<QuanlyChitieu> quanlyChitieuCollection1) {
        this.quanlyChitieuCollection1 = quanlyChitieuCollection1;
    }

    @XmlTransient
    public Collection<QuanlyChuyen> getQuanlyChuyenCollection() {
        return quanlyChuyenCollection;
    }

    public void setQuanlyChuyenCollection(Collection<QuanlyChuyen> quanlyChuyenCollection) {
        this.quanlyChuyenCollection = quanlyChuyenCollection;
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
        if (!(object instanceof QuanlyUser)) {
            return false;
        }
        QuanlyUser other = (QuanlyUser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.qldatve.pojo.QuanlyUser[ id=" + id + " ]";
    }
    
}
