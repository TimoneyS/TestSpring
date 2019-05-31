package com.rays.entity.old;

import org.springframework.stereotype.Component;

import com.rays.common.Log;

@Component
public class CommonListener implements Listener {

    @Override
    public void listener() {
        Log.p("common listener is listening");
    }

}
