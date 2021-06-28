package com.taoji666.gataway.service.fallback;

import org.springframework.stereotype.Component;

@Component
public class GlobeFallbackService {
    public String errorMsg() {
        String msg = "服务暂时不能使用";
        return msg;
    }

}
