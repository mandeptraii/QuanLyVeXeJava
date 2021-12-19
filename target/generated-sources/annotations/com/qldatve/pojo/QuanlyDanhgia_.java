package com.qldatve.pojo;

import com.qldatve.pojo.QuanlyChuyen;
import com.qldatve.pojo.QuanlyUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-12-18T20:28:23")
@StaticMetamodel(QuanlyDanhgia.class)
public class QuanlyDanhgia_ { 

    public static volatile SingularAttribute<QuanlyDanhgia, QuanlyChuyen> quanlyChuyen;
    public static volatile SingularAttribute<QuanlyDanhgia, Long> id;
    public static volatile SingularAttribute<QuanlyDanhgia, String> noiDung;
    public static volatile SingularAttribute<QuanlyDanhgia, Double> soSao;
    public static volatile SingularAttribute<QuanlyDanhgia, QuanlyUser> nguoiDungid;
    public static volatile SingularAttribute<QuanlyDanhgia, Date> thoiGian;

}