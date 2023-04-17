package com.diegosst.raidservice.controller;

import openapi.controller.RaidApi;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

@RestController
public class RaidController implements RaidApi {

    private final NativeWebRequest request;

    public RaidController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }
}
