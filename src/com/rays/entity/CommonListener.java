package com.rays.entity;

import org.springframework.stereotype.Component;

import com.ray.io.Out;

@Component
public class CommonListener implements Listener {

    @Override
    public void listener() {
        Out.p("common listener is listening");
    }

}
