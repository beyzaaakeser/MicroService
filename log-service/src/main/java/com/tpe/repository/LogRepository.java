package com.tpe.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tpe.domain.AppLog;
import org.springframework.stereotype.Repository;

// !!! JpaRepository yerine MongoRepository yazdik...
@Repository
public interface LogRepository extends MongoRepository<AppLog, String> {


}