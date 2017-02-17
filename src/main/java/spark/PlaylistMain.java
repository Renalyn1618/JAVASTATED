package com.sample.sparkdemo;

import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;
import static spark.Spark.*;


public class DemoMain {

    public static void main(String[] args) {
        staticFiles.location("/css"); // Static files
        
        get("/hello", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("title","Welcome to ShareMyPlaylist");
            model.put("message", "Page under construction");
            return new ModelAndView(model, "hello.ftl"); // located in src/main/resources/freemarker
        }, new FreeMarkerEngine());
    }
}
