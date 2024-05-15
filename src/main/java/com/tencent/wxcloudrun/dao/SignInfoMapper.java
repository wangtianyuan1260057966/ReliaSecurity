package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.controller.CounterController;
import com.tencent.wxcloudrun.model.Counter;
import com.tencent.wxcloudrun.model.SignInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.Date;
import java.util.List;


@Mapper
public interface SignInfoMapper {
    Logger logger =  LoggerFactory.getLogger(CounterController.class);;
    SignInfo getId(@Param("openId") String openId, @Param("department") String department, @Param("signTime") Date signTime);

    SignInfo getIds(@Param("openId") String openId, @Param("department") String department);

    List<SignInfo> getAll(@Param("company") String company,@Param("signTime") String signTime,@Param("endTime") String endTime,@Param("department") String department);

    List<SignInfo> getExport(@Param("ids") List<String> ids);

    int updateSign(@Param("company") String company,@Param("userName") String userName,@Param("userJob") String userJob,
                   @Param("userSign") String userSign, @Param("signTime") Date signTime,@Param("openId") String openId, @Param("department") String department);
    int createSign(@Param("id") String id,@Param("company") String company,@Param("userName") String userName,@Param("userJob") String userJob,
                        @Param("userSign") String userSign, @Param("signTime") Date signTime,@Param("openId") String openId, @Param("department") String department);

}
