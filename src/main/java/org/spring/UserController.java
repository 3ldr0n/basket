package org.spring;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value="/user", method=RequestMethod.GET)
    public User user(@RequestParam(value="name", defaultValue="michael") String name) {
        return new User(counter.incrementAndGet(), name);
    }

}
