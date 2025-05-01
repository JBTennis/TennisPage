package com.JoshBaarTennis.TennisPage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainScreenController {

    @GetMapping(path = "/mainscreen")
    public String mainScreen() {
        return "Josh Baar Tennis";
    }
}
