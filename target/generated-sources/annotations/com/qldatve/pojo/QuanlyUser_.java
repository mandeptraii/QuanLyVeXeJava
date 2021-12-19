package com.qldatve.pojo;

import com.qldatve.pojo.QuanlyBenxe;
import com.qldatve.pojo.QuanlyChitieu;
import com.qldatve.pojo.QuanlyChuyen;
import com.qldatve.pojo.QuanlyDanhgia;
import com.qldatve.pojo.QuanlyVexe;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-12-18T20:28:23")
@StaticMetamodel(QuanlyUser.class)
public class QuanlyUser_ { 

    public static volatile SingularAttribute<QuanlyUser, QuanlyBenxe> benXeid;
    public static volatile SingularAttribute<QuanlyUser, Date> lastLogin;
    public static volatile SingularAttribute<QuanlyUser, String> lastName;
    public static volatile SingularAttribute<QuanlyUser, Date> dateJoined;
    public static volatile CollectionAttribute<QuanlyUser, QuanlyDanhgia> quanlyDanhgiaCollection;
    public static volatile SingularAttribute<QuanlyUser, Boolean> isSuperuser;
    public static volatile CollectionAttribute<QuanlyUser, QuanlyChitieu> quanlyChitieuCollection1;
    public static volatile SingularAttribute<QuanlyUser, Boolean> isActive;
    public static volatile SingularAttribute<QuanlyUser, Long> tienLuong;
    public static volatile SingularAttribute<QuanlyUser, Date> namSinh;
    public static volatile SingularAttribute<QuanlyUser, String> password;
    public static volatile SingularAttribute<QuanlyUser, Integer> soVeDaDat;
    public static volatile CollectionAttribute<QuanlyUser, QuanlyVexe> quanlyVexeCollection;
    public static volatile SingularAttribute<QuanlyUser, Boolean> thuViec;
    public static volatile SingularAttribute<QuanlyUser, Long> id;
    public static volatile SingularAttribute<QuanlyUser, String> email;
    public static volatile CollectionAttribute<QuanlyUser, QuanlyChitieu> quanlyChitieuCollection;
    public static volatile SingularAttribute<QuanlyUser, Boolean> isStaff;
    public static volatile CollectionAttribute<QuanlyUser, QuanlyChuyen> quanlyChuyenCollection;
    public static volatile SingularAttribute<QuanlyUser, Integer> doThanThiet;
    public static volatile SingularAttribute<QuanlyUser, String> avatar;
    public static volatile SingularAttribute<QuanlyUser, String> firstName;
    public static volatile SingularAttribute<QuanlyUser, Integer> chuyenDaLai;
    public static volatile SingularAttribute<QuanlyUser, Double> diemUyTin;
    public static volatile SingularAttribute<QuanlyUser, String> username;

}