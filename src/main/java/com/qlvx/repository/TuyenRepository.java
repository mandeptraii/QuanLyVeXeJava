/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.qldatve.repository;

import com.qldatve.pojo.QuanlyTuyen;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface TuyenRepository {
    List<QuanlyTuyen> getTuyen();
    QuanlyTuyen getQuanlyTuyenById(int tuyenId);
}
