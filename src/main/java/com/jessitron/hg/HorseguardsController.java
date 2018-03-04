package com.jessitron.hg;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
class HorseguardsController {

    @RequestMapping(method = GET, path = "/")
    public String root() {
        return "App running: Served from " + getClass().getName();
    }

    @RequestMapping(method = GET, path = "hello/{name}")
    public String person(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @RequestMapping(method = GET, path = "kitties/{qyt}")
    public String kitties(@PathVariable Integer qty) {
        return "So many kitties" + qty;
    }

}
