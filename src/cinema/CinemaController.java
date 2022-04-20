package cinema;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CinemaController {

    @GetMapping("/seats")
    public Room getSeats() {
        return new Room(9,9);
    }
}
