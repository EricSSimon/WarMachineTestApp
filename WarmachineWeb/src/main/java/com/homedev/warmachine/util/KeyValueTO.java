package com.homedev.warmachine.util;


/**
 * Class representing a dropdown option.
 */
public class KeyValueTO {
	
	private String key;
	private String value;
	
	/**
	 * Default constructor.
	 */
	public KeyValueTO() {
		
	}
	
	/**
	 * Build the dropdown element with the key and value.
	 * @param pKey
	 * @param pValue
	 */
	public KeyValueTO(String pKey, String pValue) {
		key = pKey;
		value = pValue;
	}

	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param pKey the key to set
	 */
	public void setKey(String pKey) {
		key = pKey;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param pValue the value to set
	 */
	public void setValue(String pValue) {
		value = pValue;
	}
}
