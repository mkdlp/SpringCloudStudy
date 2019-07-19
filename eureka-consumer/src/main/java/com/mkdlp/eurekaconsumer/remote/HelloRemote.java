package com.mkdlp.eurekaconsumer.remote;

import com.mkdlp.eurekaconsumer.fallback.HelloRemoteFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="eureka-producer", fallback = HelloRemoteFallback.class)
public interface HelloRemote {

    @GetMapping("/hello/")
    String hello(@RequestParam(value="name")String name);
}
