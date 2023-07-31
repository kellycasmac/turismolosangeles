package co.com.turismolosangeles.turismolosangeles.Service;

import co.com.turismolosangeles.turismolosangeles.model.Tour;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TourService {
    Flux<Tour> getAllTours();

    Mono<Tour> getTourById(Long id);

    Mono<Tour> createTour(Tour tour);

    Mono<Tour> updateTour(Long id, Tour tour);

    Mono<Void> deleteTour(Long id);
}