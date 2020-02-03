package com.flydean;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

/**
 * @author wayne
 * @version TerminateBean,  2020/2/3 11:09 下午
 */
@Component
public class TerminateBean {

    @PreDestroy
    public void onDestroy() throws Exception {
        System.out.println("Spring Container is destroyed!");
    }
}
