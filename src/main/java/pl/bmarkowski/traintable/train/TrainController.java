package pl.bmarkowski.traintable.train;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TrainController {
    private final TrainService trainService;

    @GetMapping(path = "/trains", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Train> index() {
        return trainService.getAllTrains();
    }
}
