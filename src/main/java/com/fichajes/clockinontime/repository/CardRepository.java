package com.fichajes.clockinontime.repository;

import com.fichajes.clockinontime.entity.Card;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface CardRepository extends CrudRepository<Card, Long> {
    Card findByDateCard(Date date);
}
