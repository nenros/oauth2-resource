package pl.bmarkowski.traintable.train;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TrainService {
    private final TrainRepository trainRepository;

    public List<Train> getAllTrains(){
        return trainRepository.findAll();
    }
}
