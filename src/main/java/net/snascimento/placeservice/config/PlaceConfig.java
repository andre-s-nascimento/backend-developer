package net.snascimento.placeservice.config;

import net.snascimento.placeservice.domain.PlaceRepository;
import net.snascimento.placeservice.domain.PlaceService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlaceConfig {
  @Bean
  PlaceService placeService(PlaceRepository placeRepository){
    return new PlaceService(placeRepository);
  }
}
