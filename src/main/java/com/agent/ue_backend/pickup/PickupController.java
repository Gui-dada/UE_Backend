package com.agent.ue_backend.pickup;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/pickups")
public class PickupController {

    @GetMapping
    public List<String> list() {
        return List.of("test1", "test2", "test3", "test4", "test5");
    }
}
