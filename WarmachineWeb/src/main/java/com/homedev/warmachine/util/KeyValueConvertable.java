package com.homedev.warmachine.util;


/**
 * Class that can be turned into a KeyValueTO
 */
public interface KeyValueConvertable {
	
	/**
	 * @return the object as a key value to.
	 */
	KeyValueTO asKeyValueTO();
}
