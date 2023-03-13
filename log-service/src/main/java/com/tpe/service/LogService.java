package com.tpe.service;

import com.tpe.domain.AppLog;
import com.tpe.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogService {

    @Autowired
    private LogRepository logRepository;

    public void saveLog(AppLog appLog) {
        logRepository.save(appLog);
    }
}
