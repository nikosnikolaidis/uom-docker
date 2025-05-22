package com.example.uom_docker;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @GetMapping()
    public List<String> getItems(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Yaris");
        list.add("Aygo");
        list.add("Corola");
        return list;
    }

}
