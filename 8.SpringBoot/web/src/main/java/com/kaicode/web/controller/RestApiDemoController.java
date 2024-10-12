package com.kaicode.web.controller;

import com.kaicode.web.Coffee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/")
public class RestApiDemoController {
    private List<Coffee> coffees = new ArrayList<>();

    public RestApiDemoController() {
        coffees.addAll(List.of(
                new Coffee("Cafe Cereza"),
                new Coffee("Cafe Ganador"),
                new Coffee("Cafe Lareno"),
                new Coffee("Cafe Tres Pontas")
        ));
    }

    @GetMapping("./coffees")
    Iterable<Coffee> getCoffees(){
        return coffees;
    }

    //若想要檢索特定單一咖啡，指定路徑中{id}部分唯一個URL變數，以@PathVariable來註釋他，其值就會經由id參數傳遞給GetCoffeeById方法
    @GetMapping("./coffees/{id}")
    Optional<Coffee> getCoffeeById(@PathVariable String id) {
        for(Coffee c: coffees){
            if(c.getId().equals(id)){
                return Optional.of(c);
            }
        }
        return Optional.empty();
    }

    @PostMapping("./coffees"){
        Coffee postCoffee(@RequestBody Coffee coffee){
            coffees.add(coffees);
        }
    }

}
