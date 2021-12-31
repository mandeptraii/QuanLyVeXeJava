package com.qldatve.pojo;

import com.qldatve.pojo.QuanlyBenxe;
import com.qldatve.pojo.QuanlyChuyen;
import com.qldatve.pojo.QuanlyXebaotri;
import com.qldatve.pojo.QuanlyXevaghe;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-12-31T19:22:40")
@StaticMetamodel(QuanlyXe.class)
public class QuanlyXe_ { 

    public static volatile SingularAttribute<QuanlyXe, Integer> gheDaDat;
    public static volatile SingularAttribute<QuanlyXe, Boolean> daKhoiHanh;
    public static volatile SingularAttribute<QuanlyXe, QuanlyBenxe> quanlyBenxe;
    public static volatile CollectionAttribute<QuanlyXe, QuanlyChuyen> quanlyChuyenCollection;
    public static volatile CollectionAttribute<QuanlyXe, QuanlyXevaghe> quanlyXevagheCollection;
    public static volatile SingularAttribute<QuanlyXe, String> bienSoXe;
    public static volatile CollectionAttribute<QuanlyXe, QuanlyXebaotri> quanlyXebaotriCollection;
    public static volatile SingularAttribute<QuanlyXe, Long> id;

}