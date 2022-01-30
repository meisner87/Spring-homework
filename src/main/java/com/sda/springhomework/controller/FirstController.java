package com.sda.springhomework.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@Slf4j
@RequestMapping("/first")


public class FirstController {


    @GetMapping("/my-first-page")
    public String firstPage() {
        log.info("My page method() is called!!!");
        return "my-first-page";
    }


    @GetMapping("my-data")

    public String myData(@RequestParam(value = "name", defaultValue = "Andreas") String name,
                         @RequestParam(value = "heightInCm", defaultValue = "197") String heightInCm,
                         @RequestParam(value = "weightInKg", defaultValue = "102") String weightInKg,
                         Model pageParameters) {
        log.info("myData method was called!!!");
        log.info("my name is: [{}]", name);
        log.info("my heightInCm is: [{}]", heightInCm);
        log.info("my weightInKg is: [{}]", weightInKg);
        log.info(String.format("my name is [%s] and my height is: [%s] and i weight [%s]", name, heightInCm, weightInKg));
        pageParameters.addAttribute("myName", name)
                .addAttribute("heightInCm", heightInCm)
                .addAttribute("weightInKg", weightInKg);

        return "/data/my-data";

    }

    {
        log.info("My data method() is called!!!");

    }
}
