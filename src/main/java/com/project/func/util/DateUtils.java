package com.project.func.util;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * Utility class for date-related operations.
 */

public class DateUtils {

	/**
	 * Converts a text-based date representation to a LocalDate object.
	 *
	 * @param textDate The text-based date representation (in ISO 8601 format).
	 * @return A LocalDate object representing the date extracted from the text.
	 */

	public static LocalDate dataConversion(String textDate) {
		return LocalDateTime.ofInstant(Instant.parse(textDate), ZoneId.systemDefault()).toLocalDate();
	}

}
