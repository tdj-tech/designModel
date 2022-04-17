package com.tuodfh.chainofresponsibility.servlet;

/**
 * @author tdj
 * 2022/4/17 0017
 * @desc
 */
public class SensitiveFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filter) {
        String s = request.getReqMsg();
        s = s.concat("\r\n").concat("SensitiveFilter request 处理过了.");
        request.setReqMsg(s);
        filter.doFilter(request, response, filter);
        String resMsg = response.getRespMsg();
        resMsg = resMsg.concat("\r\n").concat("SensitiveFilter response 处理过了.");
        response.setRespMsg(resMsg);
    }
}
