package com.qldatve.pojo;

import com.qldatve.pojo.QuanlyUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-12-16T21:15:30")
@StaticMetamodel(QuanlyChitieu.class)
public class QuanlyChitieu_ { 

    public static volatile SingularAttribute<QuanlyChitieu, Date> thoiDiem;
    public static volatile SingularAttribute<QuanlyChitieu, Long> id;
    public static volatile SingularAttribute<QuanlyChitieu, QuanlyUser> nhanVienBanVeid;
    public static volatile SingularAttribute<QuanlyChitieu, QuanlyUser> taiXeid;

}