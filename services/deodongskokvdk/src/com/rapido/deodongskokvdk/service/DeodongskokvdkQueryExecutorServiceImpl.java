/*Copyright (c) 2019-2020 voyy.com All Rights Reserved.
 This software is the confidential and proprietary information of voyy.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with voyy.com*/
package com.rapido.deodongskokvdk.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wavemaker.runtime.data.dao.query.WMQueryExecutor;
import com.wavemaker.runtime.data.export.ExportOptions;
import com.wavemaker.runtime.data.model.QueryProcedureInput;

import com.rapido.deodongskokvdk.models.query.*;

@Service
public class DeodongskokvdkQueryExecutorServiceImpl implements DeodongskokvdkQueryExecutorService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DeodongskokvdkQueryExecutorServiceImpl.class);

    @Autowired
    @Qualifier("deodongskokvdkWMQueryExecutor")
    private WMQueryExecutor queryExecutor;

    @Transactional(value = "deodongskokvdkTransactionManager", readOnly = true)
    @Override
    public Page<BrandsResponse> executeBrands(Pageable pageable) {
        Map<String, Object> params = new HashMap<>(0);


        return queryExecutor.executeNamedQuery("Brands", params, BrandsResponse.class, pageable);
    }

    @Transactional(value = "deodongskokvdkTransactionManager", timeout = 300, readOnly = true)
    @Override
    public void exportBrands(ExportOptions exportOptions, Pageable pageable, OutputStream outputStream) {
        Map<String, Object> params = new HashMap<>(0);


        QueryProcedureInput queryInput = new QueryProcedureInput("Brands", params, BrandsResponse.class);

        queryExecutor.exportNamedQueryData(queryInput, exportOptions, pageable, outputStream);
    }

    @Transactional(value = "deodongskokvdkTransactionManager", readOnly = true)
    @Override
    public Page<RapidoAccountResponse> executeRapidoAccount(Pageable pageable) {
        Map<String, Object> params = new HashMap<>(0);


        return queryExecutor.executeNamedQuery("RapidoAccount", params, RapidoAccountResponse.class, pageable);
    }

    @Transactional(value = "deodongskokvdkTransactionManager", timeout = 300, readOnly = true)
    @Override
    public void exportRapidoAccount(ExportOptions exportOptions, Pageable pageable, OutputStream outputStream) {
        Map<String, Object> params = new HashMap<>(0);


        QueryProcedureInput queryInput = new QueryProcedureInput("RapidoAccount", params, RapidoAccountResponse.class);

        queryExecutor.exportNamedQueryData(queryInput, exportOptions, pageable, outputStream);
    }

    @Transactional(value = "deodongskokvdkTransactionManager", readOnly = true)
    @Override
    public Page<RapidoResponse> executeRapido(Pageable pageable) {
        Map<String, Object> params = new HashMap<>(0);


        return queryExecutor.executeNamedQuery("Rapido", params, RapidoResponse.class, pageable);
    }

    @Transactional(value = "deodongskokvdkTransactionManager", timeout = 300, readOnly = true)
    @Override
    public void exportRapido(ExportOptions exportOptions, Pageable pageable, OutputStream outputStream) {
        Map<String, Object> params = new HashMap<>(0);


        QueryProcedureInput queryInput = new QueryProcedureInput("Rapido", params, RapidoResponse.class);

        queryExecutor.exportNamedQueryData(queryInput, exportOptions, pageable, outputStream);
    }

}