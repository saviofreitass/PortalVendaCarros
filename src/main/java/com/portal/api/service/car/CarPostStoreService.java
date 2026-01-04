package com.portal.api.service.car;

import com.portal.api.dto.car.CarPostDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarPostStoreService {

    List<CarPostDTO> getCarForSale();

    void changeCarForSale(CarPostDTO carPost, String id);

    void removeCarForSale(String id);
}
