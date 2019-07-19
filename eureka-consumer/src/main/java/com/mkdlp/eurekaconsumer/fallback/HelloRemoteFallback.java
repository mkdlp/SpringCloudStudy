package com.mkdlp.eurekaconsumer.fallback;

import com.mkdlp.eurekaconsumer.remote.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloRemoteFallback implements HelloRemote {

    @Override
    public String hello(@RequestParam(value = "name")String name) {
        return "服务降级";
    }
}
