package com.homedev.warmachine.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for dealing with dropdown creation.
 */
public final class DropdownUtil {
	
	/**
	 * Default constructor.
	 */
	private DropdownUtil() {
		
	}
	
	public static List<KeyValueTO> convertListToKeyValues(List<? extends KeyValueConvertable> convertables, boolean addEmptyValue) {
		List<KeyValueTO> keyValues = new ArrayList<KeyValueTO>();
		
		if (addEmptyValue) {
			keyValues.add(new KeyValueTO("", ""));
		}
		
		for (KeyValueConvertable convertable : convertables) {
			keyValues.add(convertable.asKeyValueTO());
		}
		return keyValues;
	}
}
