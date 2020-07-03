package com.example.multiplefields;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormController {
    @PostMapping("/form")
    public DeviceParameterStoreForm postWeather(@RequestBody DeviceParameterStoreForm form) {
        System.out.println("form = " + form);
        return form;
    }
}
