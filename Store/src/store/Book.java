/**
 */
package store;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link store.Book#getPageCount <em>Page Count</em>}</li>
 *   <li>{@link store.Book#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @see store.StorePackage#getBook()
 * @model
 * @generated
 */
public interface Book extends Product {
	/**
	 * Returns the value of the '<em><b>Page Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Count</em>' attribute.
	 * @see #isSetPageCount()
	 * @see #unsetPageCount()
	 * @see #setPageCount(int)
	 * @see store.StorePackage#getBook_PageCount()
	 * @model unsettable="true" ordered="false"
	 * @generated
	 */
	int getPageCount();

	/**
	 * Sets the value of the '{@link store.Book#getPageCount <em>Page Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Count</em>' attribute.
	 * @see #isSetPageCount()
	 * @see #unsetPageCount()
	 * @see #getPageCount()
	 * @generated
	 */
	void setPageCount(int value);

	/**
	 * Unsets the value of the '{@link store.Book#getPageCount <em>Page Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPageCount()
	 * @see #getPageCount()
	 * @see #setPageCount(int)
	 * @generated
	 */
	void unsetPageCount();

	/**
	 * Returns whether the value of the '{@link store.Book#getPageCount <em>Page Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Page Count</em>' attribute is set.
	 * @see #unsetPageCount()
	 * @see #getPageCount()
	 * @see #setPageCount(int)
	 * @generated
	 */
	boolean isSetPageCount();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #isSetAuthor()
	 * @see #unsetAuthor()
	 * @see #setAuthor(Person)
	 * @see store.StorePackage#getBook_Author()
	 * @model resolveProxies="false" unsettable="true" ordered="false"
	 * @generated
	 */
	Person getAuthor();

	/**
	 * Sets the value of the '{@link store.Book#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #isSetAuthor()
	 * @see #unsetAuthor()
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Person value);

	/**
	 * Unsets the value of the '{@link store.Book#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAuthor()
	 * @see #getAuthor()
	 * @see #setAuthor(Person)
	 * @generated
	 */
	void unsetAuthor();

	/**
	 * Returns whether the value of the '{@link store.Book#getAuthor <em>Author</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Author</em>' reference is set.
	 * @see #unsetAuthor()
	 * @see #getAuthor()
	 * @see #setAuthor(Person)
	 * @generated
	 */
	boolean isSetAuthor();

} // Book
