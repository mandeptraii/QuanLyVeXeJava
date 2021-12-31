package com.qldatve.pojo;

import com.qldatve.pojo.QuanlyDanhgia;
import com.qldatve.pojo.QuanlyTuyen;
import com.qldatve.pojo.QuanlyUser;
import com.qldatve.pojo.QuanlyVexe;
import com.qldatve.pojo.QuanlyXe;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-12-31T19:22:40")
@StaticMetamodel(QuanlyChuyen.class)
public class QuanlyChuyen_ { 

    public static volatile CollectionAttribute<QuanlyChuyen, QuanlyVexe> quanlyVexeCollection;
    public static volatile SingularAttribute<QuanlyChuyen, Date> thoiDiemDi;
    public static volatile SingularAttribute<QuanlyChuyen, Boolean> daKhoiHanh;
    public static volatile SingularAttribute<QuanlyChuyen, QuanlyTuyen> quanlyTuyen;
    public static volatile CollectionAttribute<QuanlyChuyen, QuanlyDanhgia> quanlyDanhgiaCollection;
    public static volatile SingularAttribute<QuanlyChuyen, Long> id;
    public static volatile SingularAttribute<QuanlyChuyen, Long> doanhThu;
    public static volatile SingularAttribute<QuanlyChuyen, Integer> thoiGianDuKien;
    public static volatile SingularAttribute<QuanlyChuyen, QuanlyUser> taiXeid;
    public static volatile SingularAttribute<QuanlyChuyen, QuanlyXe> quanlyXe;

}