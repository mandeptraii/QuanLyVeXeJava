/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qldatve.service.impl;

import com.qldatve.pojos.Tuyen;
import com.qldatve.repository.TuyenRepository;
import com.qldatve.service.TuyenService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrator
 */
@Service
public class TuyenServiceimpl implements TuyenService {
    @Autowired
    private TuyenRepository tuyenRepository;

    @Override
    public List<Tuyen> getTuyen() {
        return this.tuyenRepository.getTuyen();
    }

    @Override
    public Tuyen getQuanlyTuyenById(int tuyenId) {
        return this.tuyenRepository.getTuyenById(tuyenId);
    }
}
