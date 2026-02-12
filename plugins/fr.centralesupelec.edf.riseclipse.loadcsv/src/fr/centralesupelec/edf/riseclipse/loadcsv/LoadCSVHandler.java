package fr.centralesupelec.edf.riseclipse.loadcsv;

import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.EnvironmentFactory;
import org.eclipse.ocl.pivot.utilities.ThreadLocalExecutor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISources;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

public class LoadCSVHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		System.out.println("LoadCSV Handler");
		
		Object applicationContext = event.getApplicationContext();
		EditingDomain editingDomain = getEditingDomain(applicationContext);
		ResourceSet resourceSet = getResourceSet(applicationContext);
		
		try {
			resourceSet.createResource(URI.createURI("platform:/resource/StoreData/test.xml")).save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		return null;
	}
	
	public static @Nullable EditingDomain getEditingDomain(@Nullable Object evaluationContext) {
		Object o = HandlerUtil.getVariable(evaluationContext, ISources.ACTIVE_EDITOR_NAME);
		if (!(o instanceof IEditorPart)) {
			return null;
		}
		IEditingDomainProvider editor = ClassUtil.getAdapter((IEditorPart)o, IEditingDomainProvider.class);
		if (editor == null) {
			return null;
		}
		EditingDomain editingDomain = editor.getEditingDomain();
		if (editingDomain == null) {
			return null;
		}
		return editingDomain;
	}

	public static @Nullable ResourceSet getResourceSet(@Nullable Object evaluationContext) {
		Object o = HandlerUtil.getVariable(evaluationContext, ISources.ACTIVE_EDITOR_NAME);
		if (!(o instanceof IEditorPart)) {
			return null;
		}
		IEditingDomainProvider editingDomainProvider = ClassUtil.getAdapter((IEditorPart)o, IEditingDomainProvider.class);
		if (editingDomainProvider != null) {
			EditingDomain editingDomain = editingDomainProvider.getEditingDomain();
			if (editingDomain == null) {
				return null;
			}
			ResourceSet resourceSet = editingDomain.getResourceSet();
			return resourceSet;
		}
		XtextEditor xtextEditor = ClassUtil.getAdapter((IEditorPart)o, XtextEditor.class);
		if (xtextEditor != null) {
			IXtextDocument document = xtextEditor.getDocument();
			ResourceSet resourceSet = document.readOnly(new IUnitOfWork<ResourceSet, XtextResource>() {
				@Override
				public ResourceSet exec(@Nullable XtextResource xtextResource) {
					if (xtextResource == null) {
						return null;
					}
					EnvironmentFactory environmentFactory = ThreadLocalExecutor.basicGetEnvironmentFactory();
					if (environmentFactory != null) {
						return environmentFactory.getResourceSet();
					}
					else {
						return xtextResource.getResourceSet();
					}
				}
			});
			return resourceSet;
		}
		return null;
	}
}
