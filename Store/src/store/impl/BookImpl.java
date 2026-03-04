/**
 */
package store.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import store.Book;
import store.Person;
import store.StorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Book</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link store.impl.BookImpl#getPageCount <em>Page Count</em>}</li>
 *   <li>{@link store.impl.BookImpl#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookImpl extends ProductImpl implements Book {
	/**
	 * The default value of the '{@link #getPageCount() <em>Page Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageCount()
	 * @generated
	 * @ordered
	 */
	protected static final int PAGE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPageCount() <em>Page Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageCount()
	 * @generated
	 * @ordered
	 */
	protected int pageCount = PAGE_COUNT_EDEFAULT;

	/**
	 * This is true if the Page Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pageCountESet;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected Person author;

	/**
	 * This is true if the Author reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean authorESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.BOOK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPageCount() {
		return pageCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageCount(int newPageCount) {
		int oldPageCount = pageCount;
		pageCount = newPageCount;
		boolean oldPageCountESet = pageCountESet;
		pageCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.BOOK__PAGE_COUNT, oldPageCount, pageCount, !oldPageCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPageCount() {
		int oldPageCount = pageCount;
		boolean oldPageCountESet = pageCountESet;
		pageCount = PAGE_COUNT_EDEFAULT;
		pageCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StorePackage.BOOK__PAGE_COUNT, oldPageCount, PAGE_COUNT_EDEFAULT, oldPageCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPageCount() {
		return pageCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(Person newAuthor) {
		Person oldAuthor = author;
		author = newAuthor;
		boolean oldAuthorESet = authorESet;
		authorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.BOOK__AUTHOR, oldAuthor, author, !oldAuthorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAuthor() {
		Person oldAuthor = author;
		boolean oldAuthorESet = authorESet;
		author = null;
		authorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StorePackage.BOOK__AUTHOR, oldAuthor, null, oldAuthorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAuthor() {
		return authorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StorePackage.BOOK__PAGE_COUNT:
				return getPageCount();
			case StorePackage.BOOK__AUTHOR:
				return getAuthor();
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
			case StorePackage.BOOK__PAGE_COUNT:
				setPageCount((Integer)newValue);
				return;
			case StorePackage.BOOK__AUTHOR:
				setAuthor((Person)newValue);
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
			case StorePackage.BOOK__PAGE_COUNT:
				unsetPageCount();
				return;
			case StorePackage.BOOK__AUTHOR:
				unsetAuthor();
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
			case StorePackage.BOOK__PAGE_COUNT:
				return isSetPageCount();
			case StorePackage.BOOK__AUTHOR:
				return isSetAuthor();
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
		result.append(" (pageCount: ");
		if (pageCountESet) result.append(pageCount); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BookImpl
