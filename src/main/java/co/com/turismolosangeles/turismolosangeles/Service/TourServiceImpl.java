package co.com.turismolosangeles.turismolosangeles.Service;
import org.springframework.stereotype.Service;

import co.com.turismolosangeles.turismolosangeles.Repository.TourRepository;
import co.com.turismolosangeles.turismolosangeles.model.Tour;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TourServiceImpl implements TourService {

    private final TourRepository tourRepository;

    public TourServiceImpl(TourRepository tourRepository) {
        this.tourRepository = tourRepository;
    }

    @Override
    public Flux<Tour> getAllTours() {
        return tourRepository.findAll();
    }

    @Override
    public Mono<Tour> getTourById(Long id) {
        return tourRepository.findById(id);
    }

    @Override
    public Mono<Tour> createTour(Tour tour) {
        return tourRepository.save(tour);
    }

    @Override
    public Mono<Tour> updateTour(Long id, Tour tour) {
        return tourRepository.findById(id)
                .flatMap(existingTour -> {
                    existingTour.setNombre(tour.getNombre());
                    existingTour.setDescripcion(tour.getDescripcion());
                    existingTour.setPrecio(tour.getPrecio());
                    return tourRepository.save(existingTour);
                });
    }

    @Override
    public Mono<Void> deleteTour(Long id) {
        return tourRepository.deleteById(id);
    }
}
