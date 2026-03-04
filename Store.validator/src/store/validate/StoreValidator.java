package store.validate;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.ocl.pivot.validation.ComposedEValidator;
// See below
//import org.eclipse.ocl.pivot.validation.ValidationRegistryAdapter;
import org.eclipse.ocl.xtext.completeocl.validation.CompleteOCLEObjectValidator;

import store.StorePackage;

public class StoreValidator {

	public static void main(String[] args) {
		org.eclipse.ocl.xtext.completeocl.CompleteOCLStandaloneSetup.doSetup();
		
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put( StorePackage.eNS_URI, StorePackage.eINSTANCE );
		
		
		URI storeUri = URI.createFileURI( new File( "data/My.store" ).getAbsolutePath() );
		Resource storeResource = resourceSet.getResource( storeUri, true );
		
		URI oclUri = URI.createFileURI( new File( "data/My.ocl" ).getAbsolutePath() );
		CompleteOCLEObjectValidator validator = new CompleteOCLEObjectValidator( StorePackage.eINSTANCE, oclUri );
		
		// Up to 2023-09
		ComposedEValidator composedValidator = ComposedEValidator.install( StorePackage.eINSTANCE );
		composedValidator.addChild( validator );
		
		Diagnostician diagnostician = new Diagnostician();
		
		// Since 2023-12, ComposedEValidator.install is deprecated (but still works even if an error message is displayed)
		// The following can be used instead
//		ValidationRegistryAdapter adapter = ValidationRegistryAdapter.getAdapter( resourceSet );
//        adapter.put( StorePackage.eINSTANCE, validator );
//        
//        Diagnostician diagnostician = new Diagnostician( adapter );
        
        Diagnostic diagnostics = diagnostician.validate( storeResource.getContents().get( 0 ), new HashMap<>() );
        for( Iterator< Diagnostic > i = diagnostics.getChildren().iterator(); i.hasNext(); ) {
        	Diagnostic diagnostic = i.next();
            if( diagnostic.getSeverity() != Diagnostic.OK ) {
                System.out.println( diagnostic.getMessage() );
                for (Diagnostic child : diagnostic.getChildren()) {
                    System.out.println( child.getMessage() );
                }
            }
        }        
	}

}
