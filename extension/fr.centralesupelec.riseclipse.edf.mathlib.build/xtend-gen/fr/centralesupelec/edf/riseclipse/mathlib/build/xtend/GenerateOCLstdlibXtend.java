/**
 * Copyright (c) 2013, 2017 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     E.D.Willink - initial API and implementation
 */
package fr.centralesupelec.edf.riseclipse.mathlib.build.xtend;

import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.eclipse.ocl.pivot.DataType;
import org.eclipse.ocl.pivot.Library;
import org.eclipse.ocl.pivot.Model;
import org.eclipse.ocl.pivot.NormalizedTemplateParameter;
import org.eclipse.ocl.pivot.PrimitiveType;
import org.eclipse.ocl.pivot.internal.manager.Orphanage;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class GenerateOCLstdlibXtend extends GenerateOCLstdlib {
  @Override
  protected String declareClassTypes(final Model root, final Collection<String> excludedEClassifierNames) {
    String _xblockexpression = null;
    {
      Map<org.eclipse.ocl.pivot.Package, List<org.eclipse.ocl.pivot.Class>> pkge2classTypes = this.getSortedClassTypes(root);
      boolean _isEmpty = pkge2classTypes.isEmpty();
      if (_isEmpty) {
        return "";
      }
      org.eclipse.ocl.pivot.Package pkg = this.findPackage(root.getOwnedPackages());
      List<org.eclipse.ocl.pivot.Package> sortedPackages = this.getSortedPackages(root, pkge2classTypes.keySet());
      StringConcatenation _builder = new StringConcatenation();
      {
        for(final org.eclipse.ocl.pivot.Package pkge : sortedPackages) {
          _builder.newLine();
          {
            List<org.eclipse.ocl.pivot.Class> _nullFree = ClassUtil.<org.eclipse.ocl.pivot.Class>nullFree(pkge2classTypes.get(pkge));
            for(final org.eclipse.ocl.pivot.Class type : _nullFree) {
              {
                if ((Objects.equals(pkg, pkge) && (!excludedEClassifierNames.contains(type.getName())))) {
                  _builder.append("\t\t");
                  _builder.append("private final ");
                  String _eClassReference = this.getEClassReference(Boolean.valueOf(true), type);
                  _builder.append(_eClassReference, "\t\t");
                  _builder.append(" ");
                  String _partialName = this.partialName(type);
                  String _plus = ("_" + _partialName);
                  String _prefixedSymbolName = this.getPrefixedSymbolName(type, _plus);
                  _builder.append(_prefixedSymbolName, "\t\t");
                  _builder.append(" = create");
                  String _name = type.eClass().getName();
                  _builder.append(_name, "\t\t");
                  _builder.append("(");
                  String _ecoreLiteral = this.getEcoreLiteral(type);
                  _builder.append(_ecoreLiteral, "\t\t");
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                } else {
                  _builder.append("\t\t");
                  _builder.append("private final ");
                  String _eClassReference_1 = this.getEClassReference(Boolean.valueOf(true), type);
                  _builder.append(_eClassReference_1, "\t\t");
                  _builder.append(" ");
                  String _partialName_1 = this.partialName(type);
                  String _plus_1 = ("_" + _partialName_1);
                  String _prefixedSymbolNameWithoutNormalization = this.getPrefixedSymbolNameWithoutNormalization(type, _plus_1);
                  _builder.append(_prefixedSymbolNameWithoutNormalization, "\t\t");
                  _builder.append(" = create");
                  String _name_1 = type.eClass().getName();
                  _builder.append(_name_1, "\t\t");
                  _builder.append("(\"");
                  String _name_2 = type.getName();
                  _builder.append(_name_2, "\t\t");
                  _builder.append("\");");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
      }
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  @Override
  protected String declarePrimitiveTypes(final Model root) {
    String _xblockexpression = null;
    {
      Map<org.eclipse.ocl.pivot.Package, List<PrimitiveType>> pkge2primitiveTypes = this.getSortedPrimitiveTypes(root);
      boolean _isEmpty = pkge2primitiveTypes.isEmpty();
      if (_isEmpty) {
        return "";
      }
      org.eclipse.ocl.pivot.Package pkg = this.findPackage(root.getOwnedPackages());
      List<org.eclipse.ocl.pivot.Package> sortedPackages = this.getSortedPackages(root, pkge2primitiveTypes.keySet());
      StringConcatenation _builder = new StringConcatenation();
      {
        for(final org.eclipse.ocl.pivot.Package pkge : sortedPackages) {
          _builder.newLine();
          {
            List<PrimitiveType> _nullFree = ClassUtil.<PrimitiveType>nullFree(pkge2primitiveTypes.get(pkge));
            for(final PrimitiveType type : _nullFree) {
              {
                if ((Objects.equals(pkg, pkge) && (!this.excludedEClassifierNames.contains(type.getName())))) {
                  _builder.append("\t\t");
                  _builder.append("private final @NonNull PrimitiveType ");
                  String _partialName = this.partialName(type);
                  String _plus = ("_" + _partialName);
                  String _prefixedSymbolNameWithoutNormalization = this.getPrefixedSymbolNameWithoutNormalization(type, _plus);
                  _builder.append(_prefixedSymbolNameWithoutNormalization, "\t\t");
                  _builder.append(" = createPrimitiveType(");
                  String _ecoreLiteral = this.getEcoreLiteral(type);
                  _builder.append(_ecoreLiteral, "\t\t");
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                } else {
                  _builder.append("\t\t");
                  _builder.append("private final @NonNull PrimitiveType ");
                  String _partialName_1 = this.partialName(type);
                  String _plus_1 = ("_" + _partialName_1);
                  String _prefixedSymbolNameWithoutNormalization_1 = this.getPrefixedSymbolNameWithoutNormalization(type, _plus_1);
                  _builder.append(_prefixedSymbolNameWithoutNormalization_1, "\t\t");
                  _builder.append(" = createPrimitiveType(\"");
                  String _name = type.getName();
                  _builder.append(_name, "\t\t");
                  _builder.append("\");");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
      }
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected String defineConstantType(final DataType type) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _equals = "Boolean".equals(type.getName());
      if (_equals) {
        _builder.append("private void PrimitiveType ");
        String _partialName = this.partialName(type);
        String _plus = ("_" + _partialName);
        String _prefixedSymbolName = this.getPrefixedSymbolName(type, _plus);
        _builder.append(_prefixedSymbolName);
        _builder.append(" = OCLstdlib._Boolean;");
      } else {
        boolean _equals_1 = "Classifier".equals(type.getName());
        if (_equals_1) {
          _builder.newLineIfNotEmpty();
          _builder.append("private void PrimitiveType ");
          String _partialName_1 = this.partialName(type);
          String _plus_1 = ("_" + _partialName_1);
          String _prefixedSymbolName_1 = this.getPrefixedSymbolName(type, _plus_1);
          _builder.append(_prefixedSymbolName_1);
          _builder.append(" = OCLstdlib._Classifier;");
        } else {
          boolean _equals_2 = "Integer".equals(type.getName());
          if (_equals_2) {
            _builder.newLineIfNotEmpty();
            _builder.append("private void PrimitiveType ");
            String _partialName_2 = this.partialName(type);
            String _plus_2 = ("_" + _partialName_2);
            String _prefixedSymbolName_2 = this.getPrefixedSymbolName(type, _plus_2);
            _builder.append(_prefixedSymbolName_2);
            _builder.append(" = OCLstdlib._Integer;");
          } else {
            boolean _equals_3 = "Real".equals(type.getName());
            if (_equals_3) {
              _builder.newLineIfNotEmpty();
              _builder.append("private void PrimitiveType ");
              String _partialName_3 = this.partialName(type);
              String _plus_3 = ("_" + _partialName_3);
              String _prefixedSymbolName_3 = this.getPrefixedSymbolName(type, _plus_3);
              _builder.append(_prefixedSymbolName_3);
              _builder.append(" = OCLstdlib._Real;");
            } else {
              boolean _equals_4 = "String".equals(type.getName());
              if (_equals_4) {
                _builder.newLineIfNotEmpty();
                _builder.append("private void PrimitiveType ");
                String _partialName_4 = this.partialName(type);
                String _plus_4 = ("_" + _partialName_4);
                String _prefixedSymbolName_4 = this.getPrefixedSymbolName(type, _plus_4);
                _builder.append(_prefixedSymbolName_4);
                _builder.append(" = OCLstdlib._String;");
              } else {
                boolean _equals_5 = "UnlimitedNatural".equals(type.getName());
                if (_equals_5) {
                  _builder.newLineIfNotEmpty();
                  _builder.append("private void PrimitiveType ");
                  String _partialName_5 = this.partialName(type);
                  String _plus_5 = ("_" + _partialName_5);
                  String _prefixedSymbolName_5 = this.getPrefixedSymbolName(type, _plus_5);
                  _builder.append(_prefixedSymbolName_5);
                  _builder.append(" = OCLstdlib._UnlimitedNatural;");
                } else {
                  _builder.newLineIfNotEmpty();
                  _builder.append("private void DataType ");
                  String _partialName_6 = this.partialName(type);
                  String _plus_6 = ("_" + _partialName_6);
                  String _prefixedSymbolName_6 = this.getPrefixedSymbolName(type, _plus_6);
                  _builder.append(_prefixedSymbolName_6);
                  _builder.append(" = createDataType(\"");
                  String _name = type.getName();
                  _builder.append(_name);
                  _builder.append("\");");
                }
              }
            }
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  /**
   * @NonNull
   */
  @Override
  protected String generateMetamodel(final Collection<String> excludedEClassifierNames) {
    String _xblockexpression = null;
    {
      Library lib = ClassUtil.<Library>requireNonNull(this.getLibrary(this.thisModel));
      int year = new GregorianCalendar().get(GregorianCalendar.YEAR);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("/*******************************************************************************");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Copyright (c) 2010, ");
      _builder.append(year, " ");
      _builder.append(" Willink Transformations and others.");
      _builder.newLineIfNotEmpty();
      _builder.append(" ");
      _builder.append("* All rights reserved. This program and the accompanying materials");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* are made available under the terms of the Eclipse Public License v2.0");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* which accompanies this distribution, and is available at");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* http://www.eclipse.org/legal/epl-v20.html");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Contributors:");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*     E.D.Willink - initial API and implementation");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*******************************************************************************");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* This code is 100% auto-generated");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* from: ");
      _builder.append(this.sourceFile, " ");
      _builder.newLineIfNotEmpty();
      _builder.append(" ");
      _builder.append("* by: org.eclipse.ocl.build.xtend.generateOCLstdlib.xtend");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* and: org.eclipse.ocl.build.GenerateOCLstdlibModel.mwe2");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Do not edit it.");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*******************************************************************************/");
      _builder.newLine();
      _builder.append("package\t");
      _builder.append(this.javaPackageName);
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("import java.io.IOException;");
      _builder.newLine();
      _builder.append("import java.util.List;");
      _builder.newLine();
      _builder.append("import java.util.Map;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("import org.eclipse.emf.common.notify.Notification;");
      _builder.newLine();
      _builder.append("import org.eclipse.emf.common.notify.NotificationChain;");
      _builder.newLine();
      _builder.append("import org.eclipse.emf.common.util.URI;");
      _builder.newLine();
      _builder.append("import org.eclipse.emf.ecore.resource.Resource;");
      _builder.newLine();
      _builder.append("import org.eclipse.emf.ecore.resource.ResourceSet;");
      _builder.newLine();
      _builder.append("import org.eclipse.jdt.annotation.NonNull;");
      _builder.newLine();
      _builder.append("import org.eclipse.jdt.annotation.Nullable;");
      _builder.newLine();
      _builder.append("import org.eclipse.ocl.pivot.AnyType;");
      _builder.newLine();
      _builder.append("import org.eclipse.ocl.pivot.AssociativityKind;");
      _builder.newLine();
      _builder.append("import org.eclipse.ocl.pivot.BagType;");
      _builder.newLine();
      _builder.append("import org.eclipse.ocl.pivot.CollectionType;");
      _builder.newLine();
      _builder.append("import org.eclipse.ocl.pivot.InvalidType;");
      _builder.newLine();
      _builder.append("import org.eclipse.ocl.pivot.Iteration;");
      _builder.newLine();
      _builder.append("import org.eclipse.ocl.pivot.LambdaType;");
      _builder.newLine();
      _builder.append("import org.eclipse.ocl.pivot.Library;");
      _builder.newLine();
      _builder.append("import org.eclipse.ocl.pivot.MapType;");
      _builder.newLine();
      _builder.append("import org.eclipse.ocl.pivot.Model;");
      _builder.newLine();
      _builder.append("import org.eclipse.ocl.pivot.NormalizedTemplateParameter;");
      _builder.newLine();
      _builder.append("import org.eclipse.ocl.pivot.Operation;");
      _builder.newLine();
      _builder.append("import org.eclipse.ocl.pivot.OrderedSetType;");
      _builder.newLine();
      _builder.append("import org.eclipse.ocl.pivot.Parameter;");
      _builder.newLine();
      _builder.append("import org.eclipse.ocl.pivot.PivotPackage;");
      _builder.newLine();
      _builder.append("import org.eclipse.ocl.pivot.Precedence;");
      _builder.newLine();
      _builder.append("import org.eclipse.ocl.pivot.PrimitiveType;");
      _builder.newLine();
      _builder.append("import org.eclipse.ocl.pivot.Property;");
      _builder.newLine();
      _builder.append("import org.eclipse.ocl.pivot.SelfType;");
      _builder.newLine();
      _builder.append("import org.eclipse.ocl.pivot.SequenceType;");
      _builder.newLine();
      _builder.append("import org.eclipse.ocl.pivot.SetType;");
      _builder.newLine();
      _builder.append("import org.eclipse.ocl.pivot.TemplateParameter;");
      _builder.newLine();
      _builder.append("import org.eclipse.ocl.pivot.TupleType;");
      _builder.newLine();
      _builder.append("import org.eclipse.ocl.pivot.VoidType;");
      _builder.newLine();
      _builder.append("import org.eclipse.ocl.pivot.internal.library.StandardLibraryContribution;");
      _builder.newLine();
      _builder.append("import org.eclipse.ocl.pivot.internal.manager.Orphanage;");
      _builder.newLine();
      _builder.append("import org.eclipse.ocl.pivot.internal.resource.ASResourceImpl;");
      _builder.newLine();
      _builder.append("import org.eclipse.ocl.pivot.internal.resource.OCLASResourceFactory;");
      _builder.newLine();
      _builder.append("import org.eclipse.ocl.pivot.internal.utilities.AbstractContents;");
      _builder.newLine();
      _builder.append("import org.eclipse.ocl.pivot.utilities.ClassUtil;");
      _builder.newLine();
      _builder.append("import org.eclipse.ocl.pivot.utilities.EnvironmentFactory;");
      _builder.newLine();
      _builder.append("import org.eclipse.ocl.pivot.utilities.PivotConstants;");
      _builder.newLine();
      _builder.append("import org.eclipse.ocl.pivot.utilities.PivotStandaloneSetup;");
      _builder.newLine();
      _builder.append("import org.eclipse.ocl.pivot.utilities.PivotUtil;");
      _builder.newLine();
      {
        List<String> _sortedImportedJavaClassNames = this.getSortedImportedJavaClassNames(this.thisModel);
        for(final String importedClassName : _sortedImportedJavaClassNames) {
          _builder.append("import ");
          _builder.append(importedClassName);
          _builder.append(";");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      _builder.append("/**");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* This is the ");
      _builder.append(this.uri, " ");
      _builder.append(" Standard Library");
      _builder.newLineIfNotEmpty();
      _builder.append(" ");
      _builder.append("* auto-generated from ");
      _builder.append(this.sourceFile, " ");
      _builder.append(".");
      _builder.newLineIfNotEmpty();
      _builder.append(" ");
      _builder.append("* It facilitates efficient library loading without the overheads of model reading.");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* <p>");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* This Standard Library may be registered as the definition of a Standard Library for");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* the OCL evaluation framework by invoking {@link #install}.");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* <p>");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* The Standard Library is normally activated when the MetamodelManager attempts");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* to locate a library type when its default Standard Library URI is the same");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* as this Standard Library.");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("@SuppressWarnings(\"unused\")");
      _builder.newLine();
      _builder.append("public class ");
      _builder.append(this.javaClassName);
      _builder.append(" extends ASResourceImpl");
      _builder.newLineIfNotEmpty();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/**");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*\tThe static package-of-types pivot model of the Standard Library.");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("private static ");
      _builder.append(this.javaClassName, "\t");
      _builder.append(" INSTANCE = null;");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/**");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*\tThe URI of this Standard Library.");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public static final @NonNull String STDLIB_URI = \"");
      _builder.append(this.uri, "\t");
      _builder.append("\";");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/**");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*\tThe URI of the AS representation of this Standard Library.");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public static final @NonNull URI STDLIB_AS_URI = URI.createURI(STDLIB_URI + PivotConstants.DOT_OCL_AS_FILE_EXTENSION);");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/**");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* Return the default ");
      _builder.append(this.uri, "\t ");
      _builder.append(" standard Library Resource");
      _builder.newLineIfNotEmpty();
      _builder.append("\t ");
      _builder.append("* if it jas been created, or null if not.");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*  This static definition auto-generated from ");
      _builder.append(this.sourceFile, "\t ");
      _builder.newLineIfNotEmpty();
      _builder.append("\t ");
      _builder.append("*  is used as the default when no overriding copy is registered.");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* It cannot be unloaded or rather unloading has no effect.");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public static @Nullable ");
      _builder.append(this.javaClassName, "\t");
      _builder.append(" basicGetDefault() {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("return INSTANCE;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/**");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* Return the default ");
      _builder.append(this.uri, "\t ");
      _builder.append(" standard Library Resource.");
      _builder.newLineIfNotEmpty();
      _builder.append("\t ");
      _builder.append("*  This static definition auto-generated from ");
      _builder.append(this.sourceFile, "\t ");
      _builder.newLineIfNotEmpty();
      _builder.append("\t ");
      _builder.append("*  is used as the default when no overriding copy is registered.");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* It cannot be unloaded or rather unloading has no effect.");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public static @NonNull ");
      _builder.append(this.javaClassName, "\t");
      _builder.append(" getDefault() {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append(this.javaClassName, "\t\t");
      _builder.append(" oclstdlib = INSTANCE;");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("if (oclstdlib == null) {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("Contents contents = new Contents(\"");
      String _uRI = lib.getURI();
      _builder.append(_uRI, "\t\t\t");
      _builder.append("\");");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.append("String asURI = STDLIB_URI + PivotConstants.DOT_OCL_AS_FILE_EXTENSION;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("oclstdlib = INSTANCE = new ReadOnly(asURI, contents.getModel());");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("oclstdlib.setSaveable(false);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return oclstdlib;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/**");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Return the default ");
      _builder.append(this.uri, " ");
      _builder.append(" standard Library model.");
      _builder.newLineIfNotEmpty();
      _builder.append(" ");
      _builder.append("*  This static definition auto-generated from ");
      _builder.append(this.sourceFile, " ");
      _builder.newLineIfNotEmpty();
      _builder.append(" ");
      _builder.append("*  is used as the default when no overriding copy is registered.");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public static @NonNull Model getDefaultModel() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Model model = (Model)(getDefault().getContents().get(0));");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("assert model != null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return model;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/**");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Return the default ");
      _builder.append(this.uri, " ");
      _builder.append(" standard Library package.");
      _builder.newLineIfNotEmpty();
      _builder.append(" ");
      _builder.append("*  This static definition auto-generated from ");
      _builder.append(this.sourceFile, " ");
      _builder.newLineIfNotEmpty();
      _builder.append(" ");
      _builder.append("*  is used as the default when no overriding copy is registered.");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public static org.eclipse.ocl.pivot.@NonNull Package getDefaultPackage() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("org.eclipse.ocl.pivot.Package pkge = getDefaultModel().getOwnedPackages().get(0);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("assert pkge != null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return pkge;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/**");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* Install this library in the {@link StandardLibraryContribution#REGISTRY}");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* and the {@link OCLASResourceFactory#REGISTRY}.");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* This method may be invoked by standalone applications to replicate");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* the registration that should appear as a standard_library plugin");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* extension when running within Eclipse.");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public static void install() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("PivotStandaloneSetup.init(OCLstdlibPackage.eINSTANCE);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Loader contribution = new Loader();");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("StandardLibraryContribution.REGISTRY.put(STDLIB_URI, contribution);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("OCLASResourceFactory.REGISTRY.put(STDLIB_AS_URI, contribution);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/**");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* Install this library in the {@link StandardLibraryContribution#REGISTRY}");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* and the {@link OCLASResourceFactory#REGISTRY}");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* unless some other library contribution has already been installed.");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public static void lazyInstall() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("if (StandardLibraryContribution.REGISTRY.get(STDLIB_URI) == null) {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("install();");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/**");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* Uninstall this library from the {@link StandardLibraryContribution#REGISTRY}");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* and the {@link OCLASResourceFactory#REGISTRY}.");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* This method may be invoked by standalone applications to release the library");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* resources for garbage collection and memory leakage detection.");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public static void uninstall() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("StandardLibraryContribution.REGISTRY.remove(STDLIB_URI);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("OCLASResourceFactory.REGISTRY.remove(STDLIB_AS_URI);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("INSTANCE = null;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/**");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* The Loader shares the Standard Library instance whenever this default library");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* is loaded from the registry of Standard Libraries populated by the standard_library");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* extension point.");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public static class Loader implements StandardLibraryContribution");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("@Override");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("public @NonNull StandardLibraryContribution getContribution() {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("return this;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("@Override");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("public @NonNull Resource getResource() {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("return getDefault();");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/**");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* A ReadOnly ");
      _builder.append(this.javaClassName, "\t ");
      _builder.append(" overrides inherited functionality to impose immutable shared behaviour.");
      _builder.newLineIfNotEmpty();
      _builder.append("\t ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("protected static class ReadOnly extends ");
      _builder.append(this.javaClassName, "\t");
      _builder.append(" implements ImmutableResource");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("protected ReadOnly(@NonNull String asURI, @NonNull Model libraryModel) {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("super(asURI, libraryModel);");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("setASonly(true);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("/**");
      _builder.newLine();
      _builder.append("\t\t ");
      _builder.append("* Overridden to inhibit entry of the shared instance in any ResourceSet.");
      _builder.newLine();
      _builder.append("\t\t ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("@Override");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("public NotificationChain basicSetResourceSet(ResourceSet resourceSet, NotificationChain notifications) {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("return notifications;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("/**");
      _builder.newLine();
      _builder.append("\t\t ");
      _builder.append("* Overridden to inhibit unloading of the shared instance.");
      _builder.newLine();
      _builder.append("\t\t ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("@Override");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("protected void doUnload() {}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("@Override");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("public boolean isCompatibleWith(@NonNull String metamodelURI) {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("return PivotPackage.eNS_URI.equals(metamodelURI);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("/**");
      _builder.newLine();
      _builder.append("\t\t ");
      _builder.append("* Overridden to trivialize loading of the shared instance.");
      _builder.newLine();
      _builder.append("\t\t ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("@Override");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("public void load(Map<?, ?> options) throws IOException {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("if (this != INSTANCE) {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("super.load(options);");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("else {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("setLoaded(true);");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("/**");
      _builder.newLine();
      _builder.append("\t\t ");
      _builder.append("* Overridden to avoid computing proxies for the shared instance.");
      _builder.newLine();
      _builder.append("\t\t ");
      _builder.append("*");
      _builder.newLine();
      _builder.append("\t\t ");
      _builder.append("* @since 7.0");
      _builder.newLine();
      _builder.append("\t\t ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("@Override");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("public void preUnload(@NonNull EnvironmentFactory environmentFactory) {}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("/**");
      _builder.newLine();
      _builder.append("\t\t ");
      _builder.append("* Overridden to inhibit unloading of the shared instance.");
      _builder.newLine();
      _builder.append("\t\t ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("@Override");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("protected Notification setLoaded(boolean isLoaded) {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("if (isLoaded) {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("return super.setLoaded(isLoaded);");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("else {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("return null;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/**");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*\tConstruct a copy of the OCL Standard Library with specified AS resource URI,");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*  and external URI.");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* @since 7.0");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public static @NonNull ");
      _builder.append(this.javaClassName, "\t");
      _builder.append(" create(@NonNull String asURI, @NonNull String externalURI) {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("Contents contents = new Contents(externalURI);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return new ");
      _builder.append(this.javaClassName, "\t\t");
      _builder.append("(asURI, contents.getModel());");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/**");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*\tConstruct an OCL Standard Library with specified resource URI and library content.");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("private ");
      _builder.append(this.javaClassName, "\t");
      _builder.append("(@NonNull String asURI, @NonNull Model libraryModel) {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("super(ClassUtil.requireNonNull(URI.createURI(asURI)), OCLASResourceFactory.getInstance());");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("assert PivotUtil.isASURI(uri);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("getContents().add(libraryModel);\t\t\t\t// and invoke setLoaded()");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("private static class AbstractLibraryContents extends AbstractContents");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t");
      Library stdlib = this.getReferencedStandardLibrary();
      _builder.newLineIfNotEmpty();
      {
        if ((stdlib == null)) {
          {
            List<org.eclipse.ocl.pivot.Package> _sortedLocalPackages = this.getSortedLocalPackages(this.thisModel);
            for(final org.eclipse.ocl.pivot.Package pkge : _sortedLocalPackages) {
              _builder.append("\t\t");
              _builder.append("protected final ");
              String _eClassReference = this.getEClassReference(Boolean.valueOf(true), pkge);
              _builder.append(_eClassReference, "\t\t");
              _builder.append(" ");
              String _symbolName = this.getSymbolName(pkge);
              _builder.append(_symbolName, "\t\t");
              _builder.append(";");
              _builder.newLineIfNotEmpty();
            }
          }
        } else {
          _builder.append("\t\t");
          _builder.append("protected final org.eclipse.ocl.pivot.@NonNull Package ");
          String _symbolName_1 = this.getSymbolName(stdlib);
          _builder.append(_symbolName_1, "\t\t");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
          {
            List<org.eclipse.ocl.pivot.Package> _sortedAllPackages = this.getSortedAllPackages(this.thisModel);
            for(final org.eclipse.ocl.pivot.Package pkge_1 : _sortedAllPackages) {
              {
                boolean _isOrphan = Orphanage.isOrphan(pkge_1);
                if (_isOrphan) {
                  _builder.append("\t\t");
                  _builder.append("protected final ");
                  String _eClassReference_1 = this.getEClassReference(Boolean.valueOf(true), pkge_1);
                  _builder.append(_eClassReference_1, "\t\t");
                  _builder.append(" ");
                  String _symbolName_2 = this.getSymbolName(pkge_1);
                  _builder.append(_symbolName_2, "\t\t");
                  _builder.append(";");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
      }
      {
        List<NormalizedTemplateParameter> _normalizedTemplateParameters = this.getNormalizedTemplateParameters(this.thisModel);
        for(final NormalizedTemplateParameter normalizedTemplateParameter : _normalizedTemplateParameters) {
          _builder.append("\t\t");
          _builder.append("protected final @NonNull NormalizedTemplateParameter ");
          String _prefixedSymbolName = this.getPrefixedSymbolName(normalizedTemplateParameter, normalizedTemplateParameter.getName());
          _builder.append(_prefixedSymbolName, "\t\t");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("protected AbstractLibraryContents() {");
      _builder.newLine();
      {
        if ((stdlib == null)) {
          {
            List<org.eclipse.ocl.pivot.Package> _sortedLocalPackages_1 = this.getSortedLocalPackages(this.thisModel);
            for(final org.eclipse.ocl.pivot.Package pkge_2 : _sortedLocalPackages_1) {
              _builder.append("\t\t\t");
              String _symbolName_3 = this.getSymbolName(pkge_2);
              _builder.append(_symbolName_3, "\t\t\t");
              _builder.append(" = create");
              String _name = pkge_2.eClass().getName();
              _builder.append(_name, "\t\t\t");
              _builder.append("(\"");
              String _name_1 = pkge_2.getName();
              _builder.append(_name_1, "\t\t\t");
              _builder.append("\", ");
              String _xifexpression = null;
              String _nsPrefix = pkge_2.getNsPrefix();
              boolean _tripleNotEquals = (_nsPrefix != null);
              if (_tripleNotEquals) {
                String _nsPrefix_1 = pkge_2.getNsPrefix();
                String _plus = ("\"" + _nsPrefix_1);
                _xifexpression = (_plus + "\"");
              } else {
                _xifexpression = "null";
              }
              _builder.append(_xifexpression, "\t\t\t");
              _builder.append(", \"");
              String _uRI_1 = pkge_2.getURI();
              _builder.append(_uRI_1, "\t\t\t");
              _builder.append("\", ");
              String _generatedPackageId = this.getGeneratedPackageId(pkge_2);
              _builder.append(_generatedPackageId, "\t\t\t");
              _builder.append(", ");
              String _ecoreLiteral = this.getEcoreLiteral(pkge_2);
              _builder.append(_ecoreLiteral, "\t\t\t");
              _builder.append(");");
              _builder.newLineIfNotEmpty();
            }
          }
        } else {
          _builder.append("\t\t\t");
          String _symbolName_4 = this.getSymbolName(stdlib);
          _builder.append(_symbolName_4, "\t\t\t");
          _builder.append(" = ");
          String _externalReference = this.getExternalReference(stdlib);
          _builder.append(_externalReference, "\t\t\t");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
          {
            List<org.eclipse.ocl.pivot.Package> _sortedAllPackages_1 = this.getSortedAllPackages(this.thisModel);
            for(final org.eclipse.ocl.pivot.Package pkge_3 : _sortedAllPackages_1) {
              {
                boolean _isOrphan_1 = Orphanage.isOrphan(pkge_3);
                if (_isOrphan_1) {
                  _builder.append("\t\t\t");
                  String _symbolName_5 = this.getSymbolName(pkge_3);
                  _builder.append(_symbolName_5, "\t\t\t");
                  _builder.append(" = create");
                  String _name_2 = pkge_3.eClass().getName();
                  _builder.append(_name_2, "\t\t\t");
                  _builder.append("(\"");
                  String _name_3 = pkge_3.getName();
                  _builder.append(_name_3, "\t\t\t");
                  _builder.append("\", ");
                  String _xifexpression_1 = null;
                  String _nsPrefix_2 = pkge_3.getNsPrefix();
                  boolean _tripleNotEquals_1 = (_nsPrefix_2 != null);
                  if (_tripleNotEquals_1) {
                    String _nsPrefix_3 = pkge_3.getNsPrefix();
                    String _plus_1 = ("\"" + _nsPrefix_3);
                    _xifexpression_1 = (_plus_1 + "\"");
                  } else {
                    _xifexpression_1 = "null";
                  }
                  _builder.append(_xifexpression_1, "\t\t\t");
                  _builder.append(", \"");
                  String _uRI_2 = pkge_3.getURI();
                  _builder.append(_uRI_2, "\t\t\t");
                  _builder.append("\", ");
                  String _generatedPackageId_1 = this.getGeneratedPackageId(pkge_3);
                  _builder.append(_generatedPackageId_1, "\t\t\t");
                  _builder.append(", null);");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
      }
      {
        List<NormalizedTemplateParameter> _normalizedTemplateParameters_1 = this.getNormalizedTemplateParameters(this.thisModel);
        for(final NormalizedTemplateParameter normalizedTemplateParameter_1 : _normalizedTemplateParameters_1) {
          _builder.append("\t\t\t");
          String _symbolName_6 = this.getSymbolName(normalizedTemplateParameter_1);
          _builder.append(_symbolName_6, "\t\t\t");
          _builder.append(" = Orphanage.getNormalizedTemplateParameter(");
          String _symbolName_7 = this.getSymbolName(this.getOrphanPackage(this.thisModel));
          _builder.append(_symbolName_7, "\t\t\t");
          _builder.append(", ");
          int _index = normalizedTemplateParameter_1.getIndex();
          _builder.append(_index, "\t\t\t");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("private static class Contents extends AbstractLibraryContents");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("private final @NonNull Model ");
      String _prefixedSymbolName_1 = this.getPrefixedSymbolName(this.thisModel, "model");
      _builder.append(_prefixedSymbolName_1, "\t\t");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      {
        if ((stdlib != null)) {
          {
            List<org.eclipse.ocl.pivot.Package> _sortedAllPackages_2 = this.getSortedAllPackages(this.thisModel);
            for(final org.eclipse.ocl.pivot.Package pkge_4 : _sortedAllPackages_2) {
              {
                boolean _equals = Objects.equals(pkge_4, stdlib);
                if (_equals) {
                } else {
                  if (((!Objects.equals(pkge_4.eContainer(), this.thisModel)) && (!Orphanage.isOrphan(pkge_4)))) {
                  } else {
                    boolean _isOrphan_2 = Orphanage.isOrphan(pkge_4);
                    boolean _not = (!_isOrphan_2);
                    if (_not) {
                      _builder.append("\t\t");
                      _builder.append("private final org.eclipse.ocl.pivot.@NonNull Package ");
                      String _symbolName_8 = this.getSymbolName(pkge_4);
                      _builder.append(_symbolName_8, "\t\t");
                      _builder.append(";");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
              }
            }
          }
        }
      }
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("private Contents(@NonNull String asURI)");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t\t");
      String _symbolName_9 = this.getSymbolName(this.thisModel);
      _builder.append(_symbolName_9, "\t\t\t");
      _builder.append(" = createModel(asURI);");
      _builder.newLineIfNotEmpty();
      {
        if ((stdlib != null)) {
          {
            List<org.eclipse.ocl.pivot.Package> _sortedAllPackages_3 = this.getSortedAllPackages(this.thisModel);
            for(final org.eclipse.ocl.pivot.Package pkge_5 : _sortedAllPackages_3) {
              {
                boolean _equals_1 = Objects.equals(pkge_5, stdlib);
                if (_equals_1) {
                } else {
                  if (((!Objects.equals(pkge_5.eContainer(), this.thisModel)) && (!Orphanage.isOrphan(pkge_5)))) {
                  } else {
                    boolean _isOrphan_3 = Orphanage.isOrphan(pkge_5);
                    boolean _not_1 = (!_isOrphan_3);
                    if (_not_1) {
                      _builder.append("\t\t\t");
                      String _symbolName_10 = this.getSymbolName(pkge_5);
                      _builder.append(_symbolName_10, "\t\t\t");
                      _builder.append(" = create");
                      String _name_4 = pkge_5.eClass().getName();
                      _builder.append(_name_4, "\t\t\t");
                      _builder.append("(\"");
                      String _name_5 = pkge_5.getName();
                      _builder.append(_name_5, "\t\t\t");
                      _builder.append("\", ");
                      String _xifexpression_2 = null;
                      String _nsPrefix_4 = pkge_5.getNsPrefix();
                      boolean _tripleNotEquals_2 = (_nsPrefix_4 != null);
                      if (_tripleNotEquals_2) {
                        String _nsPrefix_5 = pkge_5.getNsPrefix();
                        String _plus_2 = ("\"" + _nsPrefix_5);
                        _xifexpression_2 = (_plus_2 + "\"");
                      } else {
                        _xifexpression_2 = "null";
                      }
                      _builder.append(_xifexpression_2, "\t\t\t");
                      _builder.append(", \"");
                      String _uRI_3 = pkge_5.getURI();
                      _builder.append(_uRI_3, "\t\t\t");
                      _builder.append("\", ");
                      String _generatedPackageId_2 = this.getGeneratedPackageId(pkge_5);
                      _builder.append(_generatedPackageId_2, "\t\t\t");
                      _builder.append(", ");
                      String _ecoreLiteral_1 = this.getEcoreLiteral(pkge_5);
                      _builder.append(_ecoreLiteral_1, "\t\t\t");
                      _builder.append(");");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
              }
            }
          }
        }
      }
      _builder.append("\t\t\t");
      String _installPackages = this.installPackages(this.thisModel);
      _builder.append(_installPackages, "\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      String _installClassTypes = this.installClassTypes(this.thisModel);
      _builder.append(_installClassTypes, "\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      String _installPrimitiveTypes = this.installPrimitiveTypes(this.thisModel);
      _builder.append(_installPrimitiveTypes, "\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      String _installEnumerations = this.installEnumerations(this.thisModel);
      _builder.append(_installEnumerations, "\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      String _installCollectionTypes = this.installCollectionTypes(this.thisModel);
      _builder.append(_installCollectionTypes, "\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      String _installMapTypes = this.installMapTypes(this.thisModel);
      _builder.append(_installMapTypes, "\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      String _installLambdaTypes = this.installLambdaTypes(this.thisModel);
      _builder.append(_installLambdaTypes, "\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      String _installTupleTypes = this.installTupleTypes(this.thisModel);
      _builder.append(_installTupleTypes, "\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      String _installOperations = this.installOperations(this.thisModel);
      _builder.append(_installOperations, "\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      String _installIterations = this.installIterations(this.thisModel);
      _builder.append(_installIterations, "\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      String _installCoercions = this.installCoercions(this.thisModel);
      _builder.append(_installCoercions, "\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      String _installProperties = this.installProperties(this.thisModel);
      _builder.append(_installProperties, "\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      String _installTemplateArguments = this.installTemplateArguments(this.thisModel);
      _builder.append(_installTemplateArguments, "\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      String _installPrecedences = this.installPrecedences(this.thisModel);
      _builder.append(_installPrecedences, "\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      String _installComments = this.installComments(this.thisModel);
      _builder.append(_installComments, "\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("public @NonNull Model getModel() {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("return ");
      String _symbolName_11 = this.getSymbolName(this.thisModel);
      _builder.append(_symbolName_11, "\t\t\t");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      String _defineExternals = this.defineExternals(this.thisModel);
      _builder.append(_defineExternals, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      String _definePackages = this.definePackages(this.thisModel);
      _builder.append(_definePackages, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      String _declareClassTypes = this.declareClassTypes(this.thisModel, excludedEClassifierNames);
      _builder.append(_declareClassTypes, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      String _declarePrimitiveTypes = this.declarePrimitiveTypes(this.thisModel);
      _builder.append(_declarePrimitiveTypes, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      String _declareEnumerations = this.declareEnumerations(this.thisModel);
      _builder.append(_declareEnumerations, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      String _defineTemplateParameters = this.defineTemplateParameters(this.thisModel);
      _builder.append(_defineTemplateParameters, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      String _declareTupleTypes = this.declareTupleTypes(this.thisModel);
      _builder.append(_declareTupleTypes, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      String _declareCollectionTypes = this.declareCollectionTypes(this.thisModel);
      _builder.append(_declareCollectionTypes, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      String _declareMapTypes = this.declareMapTypes(this.thisModel);
      _builder.append(_declareMapTypes, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      String _defineClassTypes = this.defineClassTypes(this.thisModel);
      _builder.append(_defineClassTypes, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      String _definePrimitiveTypes = this.definePrimitiveTypes(this.thisModel);
      _builder.append(_definePrimitiveTypes, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      String _defineEnumerations = this.defineEnumerations(this.thisModel);
      _builder.append(_defineEnumerations, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      String _defineCollectionTypes = this.defineCollectionTypes(this.thisModel);
      _builder.append(_defineCollectionTypes, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      String _defineMapTypes = this.defineMapTypes(this.thisModel);
      _builder.append(_defineMapTypes, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      String _defineTupleTypes = this.defineTupleTypes(this.thisModel);
      _builder.append(_defineTupleTypes, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      String _defineLambdaTypes = this.defineLambdaTypes(this.thisModel);
      _builder.append(_defineLambdaTypes, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      String _defineOperations = this.defineOperations(this.thisModel);
      _builder.append(_defineOperations, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      String _defineIterations = this.defineIterations(this.thisModel);
      _builder.append(_defineIterations, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      String _defineCoercions = this.defineCoercions(this.thisModel);
      _builder.append(_defineCoercions, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      String _defineProperties = this.defineProperties(this.thisModel);
      _builder.append(_defineProperties, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      String _defineTemplateBindings = this.defineTemplateBindings(this.thisModel);
      _builder.append(_defineTemplateBindings, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      String _definePrecedences = this.definePrecedences(this.thisModel);
      _builder.append(_definePrecedences, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      String _defineComments = this.defineComments(this.thisModel);
      _builder.append(_defineComments, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
}
