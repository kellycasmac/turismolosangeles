package co.com.turismolosangeles.turismolosangeles;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import co.com.turismolosangeles.turismolosangeles.Controller.TourController;
import co.com.turismolosangeles.turismolosangeles.Service.TourService;
import co.com.turismolosangeles.turismolosangeles.model.Tour;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class TourControllerTest {

    @Mock
    private TourService tourService;

    @InjectMocks
    private TourController tourController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllTours() {
        when(tourService.getAllTours()).thenReturn(Flux.just(new Tour(), new Tour()));
        tourController.getAllTours();
        verify(tourService, times(1)).getAllTours();
    }

    @Test
    public void testGetTourById() {
        Long tourId = 1L;
        Tour tour = new Tour();
        tour.setId(tourId);
        when(tourService.getTourById(tourId)).thenReturn(Mono.just(tour));
        tourController.getTourById(tourId);
        verify(tourService, times(1)).getTourById(tourId);
    }

    @Test
    public void testCreateTour() {
        Tour tour = new Tour();
        when(tourService.createTour(tour)).thenReturn(Mono.just(tour));
        tourController.createTour(tour);
        verify(tourService, times(1)).createTour(tour);
    }

    @Test
    public void testUpdateTour() {
        Long tourId = 1L;
        Tour tour = new Tour();
        tour.setId(tourId);
        when(tourService.updateTour(tourId, tour)).thenReturn(Mono.just(tour));
        tourController.updateTour(tourId, tour);
        verify(tourService, times(1)).updateTour(tourId, tour);
    }

    @Test
    public void testDeleteTour() {
        Long tourId = 1L;
        when(tourService.deleteTour(tourId)).thenReturn(Mono.empty());
        tourController.deleteTour(tourId);
        verify(tourService, times(1)).deleteTour(tourId);
    }
}