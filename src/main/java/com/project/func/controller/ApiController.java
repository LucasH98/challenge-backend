package com.project.func.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.func.entities.Item;
import com.project.func.service.ApiService;

@RestController
@RequestMapping(value = "/challenge-backend")
public class ApiController {

	private ApiService api;

	public ApiController() {

	}

	/**
	 * Constructor that performs dependency injection of the ApiService.
	 *
	 * @param api The ApiService responsible for processing requests related to
	 *            items.
	 */

	@Autowired
	public ApiController(ApiService api) {
		this.api = api;
	}

	/**
	 * Endpoint for retrieving a list of items filtered by a date range.
	 *
	 * @param beginDate The start date of the range (format: dd-MM-yyyy).
	 * @param endDate   The end date of the range (format: dd-MM-yyyy).
	 * @return A list of items filtered by the date range.
	 */

	@GetMapping(value = "/item")
	public List<Item> getItens(
			@RequestParam(value = "begindate") @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate beginDate,
			@RequestParam(value = "finaldate") @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate endDate) {

		return api.getFiltredItems(beginDate, endDate);

	}

}
