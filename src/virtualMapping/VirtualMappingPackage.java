/**
 */
package virtualMapping;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see virtualMapping.VirtualMappingFactory
 * @model kind="package"
 * @generated
 */
public interface VirtualMappingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "virtualMapping";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/VirtualMapping/model/virtualMapping.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "virtualMapping";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VirtualMappingPackage eINSTANCE = virtualMapping.impl.VirtualMappingPackageImpl.init();

	/**
	 * The meta object id for the '{@link virtualMapping.impl.VirtualNodeImpl <em>Virtual Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see virtualMapping.impl.VirtualNodeImpl
	 * @see virtualMapping.impl.VirtualMappingPackageImpl#getVirtualNode()
	 * @generated
	 */
	int VIRTUAL_NODE = 0;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE__AGENTS = 0;

	/**
	 * The feature id for the '<em><b>Req Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE__REQ_CONTAINER = 1;

	/**
	 * The number of structural features of the '<em>Virtual Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Virtual Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link virtualMapping.VirtualNode <em>Virtual Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Node</em>'.
	 * @see virtualMapping.VirtualNode
	 * @generated
	 */
	EClass getVirtualNode();

	/**
	 * Returns the meta object for the containment reference list '{@link virtualMapping.VirtualNode#getAgents <em>Agents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agents</em>'.
	 * @see virtualMapping.VirtualNode#getAgents()
	 * @see #getVirtualNode()
	 * @generated
	 */
	EReference getVirtualNode_Agents();

	/**
	 * Returns the meta object for the containment reference '{@link virtualMapping.VirtualNode#getReqContainer <em>Req Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Req Container</em>'.
	 * @see virtualMapping.VirtualNode#getReqContainer()
	 * @see #getVirtualNode()
	 * @generated
	 */
	EReference getVirtualNode_ReqContainer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VirtualMappingFactory getVirtualMappingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link virtualMapping.impl.VirtualNodeImpl <em>Virtual Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see virtualMapping.impl.VirtualNodeImpl
		 * @see virtualMapping.impl.VirtualMappingPackageImpl#getVirtualNode()
		 * @generated
		 */
		EClass VIRTUAL_NODE = eINSTANCE.getVirtualNode();

		/**
		 * The meta object literal for the '<em><b>Agents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_NODE__AGENTS = eINSTANCE.getVirtualNode_Agents();

		/**
		 * The meta object literal for the '<em><b>Req Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_NODE__REQ_CONTAINER = eINSTANCE.getVirtualNode_ReqContainer();

	}

} //VirtualMappingPackage
