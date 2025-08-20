package com.elu.fruitsservicetwo.repo;

import com.elu.fruitsservicetwo.modal.Fruits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitsRepo extends JpaRepository<Fruits, Integer> {
}
