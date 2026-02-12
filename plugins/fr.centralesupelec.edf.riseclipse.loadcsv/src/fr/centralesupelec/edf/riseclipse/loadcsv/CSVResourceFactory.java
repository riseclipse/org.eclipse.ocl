package fr.centralesupelec.edf.riseclipse.loadcsv;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;

public class CSVResourceFactory implements Factory {

	public CSVResourceFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Resource createResource(URI uri) {
		System.out.println("Hello !");
		return new CSVResource(uri);
	}

}
