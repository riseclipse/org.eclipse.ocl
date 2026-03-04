/**
 */
package store;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link store.CD#getTrackCount <em>Track Count</em>}</li>
 *   <li>{@link store.CD#getSinger <em>Singer</em>}</li>
 * </ul>
 *
 * @see store.StorePackage#getCD()
 * @model
 * @generated
 */
public interface CD extends Product {
	/**
	 * Returns the value of the '<em><b>Track Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track Count</em>' attribute.
	 * @see #isSetTrackCount()
	 * @see #unsetTrackCount()
	 * @see #setTrackCount(int)
	 * @see store.StorePackage#getCD_TrackCount()
	 * @model unsettable="true" ordered="false"
	 * @generated
	 */
	int getTrackCount();

	/**
	 * Sets the value of the '{@link store.CD#getTrackCount <em>Track Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Track Count</em>' attribute.
	 * @see #isSetTrackCount()
	 * @see #unsetTrackCount()
	 * @see #getTrackCount()
	 * @generated
	 */
	void setTrackCount(int value);

	/**
	 * Unsets the value of the '{@link store.CD#getTrackCount <em>Track Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTrackCount()
	 * @see #getTrackCount()
	 * @see #setTrackCount(int)
	 * @generated
	 */
	void unsetTrackCount();

	/**
	 * Returns whether the value of the '{@link store.CD#getTrackCount <em>Track Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Track Count</em>' attribute is set.
	 * @see #unsetTrackCount()
	 * @see #getTrackCount()
	 * @see #setTrackCount(int)
	 * @generated
	 */
	boolean isSetTrackCount();

	/**
	 * Returns the value of the '<em><b>Singer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Singer</em>' reference.
	 * @see #isSetSinger()
	 * @see #unsetSinger()
	 * @see #setSinger(Person)
	 * @see store.StorePackage#getCD_Singer()
	 * @model resolveProxies="false" unsettable="true" ordered="false"
	 * @generated
	 */
	Person getSinger();

	/**
	 * Sets the value of the '{@link store.CD#getSinger <em>Singer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Singer</em>' reference.
	 * @see #isSetSinger()
	 * @see #unsetSinger()
	 * @see #getSinger()
	 * @generated
	 */
	void setSinger(Person value);

	/**
	 * Unsets the value of the '{@link store.CD#getSinger <em>Singer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSinger()
	 * @see #getSinger()
	 * @see #setSinger(Person)
	 * @generated
	 */
	void unsetSinger();

	/**
	 * Returns whether the value of the '{@link store.CD#getSinger <em>Singer</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Singer</em>' reference is set.
	 * @see #unsetSinger()
	 * @see #getSinger()
	 * @see #setSinger(Person)
	 * @generated
	 */
	boolean isSetSinger();

} // CD
