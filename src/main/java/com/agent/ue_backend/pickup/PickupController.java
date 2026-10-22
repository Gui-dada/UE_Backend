package com.agent.ue_backend.pickup;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/pickups")
public class PickupController {

    @GetMapping
    public List<String> list() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("E:/CODING/ai_agent_FBend/UE_LearnFiles/p5_a6_items.json"));
        List<String> names = new ArrayList<>();
        for (JsonNode item : root.get("items")) {
            names.add(item.get("name").asText());
        }
        return names;
    }
}
