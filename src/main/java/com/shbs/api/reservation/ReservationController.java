package com.shbs.api.reservation;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("reservation")
@RequiredArgsConstructor
public class ReservationController {

    private final ReservationService reservationService;

    @PostMapping
    public ResponseEntity<Reservation> create(@Validated @RequestBody ReservationRequest request) {
        return new ResponseEntity<>(reservationService.create(request), HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public Reservation get(@PathVariable Integer id) {
        return reservationService.get(id);
    }

    @PatchMapping("{id}")
    public Reservation update(@PathVariable Integer id, @Validated @RequestBody ReservationRequest request) {
        return reservationService.update(id, request);
    }

    @PatchMapping("cancel/{id}")
    public Reservation cancel(@PathVariable Integer id) {
        return reservationService.cancel(id);
    }
}
