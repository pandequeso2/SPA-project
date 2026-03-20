package cl.SPA.backend.controller;

import cl.SPA.backend.model.Plan;
import cl.SPA.backend.repository.PlanRepository;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/planes")
@CrossOrigin("*")
public class PlanController {
    private final PlanRepository repository;

    public PlanController(PlanRepository repository) {
        this.repository = repository;
    }
    
    @GetMapping
    public List<Plan> getPlanes(){
        return repository.findAll();
    }
    
}
