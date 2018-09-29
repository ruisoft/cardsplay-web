package com.cardspaly.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.cardspaly.web.entity.Log;

/**
 * @Project: cardspaly
 * @Description 系统日志Repository接口
 * @author silence
 * @date 2018年9月25日
 * @version V1.0
 */

public interface LogRepository extends JpaRepository<Log, Integer>,JpaSpecificationExecutor<Log>{

	
}
