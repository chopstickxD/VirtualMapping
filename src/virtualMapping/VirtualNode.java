/**
 */
package virtualMapping;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import requirements.Agent;
import requirements.Container;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link virtualMapping.VirtualNode#getAgents <em>Agents</em>}</li>
 *   <li>{@link virtualMapping.VirtualNode#getReqContainer <em>Req Container</em>}</li>
 * </ul>
 *
 * @see virtualMapping.VirtualMappingPackage#getVirtualNode()
 * @model
 * @generated
 */
public interface VirtualNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Agents</b></em>' containment reference list.
	 * The list contents are of type {@link requirements.Agent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agents</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agents</em>' containment reference list.
	 * @see virtualMapping.VirtualMappingPackage#getVirtualNode_Agents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Agent> getAgents();

	/**
	 * Returns the value of the '<em><b>Req Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req Container</em>' containment reference.
	 * @see #setReqContainer(Container)
	 * @see virtualMapping.VirtualMappingPackage#getVirtualNode_ReqContainer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Container getReqContainer();

	/**
	 * Sets the value of the '{@link virtualMapping.VirtualNode#getReqContainer <em>Req Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Req Container</em>' containment reference.
	 * @see #getReqContainer()
	 * @generated
	 */
	void setReqContainer(Container value);

} // VirtualNode
