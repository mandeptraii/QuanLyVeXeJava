package com.qldatve.pojo;

import com.qldatve.pojo.QuanlyBenxe;
import com.qldatve.pojo.QuanlyChuyen;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-12-16T21:15:30")
@StaticMetamodel(QuanlyTuyen.class)
public class QuanlyTuyen_ { 

    public static volatile SingularAttribute<QuanlyTuyen, Long> giaTien;
    public static volatile SingularAttribute<QuanlyTuyen, QuanlyBenxe> quanlyBenxe;
    public static volatile CollectionAttribute<QuanlyTuyen, QuanlyChuyen> quanlyChuyenCollection;
    public static volatile SingularAttribute<QuanlyTuyen, QuanlyBenxe> quanlyBenxe1;
    public static volatile SingularAttribute<QuanlyTuyen, Long> id;

}