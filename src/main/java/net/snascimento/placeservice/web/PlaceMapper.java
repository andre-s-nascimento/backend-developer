package net.snascimento.placeservice.web;

import net.snascimento.placeservice.api.PlaceResponse;
import net.snascimento.placeservice.domain.Place;

public class PlaceMapper {
  public static PlaceResponse fromPlaceToResponse(Place place) {
    return new PlaceResponse(place.name(), place.slug(), place.state(), place.createdAt(), place.updatedAt());
  }
}
