/*
 * generated by Xtext 2.26.0
 */
package org.example.domainmodel.validation;

import org.eclipse.xtext.validation.Check;
import org.example.domainmodel.domainmodel.DomainmodelPackage;
import org.example.domainmodel.domainmodel.Entity;

public class DomainmodelValidator extends AbstractDomainmodelValidator {
	
	public static final String INVALID_NAME = "invalidName";

	@Check
	public void checkGreetingStartsWithCapital(Entity entityObject) {
		if (!Character.isUpperCase(entityObject.getName().charAt(0))) {
			error("Name should start with a capital",
					DomainmodelPackage.Literals.ABSTRACT_ELEMENT__NAME,
					INVALID_NAME);

		}
	}
	
}
