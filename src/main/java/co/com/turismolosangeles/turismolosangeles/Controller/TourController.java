package co.com.turismolosangeles.turismolosangeles.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.turismolosangeles.turismolosangeles.Service.TourService;
import co.com.turismolosangeles.turismolosangeles.model.Tour;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/tours")
public class TourController {

    private final TourService tourService;

    public TourController(TourService tourService) {
        this.tourService = tourService;
    }

    @GetMapping
    public Flux<Tour> getAllTours() {
        return tourService.getAllTours();
    }

    @GetMapping("/{id}")
    public Mono<Tour> getTourById(@PathVariable Long id) {
        return tourService.getTourById(id);
    }

    @PostMapping
    public Mono<Tour> createTour(@RequestBody Tour tour) {
        return tourService.createTour(tour);
    }

    @PutMapping("/{id}")
    public Mono<Tour> updateTour(@PathVariable Long id, @RequestBody Tour tour) {
        return tourService.updateTour(id, tour);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteTour(@PathVariable Long id) {
        return tourService.deleteTour(id);
    }
}
