package com.flydean.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author wayne
 * @version TransactionFilter,  2020/2/6 7:47 下午
 */
@Slf4j
@Component
@Order(1)
public class TransactionFilter implements Filter {

    @Override
    public void doFilter(
    ServletRequest request,
    ServletResponse response,
    FilterChain chain) throws IOException, ServletException

    {

        HttpServletRequest req = (HttpServletRequest) request;
        log.info(
                "Starting a transaction for req : {}",
                req.getRequestURI());

        chain.doFilter(request, response);
        log.info(
                "Committing a transaction for req : {}",
                req.getRequestURI());
    }

    // other methods
}
