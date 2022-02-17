/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.qldatve.service;

import com.qldatve.pojos.Tuyen;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface TuyenService {
    List<Tuyen> getTuyen();
    Tuyen getQuanlyTuyenById(int tuyenId);
    
}
