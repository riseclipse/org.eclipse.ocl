/**
 */
package store;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link store.Store#getProducts <em>Products</em>}</li>
 *   <li>{@link store.Store#getArtists <em>Artists</em>}</li>
 * </ul>
 *
 * @see store.StorePackage#getStore()
 * @model
 * @generated
 */
public interface Store extends EObject {
	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link store.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see #isSetProducts()
	 * @see #unsetProducts()
	 * @see store.StorePackage#getStore_Products()
	 * @model containment="true" unsettable="true" ordered="false"
	 * @generated
	 */
	EList<Product> getProducts();

	/**
	 * Unsets the value of the '{@link store.Store#getProducts <em>Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProducts()
	 * @see #getProducts()
	 * @generated
	 */
	void unsetProducts();

	/**
	 * Returns whether the value of the '{@link store.Store#getProducts <em>Products</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Products</em>' containment reference list is set.
	 * @see #unsetProducts()
	 * @see #getProducts()
	 * @generated
	 */
	boolean isSetProducts();

	/**
	 * Returns the value of the '<em><b>Artists</b></em>' containment reference list.
	 * The list contents are of type {@link store.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artists</em>' containment reference list.
	 * @see #isSetArtists()
	 * @see #unsetArtists()
	 * @see store.StorePackage#getStore_Artists()
	 * @model containment="true" unsettable="true" ordered="false"
	 * @generated
	 */
	EList<Person> getArtists();

	/**
	 * Unsets the value of the '{@link store.Store#getArtists <em>Artists</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArtists()
	 * @see #getArtists()
	 * @generated
	 */
	void unsetArtists();

	/**
	 * Returns whether the value of the '{@link store.Store#getArtists <em>Artists</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Artists</em>' containment reference list is set.
	 * @see #unsetArtists()
	 * @see #getArtists()
	 * @generated
	 */
	boolean isSetArtists();

} // Store
