/**
 */
package store.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import store.CD;
import store.Person;
import store.StorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link store.impl.CDImpl#getTrackCount <em>Track Count</em>}</li>
 *   <li>{@link store.impl.CDImpl#getSinger <em>Singer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CDImpl extends ProductImpl implements CD {
	/**
	 * The default value of the '{@link #getTrackCount() <em>Track Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackCount()
	 * @generated
	 * @ordered
	 */
	protected static final int TRACK_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTrackCount() <em>Track Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackCount()
	 * @generated
	 * @ordered
	 */
	protected int trackCount = TRACK_COUNT_EDEFAULT;

	/**
	 * This is true if the Track Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean trackCountESet;

	/**
	 * The cached value of the '{@link #getSinger() <em>Singer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSinger()
	 * @generated
	 * @ordered
	 */
	protected Person singer;

	/**
	 * This is true if the Singer reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean singerESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.CD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTrackCount() {
		return trackCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackCount(int newTrackCount) {
		int oldTrackCount = trackCount;
		trackCount = newTrackCount;
		boolean oldTrackCountESet = trackCountESet;
		trackCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.CD__TRACK_COUNT, oldTrackCount, trackCount, !oldTrackCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTrackCount() {
		int oldTrackCount = trackCount;
		boolean oldTrackCountESet = trackCountESet;
		trackCount = TRACK_COUNT_EDEFAULT;
		trackCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StorePackage.CD__TRACK_COUNT, oldTrackCount, TRACK_COUNT_EDEFAULT, oldTrackCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTrackCount() {
		return trackCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getSinger() {
		return singer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSinger(Person newSinger) {
		Person oldSinger = singer;
		singer = newSinger;
		boolean oldSingerESet = singerESet;
		singerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.CD__SINGER, oldSinger, singer, !oldSingerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSinger() {
		Person oldSinger = singer;
		boolean oldSingerESet = singerESet;
		singer = null;
		singerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StorePackage.CD__SINGER, oldSinger, null, oldSingerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSinger() {
		return singerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StorePackage.CD__TRACK_COUNT:
				return getTrackCount();
			case StorePackage.CD__SINGER:
				return getSinger();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StorePackage.CD__TRACK_COUNT:
				setTrackCount((Integer)newValue);
				return;
			case StorePackage.CD__SINGER:
				setSinger((Person)newValue);
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
			case StorePackage.CD__TRACK_COUNT:
				unsetTrackCount();
				return;
			case StorePackage.CD__SINGER:
				unsetSinger();
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
			case StorePackage.CD__TRACK_COUNT:
				return isSetTrackCount();
			case StorePackage.CD__SINGER:
				return isSetSinger();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (trackCount: ");
		if (trackCountESet) result.append(trackCount); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CDImpl
