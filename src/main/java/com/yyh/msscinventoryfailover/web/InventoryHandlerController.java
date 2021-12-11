package com.yyh.msscinventoryfailover.web;

import com.yyh.msscinventoryfailover.model.BeerInventoryDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RequestMapping("/")
@RestController
public class InventoryHandlerController {

    @GetMapping("inventory-failover")
    public List<BeerInventoryDto> listInventory() {
        List<BeerInventoryDto> list = new ArrayList<>();

        BeerInventoryDto beerInventoryDto = BeerInventoryDto.builder()
                .id(UUID.randomUUID())
                .beerId(UUID.fromString("00000000-0000-0000-0000-000000000000"))
                .quantityOnHand(999)
                .createdDate(OffsetDateTime.now())
                .lastModifiedDate(OffsetDateTime.now())
                .build();

        list.add(beerInventoryDto);

        return list;
    }

}
