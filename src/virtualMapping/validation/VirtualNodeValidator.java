/**
 *
 * $Id$
 */
package virtualMapping.validation;

import org.eclipse.emf.common.util.EList;
import requirements.Agent;
import requirements.Container;

/**
 * A sample validator interface for {@link virtualMapping.VirtualNode}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface VirtualNodeValidator {
	boolean validate();

	boolean validateAgents(EList<Agent> value);

	boolean validateAgents(Agent value);
	boolean validateReqContainer(Container value);
}