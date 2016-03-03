package com.wendll.hellworld.web;

import com.wendll.hellworld.model.User;
import com.wendll.hellworld.service.HelloWorldService;
import com.wendll.hellworld.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(WelcomeController.class);
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/user/{name:.+}", method = RequestMethod.GET)
    public ModelAndView user(@PathVariable("name") String name) {

        logger.debug("hello() is executed - $name {}", name);

        ModelAndView model = new ModelAndView();
        model.setViewName("user");

        User user = userService.getUserByName(name);

        model.addObject("name", user.getName());

        return model;

    }
}
