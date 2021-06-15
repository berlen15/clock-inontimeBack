package com.fichajes.clockinontime.repository;

import com.fichajes.clockinontime.entity.ClockingTime;
import org.springframework.data.repository.CrudRepository;

public interface ClockingTimeRepository extends CrudRepository<ClockingTime, Long> {
}
