package store.validate;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.ocl.pivot.internal.resource.ASResourceFactoryRegistry;
import org.eclipse.ocl.pivot.internal.validation.PivotEObjectValidator;
import org.eclipse.ocl.pivot.utilities.EnvironmentFactory;
import org.eclipse.ocl.pivot.utilities.OCL;
import org.eclipse.ocl.pivot.validation.ValidationRegistryAdapter;
import org.eclipse.ocl.xtext.completeocl.utilities.CompleteOCLLoader;

import store.StorePackage;

public class StoreValidatorBad {

	public static void main(String[] args) {
		org.eclipse.ocl.xtext.completeocl.CompleteOCLStandaloneSetup.doSetup();
		
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put( StorePackage.eNS_URI, StorePackage.eINSTANCE );
		
		URI storeUri = URI.createFileURI( new File( "data/My.store" ).getAbsolutePath() );
		Resource storeResource = resourceSet.getResource( storeUri, true );
		
		URI oclUri = URI.createFileURI( new File( "data/My.ocl" ).getAbsolutePath() );
		
		
		EnvironmentFactory env =  ASResourceFactoryRegistry.INSTANCE.createEnvironmentFactory(OCL.CLASS_PATH, resourceSet, null);
		
		CompleteOCLLoader loader = new CompleteOCLLoader(env) {
			protected boolean error(String primaryMessage, String detailMessage) {
				System.err.printf("Error from CompleteOCLLoader: %s - %s%n", primaryMessage, detailMessage);
				return false;
			}
		};
		
		if (!loader.loadMetamodels()) {
			System.err.println("Loading metamodels failed");
			return;
		}
		
		StringBuilder s = new StringBuilder();
		if (!loader.loadDocument(oclUri, s)) {
			System.err.println("Loading document failed:" + s);
			return;
		}
		
		PivotEObjectValidator validator = new PivotEObjectValidator(null);
		
		ValidationRegistryAdapter adapter = ValidationRegistryAdapter.getAdapter( resourceSet );
        adapter.put( StorePackage.eINSTANCE, validator );
        
        Diagnostician diagnostician = new Diagnostician( adapter );
        
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
        
        System.out.println("end");
	}
}
