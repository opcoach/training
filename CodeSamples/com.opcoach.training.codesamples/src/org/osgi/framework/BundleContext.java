package org.osgi.framework;

public interface BundleContext {
	
	
	

	public ServiceReference[] getAllServiceReferences(String clazz, String filter) throws InvalidSyntaxException;

	
	
	
}
