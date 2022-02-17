package com.qldatve.pojos;

import com.qldatve.pojos.Danhgia;
import com.qldatve.pojos.Tuyen;
import com.qldatve.pojos.Vexe;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-02-17T18:49:29")
@StaticMetamodel(Chuyen.class)
public class Chuyen_ { 

    public static volatile SingularAttribute<Chuyen, String> soLuongVe;
    public static volatile CollectionAttribute<Chuyen, Danhgia> danhgiaCollection;
    public static volatile SingularAttribute<Chuyen, Date> thoiDiemDi;
    public static volatile SingularAttribute<Chuyen, Short> daKhoiHanh;
    public static volatile SingularAttribute<Chuyen, Integer> id;
    public static volatile SingularAttribute<Chuyen, Long> doanhThu;
    public static volatile SingularAttribute<Chuyen, Integer> taiXeid;
    public static volatile SingularAttribute<Chuyen, Tuyen> tuyenid;
    public static volatile CollectionAttribute<Chuyen, Vexe> vexeCollection;

}