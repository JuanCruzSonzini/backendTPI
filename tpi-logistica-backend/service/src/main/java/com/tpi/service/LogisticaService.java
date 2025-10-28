package com.tpi.service;

import org.springframework.stereotype.Service;
import com.tpi.common.Constants;

@Service
public class LogisticaService {
    public String info() {
        return "Servicio de logística para " + Constants.APP_NAME;
    }
}
