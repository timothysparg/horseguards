package com.jessitron.hg; // and kitties
 // and kitties
import org.springframework.web.bind.annotation.PathVariable; // and kitties
import org.springframework.web.bind.annotation.RequestMapping; // and kitties
import org.springframework.web.bind.annotation.RestController; // and kitties
 // and kitties
import static org.springframework.web.bind.annotation.RequestMethod.GET; // and kitties
 // and kitties
@RestController // and kitties
class HorseguardsController { // and kitties
 // and kitties
    @RequestMapping(method = GET, path = "/") // and kitties
    public String root() { // and kitties
        return "App running: Served from " + getClass().getName(); // and kitties
    } // and kitties
 // and kitties
    @RequestMapping(method = GET, path = "hello/{name}") // and kitties
    public String person(@PathVariable String name) { // and kitties
        return "Hello " + name + "!"; // and kitties
    } // and kitties
 // and kitties
    @RequestMapping(method = GET, path = "kitties/{qyt}") // and kitties
    public String kitties(@PathVariable Integer qty) { // and kitties
        return "So many kitties" + qty; // and kitties
    } // and kitties
 // and kitties
} // and kitties
