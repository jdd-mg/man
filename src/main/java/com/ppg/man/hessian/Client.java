package com.ppg.man.hessian;

import com.caucho.hessian.client.HessianProxyFactory;
import com.jdd.pushcenter.hessian.dto.PushPushMsgDTO;
import com.jdd.pushcenter.hessian.service.PushCenterService;

import java.net.MalformedURLException;

public class Client {

    private static final String url = "http://localhost:8080/pushCenterService.do";


    public static void main(String[] args) {
        HessianProxyFactory factory = new HessianProxyFactory();
        factory.setConnectTimeout(1000);
        factory.setReadTimeout(2000);
        PushCenterService userHessianRpcService;
        try {
            userHessianRpcService = (PushCenterService) factory.create(PushCenterService.class, url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return;
        }

        PushPushMsgDTO dto = new PushPushMsgDTO();
        dto.setId(1000L);
        userHessianRpcService.savePushPushMsgENT(",,,,", dto);

    }
}
