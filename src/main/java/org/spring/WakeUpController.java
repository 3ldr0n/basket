package org.spring;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WakeUpController {

    private static final String template = "Wake up, %s...";

    @RequestMapping("/wakeup")
    public String wakeup(@RequestParam(value="name", defaultValue="Neo") String name) {
        return String.format(template, name);
    }
}
