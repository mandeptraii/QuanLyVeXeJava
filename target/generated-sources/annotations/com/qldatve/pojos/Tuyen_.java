package com.qldatve.pojos;

import com.qldatve.pojos.Benxe;
import com.qldatve.pojos.Chuyen;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-02-17T18:49:29")
@StaticMetamodel(Tuyen.class)
public class Tuyen_ { 

    public static volatile SingularAttribute<Tuyen, Long> giaTien;
    public static volatile SingularAttribute<Tuyen, Benxe> noiKhoiHanhid;
    public static volatile CollectionAttribute<Tuyen, Chuyen> chuyenCollection;
    public static volatile SingularAttribute<Tuyen, Integer> id;
    public static volatile SingularAttribute<Tuyen, Benxe> noiDenid;

}