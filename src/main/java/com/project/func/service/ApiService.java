package com.project.func.service;

import java.time.LocalDate;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.project.func.controller.GetItemsAPI;
import com.project.func.entities.Item;
import com.project.func.util.DateUtils;

/**
 * The {@code ApiService} class provides methods to interact with external APIs
 * and perform operations on the retrieved data.
 */

@Service
public class ApiService {

	private GetItemsAPI getItemsAPI;

	public ApiService(GetItemsAPI getItemsAPI) {
		this.getItemsAPI = getItemsAPI;
	}

	/**
	 * Retrieves a filtered list of items based on the specified date range.
	 *
	 * @param beginDate The start date of the range
	 * @param endDate   The end date of the range
	 * @return A list of filtered items
	 */

	public List<Item> getFiltredItems(LocalDate beginDate, LocalDate endDate) {
		List<Item> itemList = getItemsAPI.getItems();

		return itemList.stream().filter(item -> {
			LocalDate itemDate = DateUtils.dataConversion(item.getDate());
			return beginDate.equals(itemDate) || endDate.equals(itemDate)
					|| (itemDate.isAfter(beginDate) && itemDate.isBefore(endDate));
		}).collect(Collectors.toList());
	}

}
