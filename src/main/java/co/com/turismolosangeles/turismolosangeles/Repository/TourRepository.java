package co.com.turismolosangeles.turismolosangeles.Repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import co.com.turismolosangeles.turismolosangeles.model.Tour;

public interface TourRepository extends ReactiveCrudRepository<Tour, Long> {
}