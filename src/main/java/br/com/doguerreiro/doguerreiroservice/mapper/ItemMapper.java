package br.com.doguerreiro.doguerreiroservice.mapper;

import br.com.doguerreiro.doguerreiroservice.api.request.ItemRequest;
import br.com.doguerreiro.doguerreiroservice.entity.Item;

import java.util.List;
import java.util.stream.Collectors;

public class ItemMapper {
    public static List<Item> map(List<ItemRequest> requestList) {
        return requestList.stream().map(ItemMapper::map).collect(Collectors.toList());
    }

    private static Item map(ItemRequest request) {
        return Item.builder()
                .sabor(request.getSabor())
                .build();
    }
}
