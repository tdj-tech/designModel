package com.tuodfh.chainofresponsibility.servlet;

/**
 * @author tdj
 * 2022/4/17 0017
 * @desc
 */
public class Main {

    public static void main(String[] args) {
        FilterChain fc1 = new FilterChain();
        fc1.addFilter(new HtmlFilter())
                .addFilter(new SensitiveFilter());
        FilterChain fc2 = new FilterChain();
        fc2.addFilter(new SpecialSymbolFilter())
                .addFilter(new UrlFilter());
        fc1.addFilter(fc2);
        Request req = new Request();
        req.setReqMsg("i am a request.");
        Response resp = new Response();
        resp.setRespMsg("i am a response.");
        fc1.doFilter(req, resp, fc1);
        System.out.println(req.getReqMsg());
        System.out.println(resp.getRespMsg());
    }

}
