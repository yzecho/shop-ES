package io.yzecho.springbootelasticsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yzecho
 * @desc
 * @date 09/04/2020 15:18
 */
@Controller
public class IndexController {
    @GetMapping({"/", "/index"})
    public String index() {
        return "index";
    }
}
