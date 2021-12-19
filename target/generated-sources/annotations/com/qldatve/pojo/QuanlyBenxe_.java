package com.qldatve.pojo;

import com.qldatve.pojo.QuanlyTuyen;
import com.qldatve.pojo.QuanlyUser;
import com.qldatve.pojo.QuanlyXe;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-12-18T20:28:23")
@StaticMetamodel(QuanlyBenxe.class)
public class QuanlyBenxe_ { 

    public static volatile CollectionAttribute<QuanlyBenxe, QuanlyTuyen> quanlyTuyenCollection;
    public static volatile CollectionAttribute<QuanlyBenxe, QuanlyUser> quanlyUserCollection;
    public static volatile CollectionAttribute<QuanlyBenxe, QuanlyTuyen> quanlyTuyenCollection1;
    public static volatile SingularAttribute<QuanlyBenxe, String> diaDiem;
    public static volatile SingularAttribute<QuanlyBenxe, Long> id;
    public static volatile CollectionAttribute<QuanlyBenxe, QuanlyXe> quanlyXeCollection;

}