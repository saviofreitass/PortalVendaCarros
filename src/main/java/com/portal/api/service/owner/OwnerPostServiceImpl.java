package com.portal.api.service.owner;

import com.portal.api.client.CarPostStoreClient;
import com.portal.api.dto.owner.OwnerPostDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class OwnerPostServiceImpl implements OwnerPostService {

    private final CarPostStoreClient carPostStoreClient;

    public OwnerPostServiceImpl(CarPostStoreClient carPostStoreClient) {
        this.carPostStoreClient = carPostStoreClient;
    }

    @Override
    public void createOwnerCar(OwnerPostDTO ownerPostDTO) {
        carPostStoreClient.ownerPostsClient(ownerPostDTO);
    }
}
