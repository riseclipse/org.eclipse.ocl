/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /fr.centralesupelec.edf.riseclipse.mathlib/model/mathlib.oclstdlib
 * using:
 *   /fr.centralesupelec.edf.riseclipse.mathlib/model/mathlib.genmodel
 *   org.eclipse.ocl.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package fr.centralesupelec.edf.riseclipse.mathlib.mathlib;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.Operation;
import org.eclipse.ocl.pivot.ParameterTypes;
import org.eclipse.ocl.pivot.PivotPackage;
import org.eclipse.ocl.pivot.Property;
import org.eclipse.ocl.pivot.flat.FlatFragment;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.executor.PartialStandardLibraryImpl;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.types.TemplateParameters;
import org.eclipse.ocl.pivot.utilities.AbstractTables;

/**
 * MathlibTables provides the dispatch tables for the math for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class MathlibTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The overall library of all packages and types.
	 */
	public static final PartialStandardLibraryImpl.@NonNull ReadOnly LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	The AS package for the MathlibPackage.eINSTANCE EPackage.
	 */
	public static final org.eclipse.ocl.pivot.@NonNull Package PACKAGE = LIBRARY.createPackage(MathlibPackage.eINSTANCE);

	/**
	 *	The AS model for the AS package and its additional orphans.
	 */
	public static final AbstractTables.@NonNull BuiltInModel MODEL = LIBRARY.createModel(PACKAGE);

	/**
	 *	The EMF Resource containing the AS model, its AS package and its additional orphans.
	 */
	public static final @NonNull Resource RESOURCE = LIBRARY.createResource(MODEL);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			MathlibTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MathlibTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final org.eclipse.ocl.pivot.@NonNull Class _Real = LIBRARY.createClass(PivotPackage.Literals.PRIMITIVE_TYPE, MathlibPackage.Literals.REAL, TypeId.REAL, 0);

		/*
		 * AS Class indexed by EClassifier.getClassifierID().
		 */
		private static final org.eclipse.ocl.pivot.@NonNull Class @NonNull [] eClassifierID2asClass = {
			/* 0 */ _Real
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			LIBRARY.initPackage(PACKAGE, eClassifierID2asClass);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MathlibTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final @NonNull FlatFragment _Real__OclAny = LIBRARY.createFragment(Types._Real, OCLstdlibTables.Types._OclAny);
		private static final @NonNull FlatFragment _Real__OclComparable = LIBRARY.createFragment(Types._Real, OCLstdlibTables.Types._OclComparable);
		private static final @NonNull FlatFragment _Real__OclElement = LIBRARY.createFragment(Types._Real, OCLstdlibTables.Types._OclElement);
		private static final @NonNull FlatFragment _Real__OclSummable = LIBRARY.createFragment(Types._Real, OCLstdlibTables.Types._OclSummable);
		private static final @NonNull FlatFragment _Real__Real = LIBRARY.createFragment(Types._Real, OCLstdlibTables.Types._Real);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MathlibTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		public static final @NonNull ParameterTypes _OclSelf = new ParameterTypes(OCLstdlibTables.Types._OclSelf);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MathlibTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final @NonNull Operation _Real___mul_ = LIBRARY.createOperation(OCLstdlibTables.Types._Real, "*", Parameters._OclSelf, OCLstdlibTables.Types._Real,
			0 | IsRequired, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.numeric.NumericTimesOperation.INSTANCE);
		public static final @NonNull Operation _Real___add_ = LIBRARY.createOperation(OCLstdlibTables.Types._Real, "+", Parameters._OclSelf, OCLstdlibTables.Types._Real,
			1 | IsRequired, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.numeric.NumericPlusOperation.INSTANCE);
		public static final @NonNull Operation _Real___neg_ = LIBRARY.createOperation(OCLstdlibTables.Types._Real, "-", ParameterTypes.EMPTY_LIST, OCLstdlibTables.Types._Real,
			2 | IsRequired, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.numeric.NumericNegateOperation.INSTANCE);
		public static final @NonNull Operation _Real___sub_ = LIBRARY.createOperation(OCLstdlibTables.Types._Real, "-", Parameters._OclSelf, OCLstdlibTables.Types._Real,
			3 | IsRequired, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.numeric.NumericMinusOperation.INSTANCE);
		public static final @NonNull Operation _Real___div_ = LIBRARY.createOperation(OCLstdlibTables.Types._Real, "/", Parameters._OclSelf, OCLstdlibTables.Types._Real,
			4 | IsInvalidating | IsRequired, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.numeric.NumericDivideOperation.INSTANCE);
		public static final @NonNull Operation _Real___lt__gt_ = LIBRARY.createOperation(OCLstdlibTables.Types._Real, "<>", Parameters._OclSelf, OCLstdlibTables.Types._Boolean,
			5 | IsRequired, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.oclany.OclAnyNotEqualOperation.INSTANCE);
		public static final @NonNull Operation _Real___eq_ = LIBRARY.createOperation(OCLstdlibTables.Types._Real, "=", Parameters._OclSelf, OCLstdlibTables.Types._Boolean,
			6 | IsRequired, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.oclany.OclAnyEqualOperation.INSTANCE);
		public static final @NonNull Operation _Real__abs = LIBRARY.createOperation(OCLstdlibTables.Types._Real, "abs", ParameterTypes.EMPTY_LIST, OCLstdlibTables.Types._Real,
			7 | IsRequired, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.numeric.NumericAbsOperation.INSTANCE);
		public static final @NonNull Operation _Real__floor = LIBRARY.createOperation(OCLstdlibTables.Types._Real, "floor", ParameterTypes.EMPTY_LIST, OCLstdlibTables.Types._Integer,
			8 | IsRequired, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.numeric.NumericFloorOperation.INSTANCE);
		public static final @NonNull Operation _Real__max = LIBRARY.createOperation(OCLstdlibTables.Types._Real, "max", Parameters._OclSelf, OCLstdlibTables.Types._Real,
			9 | IsRequired, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.numeric.NumericMaxOperation.INSTANCE);
		public static final @NonNull Operation _Real__min = LIBRARY.createOperation(OCLstdlibTables.Types._Real, "min", Parameters._OclSelf, OCLstdlibTables.Types._Real,
			10 | IsRequired, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.numeric.NumericMinOperation.INSTANCE);
		public static final @NonNull Operation _Real__round = LIBRARY.createOperation(OCLstdlibTables.Types._Real, "round", ParameterTypes.EMPTY_LIST, OCLstdlibTables.Types._Integer,
			11 | IsRequired, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.numeric.NumericRoundOperation.INSTANCE);
		public static final @NonNull Operation _Real__sin = LIBRARY.createOperation(Types._Real, "sin", ParameterTypes.EMPTY_LIST, OCLstdlibTables.Types._Real,
			12 | IsRequired, TemplateParameters.EMPTY_LIST, fr.centralesupelec.edf.riseclipse.mathlib.SinOperation.INSTANCE);
		public static final @NonNull Operation _Real__toString = LIBRARY.createOperation(OCLstdlibTables.Types._Real, "toString", ParameterTypes.EMPTY_LIST, OCLstdlibTables.Types._String,
			13 | IsRequired, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation.INSTANCE);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MathlibTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MathlibTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final @NonNull FlatFragment @NonNull [] _Real =
			{
				Fragments._Real__OclAny /* 0 */,
				Fragments._Real__OclComparable /* 1 */,
				Fragments._Real__OclElement /* 1 */,
				Fragments._Real__OclSummable /* 1 */,
				Fragments._Real__Real /* 2 */
			};
		private static final int @NonNull [] __Real = { 0,1,4 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Real.initFragments(_Real, __Real, OCLstdlibTables.Types._Real);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MathlibTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final @NonNull Operation @NonNull [] _Real__Real = {
			OCLstdlibTables.Operations._Real___mul_ /* _'*'(OclSelf[1]) */,
			OCLstdlibTables.Operations._Real___add_ /* _'+'(OclSelf[1]) */,
			OCLstdlibTables.Operations._Real___neg_ /* _'-'() */,
			OCLstdlibTables.Operations._Real___sub_ /* _'-'(OclSelf[1]) */,
			OCLstdlibTables.Operations._Real___div_ /* _'/'(OclSelf[1]) */,
			OCLstdlibTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Real___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._Real__abs /* abs() */,
			OCLstdlibTables.Operations._Real__floor /* floor() */,
			OCLstdlibTables.Operations._Real__max /* max(OclSelf[1]) */,
			OCLstdlibTables.Operations._Real__min /* min(OclSelf[1]) */,
			OCLstdlibTables.Operations._Real__round /* round() */,
			Operations._Real__sin /* sin() */,
			OCLstdlibTables.Operations._Real__toString /* toString() */
		};
		private static final @NonNull Operation @NonNull [] _Real__OclAny = {
			OCLstdlibTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Real___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._Real__toString /* toString() */
		};
		private static final @NonNull Operation @NonNull [] _Real__OclComparable = {
			OCLstdlibTables.Operations._OclComparable___lt_ /* _'<'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclComparable___lt__eq_ /* _'<='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclComparable___gt_ /* _'>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclComparable___gt__eq_ /* _'>='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclComparable__compareTo /* compareTo(OclSelf[1]) */
		};
		private static final @NonNull Operation @NonNull [] _Real__OclElement = {
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull Operation @NonNull [] _Real__OclSummable = {
			OCLstdlibTables.Operations._OclSummable__sum /* sum(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclSummable__zero /* zero() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Real__OclAny.initOperations(_Real__OclAny);
			Fragments._Real__OclComparable.initOperations(_Real__OclComparable);
			Fragments._Real__OclElement.initOperations(_Real__OclElement);
			Fragments._Real__OclSummable.initOperations(_Real__OclSummable);
			Fragments._Real__Real.initOperations(_Real__Real);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MathlibTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final @NonNull Property @NonNull [] _Real = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Real__Real.initProperties(_Real);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MathlibTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MathlibTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
					LIBRARY.freeze(RESOURCE);
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new MathlibTables();
	}

	private MathlibTables() {
		super(MathlibPackage.eNS_URI);
	}
}
