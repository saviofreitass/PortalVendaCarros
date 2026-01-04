package com.portal.api.service.car;

import com.portal.api.client.CarPostStoreClient;
import com.portal.api.dto.car.CarPostDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarPostStoreServiceImpl implements CarPostStoreService {

    private final CarPostStoreClient carPostStoreClient;

    @Override
    public List<CarPostDTO> getCarForSale() {
        return carPostStoreClient.carForSaleClient();
    }

    @Override
    public void changeCarForSale(CarPostDTO carPost, String id) {
        carPostStoreClient.changeCarForSaleClient(carPost, id);
    }

    @Override
    public void removeCarForSale(String id) {
        carPostStoreClient.deleteCarForSaleClient(id);
    }
}
