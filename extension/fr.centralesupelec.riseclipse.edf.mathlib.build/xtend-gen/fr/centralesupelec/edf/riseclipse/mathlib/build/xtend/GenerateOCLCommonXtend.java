/**
 * Copyright (c) 2013 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     E.D.Willink - initial API and implementation
 */
package fr.centralesupelec.edf.riseclipse.mathlib.build.xtend;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.pivot.AnyType;
import org.eclipse.ocl.pivot.CollectionType;
import org.eclipse.ocl.pivot.Comment;
import org.eclipse.ocl.pivot.Constraint;
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.Enumeration;
import org.eclipse.ocl.pivot.EnumerationLiteral;
import org.eclipse.ocl.pivot.Iteration;
import org.eclipse.ocl.pivot.LambdaParameter;
import org.eclipse.ocl.pivot.LambdaType;
import org.eclipse.ocl.pivot.LanguageExpression;
import org.eclipse.ocl.pivot.Library;
import org.eclipse.ocl.pivot.MapType;
import org.eclipse.ocl.pivot.Model;
import org.eclipse.ocl.pivot.NamedElement;
import org.eclipse.ocl.pivot.NormalizedTemplateParameter;
import org.eclipse.ocl.pivot.Operation;
import org.eclipse.ocl.pivot.Parameter;
import org.eclipse.ocl.pivot.Precedence;
import org.eclipse.ocl.pivot.PrimitiveType;
import org.eclipse.ocl.pivot.Property;
import org.eclipse.ocl.pivot.TemplateArgument;
import org.eclipse.ocl.pivot.TemplateParameter;
import org.eclipse.ocl.pivot.TemplateableElement;
import org.eclipse.ocl.pivot.TupleType;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.manager.Orphanage;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.NameUtil;
import org.eclipse.ocl.pivot.utilities.PivotConstants;
import org.eclipse.ocl.pivot.values.Unlimited;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public abstract class GenerateOCLCommonXtend extends GenerateOCLCommon {
  protected String declareClassTypes(final Model root, final Collection<String> excludedEClassifierNames) {
    String _xblockexpression = null;
    {
      Map<org.eclipse.ocl.pivot.Package, List<org.eclipse.ocl.pivot.Class>> pkge2classTypes = this.getSortedClassTypes(root);
      boolean _isEmpty = pkge2classTypes.isEmpty();
      if (_isEmpty) {
        return "";
      }
      List<org.eclipse.ocl.pivot.Package> sortedPackages = this.getSortedPackages(root, pkge2classTypes.keySet());
      StringConcatenation _builder = new StringConcatenation();
      {
        for(final org.eclipse.ocl.pivot.Package pkge : sortedPackages) {
          _builder.newLine();
          {
            List<org.eclipse.ocl.pivot.Class> _nullFree = ClassUtil.<org.eclipse.ocl.pivot.Class>nullFree(pkge2classTypes.get(pkge));
            for(final org.eclipse.ocl.pivot.Class type : _nullFree) {
              _builder.append("\t\t");
              _builder.append("private final ");
              String _eClassReference = this.getEClassReference(Boolean.valueOf(true), type);
              _builder.append(_eClassReference, "\t\t");
              _builder.append(" ");
              String _partialName = this.partialName(type);
              String _plus = ("_" + _partialName);
              String _prefixedSymbolNameWithoutNormalization = this.getPrefixedSymbolNameWithoutNormalization(type, _plus);
              _builder.append(_prefixedSymbolNameWithoutNormalization, "\t\t");
              _builder.append(" = create");
              String _name = type.eClass().getName();
              _builder.append(_name, "\t\t");
              _builder.append("(\"");
              String _name_1 = type.getName();
              _builder.append(_name_1, "\t\t");
              _builder.append("\");");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected String declareCollectionTypes(final Model root) {
    String _xblockexpression = null;
    {
      Map<org.eclipse.ocl.pivot.Package, List<CollectionType>> pkge2collectionTypes = this.getSortedCollectionTypes(root);
      boolean _isEmpty = pkge2collectionTypes.isEmpty();
      if (_isEmpty) {
        return "";
      }
      List<org.eclipse.ocl.pivot.Package> sortedPackages = this.getSortedPackages(root, pkge2collectionTypes.keySet());
      StringConcatenation _builder = new StringConcatenation();
      {
        for(final org.eclipse.ocl.pivot.Package pkge : sortedPackages) {
          _builder.newLine();
          _builder.append("\t\t");
          {
            List<CollectionType> _nullFree = ClassUtil.<CollectionType>nullFree(pkge2collectionTypes.get(pkge));
            for(final CollectionType type : _nullFree) {
              String _name = type.getName();
              String _plus = ("_" + _name);
              String _plus_1 = (_plus + "_");
              String _partialName = this.partialName(type.getElementType());
              String _plus_2 = (_plus_1 + _partialName);
              String _xifexpression = null;
              boolean _isIsNullFree = type.isIsNullFree();
              if (_isIsNullFree) {
                _xifexpression = "_NullFree";
              } else {
                _xifexpression = "";
              }
              String _plus_3 = (_plus_2 + _xifexpression);
              String typeName = this.getPrefixedSymbolName(type, _plus_3);
              _builder.newLineIfNotEmpty();
              {
                List<TemplateParameter> _basicGetOwnedTemplateParameters = type.basicGetOwnedTemplateParameters();
                boolean _tripleNotEquals = (_basicGetOwnedTemplateParameters != null);
                if (_tripleNotEquals) {
                  _builder.append("\t\t");
                  _builder.append("\t");
                  _builder.append("private final ");
                  String _eClassReference = this.getEClassReference(Boolean.valueOf(true), type);
                  _builder.append(_eClassReference, "\t\t\t");
                  _builder.append(" ");
                  _builder.append(typeName, "\t\t\t");
                  _builder.append(" = create");
                  String _name_1 = type.eClass().getName();
                  _builder.append(_name_1, "\t\t\t");
                  _builder.append("(");
                  String _ecoreLiteral = this.getEcoreLiteral(type);
                  _builder.append(_ecoreLiteral, "\t\t\t");
                  {
                    List<TemplateParameter> _basicGetOwnedTemplateParameters_1 = type.basicGetOwnedTemplateParameters();
                    boolean _tripleNotEquals_1 = (_basicGetOwnedTemplateParameters_1 != null);
                    if (_tripleNotEquals_1) {
                      {
                        List<TemplateParameter> _ownedTemplateParameters = type.getOwnedTemplateParameters();
                        for(final TemplateParameter templateParameter : _ownedTemplateParameters) {
                          _builder.append(", ");
                          String _symbolName = this.getSymbolName(templateParameter);
                          _builder.append(_symbolName, "\t\t\t");
                        }
                      }
                    }
                  }
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
          _builder.append("\t");
          {
            List<CollectionType> _nullFree_1 = ClassUtil.<CollectionType>nullFree(pkge2collectionTypes.get(pkge));
            for(final CollectionType type_1 : _nullFree_1) {
              String _name_2 = type_1.getName();
              String _plus_4 = ("_" + _name_2);
              String _plus_5 = (_plus_4 + "_");
              String _partialName_1 = this.partialName(type_1.getElementType());
              String _plus_6 = (_plus_5 + _partialName_1);
              String _xifexpression_1 = null;
              boolean _isIsNullFree_1 = type_1.isIsNullFree();
              if (_isIsNullFree_1) {
                _xifexpression_1 = "_NullFree";
              } else {
                _xifexpression_1 = "";
              }
              String _plus_7 = (_plus_6 + _xifexpression_1);
              String typeName_1 = this.getPrefixedSymbolName(type_1, _plus_7);
              _builder.newLineIfNotEmpty();
              {
                List<TemplateParameter> _basicGetOwnedTemplateParameters_2 = type_1.basicGetOwnedTemplateParameters();
                boolean _tripleEquals = (_basicGetOwnedTemplateParameters_2 == null);
                if (_tripleEquals) {
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("private final ");
                  String _eClassReference_1 = this.getEClassReference(Boolean.valueOf(true), type_1);
                  _builder.append(_eClassReference_1, "\t\t");
                  _builder.append(" ");
                  _builder.append(typeName_1, "\t\t");
                  _builder.append(" = create");
                  String _name_3 = type_1.eClass().getName();
                  _builder.append(_name_3, "\t\t");
                  _builder.append("(");
                  String _symbolName_1 = this.getSymbolName(type_1.getGeneric());
                  _builder.append(_symbolName_1, "\t\t");
                  _builder.append(");");
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

  protected String declareEnumerations(final Model root) {
    String _xblockexpression = null;
    {
      Map<org.eclipse.ocl.pivot.Package, List<Enumeration>> pkge2enumerations = this.getSortedEnumerations(root);
      boolean _isEmpty = pkge2enumerations.isEmpty();
      if (_isEmpty) {
        return "";
      }
      List<org.eclipse.ocl.pivot.Package> sortedPackages = this.getSortedPackages(root, pkge2enumerations.keySet());
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      {
        for(final org.eclipse.ocl.pivot.Package pkge : sortedPackages) {
          {
            List<Enumeration> _nullFree = ClassUtil.<Enumeration>nullFree(pkge2enumerations.get(pkge));
            for(final Enumeration enumeration : _nullFree) {
              String _partialName = this.partialName(enumeration);
              String _plus = ("_" + _partialName);
              String enumerationName = this.getPrefixedSymbolName(enumeration, _plus);
              _builder.newLineIfNotEmpty();
              _builder.append("private final @NonNull Enumeration ");
              _builder.append(enumerationName);
              _builder.append(" = createEnumeration(\"");
              String _name = enumeration.getName();
              _builder.append(_name);
              _builder.append("\");");
              _builder.newLineIfNotEmpty();
              {
                List<EnumerationLiteral> _ownedLiterals = enumeration.getOwnedLiterals();
                for(final EnumerationLiteral enumerationLiteral : _ownedLiterals) {
                  _builder.append("private final @NonNull EnumerationLiteral ");
                  String _name_1 = enumerationLiteral.getName();
                  String _plus_1 = ((("el_" + enumerationName) + "_") + _name_1);
                  String _prefixedSymbolName = this.getPrefixedSymbolName(enumerationLiteral, _plus_1);
                  _builder.append(_prefixedSymbolName);
                  _builder.append(" = createEnumerationLiteral(\"");
                  String _name_2 = enumerationLiteral.getName();
                  _builder.append(_name_2);
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

  protected String declareMapTypes(final Model root) {
    String _xblockexpression = null;
    {
      Map<org.eclipse.ocl.pivot.Package, List<MapType>> pkge2mapTypes = this.getSortedMapTypes(root);
      boolean _isEmpty = pkge2mapTypes.isEmpty();
      if (_isEmpty) {
        return "";
      }
      List<org.eclipse.ocl.pivot.Package> sortedPackages = this.getSortedPackages(root, pkge2mapTypes.keySet());
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      {
        for(final org.eclipse.ocl.pivot.Package pkge : sortedPackages) {
          {
            List<MapType> _nullFree = ClassUtil.<MapType>nullFree(pkge2mapTypes.get(pkge));
            for(final MapType type : _nullFree) {
              {
                List<TemplateParameter> _basicGetOwnedTemplateParameters = type.basicGetOwnedTemplateParameters();
                boolean _tripleNotEquals = (_basicGetOwnedTemplateParameters != null);
                if (_tripleNotEquals) {
                  _builder.append("private final ");
                  String _eClassReference = this.getEClassReference(Boolean.valueOf(true), type);
                  _builder.append(_eClassReference);
                  _builder.append(" ");
                  String _name = type.getName();
                  String _plus = ("_" + _name);
                  String _plus_1 = (_plus + "_");
                  String _partialName = this.partialName(type.getKeyType());
                  String _plus_2 = (_plus_1 + _partialName);
                  String _plus_3 = (_plus_2 + "_");
                  String _partialName_1 = this.partialName(type.getValueType());
                  String _plus_4 = (_plus_3 + _partialName_1);
                  String _prefixedSymbolName = this.getPrefixedSymbolName(type, _plus_4);
                  _builder.append(_prefixedSymbolName);
                  _builder.append(" = create");
                  String _name_1 = type.eClass().getName();
                  _builder.append(_name_1);
                  _builder.append("(");
                  String _ecoreLiteral = this.getEcoreLiteral(type);
                  _builder.append(_ecoreLiteral);
                  {
                    List<TemplateParameter> _basicGetOwnedTemplateParameters_1 = type.basicGetOwnedTemplateParameters();
                    boolean _tripleNotEquals_1 = (_basicGetOwnedTemplateParameters_1 != null);
                    if (_tripleNotEquals_1) {
                      {
                        List<TemplateParameter> _ownedTemplateParameters = type.getOwnedTemplateParameters();
                        for(final TemplateParameter templateParameter : _ownedTemplateParameters) {
                          _builder.append(", ");
                          String _symbolName = this.getSymbolName(templateParameter);
                          _builder.append(_symbolName);
                        }
                      }
                    }
                  }
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
          {
            List<MapType> _nullFree_1 = ClassUtil.<MapType>nullFree(pkge2mapTypes.get(pkge));
            for(final MapType type_1 : _nullFree_1) {
              {
                List<TemplateParameter> _basicGetOwnedTemplateParameters_2 = type_1.basicGetOwnedTemplateParameters();
                boolean _tripleEquals = (_basicGetOwnedTemplateParameters_2 == null);
                if (_tripleEquals) {
                  _builder.append("private final ");
                  String _eClassReference_1 = this.getEClassReference(Boolean.valueOf(true), type_1);
                  _builder.append(_eClassReference_1);
                  _builder.append(" ");
                  String _name_2 = type_1.getName();
                  String _plus_5 = ("_" + _name_2);
                  String _plus_6 = (_plus_5 + "_");
                  String _partialName_2 = this.partialName(type_1.getKeyType());
                  String _plus_7 = (_plus_6 + _partialName_2);
                  String _plus_8 = (_plus_7 + "_");
                  String _partialName_3 = this.partialName(type_1.getValueType());
                  String _plus_9 = (_plus_8 + _partialName_3);
                  String _prefixedSymbolName_1 = this.getPrefixedSymbolName(type_1, _plus_9);
                  _builder.append(_prefixedSymbolName_1);
                  _builder.append(" = create");
                  String _name_3 = type_1.eClass().getName();
                  _builder.append(_name_3);
                  _builder.append("(");
                  String _symbolName_1 = this.getSymbolName(type_1.getGeneric());
                  _builder.append(_symbolName_1);
                  _builder.append(");");
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

  protected String declarePrimitiveTypes(final Model root) {
    String _xblockexpression = null;
    {
      Map<org.eclipse.ocl.pivot.Package, List<PrimitiveType>> pkge2primitiveTypes = this.getSortedPrimitiveTypes(root);
      boolean _isEmpty = pkge2primitiveTypes.isEmpty();
      if (_isEmpty) {
        return "";
      }
      List<org.eclipse.ocl.pivot.Package> sortedPackages = this.getSortedPackages(root, pkge2primitiveTypes.keySet());
      StringConcatenation _builder = new StringConcatenation();
      {
        for(final org.eclipse.ocl.pivot.Package pkge : sortedPackages) {
          _builder.newLine();
          {
            List<PrimitiveType> _nullFree = ClassUtil.<PrimitiveType>nullFree(pkge2primitiveTypes.get(pkge));
            for(final PrimitiveType type : _nullFree) {
              _builder.append("\t\t");
              _builder.append("private final @NonNull Class ");
              String _partialName = this.partialName(type);
              String _plus = ("_" + _partialName);
              String _prefixedSymbolNameWithoutNormalization = this.getPrefixedSymbolNameWithoutNormalization(type, _plus);
              _builder.append(_prefixedSymbolNameWithoutNormalization, "\t\t");
              _builder.append(" = createPrimitiveType(\"");
              String _name = type.getName();
              _builder.append(_name, "\t\t");
              _builder.append("\");");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected String declareTupleTypes(final Model root) {
    String _xblockexpression = null;
    {
      List<TupleType> tupleTypes = this.getSortedTupleTypes(root);
      boolean _isEmpty = tupleTypes.isEmpty();
      if (_isEmpty) {
        return "";
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      {
        for(final TupleType type : tupleTypes) {
          _builder.append("private final @NonNull TupleType ");
          String _partialName = this.partialName(type);
          String _plus = ("_" + _partialName);
          String _prefixedSymbolName = this.getPrefixedSymbolName(type, _plus);
          _builder.append(_prefixedSymbolName);
          _builder.append(" = createTupleType(\"");
          String _name = type.getName();
          _builder.append(_name);
          _builder.append("\",");
          _builder.newLineIfNotEmpty();
          {
            List<Property> _sortedTupleParts = this.getSortedTupleParts(type);
            boolean _hasElements = false;
            for(final Property property : _sortedTupleParts) {
              if (!_hasElements) {
                _hasElements = true;
                _builder.append("\t");
              } else {
                _builder.appendImmediate(",\n\t", "");
              }
              _builder.append("createProperty(\"");
              String _name_1 = property.getName();
              _builder.append(_name_1);
              _builder.append("\", ");
              String _symbolName = this.getSymbolName(property.getType());
              _builder.append(_symbolName);
              _builder.append(")");
            }
          }
          _builder.append(");");
          _builder.newLineIfNotEmpty();
        }
      }
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected String defineCoercions(final Model root) {
    String _xblockexpression = null;
    {
      List<Operation> allCoercions = this.getSortedCoercions(root);
      boolean _isEmpty = allCoercions.isEmpty();
      if (_isEmpty) {
        return "";
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("private void installCoercions() {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("List<Operation> ownedCoercions;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Operation coercion;");
      _builder.newLine();
      {
        List<org.eclipse.ocl.pivot.Class> _sortedOwningTypes = this.getSortedOwningTypes(allCoercions);
        for(final org.eclipse.ocl.pivot.Class type : _sortedOwningTypes) {
          _builder.append("\t");
          _builder.append("ownedCoercions = ");
          String _symbolName = this.getSymbolName(type);
          _builder.append(_symbolName, "\t");
          _builder.append(".getCoercions();");
          _builder.newLineIfNotEmpty();
          {
            List<Operation> _sortedCoercions = this.getSortedCoercions(((PrimitiveType) type), allCoercions);
            for(final Operation coercion : _sortedCoercions) {
              _builder.append("\t");
              _builder.append("ownedCoercions.add(coercion = ");
              String _symbolName_1 = this.getSymbolName(coercion);
              _builder.append(_symbolName_1, "\t");
              _builder.append(");");
              _builder.newLineIfNotEmpty();
              {
                LanguageExpression _bodyExpression = coercion.getBodyExpression();
                boolean _tripleNotEquals = (_bodyExpression != null);
                if (_tripleNotEquals) {
                  _builder.append("\t");
                  _builder.append("createBodyExpression(operation, ");
                  String _symbolName_2 = this.getSymbolName(coercion.getType());
                  _builder.append(_symbolName_2, "\t");
                  _builder.append(", \"");
                  String _javaString = this.javaString(coercion.getBodyExpression());
                  _builder.append(_javaString, "\t");
                  _builder.append("\");");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
      }
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected String defineClassTypes(final Model root) {
    String _xblockexpression = null;
    {
      Map<org.eclipse.ocl.pivot.Package, List<org.eclipse.ocl.pivot.Class>> pkge2classTypes = this.getSortedClassTypes(root);
      boolean _isEmpty = pkge2classTypes.isEmpty();
      if (_isEmpty) {
        return "";
      }
      List<org.eclipse.ocl.pivot.Package> sortedPackages = this.getSortedPackages(root, pkge2classTypes.keySet());
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("private void installClassTypes() {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("List<org.eclipse.ocl.pivot.Class> ownedClasses;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("List<org.eclipse.ocl.pivot.Class> superClasses;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("org.eclipse.ocl.pivot.Class type;");
      _builder.newLine();
      {
        for(final org.eclipse.ocl.pivot.Package pkge : sortedPackages) {
          _builder.newLine();
          _builder.append("\t");
          _builder.append("ownedClasses = ");
          String _symbolName = this.getSymbolName(pkge);
          _builder.append(_symbolName, "\t");
          _builder.append(".getOwnedClasses();");
          _builder.newLineIfNotEmpty();
          {
            List<org.eclipse.ocl.pivot.Class> _nullFree = ClassUtil.<org.eclipse.ocl.pivot.Class>nullFree(pkge2classTypes.get(pkge));
            for(final org.eclipse.ocl.pivot.Class type : _nullFree) {
              _builder.append("\t");
              _builder.append("type = ");
              String _symbolName_1 = this.getSymbolName(type);
              _builder.append(_symbolName_1, "\t");
              _builder.append(";");
              _builder.newLineIfNotEmpty();
              {
                boolean _isIsAbstract = type.isIsAbstract();
                if (_isIsAbstract) {
                  _builder.append("\t");
                  _builder.append("type.setIsAbstract(true);");
                  _builder.newLine();
                }
              }
              {
                if ((!(type instanceof AnyType))) {
                  _builder.append("\t");
                  String _emitSuperClasses = this.emitSuperClasses(type, "type");
                  _builder.append(_emitSuperClasses, "\t");
                  _builder.newLineIfNotEmpty();
                }
              }
              {
                int _size = type.getOwnedTemplateParameters().size();
                boolean _greaterThan = (_size > 0);
                if (_greaterThan) {
                  _builder.append("\t");
                  _builder.append("createTemplateSignature(type, ");
                  {
                    List<TemplateParameter> _ownedTemplateParameters = type.getOwnedTemplateParameters();
                    boolean _hasElements = false;
                    for(final TemplateParameter templateParameter : _ownedTemplateParameters) {
                      if (!_hasElements) {
                        _hasElements = true;
                      } else {
                        _builder.appendImmediate(", ", "\t");
                      }
                      String _symbolName_2 = this.getSymbolName(templateParameter);
                      _builder.append(_symbolName_2, "\t");
                    }
                  }
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                }
              }
              _builder.append("\t");
              _builder.append("ownedClasses.add(type);");
              _builder.newLine();
            }
          }
        }
      }
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected String defineCollectionTypes(final Model root) {
    String _xblockexpression = null;
    {
      Map<org.eclipse.ocl.pivot.Package, List<CollectionType>> pkge2collectionTypes = this.getSortedCollectionTypes(root);
      boolean _isEmpty = pkge2collectionTypes.isEmpty();
      if (_isEmpty) {
        return "";
      }
      List<org.eclipse.ocl.pivot.Package> sortedPackages = this.getSortedPackages(root, pkge2collectionTypes.keySet());
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("private void installCollectionTypes() {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("List<org.eclipse.ocl.pivot.Class> ownedClasses;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("List<org.eclipse.ocl.pivot.Class> superClasses;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("CollectionType type;");
      _builder.newLine();
      {
        for(final org.eclipse.ocl.pivot.Package pkge : sortedPackages) {
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("ownedClasses = ");
          String _symbolName = this.getSymbolName(pkge);
          _builder.append(_symbolName, "\t\t");
          _builder.append(".getOwnedClasses();");
          _builder.newLineIfNotEmpty();
          {
            List<CollectionType> _nullFree = ClassUtil.<CollectionType>nullFree(pkge2collectionTypes.get(pkge));
            for(final CollectionType type : _nullFree) {
              _builder.append("\t\t");
              _builder.append("type = ");
              String _symbolName_1 = this.getSymbolName(type);
              _builder.append(_symbolName_1, "\t\t");
              _builder.append(";");
              _builder.newLineIfNotEmpty();
              {
                boolean _isIsAbstract = type.isIsAbstract();
                if (_isIsAbstract) {
                  _builder.append("\t\t");
                  _builder.append("type.setIsAbstract(true);");
                  _builder.newLine();
                }
              }
              {
                int _intValue = type.getLower().intValue();
                boolean _notEquals = (_intValue != 0);
                if (_notEquals) {
                  _builder.append("\t\t");
                  _builder.append("type.setLower(");
                  int _intValue_1 = type.getLower().intValue();
                  _builder.append(_intValue_1, "\t\t");
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                }
              }
              {
                Number _upper = type.getUpper();
                boolean _not = (!(_upper instanceof Unlimited));
                if (_not) {
                  _builder.append("\t\t");
                  _builder.append("type.setUpper(");
                  int _intValue_2 = type.getUpper().intValue();
                  _builder.append(_intValue_2, "\t\t");
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                }
              }
              {
                boolean _isIsNullFree = type.isIsNullFree();
                if (_isIsNullFree) {
                  _builder.append("\t\t");
                  _builder.append("type.setIsNullFree(true);");
                  _builder.newLine();
                }
              }
              _builder.append("\t\t");
              String _emitSuperClasses = this.emitSuperClasses(type, "type");
              _builder.append(_emitSuperClasses, "\t\t");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t");
              _builder.append("ownedClasses.add(type);");
              _builder.newLine();
            }
          }
        }
      }
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected String defineComments(final Model root) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("private void installComments() {");
    _builder.newLine();
    {
      List<Element> _sortedCommentedElements = this.getSortedCommentedElements(root);
      for(final Element pElement : _sortedCommentedElements) {
        {
          List<Comment> _sortedComments = this.getSortedComments(pElement);
          for(final Comment pComment : _sortedComments) {
            _builder.append("\t");
            _builder.append("installComment(");
            String _symbolName = this.getSymbolName(pElement);
            _builder.append(_symbolName, "\t");
            _builder.append(", \"");
            String _javaString = this.javaString(pComment);
            _builder.append(_javaString, "\t");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  protected String defineEnumerations(final Model root) {
    String _xblockexpression = null;
    {
      Map<org.eclipse.ocl.pivot.Package, List<Enumeration>> pkge2enumerations = this.getSortedEnumerations(root);
      boolean _isEmpty = pkge2enumerations.isEmpty();
      if (_isEmpty) {
        return "";
      }
      List<org.eclipse.ocl.pivot.Package> sortedPackages = this.getSortedPackages(root, pkge2enumerations.keySet());
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("private void installEnumerations() {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("List<org.eclipse.ocl.pivot.Class> ownedClasses;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Enumeration type;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("List<EnumerationLiteral> enumerationLiterals;");
      _builder.newLine();
      {
        for(final org.eclipse.ocl.pivot.Package pkge : sortedPackages) {
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("ownedClasses = ");
          String _symbolName = this.getSymbolName(pkge);
          _builder.append(_symbolName, "\t\t");
          _builder.append(".getOwnedClasses();");
          _builder.newLineIfNotEmpty();
          {
            List<Enumeration> _nullFree = ClassUtil.<Enumeration>nullFree(pkge2enumerations.get(pkge));
            for(final Enumeration enumeration : _nullFree) {
              _builder.append("\t\t");
              _builder.append("type = ");
              String _symbolName_1 = this.getSymbolName(enumeration);
              _builder.append(_symbolName_1, "\t\t");
              _builder.append(";");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t");
              _builder.append("enumerationLiterals = type.getOwnedLiterals();");
              _builder.newLine();
              {
                List<EnumerationLiteral> _ownedLiterals = enumeration.getOwnedLiterals();
                for(final EnumerationLiteral enumerationLiteral : _ownedLiterals) {
                  _builder.append("\t\t");
                  _builder.append("enumerationLiterals.add(");
                  String _symbolName_2 = this.getSymbolName(enumerationLiteral);
                  _builder.append(_symbolName_2, "\t\t");
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                }
              }
              _builder.append("\t\t");
              _builder.append("type.getSuperClasses().add(_OclEnumeration);");
              _builder.newLine();
              _builder.append("\t\t");
              _builder.append("ownedClasses.add(type);");
              _builder.newLine();
            }
          }
        }
      }
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected String defineExternals(final Model root) {
    String _xblockexpression = null;
    {
      List<String> externals = this.getSortedExternals(root);
      boolean _isEmpty = externals.isEmpty();
      if (_isEmpty) {
        return "";
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      {
        for(final String name : externals) {
          NamedElement element = ClassUtil.<NamedElement>requireNonNull(this.name2external.get(name));
          _builder.newLineIfNotEmpty();
          {
            if ((element == this.referencedStandardLibrary)) {
            } else {
              if ((element instanceof PrimitiveType)) {
                _builder.append("\t");
                _builder.append("private final org.eclipse.ocl.pivot.@NonNull Class ");
                String _prefixedSymbolName = this.getPrefixedSymbolName(element, name);
                _builder.append(_prefixedSymbolName, "\t");
                _builder.append(" = ");
                String _externalReference = this.getExternalReference(element);
                _builder.append(_externalReference, "\t");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("private final ");
                String _eClassReference = this.getEClassReference(Boolean.valueOf(true), element);
                _builder.append(_eClassReference, "\t");
                _builder.append(" ");
                String _prefixedSymbolName_1 = this.getPrefixedSymbolName(element, name);
                _builder.append(_prefixedSymbolName_1, "\t");
                _builder.append(" = ");
                String _externalReference_1 = this.getExternalReference(element);
                _builder.append(_externalReference_1, "\t");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected String defineInvariants(final Model root) {
    String _xblockexpression = null;
    {
      Map<org.eclipse.ocl.pivot.Package, List<Constraint>> pkge2constraints = this.getSortedInvariants(root);
      boolean _isEmpty = pkge2constraints.isEmpty();
      if (_isEmpty) {
        return "";
      }
      List<org.eclipse.ocl.pivot.Package> sortedPackages = this.getSortedPackages(root, pkge2constraints.keySet());
      org.eclipse.ocl.pivot.Class oldType = null;
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      {
        for(final org.eclipse.ocl.pivot.Package pkge : sortedPackages) {
          {
            List<Constraint> _nullFree = ClassUtil.<Constraint>nullFree(pkge2constraints.get(pkge));
            for(final Constraint constraint : _nullFree) {
              _builder.append("private final @NonNull Constraint ");
              String _partialName = this.partialName(constraint);
              String _plus = ("iv_" + _partialName);
              String _prefixedSymbolName = this.getPrefixedSymbolName(constraint, _plus);
              _builder.append(_prefixedSymbolName);
              _builder.append(" = createInvariant(");
              String _nameLiteral = this.getNameLiteral(constraint);
              _builder.append(_nameLiteral);
              _builder.append(", \"");
              String _name = constraint.getName();
              _builder.append(_name);
              _builder.append("\", \"");
              String _javaString = this.javaString(constraint.getOwnedSpecification());
              _builder.append(_javaString);
              _builder.append("\");");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      _builder.newLine();
      _builder.append("private void installInvariants() {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("List<Constraint> ownedInvariants;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Constraint constraint;");
      _builder.newLine();
      {
        for(final org.eclipse.ocl.pivot.Package pkge_1 : sortedPackages) {
          _builder.append("\t");
          {
            List<Constraint> _nullFree_1 = ClassUtil.<Constraint>nullFree(pkge2constraints.get(pkge_1));
            for(final Constraint constraint_1 : _nullFree_1) {
              EObject _eContainer = constraint_1.eContainer();
              org.eclipse.ocl.pivot.Class newType = ((org.eclipse.ocl.pivot.Class) _eContainer);
              _builder.newLineIfNotEmpty();
              {
                boolean _notEquals = (!Objects.equals(newType, oldType));
                if (_notEquals) {
                  _builder.newLine();
                  _builder.append("\t\t\t\t");
                  _builder.append("ownedInvariants = ");
                  String _symbolName = this.getSymbolName((oldType = newType));
                  _builder.append(_symbolName, "\t\t\t\t");
                  _builder.append(".getOwnedInvariants();");
                  _builder.newLineIfNotEmpty();
                }
              }
              _builder.append("\t");
              _builder.append("ownedInvariants.add(constraint = ");
              String _symbolName_1 = this.getSymbolName(constraint_1);
              _builder.append(_symbolName_1, "\t");
              _builder.append(");");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected String defineIterations(final Model root) {
    String _xblockexpression = null;
    {
      Map<org.eclipse.ocl.pivot.Package, List<Iteration>> pkge2iterations = this.getSortedIterations(root);
      boolean _isEmpty = pkge2iterations.isEmpty();
      if (_isEmpty) {
        return "";
      }
      List<org.eclipse.ocl.pivot.Package> sortedPackages = this.getSortedPackages(root, pkge2iterations.keySet());
      org.eclipse.ocl.pivot.Class oldType = null;
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      {
        for(final org.eclipse.ocl.pivot.Package pkge : sortedPackages) {
          {
            List<Iteration> _nullFree = ClassUtil.<Iteration>nullFree(pkge2iterations.get(pkge));
            for(final Iteration iteration : _nullFree) {
              _builder.append("private final @NonNull Iteration ");
              String _partialName = this.partialName(iteration);
              String _plus = ("it_" + _partialName);
              String _prefixedSymbolName = this.getPrefixedSymbolName(iteration, _plus);
              _builder.append(_prefixedSymbolName);
              _builder.append(" = createIteration(\"");
              String _name = iteration.getName();
              _builder.append(_name);
              _builder.append("\", ");
              String _symbolName = this.getSymbolName(iteration.getType());
              _builder.append(_symbolName);
              _builder.append(", ");
              {
                String _implementationClass = iteration.getImplementationClass();
                boolean _tripleNotEquals = (_implementationClass != null);
                if (_tripleNotEquals) {
                  _builder.append("\"");
                  String _implementationClass_1 = iteration.getImplementationClass();
                  _builder.append(_implementationClass_1);
                  _builder.append("\", ");
                  String _implementationClass_2 = iteration.getImplementationClass();
                  _builder.append(_implementationClass_2);
                  _builder.append(".INSTANCE");
                } else {
                  _builder.append("null, null");
                }
              }
              {
                List<TemplateParameter> _basicGetOwnedTemplateParameters = iteration.basicGetOwnedTemplateParameters();
                boolean _tripleNotEquals_1 = (_basicGetOwnedTemplateParameters != null);
                if (_tripleNotEquals_1) {
                  {
                    List<TemplateParameter> _ownedTemplateParameters = iteration.getOwnedTemplateParameters();
                    for(final TemplateParameter templateParameter : _ownedTemplateParameters) {
                      _builder.append(", ");
                      String _symbolName_1 = this.getSymbolName(templateParameter);
                      _builder.append(_symbolName_1);
                    }
                  }
                }
              }
              _builder.append(");");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      _builder.newLine();
      _builder.append("private void installIterations() {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("List<Operation> ownedIterations;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("List<Parameter> ownedParameters;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Iteration iteration;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Parameter parameter;");
      _builder.newLine();
      {
        for(final org.eclipse.ocl.pivot.Package pkge_1 : sortedPackages) {
          _builder.append("\t");
          {
            List<Iteration> _nullFree_1 = ClassUtil.<Iteration>nullFree(pkge2iterations.get(pkge_1));
            for(final Iteration iteration_1 : _nullFree_1) {
              org.eclipse.ocl.pivot.Class newType = iteration_1.getOwningClass();
              _builder.newLineIfNotEmpty();
              {
                boolean _notEquals = (!Objects.equals(newType, oldType));
                if (_notEquals) {
                  _builder.newLine();
                  _builder.append("\t\t\t\t");
                  _builder.append("ownedIterations = ");
                  String _symbolName_2 = this.getSymbolName((oldType = newType));
                  _builder.append(_symbolName_2, "\t\t\t\t");
                  _builder.append(".getOwnedOperations();");
                  _builder.newLineIfNotEmpty();
                }
              }
              _builder.append("\t");
              _builder.append("ownedIterations.add(iteration = ");
              String _symbolName_3 = this.getSymbolName(iteration_1);
              _builder.append(_symbolName_3, "\t");
              _builder.append(");");
              _builder.newLineIfNotEmpty();
              {
                boolean _isIsInvalidating = iteration_1.isIsInvalidating();
                if (_isIsInvalidating) {
                  _builder.append("\t");
                  _builder.append("iteration.setIsInvalidating(true);");
                  _builder.newLine();
                }
              }
              {
                boolean _isIsRequired = iteration_1.isIsRequired();
                if (_isIsRequired) {
                  _builder.append("\t");
                  _builder.append("iteration.setIsRequired(true);");
                  _builder.newLine();
                }
              }
              {
                boolean _isIsStatic = iteration_1.isIsStatic();
                if (_isIsStatic) {
                  _builder.append("\t");
                  _builder.append("iteration.setIsStatic(true);");
                  _builder.newLine();
                }
              }
              {
                boolean _isIsTypeof = iteration_1.isIsTypeof();
                if (_isIsTypeof) {
                  _builder.append("\t");
                  _builder.append("iteration.setIsTypeof(true);");
                  _builder.newLine();
                }
              }
              {
                boolean _isIsValidating = iteration_1.isIsValidating();
                if (_isIsValidating) {
                  _builder.append("\t");
                  _builder.append("iteration.setIsValidating(true);");
                  _builder.newLine();
                }
              }
              {
                int _size = iteration_1.getOwnedIterators().size();
                boolean _greaterThan = (_size > 0);
                if (_greaterThan) {
                  _builder.append("\t");
                  _builder.append("ownedParameters = iteration.getOwnedIterators();");
                  _builder.newLine();
                  {
                    List<Parameter> _ownedIterators = iteration_1.getOwnedIterators();
                    for(final Parameter parameter : _ownedIterators) {
                      _builder.append("\t");
                      _builder.append("ownedParameters.add(parameter = createParameter(\"");
                      String _name_1 = parameter.getName();
                      _builder.append(_name_1, "\t");
                      _builder.append("\", ");
                      String _symbolName_4 = this.getSymbolName(parameter.getType());
                      _builder.append(_symbolName_4, "\t");
                      _builder.append(", ");
                      boolean _isIsRequired_1 = parameter.isIsRequired();
                      _builder.append(_isIsRequired_1, "\t");
                      _builder.append("));");
                      _builder.newLineIfNotEmpty();
                      {
                        boolean _isIsTypeof_1 = parameter.isIsTypeof();
                        if (_isIsTypeof_1) {
                          _builder.append("\t");
                          _builder.append("parameter.setIsTypeof(true);");
                          _builder.newLine();
                        }
                      }
                    }
                  }
                }
              }
              {
                Parameter _ownedAccumulator = iteration_1.getOwnedAccumulator();
                boolean _tripleNotEquals_2 = (_ownedAccumulator != null);
                if (_tripleNotEquals_2) {
                  _builder.append("\t");
                  _builder.append("iteration.setOwnedAccumulator(parameter = createParameter(\"");
                  String _name_2 = iteration_1.getOwnedAccumulator().getName();
                  _builder.append(_name_2, "\t");
                  _builder.append("\", ");
                  String _symbolName_5 = this.getSymbolName(iteration_1.getOwnedAccumulator().getType());
                  _builder.append(_symbolName_5, "\t");
                  _builder.append(", ");
                  boolean _isIsRequired_2 = iteration_1.getOwnedAccumulator().isIsRequired();
                  _builder.append(_isIsRequired_2, "\t");
                  _builder.append("));");
                  _builder.newLineIfNotEmpty();
                  {
                    boolean _isIsTypeof_2 = iteration_1.getOwnedAccumulator().isIsTypeof();
                    if (_isIsTypeof_2) {
                      _builder.append("\t");
                      _builder.append("parameter.setIsTypeof(true);");
                      _builder.newLine();
                    }
                  }
                }
              }
              {
                int _size_1 = iteration_1.getOwnedParameters().size();
                boolean _greaterThan_1 = (_size_1 > 0);
                if (_greaterThan_1) {
                  _builder.append("\t");
                  _builder.append("ownedParameters = iteration.getOwnedParameters();");
                  _builder.newLine();
                  {
                    List<Parameter> _ownedParameters = iteration_1.getOwnedParameters();
                    for(final Parameter parameter_1 : _ownedParameters) {
                      _builder.append("\t");
                      _builder.append("ownedParameters.add(parameter = createParameter(\"");
                      String _name_3 = parameter_1.getName();
                      _builder.append(_name_3, "\t");
                      _builder.append("\", ");
                      String _symbolName_6 = this.getSymbolName(parameter_1.getType());
                      _builder.append(_symbolName_6, "\t");
                      _builder.append(", ");
                      boolean _isIsRequired_3 = parameter_1.isIsRequired();
                      _builder.append(_isIsRequired_3, "\t");
                      _builder.append("));");
                      _builder.newLineIfNotEmpty();
                      {
                        boolean _isIsTypeof_3 = parameter_1.isIsTypeof();
                        if (_isIsTypeof_3) {
                          _builder.append("\t");
                          _builder.append("parameter.setIsTypeof(true);");
                          _builder.newLine();
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected String defineLambdaTypes(final Model root) {
    String _xblockexpression = null;
    {
      List<LambdaType> allLambdaTypes = this.getSortedLambdaTypes(root);
      boolean _isEmpty = allLambdaTypes.isEmpty();
      if (_isEmpty) {
        return "";
      }
      org.eclipse.ocl.pivot.Package orphanPackage = this.getOrphanPackage(root);
      if ((orphanPackage == null)) {
        return "";
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      {
        for(final LambdaType type : allLambdaTypes) {
          _builder.append("private final @NonNull LambdaType ");
          String _partialName = this.partialName(type);
          String _plus = ("_" + _partialName);
          String _prefixedSymbolName = this.getPrefixedSymbolName(type, _plus);
          _builder.append(_prefixedSymbolName);
          _builder.append(" = createLambdaType(\"");
          String _name = type.getName();
          _builder.append(_name);
          _builder.append("\");");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      _builder.append("private void installLambdaTypes() {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("final List<org.eclipse.ocl.pivot.Class> orphanTypes = ");
      String _symbolName = this.getSymbolName(ClassUtil.<org.eclipse.ocl.pivot.Package>requireNonNull(orphanPackage));
      _builder.append(_symbolName, "\t");
      _builder.append(".getOwnedClasses();");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("LambdaType type;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("List<org.eclipse.ocl.pivot.Class> superClasses;");
      _builder.newLine();
      {
        for(final LambdaType type_1 : allLambdaTypes) {
          _builder.append("\t");
          _builder.append("orphanTypes.add(type = ");
          String _symbolName_1 = this.getSymbolName(type_1);
          _builder.append(_symbolName_1, "\t");
          _builder.append(");\t");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("type.setOwnedContext(createLambdaParameter(\"");
          String _name_1 = type_1.getOwnedContext().getName();
          _builder.append(_name_1, "\t");
          _builder.append("\", ");
          String _templateIndex = this.getTemplateIndex(type_1.getOwnedContext().getType());
          _builder.append(_templateIndex, "\t");
          _builder.append(", ");
          String _xifexpression = null;
          boolean _isIsRequired = type_1.getOwnedContext().isIsRequired();
          if (_isIsRequired) {
            _xifexpression = "true";
          } else {
            _xifexpression = "false";
          }
          _builder.append(_xifexpression, "\t");
          _builder.append("));");
          _builder.newLineIfNotEmpty();
          {
            List<LambdaParameter> _ownedParameters = type_1.getOwnedParameters();
            for(final LambdaParameter parameter : _ownedParameters) {
              _builder.append("\t");
              _builder.append("type.getOwnedParameters().add(createLambdaParameter(\"");
              String _name_2 = parameter.getName();
              _builder.append(_name_2, "\t");
              _builder.append("\", ");
              String _templateIndex_1 = this.getTemplateIndex(parameter.getType());
              _builder.append(_templateIndex_1, "\t");
              _builder.append(", ");
              String _xifexpression_1 = null;
              boolean _isIsRequired_1 = parameter.isIsRequired();
              if (_isIsRequired_1) {
                _xifexpression_1 = "true";
              } else {
                _xifexpression_1 = "false";
              }
              _builder.append(_xifexpression_1, "\t");
              _builder.append("));");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append("\t");
          _builder.append("type.setOwnedResult(createLambdaParameter(\"");
          String _name_3 = type_1.getOwnedResult().getName();
          _builder.append(_name_3, "\t");
          _builder.append("\", ");
          String _templateIndex_2 = this.getTemplateIndex(type_1.getOwnedResult().getType());
          _builder.append(_templateIndex_2, "\t");
          _builder.append(", ");
          String _xifexpression_2 = null;
          boolean _isIsRequired_2 = type_1.getOwnedResult().isIsRequired();
          if (_isIsRequired_2) {
            _xifexpression_2 = "true";
          } else {
            _xifexpression_2 = "false";
          }
          _builder.append(_xifexpression_2, "\t");
          _builder.append("));");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          String _emitSuperClasses = this.emitSuperClasses(type_1, "type");
          _builder.append(_emitSuperClasses, "\t");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected String defineMapTypes(final Model root) {
    String _xblockexpression = null;
    {
      Map<org.eclipse.ocl.pivot.Package, List<MapType>> pkge2mapTypes = this.getSortedMapTypes(root);
      boolean _isEmpty = pkge2mapTypes.isEmpty();
      if (_isEmpty) {
        return "";
      }
      List<org.eclipse.ocl.pivot.Package> sortedPackages = this.getSortedPackages(root, pkge2mapTypes.keySet());
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("private void installMapTypes() {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("List<org.eclipse.ocl.pivot.Class> ownedClasses;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("List<org.eclipse.ocl.pivot.Class> superClasses;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("MapType type;");
      _builder.newLine();
      {
        for(final org.eclipse.ocl.pivot.Package pkge : sortedPackages) {
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("ownedClasses = ");
          String _symbolName = this.getSymbolName(pkge);
          _builder.append(_symbolName, "\t\t");
          _builder.append(".getOwnedClasses();");
          _builder.newLineIfNotEmpty();
          {
            List<MapType> _nullFree = ClassUtil.<MapType>nullFree(pkge2mapTypes.get(pkge));
            for(final MapType type : _nullFree) {
              _builder.append("\t\t");
              _builder.append("type = ");
              String _symbolName_1 = this.getSymbolName(type);
              _builder.append(_symbolName_1, "\t\t");
              _builder.append(";");
              _builder.newLineIfNotEmpty();
              {
                boolean _isKeysAreNullFree = type.isKeysAreNullFree();
                boolean _not = (!_isKeysAreNullFree);
                if (_not) {
                  _builder.append("\t\t");
                  _builder.append("type.setKeysAreNullFree(false);");
                  _builder.newLine();
                }
              }
              {
                boolean _isValuesAreNullFree = type.isValuesAreNullFree();
                boolean _not_1 = (!_isValuesAreNullFree);
                if (_not_1) {
                  _builder.append("\t\t");
                  _builder.append("type.setValuesAreNullFree(false);");
                  _builder.newLine();
                }
              }
              _builder.append("\t\t");
              String _emitSuperClasses = this.emitSuperClasses(type, "type");
              _builder.append(_emitSuperClasses, "\t\t");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t");
              _builder.append("ownedClasses.add(type);");
              _builder.newLine();
            }
          }
        }
      }
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected String defineOperations(final Model root) {
    String _xblockexpression = null;
    {
      Map<org.eclipse.ocl.pivot.Package, List<Operation>> pkge2operations = this.getSortedOperations(root);
      boolean _isEmpty = pkge2operations.isEmpty();
      if (_isEmpty) {
        return "";
      }
      List<org.eclipse.ocl.pivot.Package> sortedPackages = this.getSortedPackages(root, pkge2operations.keySet());
      org.eclipse.ocl.pivot.Class oldType = null;
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      {
        for(final org.eclipse.ocl.pivot.Package pkge : sortedPackages) {
          {
            List<Operation> _nullFree = ClassUtil.<Operation>nullFree(pkge2operations.get(pkge));
            for(final Operation operation : _nullFree) {
              _builder.append("private final @NonNull Operation ");
              String _partialName = this.partialName(operation);
              String _plus = ("op_" + _partialName);
              String _prefixedSymbolName = this.getPrefixedSymbolName(operation, _plus);
              _builder.append(_prefixedSymbolName);
              _builder.append(" = createOperation(");
              String _nameLiteral = this.getNameLiteral(operation);
              _builder.append(_nameLiteral);
              _builder.append(", ");
              String _symbolName = this.getSymbolName(operation.getType());
              _builder.append(_symbolName);
              _builder.append(", ");
              {
                String _implementationClass = operation.getImplementationClass();
                boolean _tripleNotEquals = (_implementationClass != null);
                if (_tripleNotEquals) {
                  _builder.append("\"");
                  String _implementationClass_1 = operation.getImplementationClass();
                  _builder.append(_implementationClass_1);
                  _builder.append("\", ");
                  String _implementationClass_2 = operation.getImplementationClass();
                  _builder.append(_implementationClass_2);
                  _builder.append(".INSTANCE");
                } else {
                  _builder.append("null, null");
                }
              }
              {
                List<TemplateParameter> _basicGetOwnedTemplateParameters = operation.basicGetOwnedTemplateParameters();
                boolean _tripleNotEquals_1 = (_basicGetOwnedTemplateParameters != null);
                if (_tripleNotEquals_1) {
                  {
                    List<TemplateParameter> _ownedTemplateParameters = operation.getOwnedTemplateParameters();
                    for(final TemplateParameter templateParameter : _ownedTemplateParameters) {
                      _builder.append(", ");
                      String _symbolName_1 = this.getSymbolName(templateParameter);
                      _builder.append(_symbolName_1);
                    }
                  }
                }
              }
              _builder.append(");");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      _builder.newLine();
      _builder.append("private void installOperations() {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("List<Operation> ownedOperations;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("List<Parameter> ownedParameters;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Operation operation;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Parameter parameter;");
      _builder.newLine();
      {
        for(final org.eclipse.ocl.pivot.Package pkge_1 : sortedPackages) {
          _builder.append("\t");
          {
            List<Operation> _nullFree_1 = ClassUtil.<Operation>nullFree(pkge2operations.get(pkge_1));
            for(final Operation operation_1 : _nullFree_1) {
              org.eclipse.ocl.pivot.Class newType = operation_1.getOwningClass();
              _builder.newLineIfNotEmpty();
              {
                boolean _notEquals = (!Objects.equals(newType, oldType));
                if (_notEquals) {
                  _builder.newLine();
                  _builder.append("\t\t\t\t");
                  _builder.append("ownedOperations = ");
                  String _symbolName_2 = this.getSymbolName((oldType = newType));
                  _builder.append(_symbolName_2, "\t\t\t\t");
                  _builder.append(".getOwnedOperations();");
                  _builder.newLineIfNotEmpty();
                }
              }
              _builder.append("\t");
              _builder.append("ownedOperations.add(operation = ");
              String _symbolName_3 = this.getSymbolName(operation_1);
              _builder.append(_symbolName_3, "\t");
              _builder.append(");");
              _builder.newLineIfNotEmpty();
              {
                boolean _isIsInvalidating = operation_1.isIsInvalidating();
                if (_isIsInvalidating) {
                  _builder.append("\t");
                  _builder.append("operation.setIsInvalidating(true);");
                  _builder.newLine();
                }
              }
              {
                boolean _isIsRequired = operation_1.isIsRequired();
                if (_isIsRequired) {
                  _builder.append("\t");
                  _builder.append("operation.setIsRequired(true);");
                  _builder.newLine();
                }
              }
              {
                boolean _isIsStatic = operation_1.isIsStatic();
                if (_isIsStatic) {
                  _builder.append("\t");
                  _builder.append("operation.setIsStatic(true);");
                  _builder.newLine();
                }
              }
              {
                boolean _isIsTypeof = operation_1.isIsTypeof();
                if (_isIsTypeof) {
                  _builder.append("\t");
                  _builder.append("operation.setIsTypeof(true);");
                  _builder.newLine();
                }
              }
              {
                boolean _isIsValidating = operation_1.isIsValidating();
                if (_isIsValidating) {
                  _builder.append("\t");
                  _builder.append("operation.setIsValidating(true);");
                  _builder.newLine();
                }
              }
              {
                LanguageExpression _bodyExpression = operation_1.getBodyExpression();
                boolean _tripleNotEquals_2 = (_bodyExpression != null);
                if (_tripleNotEquals_2) {
                  _builder.append("\t");
                  _builder.append("createBodyExpression(operation, ");
                  String _symbolName_4 = this.getSymbolName(operation_1.getOwningClass());
                  _builder.append(_symbolName_4, "\t");
                  _builder.append(", \"");
                  String _javaString = this.javaString(operation_1.getBodyExpression());
                  _builder.append(_javaString, "\t");
                  _builder.append("\", ");
                  String _symbolName_5 = this.getSymbolName(operation_1.getType());
                  _builder.append(_symbolName_5, "\t");
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                }
              }
              {
                int _size = operation_1.getOwnedParameters().size();
                boolean _greaterThan = (_size > 0);
                if (_greaterThan) {
                  _builder.append("\t");
                  _builder.append("ownedParameters = operation.getOwnedParameters();");
                  _builder.newLine();
                  {
                    List<Parameter> _ownedParameters = operation_1.getOwnedParameters();
                    for(final Parameter parameter : _ownedParameters) {
                      _builder.append("\t");
                      _builder.append("ownedParameters.add(parameter = createParameter(\"");
                      String _name = parameter.getName();
                      _builder.append(_name, "\t");
                      _builder.append("\", ");
                      String _symbolName_6 = this.getSymbolName(parameter.getType());
                      _builder.append(_symbolName_6, "\t");
                      _builder.append(", ");
                      boolean _isIsRequired_1 = parameter.isIsRequired();
                      _builder.append(_isIsRequired_1, "\t");
                      _builder.append("));");
                      _builder.newLineIfNotEmpty();
                      {
                        boolean _isIsTypeof_1 = parameter.isIsTypeof();
                        if (_isIsTypeof_1) {
                          _builder.append("\t");
                          _builder.append("parameter.setIsTypeof(true);");
                          _builder.newLine();
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected String definePackages(final Model root) {
    String _xblockexpression = null;
    {
      List<org.eclipse.ocl.pivot.Package> localPackages = this.getSortedLocalPackages(root);
      Map<org.eclipse.ocl.pivot.Package, String> import2alias = this.getSortedImports(root);
      Set<org.eclipse.ocl.pivot.Package> _keySet = import2alias.keySet();
      ArrayList<org.eclipse.ocl.pivot.Package> importKeys = new ArrayList<org.eclipse.ocl.pivot.Package>(_keySet);
      Collections.<org.eclipse.ocl.pivot.Package>sort(importKeys, NameUtil.NAMEABLE_COMPARATOR);
      boolean _isEmpty = localPackages.isEmpty();
      if (_isEmpty) {
        return "";
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("private void installPackages() {");
      _builder.newLine();
      _builder.append("\t");
      String _emitRoot = this.emitRoot(root);
      _builder.append(_emitRoot, "\t");
      _builder.newLineIfNotEmpty();
      {
        for(final org.eclipse.ocl.pivot.Package importKey : importKeys) {
          final String importName = import2alias.get(importKey);
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          String _symbolName = this.getSymbolName(root);
          _builder.append(_symbolName, "\t\t");
          _builder.append(".getOwnedImports().add(createImport(");
          {
            if ((importName != null)) {
              _builder.append("\"");
              _builder.append(importName, "\t\t");
              _builder.append("\"");
            } else {
              _builder.append("null");
            }
          }
          _builder.append(", ");
          String _symbolName_1 = this.getSymbolName(importKey);
          _builder.append(_symbolName_1, "\t\t");
          _builder.append("));");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected String definePrecedences(final Model root) {
    String _xblockexpression = null;
    {
      List<Library> allLibraries = this.getSortedLibrariesWithPrecedence(root);
      List<Operation> allOperations = this.getSortedOperationsWithPrecedence(root);
      StringConcatenation _builder = new StringConcatenation();
      {
        if (((allLibraries.size() > 0) || (allOperations.size() > 0))) {
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("private void installPrecedences() {");
          _builder.newLine();
          {
            int _size = allLibraries.size();
            boolean _greaterThan = (_size > 0);
            if (_greaterThan) {
              _builder.append("\t\t\t\t");
              _builder.append("List<Precedence> ownedPrecedences;");
              _builder.newLine();
              _builder.newLine();
              {
                for(final Library lib : allLibraries) {
                  _builder.append("\t\t");
                  List<Precedence> allPrecedences = this.getSortedPrecedences(lib);
                  _builder.newLineIfNotEmpty();
                  {
                    if (((allPrecedences != null) && (allPrecedences.size() > 0))) {
                      {
                        for(final Precedence precedence : allPrecedences) {
                          _builder.append("\t\t\t\t");
                          _builder.append("final Precedence ");
                          String _partialName = this.partialName(precedence);
                          String _plus = ("prec_" + _partialName);
                          String _prefixedSymbolName = this.getPrefixedSymbolName(precedence, _plus);
                          _builder.append(_prefixedSymbolName, "\t\t\t\t");
                          _builder.append(" = createPrecedence(\"");
                          String _name = precedence.getName();
                          _builder.append(_name, "\t\t\t\t");
                          _builder.append("\", AssociativityKind.");
                          String _upperCase = precedence.getAssociativity().toString().toUpperCase();
                          _builder.append(_upperCase, "\t\t\t\t");
                          _builder.append(");");
                          _builder.newLineIfNotEmpty();
                        }
                      }
                      _builder.newLine();
                      _builder.append("\t\t\t\t");
                      _builder.append("ownedPrecedences = ");
                      String _symbolName = this.getSymbolName(lib);
                      _builder.append(_symbolName, "\t\t\t\t");
                      _builder.append(".getOwnedPrecedences();");
                      _builder.newLineIfNotEmpty();
                      {
                        List<Precedence> _ownedPrecedences = lib.getOwnedPrecedences();
                        for(final Precedence precedence_1 : _ownedPrecedences) {
                          _builder.append("\t\t\t\t");
                          _builder.append("ownedPrecedences.add(");
                          String _symbolName_1 = this.getSymbolName(precedence_1);
                          _builder.append(_symbolName_1, "\t\t\t\t");
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
          _builder.newLine();
          {
            for(final Operation operation : allOperations) {
              _builder.append("\t");
              String _symbolName_2 = this.getSymbolName(operation);
              _builder.append(_symbolName_2, "\t");
              _builder.append(".setPrecedence(");
              String _symbolName_3 = this.getSymbolName(operation.getPrecedence());
              _builder.append(_symbolName_3, "\t");
              _builder.append(");");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
        }
      }
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected String definePrimitiveTypes(final Model root) {
    String _xblockexpression = null;
    {
      Map<org.eclipse.ocl.pivot.Package, List<PrimitiveType>> pkge2primitiveTypes = this.getSortedPrimitiveTypes(root);
      boolean _isEmpty = pkge2primitiveTypes.isEmpty();
      if (_isEmpty) {
        return "";
      }
      List<org.eclipse.ocl.pivot.Package> sortedPackages = this.getSortedPackages(root, pkge2primitiveTypes.keySet());
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("private void installPrimitiveTypes() {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("List<org.eclipse.ocl.pivot.Class> ownedClasses;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("PrimitiveType type;");
      _builder.newLine();
      {
        for(final org.eclipse.ocl.pivot.Package pkge : sortedPackages) {
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("ownedClasses = ");
          String _symbolName = this.getSymbolName(pkge);
          _builder.append(_symbolName, "\t\t");
          _builder.append(".getOwnedClasses();");
          _builder.newLineIfNotEmpty();
          {
            List<PrimitiveType> _nullFree = ClassUtil.<PrimitiveType>nullFree(pkge2primitiveTypes.get(pkge));
            for(final PrimitiveType type : _nullFree) {
              _builder.append("\t\t");
              List<org.eclipse.ocl.pivot.Class> superClasses = this.getSuperclassesInPackage(type);
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t");
              _builder.append("type = ");
              String _symbolNameWithoutNormalization = this.getSymbolNameWithoutNormalization(type);
              _builder.append(_symbolNameWithoutNormalization, "\t\t");
              _builder.append(";");
              _builder.newLineIfNotEmpty();
              {
                for(final org.eclipse.ocl.pivot.Class superClass : superClasses) {
                  _builder.append("\t\t");
                  _builder.append("type.getSuperClasses().add(");
                  String _symbolName_1 = this.getSymbolName(superClass);
                  _builder.append(_symbolName_1, "\t\t");
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                }
              }
              _builder.append("\t\t");
              _builder.append("ownedClasses.add(type);");
              _builder.newLine();
            }
          }
        }
      }
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected String defineProperties(final Model root) {
    String _xblockexpression = null;
    {
      Map<org.eclipse.ocl.pivot.Package, List<Property>> pkge2properties = this.getSortedProperties(root);
      boolean _isEmpty = pkge2properties.isEmpty();
      if (_isEmpty) {
        return "";
      }
      List<org.eclipse.ocl.pivot.Package> sortedPackages = this.getSortedPackages(root, pkge2properties.keySet());
      org.eclipse.ocl.pivot.Class oldType = null;
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      {
        for(final org.eclipse.ocl.pivot.Package pkge : sortedPackages) {
          _builder.newLine();
          {
            List<Property> _nullFree = ClassUtil.<Property>nullFree(pkge2properties.get(pkge));
            for(final Property property : _nullFree) {
              _builder.append("\t\t");
              _builder.append("private final @NonNull Property ");
              String _partialName = this.partialName(property);
              String _plus = ("pr_" + _partialName);
              String _prefixedSymbolName = this.getPrefixedSymbolName(property, _plus);
              _builder.append(_prefixedSymbolName, "\t\t");
              _builder.append(" = createProperty(");
              String _nameLiteral = this.getNameLiteral(property);
              _builder.append(_nameLiteral, "\t\t");
              _builder.append(", ");
              String _symbolName = this.getSymbolName(property.getType());
              _builder.append(_symbolName, "\t\t");
              _builder.append(");");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      _builder.newLine();
      _builder.append("private void installProperties() {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("List<Property> ownedProperties;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Property property;");
      _builder.newLine();
      {
        for(final org.eclipse.ocl.pivot.Package pkge_1 : sortedPackages) {
          _builder.append("\t");
          {
            List<Property> _nullFree_1 = ClassUtil.<Property>nullFree(pkge2properties.get(pkge_1));
            for(final Property property_1 : _nullFree_1) {
              org.eclipse.ocl.pivot.Class newType = property_1.getOwningClass();
              _builder.newLineIfNotEmpty();
              {
                boolean _notEquals = (!Objects.equals(newType, oldType));
                if (_notEquals) {
                  _builder.newLine();
                  _builder.append("\t\t\t\t");
                  _builder.append("ownedProperties = ");
                  String _symbolName_1 = this.getSymbolName((oldType = newType));
                  _builder.append(_symbolName_1, "\t\t\t\t");
                  _builder.append(".getOwnedProperties();");
                  _builder.newLineIfNotEmpty();
                }
              }
              _builder.append("\t");
              _builder.append("ownedProperties.add(property = ");
              String _symbolName_2 = this.getSymbolName(property_1);
              _builder.append(_symbolName_2, "\t");
              _builder.append(");");
              _builder.newLineIfNotEmpty();
              {
                boolean _isIsComposite = property_1.isIsComposite();
                if (_isIsComposite) {
                  _builder.append("\t");
                  _builder.append("property.setIsComposite(true);");
                  _builder.newLine();
                }
              }
              {
                boolean _isIsDerived = property_1.isIsDerived();
                if (_isIsDerived) {
                  _builder.append("\t");
                  _builder.append("property.setIsDerived(true);");
                  _builder.newLine();
                }
              }
              {
                boolean _isIsID = property_1.isIsID();
                if (_isIsID) {
                  _builder.append("\t");
                  _builder.append("property.setIsID(true);");
                  _builder.newLine();
                }
              }
              {
                boolean _isIsImplicit = property_1.isIsImplicit();
                if (_isIsImplicit) {
                  _builder.append("\t");
                  _builder.append("property.setIsImplicit(true);");
                  _builder.newLine();
                }
              }
              {
                boolean _isIsReadOnly = property_1.isIsReadOnly();
                if (_isIsReadOnly) {
                  _builder.append("\t");
                  _builder.append("property.setIsReadOnly(true);");
                  _builder.newLine();
                }
              }
              {
                boolean _isIsRequired = property_1.isIsRequired();
                if (_isIsRequired) {
                  _builder.append("\t");
                  _builder.append("property.setIsRequired(true);");
                  _builder.newLine();
                }
              }
              {
                boolean _isIsResolveProxies = property_1.isIsResolveProxies();
                if (_isIsResolveProxies) {
                  _builder.append("\t");
                  _builder.append("property.setIsResolveProxies(true);");
                  _builder.newLine();
                }
              }
              {
                boolean _isIsStatic = property_1.isIsStatic();
                if (_isIsStatic) {
                  _builder.append("\t");
                  _builder.append("property.setIsStatic(true);");
                  _builder.newLine();
                }
              }
              {
                boolean _isIsTransient = property_1.isIsTransient();
                if (_isIsTransient) {
                  _builder.append("\t");
                  _builder.append("property.setIsTransient(true);");
                  _builder.newLine();
                }
              }
              {
                if (false) {
                  _builder.append("\t");
                  _builder.append("property.setIsTypeof(true);");
                  _builder.newLine();
                }
              }
              {
                boolean _isIsUnsettable = property_1.isIsUnsettable();
                if (_isIsUnsettable) {
                  _builder.append("\t");
                  _builder.append("property.setIsUnsettable(true);");
                  _builder.newLine();
                }
              }
              {
                boolean _isIsVolatile = property_1.isIsVolatile();
                if (_isIsVolatile) {
                  _builder.append("\t");
                  _builder.append("property.setIsVolatile(true);");
                  _builder.newLine();
                }
              }
              {
                String _defaultValueString = property_1.getDefaultValueString();
                boolean _tripleNotEquals = (_defaultValueString != null);
                if (_tripleNotEquals) {
                  _builder.append("\t");
                  _builder.append("property.setDefaultValueString(\"");
                  String _defaultValueString_1 = property_1.getDefaultValueString();
                  _builder.append(_defaultValueString_1, "\t");
                  _builder.append("\");");
                  _builder.newLineIfNotEmpty();
                }
              }
              {
                Property _opposite = property_1.getOpposite();
                boolean _tripleNotEquals_1 = (_opposite != null);
                if (_tripleNotEquals_1) {
                  _builder.append("\t");
                  _builder.append("property.setOpposite(");
                  String _symbolName_3 = this.getSymbolName(property_1.getOpposite());
                  _builder.append(_symbolName_3, "\t");
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                }
              }
              {
                String _implementationClass = property_1.getImplementationClass();
                boolean _tripleNotEquals_2 = (_implementationClass != null);
                if (_tripleNotEquals_2) {
                  _builder.append("\t");
                  _builder.append("property.setImplementationClass(\"");
                  String _implementationClass_1 = property_1.getImplementationClass();
                  _builder.append(_implementationClass_1, "\t");
                  _builder.append("\");");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("property.setImplementation(");
                  String _implementationClass_2 = property_1.getImplementationClass();
                  _builder.append(_implementationClass_2, "\t");
                  _builder.append(".INSTANCE);");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
      }
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected String defineTemplateBindings(final Model root) {
    String _xblockexpression = null;
    {
      List<TemplateableElement> allTemplateableElements = this.getSortedTemplateableElements(root, this.symbolNameComparator);
      boolean _isEmpty = allTemplateableElements.isEmpty();
      if (_isEmpty) {
        return "";
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("private void installTemplateArguments() {");
      _builder.newLine();
      {
        for(final TemplateableElement templateableElement : allTemplateableElements) {
          {
            List<TemplateArgument> _ownedTemplateArguments = templateableElement.getOwnedTemplateArguments();
            for(final TemplateArgument templateArgument : _ownedTemplateArguments) {
              _builder.append("\t");
              _builder.append("addBinding(");
              String _symbolName = this.getSymbolName(templateableElement);
              _builder.append(_symbolName, "\t");
              _builder.append(", ");
              String _templateIndex = this.getTemplateIndex(templateArgument.getActual());
              _builder.append(_templateIndex, "\t");
              _builder.append(");");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected String defineTemplateParameters(final Model root) {
    String _xblockexpression = null;
    {
      List<TemplateParameter> allTemplateParameters = this.getSortedTemplateParameters(root);
      boolean _isEmpty = allTemplateParameters.isEmpty();
      if (_isEmpty) {
        return "";
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      {
        for(final TemplateParameter templateParameter : allTemplateParameters) {
          _builder.append("private final @NonNull TemplateParameter ");
          String _partialName = this.partialName(templateParameter);
          String _plus = ("tp_" + _partialName);
          String _prefixedSymbolName = this.getPrefixedSymbolName(templateParameter, _plus);
          _builder.append(_prefixedSymbolName);
          _builder.append(" = createTemplateParameter(\"");
          String _name = templateParameter.getName();
          _builder.append(_name);
          _builder.append("\");");
          _builder.newLineIfNotEmpty();
        }
      }
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected String defineTupleTypes(final Model root) {
    String _xblockexpression = null;
    {
      List<TupleType> allTupleTypes = this.getSortedTupleTypes(root);
      boolean _isEmpty = allTupleTypes.isEmpty();
      if (_isEmpty) {
        return "";
      }
      org.eclipse.ocl.pivot.Package orphanPackage = this.getOrphanPackage(root);
      if ((orphanPackage == null)) {
        return "";
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("private void installTupleTypes() {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("final List<org.eclipse.ocl.pivot.Class> orphanTypes = ");
      String _symbolName = this.getSymbolName(ClassUtil.<org.eclipse.ocl.pivot.Package>requireNonNull(orphanPackage));
      _builder.append(_symbolName, "\t");
      _builder.append(".getOwnedClasses();");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("TupleType type;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("List<org.eclipse.ocl.pivot.Class> superClasses;");
      _builder.newLine();
      {
        for(final TupleType type : allTupleTypes) {
          _builder.append("\t");
          _builder.append("orphanTypes.add(type = ");
          String _symbolName_1 = this.getSymbolName(type);
          _builder.append(_symbolName_1, "\t");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
          {
            List<Property> _sortedProperties = this.getSortedProperties(type);
            for(final Property property : _sortedProperties) {
              {
                String _implementationClass = property.getImplementationClass();
                boolean _tripleNotEquals = (_implementationClass != null);
                if (_tripleNotEquals) {
                  _builder.append("\t");
                  String _symbolName_2 = this.getSymbolName(property);
                  _builder.append(_symbolName_2, "\t");
                  _builder.append(".setImplementationClass(\"");
                  String _implementationClass_1 = property.getImplementationClass();
                  _builder.append(_implementationClass_1, "\t");
                  _builder.append("\");");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  String _symbolName_3 = this.getSymbolName(property);
                  _builder.append(_symbolName_3, "\t");
                  _builder.append(".setImplementation(");
                  String _implementationClass_2 = property.getImplementationClass();
                  _builder.append(_implementationClass_2, "\t");
                  _builder.append(".INSTANCE);");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
          _builder.append("\t");
          String _emitSuperClasses = this.emitSuperClasses(type, "type");
          _builder.append(_emitSuperClasses, "\t");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected String emitCreateProperty(final Property property) {
    String _name = property.getName();
    String _plus = ("createProperty(" + _name);
    String _plus_1 = (_plus + ", ");
    String _symbolName = this.getSymbolName(property.getType());
    String _plus_2 = (_plus_1 + _symbolName);
    return (_plus_2 + ")");
  }

  protected String emitPackage(final org.eclipse.ocl.pivot.Package pkg) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<org.eclipse.ocl.pivot.Package> _sortedNestedPackages = this.getSortedNestedPackages(pkg);
      for(final org.eclipse.ocl.pivot.Package nestedPackage : _sortedNestedPackages) {
        String _symbolName = this.getSymbolName(pkg);
        _builder.append(_symbolName);
        _builder.append(".getOwnedPackages().add(");
        String _symbolName_1 = this.getSymbolName(nestedPackage);
        _builder.append(_symbolName_1);
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        String _emitPackage = this.emitPackage(nestedPackage);
        _builder.append(_emitPackage);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }

  protected String emitRoot(final Model root) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<org.eclipse.ocl.pivot.Package> _sortedNestedPackages = this.getSortedNestedPackages(root);
      for(final org.eclipse.ocl.pivot.Package localPackage : _sortedNestedPackages) {
        String _symbolName = this.getSymbolName(root);
        _builder.append(_symbolName);
        _builder.append(".getOwnedPackages().add(");
        String _symbolName_1 = this.getSymbolName(localPackage);
        _builder.append(_symbolName_1);
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        String _emitPackage = this.emitPackage(localPackage);
        _builder.append(_emitPackage);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }

  protected String emitSuperClasses(final org.eclipse.ocl.pivot.Class type, final String typeName) {
    String _xblockexpression = null;
    {
      List<org.eclipse.ocl.pivot.Class> superClasses = this.getSuperclassesInPackage(type);
      StringConcatenation _builder = new StringConcatenation();
      {
        int _size = superClasses.size();
        boolean _greaterThan = (_size > 0);
        if (_greaterThan) {
          _builder.append("superClasses = ");
          _builder.append(typeName);
          _builder.append(".getSuperClasses();");
          _builder.newLineIfNotEmpty();
          {
            for(final org.eclipse.ocl.pivot.Class superClass : superClasses) {
              _builder.append("superClasses.add(");
              String _symbolName = this.getSymbolName(superClass);
              _builder.append(_symbolName);
              _builder.append(");");
              _builder.newLineIfNotEmpty();
            }
          }
        } else {
          if ((type instanceof MapType)) {
            _builder.append("superClasses = ");
            _builder.append(typeName);
            _builder.append(".getSuperClasses();");
            _builder.newLineIfNotEmpty();
            _builder.append("superClasses.add(_OclAny);");
            _builder.newLine();
          } else {
            if ((type instanceof AnyType)) {
            } else {
              boolean _equals = TypeId.OCL_ELEMENT_NAME.equals(type.getName());
              if (_equals) {
              } else {
                boolean _equals_1 = PivotConstants.ORPHANAGE_NAME.equals(type.getName());
                if (_equals_1) {
                } else {
                  _builder.append("superClasses = ");
                  _builder.append(typeName);
                  _builder.append(".getSuperClasses();");
                  _builder.newLineIfNotEmpty();
                  _builder.append("superClasses.add(_OclElement);");
                  _builder.newLine();
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

  protected String installClassTypes(final Model root) {
    String _xblockexpression = null;
    {
      Map<org.eclipse.ocl.pivot.Package, List<org.eclipse.ocl.pivot.Class>> pkge2classTypes = this.getSortedClassTypes(root);
      boolean _isEmpty = pkge2classTypes.isEmpty();
      if (_isEmpty) {
        return "";
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("installClassTypes();");
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected String installCoercions(final Model root) {
    String _xblockexpression = null;
    {
      List<Operation> allCoercions = this.getSortedCoercions(root);
      boolean _isEmpty = allCoercions.isEmpty();
      if (_isEmpty) {
        return "";
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("installCoercions();");
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected String installCollectionTypes(final Model root) {
    String _xblockexpression = null;
    {
      Map<org.eclipse.ocl.pivot.Package, List<CollectionType>> pkge2collectionTypes = this.getSortedCollectionTypes(root);
      boolean _isEmpty = pkge2collectionTypes.isEmpty();
      if (_isEmpty) {
        return "";
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("installCollectionTypes();");
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected String installComments(final Model root) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("installComments();");
    return _builder.toString();
  }

  protected String installEnumerations(final Model root) {
    String _xblockexpression = null;
    {
      Map<org.eclipse.ocl.pivot.Package, List<Enumeration>> pkge2enumerations = this.getSortedEnumerations(root);
      boolean _isEmpty = pkge2enumerations.isEmpty();
      if (_isEmpty) {
        return "";
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("installEnumerations();");
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected String installInvariants(final Model root) {
    String _xblockexpression = null;
    {
      Map<org.eclipse.ocl.pivot.Package, List<Constraint>> pkge2invariants = this.getSortedInvariants(root);
      boolean _isEmpty = pkge2invariants.isEmpty();
      if (_isEmpty) {
        return "";
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("installInvariants();");
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected String installIterations(final Model root) {
    String _xblockexpression = null;
    {
      Map<org.eclipse.ocl.pivot.Package, List<Iteration>> pkge2iterations = this.getSortedIterations(root);
      boolean _isEmpty = pkge2iterations.isEmpty();
      if (_isEmpty) {
        return "";
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("installIterations();");
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected String installLambdaTypes(final Model root) {
    String _xblockexpression = null;
    {
      List<LambdaType> allLambdaTypes = this.getSortedLambdaTypes(root);
      boolean _isEmpty = allLambdaTypes.isEmpty();
      if (_isEmpty) {
        return "";
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("installLambdaTypes();");
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected String installMapTypes(final Model root) {
    String _xblockexpression = null;
    {
      Map<org.eclipse.ocl.pivot.Package, List<MapType>> pkge2mapTypes = this.getSortedMapTypes(root);
      boolean _isEmpty = pkge2mapTypes.isEmpty();
      if (_isEmpty) {
        return "";
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("installMapTypes();");
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected String installOperations(final Model root) {
    String _xblockexpression = null;
    {
      Map<org.eclipse.ocl.pivot.Package, List<Operation>> pkge2operations = this.getSortedOperations(root);
      boolean _isEmpty = pkge2operations.isEmpty();
      if (_isEmpty) {
        return "";
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("installOperations();");
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected String installPackages(final Model root) {
    String _xblockexpression = null;
    {
      List<org.eclipse.ocl.pivot.Package> allPackages = this.getSortedLocalPackages(root);
      boolean _isEmpty = allPackages.isEmpty();
      if (_isEmpty) {
        return "";
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("installPackages();");
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected String installPrecedences(final Model root) {
    String _xblockexpression = null;
    {
      List<Library> allLibraries = this.getSortedLibrariesWithPrecedence(root);
      List<Operation> allOperations = this.getSortedOperationsWithPrecedence(root);
      if ((allLibraries.isEmpty() && allOperations.isEmpty())) {
        return "";
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("installPrecedences();");
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected String installPrimitiveTypes(final Model root) {
    String _xblockexpression = null;
    {
      Map<org.eclipse.ocl.pivot.Package, List<PrimitiveType>> pkge2primitiveTypes = this.getSortedPrimitiveTypes(root);
      boolean _isEmpty = pkge2primitiveTypes.isEmpty();
      if (_isEmpty) {
        return "";
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("installPrimitiveTypes();");
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected String installProperties(final Model root) {
    String _xblockexpression = null;
    {
      Map<org.eclipse.ocl.pivot.Package, List<Property>> pkge2properties = this.getSortedProperties(root);
      boolean _isEmpty = pkge2properties.isEmpty();
      if (_isEmpty) {
        return "";
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("installProperties();");
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected String installTemplateArguments(final Model root) {
    String _xblockexpression = null;
    {
      List<TemplateableElement> allTemplateableElements = this.getSortedTemplateableElements(root);
      boolean _isEmpty = allTemplateableElements.isEmpty();
      if (_isEmpty) {
        return "";
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("installTemplateArguments();");
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected String installTupleTypes(final Model root) {
    String _xblockexpression = null;
    {
      List<TupleType> allTupleTypes = this.getSortedTupleTypes(root);
      int _size = allTupleTypes.size();
      boolean _lessEqualsThan = (_size <= 0);
      if (_lessEqualsThan) {
        return "";
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("installTupleTypes();");
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  /**
   * Generate a name for element suitable for embedding in a surrounding punctuation context.
   */
  @Override
  protected String partialName(final EObject element) {
    boolean _matched = false;
    if (element instanceof CollectionType) {
      Type _elementType = ((CollectionType)element).getElementType();
      boolean _tripleEquals = (_elementType == null);
      if (_tripleEquals) {
        _matched=true;
        return this.javaName(((NamedElement)element));
      }
    }
    if (!_matched) {
      if (element instanceof CollectionType) {
        _matched=true;
        return this.javaName(((NamedElement)element));
      }
    }
    if (!_matched) {
      if (element instanceof Constraint) {
        _matched=true;
        return this.getPartialName(((Constraint)element));
      }
    }
    if (!_matched) {
      if (element instanceof LambdaType) {
        Type _type = ((LambdaType)element).getOwnedContext().getType();
        boolean _tripleEquals = (_type == null);
        if (_tripleEquals) {
          _matched=true;
          return "null";
        }
      }
    }
    if (!_matched) {
      if (element instanceof LambdaType) {
        _matched=true;
        String _javaName = this.javaName(((NamedElement)element));
        String _plus = (_javaName + "_");
        String _partialName = this.partialName(((LambdaType)element).getOwnedContext().getType());
        return (_plus + _partialName);
      }
    }
    if (!_matched) {
      if (element instanceof MapType) {
        Type _keyType = ((MapType)element).getKeyType();
        boolean _tripleEquals = (_keyType == null);
        if (_tripleEquals) {
          _matched=true;
          return this.javaName(((NamedElement)element));
        }
      }
    }
    if (!_matched) {
      if (element instanceof MapType) {
        Type _valueType = ((MapType)element).getValueType();
        boolean _tripleEquals = (_valueType == null);
        if (_tripleEquals) {
          _matched=true;
          return this.javaName(((NamedElement)element));
        }
      }
    }
    if (!_matched) {
      if (element instanceof MapType) {
        _matched=true;
        return this.javaName(((NamedElement)element));
      }
    }
    if (!_matched) {
      if (element instanceof org.eclipse.ocl.pivot.Class) {
        List<TemplateArgument> _basicGetOwnedTemplateArguments = ((org.eclipse.ocl.pivot.Class)element).basicGetOwnedTemplateArguments();
        boolean _tripleNotEquals = (_basicGetOwnedTemplateArguments != null);
        if (_tripleNotEquals) {
          _matched=true;
          StringConcatenation _builder = new StringConcatenation();
          String _javaName = this.javaName(((NamedElement)element));
          _builder.append(_javaName);
          {
            List<TemplateArgument> _ownedTemplateArguments = ((org.eclipse.ocl.pivot.Class)element).getOwnedTemplateArguments();
            for(final TemplateArgument tps : _ownedTemplateArguments) {
              _builder.append("_");
              String _simpleName = this.simpleName(tps.getActual());
              _builder.append(_simpleName);
            }
          }
          return _builder.toString();
        }
      }
    }
    if (!_matched) {
      if (element instanceof org.eclipse.ocl.pivot.Class) {
        _matched=true;
        return this.javaName(((NamedElement)element));
      }
    }
    if (!_matched) {
      if (element instanceof Comment) {
        String _body = ((Comment)element).getBody();
        boolean _tripleEquals = (_body == null);
        if (_tripleEquals) {
          _matched=true;
          return "null";
        }
      }
    }
    if (!_matched) {
      if (element instanceof Comment) {
        _matched=true;
        int _length = ((Comment)element).getBody().length();
        int _minus = (_length - 1);
        return this.javaName(element, ((Comment)element).getBody().substring(0, Math.min(11, _minus)));
      }
    }
    if (!_matched) {
      if (element instanceof EnumerationLiteral) {
        Enumeration _owningEnumeration = ((EnumerationLiteral)element).getOwningEnumeration();
        boolean _tripleEquals = (_owningEnumeration == null);
        if (_tripleEquals) {
          _matched=true;
          return "null";
        }
      }
    }
    if (!_matched) {
      if (element instanceof EnumerationLiteral) {
        _matched=true;
        String _partialName = this.partialName(((EnumerationLiteral)element).getOwningEnumeration());
        String _plus = (_partialName + "_");
        String _javaName = this.javaName(((NamedElement)element));
        return (_plus + _javaName);
      }
    }
    if (!_matched) {
      if (element instanceof LambdaParameter) {
        _matched=true;
        return this.javaName(((NamedElement)element));
      }
    }
    if (!_matched) {
      if (element instanceof Library) {
        boolean _equals = Objects.equals(element, this.referencedStandardLibrary);
        if (_equals) {
          _matched=true;
          return "standardLibraryPackage";
        }
      }
    }
    if (!_matched) {
      if (element instanceof Library) {
        _matched=true;
        return "library";
      }
    }
    if (!_matched) {
      if (element instanceof Operation) {
        org.eclipse.ocl.pivot.Class _owningClass = ((Operation)element).getOwningClass();
        boolean _tripleEquals = (_owningClass == null);
        if (_tripleEquals) {
          _matched=true;
          String _javaName = this.javaName(((NamedElement)element));
          return ("null_" + _javaName);
        }
      }
    }
    if (!_matched) {
      if (element instanceof Operation) {
        _matched=true;
        String _partialName = this.partialName(((Operation)element).getOwningClass());
        String _plus = (_partialName + "_");
        String _javaName = this.javaName(((NamedElement)element));
        return (_plus + _javaName);
      }
    }
    if (!_matched) {
      if (element instanceof org.eclipse.ocl.pivot.Package) {
        org.eclipse.ocl.pivot.Package _basicGetOrphanPackage = this.basicGetOrphanPackage(this.thisModel);
        boolean _equals = Objects.equals(element, _basicGetOrphanPackage);
        if (_equals) {
          _matched=true;
          return "local_orphanage";
        }
      }
    }
    if (!_matched) {
      if (element instanceof org.eclipse.ocl.pivot.Package) {
        boolean _isOrphan = Orphanage.isOrphan(((Element)element));
        if (_isOrphan) {
          _matched=true;
          String _javaName = this.javaName(((NamedElement)element));
          return ("local_" + _javaName);
        }
      }
    }
    if (!_matched) {
      if (element instanceof org.eclipse.ocl.pivot.Package) {
        _matched=true;
        return this.javaName(((NamedElement)element));
      }
    }
    if (!_matched) {
      if (element instanceof Parameter) {
        EObject _eContainer = ((Parameter)element).eContainer();
        boolean _tripleEquals = (_eContainer == null);
        if (_tripleEquals) {
          _matched=true;
          String _javaName = this.javaName(((NamedElement)element));
          return ("null_" + _javaName);
        }
      }
    }
    if (!_matched) {
      if (element instanceof Parameter) {
        _matched=true;
        String _partialName = this.partialName(((Parameter)element).eContainer());
        String _plus = (_partialName + "_");
        String _javaName = this.javaName(((NamedElement)element));
        return (_plus + _javaName);
      }
    }
    if (!_matched) {
      if (element instanceof Precedence) {
        _matched=true;
        return this.javaName(((NamedElement)element));
      }
    }
    if (!_matched) {
      if (element instanceof Property) {
        _matched=true;
        return this.getPartialName(((Property)element));
      }
    }
    if (!_matched) {
      if (element instanceof NormalizedTemplateParameter) {
        _matched=true;
        return this.javaName(((NamedElement)element));
      }
    }
    if (!_matched) {
      if (element instanceof TemplateParameter) {
        _matched=true;
        String _partialName = this.partialName(((TemplateParameter)element).getOwningTemplateableElement());
        String _plus = (_partialName + "_");
        String _javaName = this.javaName(((NamedElement)element));
        return (_plus + _javaName);
      }
    }
    if (!_matched) {
      if (element instanceof TemplateArgument) {
        TemplateableElement _owningTemplateableElement = ((TemplateArgument)element).getOwningTemplateableElement();
        boolean _tripleEquals = (_owningTemplateableElement == null);
        if (_tripleEquals) {
          _matched=true;
          return "null";
        }
      }
    }
    if (!_matched) {
      if (element instanceof TemplateArgument) {
        _matched=true;
        return this.partialName(((TemplateArgument)element).getOwningTemplateableElement());
      }
    }
    String _name = element.eClass().getName();
    return ("xyzzy" + _name);
  }

  protected String simpleName(final EObject element) {
    boolean _matched = false;
    if (element instanceof TemplateParameter) {
      TemplateableElement _owningTemplateableElement = ((TemplateParameter)element).getOwningTemplateableElement();
      boolean _tripleEquals = (_owningTemplateableElement == null);
      if (_tripleEquals) {
        _matched=true;
        return "null";
      }
    }
    if (!_matched) {
      if (element instanceof TemplateParameter) {
        _matched=true;
        String _simpleName = this.simpleName(((TemplateParameter)element).getOwningTemplateableElement());
        String _plus = (_simpleName + "_");
        String _javaName = this.javaName(((NamedElement)element));
        return (_plus + _javaName);
      }
    }
    if (!_matched) {
      if (element instanceof TemplateArgument) {
        TemplateableElement _owningTemplateableElement = ((TemplateArgument)element).getOwningTemplateableElement();
        boolean _tripleEquals = (_owningTemplateableElement == null);
        if (_tripleEquals) {
          _matched=true;
          return "null";
        }
      }
    }
    if (!_matched) {
      if (element instanceof TemplateArgument) {
        _matched=true;
        return this.simpleName(((TemplateArgument)element).getOwningTemplateableElement());
      }
    }
    if (!_matched) {
      if (element instanceof org.eclipse.ocl.pivot.Class) {
        _matched=true;
        return this.javaName(((NamedElement)element));
      }
    }
    if (!_matched) {
      if (element instanceof Operation) {
        org.eclipse.ocl.pivot.Class _owningClass = ((Operation)element).getOwningClass();
        boolean _tripleEquals = (_owningClass == null);
        if (_tripleEquals) {
          _matched=true;
          String _javaName = this.javaName(((NamedElement)element));
          return ("null_" + _javaName);
        }
      }
    }
    if (!_matched) {
      if (element instanceof Operation) {
        _matched=true;
        String _simpleName = this.simpleName(((Operation)element).getOwningClass());
        String _plus = (_simpleName + "_");
        String _javaName = this.javaName(((NamedElement)element));
        return (_plus + _javaName);
      }
    }
    String _name = element.eClass().getName();
    return ("xyzzy" + _name);
  }
}
