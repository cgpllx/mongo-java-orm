package com.googlecode.mjorm;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import com.googlecode.mjorm.convert.JavaType;


/**
 * A descriptor of an object property.
 */
public class PropertyDescriptor {

	private String name;
	private Map<String, Object> conversionHints = new HashMap<String, Object>();
	private String fieldName;
	private JavaType type;
	private JavaType storageType;
	private Type[] genericParameterTypes;
	private Method setter;
	private Method getter;
	private boolean isIdentifier;
	private boolean isAutoGenerated;
	private ValueGenerator<?> valueGenerator;

	/**
	 * Sets the value on the given target.
	 * @param target the target
	 * @param value the value
	 * @throws IllegalAccessException on error
	 * @throws InvocationTargetException on error
	 */
	public void set(Object target, Object value)
		throws IllegalAccessException,
		InvocationTargetException {
		setter.setAccessible(true);
		setter.invoke(target, value);
	}

	/**
	 * Gets the value on the given target.
	 * @param target the target
	 * @return the value
	 * @throws IllegalAccessException on error
	 * @throws InvocationTargetException on error
	 */
	public Object get(Object target)
		throws IllegalAccessException,
		InvocationTargetException {
		getter.setAccessible(true);
		return getter.invoke(target);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the conversionHints
	 */
	public Map<String, Object> getConversionHints() {
		return conversionHints;
	}

	/**
	 * @param conversionHints the conversionHints to set
	 */
	public void setConversionHints(Map<String, Object> conversionHints) {
		this.conversionHints = conversionHints;
	}

	/**
	 * @return the type
	 */
	public JavaType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(JavaType objectClass) {
		this.type = objectClass;
	}

	/**
	 * @return the storageType
	 */
	public JavaType getStorageType() {
		return storageType;
	}

	/**
	 * @param storageType the storageType to set
	 */
	public void setStorageType(JavaType storageType) {
		this.storageType = storageType;
	}

	/**
	 * @return the setter
	 */
	public Method getSetter() {
		return setter;
	}

	/**
	 * @param setter the setter to set
	 */
	public void setSetter(Method setter) {
		this.setter = setter;
	}

	/**
	 * @return the getter
	 */
	public Method getGetter() {
		return getter;
	}

	/**
	 * @param getter the getter to set
	 */
	public void setGetter(Method getter) {
		this.getter = getter;
	}

	/**
	 * @return the isIdentifier
	 */
	public boolean isIdentifier() {
		return isIdentifier;
	}

	/**
	 * @param isIdentifier the isIdentifier to set
	 */
	public void setIdentifier(boolean isIdentifier) {
		this.isIdentifier = isIdentifier;
	}

	/**
	 * @return the isAutoGenerated
	 */
	public boolean isAutoGenerated() {
		return isAutoGenerated;
	}

	/**
	 * @param isAutoGenerated the isAutoGenerated to set
	 */
	public void setAutoGenerated(boolean isAutoGenerated) {
		this.isAutoGenerated = isAutoGenerated;
	}

	/**
	 * @return the fieldName
	 */
	public String getFieldName() {
		return fieldName;
	}

	/**
	 * @param fieldName the fieldName to set
	 */
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	/**
	 * @return the genericParameterTypes
	 */
	public Type[] getGenericParameterTypes() {
		return genericParameterTypes;
	}

	/**
	 * @param genericParameterTypes the genericParameterTypes to set
	 */
	public void setGenericParameterTypes(Type[] genericParameterTypes) {
		this.genericParameterTypes = genericParameterTypes;
	}

	/**
	 * @return the idGenerator
	 */
	public ValueGenerator<?> getValueGenerator() {
		return valueGenerator;
	}

	/**
	 * @param valueGenerator the valueGenerator to set
	 */
	public void setValueGenerator(ValueGenerator<?> valueGenerator) {
		this.valueGenerator = valueGenerator;
	}

}