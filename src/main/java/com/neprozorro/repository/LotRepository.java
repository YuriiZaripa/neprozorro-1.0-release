package com.neprozorro.repository;

import com.neprozorro.model.Lot;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface LotRepository extends JpaRepository<Lot, UUID> {
}
