/**
 */
package virtualMapping.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import requirements.Agent;

import virtualMapping.VirtualMappingPackage;
import virtualMapping.VirtualNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link virtualMapping.impl.VirtualNodeImpl#getAgents <em>Agents</em>}</li>
 *   <li>{@link virtualMapping.impl.VirtualNodeImpl#getReqContainer <em>Req Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualNodeImpl extends MinimalEObjectImpl.Container implements VirtualNode {
	/**
	 * The cached value of the '{@link #getAgents() <em>Agents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgents()
	 * @generated
	 * @ordered
	 */
	protected EList<Agent> agents;

	/**
	 * The cached value of the '{@link #getReqContainer() <em>Req Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqContainer()
	 * @generated
	 * @ordered
	 */
	protected requirements.Container reqContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VirtualMappingPackage.Literals.VIRTUAL_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Agent> getAgents() {
		if (agents == null) {
			agents = new EObjectContainmentEList<Agent>(Agent.class, this, VirtualMappingPackage.VIRTUAL_NODE__AGENTS);
		}
		return agents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public requirements.Container getReqContainer() {
		return reqContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReqContainer(requirements.Container newReqContainer, NotificationChain msgs) {
		requirements.Container oldReqContainer = reqContainer;
		reqContainer = newReqContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VirtualMappingPackage.VIRTUAL_NODE__REQ_CONTAINER, oldReqContainer, newReqContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReqContainer(requirements.Container newReqContainer) {
		if (newReqContainer != reqContainer) {
			NotificationChain msgs = null;
			if (reqContainer != null)
				msgs = ((InternalEObject)reqContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VirtualMappingPackage.VIRTUAL_NODE__REQ_CONTAINER, null, msgs);
			if (newReqContainer != null)
				msgs = ((InternalEObject)newReqContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VirtualMappingPackage.VIRTUAL_NODE__REQ_CONTAINER, null, msgs);
			msgs = basicSetReqContainer(newReqContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VirtualMappingPackage.VIRTUAL_NODE__REQ_CONTAINER, newReqContainer, newReqContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VirtualMappingPackage.VIRTUAL_NODE__AGENTS:
				return ((InternalEList<?>)getAgents()).basicRemove(otherEnd, msgs);
			case VirtualMappingPackage.VIRTUAL_NODE__REQ_CONTAINER:
				return basicSetReqContainer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VirtualMappingPackage.VIRTUAL_NODE__AGENTS:
				return getAgents();
			case VirtualMappingPackage.VIRTUAL_NODE__REQ_CONTAINER:
				return getReqContainer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VirtualMappingPackage.VIRTUAL_NODE__AGENTS:
				getAgents().clear();
				getAgents().addAll((Collection<? extends Agent>)newValue);
				return;
			case VirtualMappingPackage.VIRTUAL_NODE__REQ_CONTAINER:
				setReqContainer((requirements.Container)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VirtualMappingPackage.VIRTUAL_NODE__AGENTS:
				getAgents().clear();
				return;
			case VirtualMappingPackage.VIRTUAL_NODE__REQ_CONTAINER:
				setReqContainer((requirements.Container)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VirtualMappingPackage.VIRTUAL_NODE__AGENTS:
				return agents != null && !agents.isEmpty();
			case VirtualMappingPackage.VIRTUAL_NODE__REQ_CONTAINER:
				return reqContainer != null;
		}
		return super.eIsSet(featureID);
	}

} //VirtualNodeImpl
