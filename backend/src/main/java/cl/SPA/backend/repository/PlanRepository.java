package cl.SPA.backend.repository;

import cl.SPA.backend.model.Plan;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PlanRepository extends JpaRepository<Plan, Long>{
    
}
