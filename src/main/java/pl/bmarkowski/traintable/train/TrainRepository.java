package pl.bmarkowski.traintable.train;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TrainRepository extends JpaRepository<Train, UUID> {
}
