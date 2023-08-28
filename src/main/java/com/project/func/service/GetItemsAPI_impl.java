package com.project.func.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.project.func.controller.GetItemsAPI;
import com.project.func.entities.Item;

/**
 * Implementation of the GetItemsAPI interface that retrieves items from an
 * external API.
 */

@Service
public class GetItemsAPI_impl implements GetItemsAPI {

	@Autowired
	private RestTemplate restTemplate;

	/**
	 * Retrieves a list of items from an external API.
	 *
	 * @return A list of Item objects retrieved from the API.
	 * @throws RuntimeException If there's an error while retrieving the items or
	 *                          the API response is not successful.
	 */

	@Override
	public List<Item> getItems() {

		String url = "https://www.mocky.io/v2/5817803a1000007d01cc7fc9";
		ResponseEntity<Item[]> resp = restTemplate.getForEntity(url, Item[].class);
		Item[] items = resp.getBody();

		if (resp.getStatusCode() != HttpStatus.OK) {
			throw new RuntimeException("Erro ao obter a lista de itens da API: " + resp.getStatusCode());
		}

		if (items == null || items.length == 0) {
			throw new RuntimeException("A lista de itens está vazia ou não pôde ser obtida.");
		}

		return Arrays.asList(items);
	}
}
