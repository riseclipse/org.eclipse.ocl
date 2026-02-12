package org.eclipse.ocl.pivot.library.csv;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.AbstractUntypedTernaryOperation;

import fr.centralesupelec.edf.riseclipse.loadcsv.CSVResource;

public class RealFromCSVOperation extends AbstractUntypedTernaryOperation {
	
	public static final RealFromCSVOperation INSTANCE = new RealFromCSVOperation();

	@Override
	public @Nullable Object evaluate(@NonNull Executor executor,
			@Nullable Object sourceValue, @Nullable Object firstArgumentValue,
			@Nullable Object secondArgumentValue) {
		
		for (Resource resource : executor.getEnvironmentFactory().getUserResourceSet().getResources()) {
			if (resource instanceof CSVResource) {
				System.out.println("found");
				break;
			}
		}

		return firstArgumentValue;
	}

	@Override
	public @Nullable Object evaluate(@NonNull Executor executor,
			@NonNull TypeId returnTypeId, @Nullable Object sourceValue,
			@Nullable Object firstArgumentValue,
			@Nullable Object secondArgumentValue) {
		// TODO Auto-generated method stub
		return evaluate(executor, sourceValue, firstArgumentValue, secondArgumentValue);
	}

	
}
