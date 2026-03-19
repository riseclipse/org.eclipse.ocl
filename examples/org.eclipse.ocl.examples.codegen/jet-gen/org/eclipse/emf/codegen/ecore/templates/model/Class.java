package org.eclipse.emf.codegen.ecore.templates.model;

import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.ocl.examples.codegen.genmodel.OCLGenModelUtil;
import org.eclipse.ocl.examples.codegen.genmodel.ModelSpec;

public class Class
{
  protected static String nl;
  public static synchronized Class create(String lineSeparator)
  {
    nl = lineSeparator;
    Class result = new Class();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "/*******************************************************************************" + NL + " * Copyright (c) 2009 Eclipse Modeling Project and others." + NL + " * All rights reserved.   This program and the accompanying materials" + NL + " * are made available under the terms of the Eclipse Public License v2.0" + NL + " * which accompanies this distribution, and is available at" + NL + " * http://www.eclipse.org/legal/epl-v20.html" + NL + " *" + NL + " * Contributors:" + NL + " *   IBM - Initial API and implementation" + NL + " *******************************************************************************/";
  protected final String TEXT_3 = NL + "package ";
  protected final String TEXT_4 = ";";
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * A representation of the model object '<em><b>";
  protected final String TEXT_7 = "</b></em>'." + NL + " * <!-- end-user-doc -->";
  protected final String TEXT_8 = NL + " *" + NL + " * <!-- begin-model-doc -->" + NL + " * ";
  protected final String TEXT_9 = NL + " * <!-- end-model-doc -->";
  protected final String TEXT_10 = NL + " *";
  protected final String TEXT_11 = NL + " * <p>" + NL + " * The following features are supported:" + NL + " * </p>" + NL + " * <ul>";
  protected final String TEXT_12 = NL + " *   <li>{@link ";
  protected final String TEXT_13 = "#";
  protected final String TEXT_14 = " <em>";
  protected final String TEXT_15 = "</em>}</li>";
  protected final String TEXT_16 = NL + " * </ul>";
  protected final String TEXT_17 = NL + " * @see ";
  protected final String TEXT_18 = "#get";
  protected final String TEXT_19 = "()";
  protected final String TEXT_20 = NL + " * @model ";
  protected final String TEXT_21 = NL + " *        ";
  protected final String TEXT_22 = NL + " * @model";
  protected final String TEXT_23 = NL + " * @extends ";
  protected final String TEXT_24 = NL + " * ";
  protected final String TEXT_25 = NL + " * @generated" + NL + " */";
  protected final String TEXT_26 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * An implementation of the model object '<em><b>";
  protected final String TEXT_27 = NL + " * <p>" + NL + " * The following features are implemented:" + NL + " * </p>" + NL + " * <ul>";
  protected final String TEXT_28 = NL + "@Deprecated";
  protected final String TEXT_29 = NL + "@SuppressWarnings(\"deprecation\")";
  protected final String TEXT_30 = NL + "public";
  protected final String TEXT_31 = " abstract";
  protected final String TEXT_32 = " class ";
  protected final String TEXT_33 = NL + "public interface ";
  protected final String TEXT_34 = NL + "{";
  protected final String TEXT_35 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_36 = " copyright = ";
  protected final String TEXT_37 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_38 = " mofDriverNumber = \"";
  protected final String TEXT_39 = "\";";
  protected final String TEXT_40 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final long serialVersionUID = 1L;" + NL;
  protected final String TEXT_41 = NL + "\t/**" + NL + "\t * An array of objects representing the values of non-primitive features." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_42 = NL + "\t@";
  protected final String TEXT_43 = NL + "\tprotected Object[] ";
  protected final String TEXT_44 = ";" + NL;
  protected final String TEXT_45 = NL + "\t/**" + NL + "\t * A bit field representing the indices of non-primitive feature values." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_46 = NL + "\tprotected int ";
  protected final String TEXT_47 = NL + "\t/**" + NL + "\t * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_48 = " = 0;" + NL;
  protected final String TEXT_49 = NL + "\t/**" + NL + "\t * The number of structural features of the '<em>";
  protected final String TEXT_50 = "</em>' class." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_51 = NL + "\t * ";
  protected final String TEXT_52 = NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_53 = NL + "\t@Deprecated";
  protected final String TEXT_54 = NL + "\t";
  protected final String TEXT_55 = "int ";
  protected final String TEXT_56 = " = ";
  protected final String TEXT_57 = NL + "\t/**" + NL + "\t * The number of operations of the '<em>";
  protected final String TEXT_58 = NL + "\t/**" + NL + "\t * The empty value for the '{@link #";
  protected final String TEXT_59 = "() <em>";
  protected final String TEXT_60 = "</em>}' array accessor." + NL + "\t * This is specialized for the more specific element type known in this context." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_61 = NL + "\t@SuppressWarnings(\"rawtypes\")";
  protected final String TEXT_62 = NL + "\tprotected static final ";
  protected final String TEXT_63 = "[] ";
  protected final String TEXT_64 = "_EEMPTY_ARRAY = new ";
  protected final String TEXT_65 = " [0]";
  protected final String TEXT_66 = NL + "\t/**" + NL + "\t * The cached setting delegate for the '{@link #";
  protected final String TEXT_67 = "</em>}' ";
  protected final String TEXT_68 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_69 = NL + "\tprotected ";
  protected final String TEXT_70 = ".Internal.SettingDelegate ";
  protected final String TEXT_71 = "__ESETTING_DELEGATE = ((";
  protected final String TEXT_72 = ".Internal)";
  protected final String TEXT_73 = ").getSettingDelegate();" + NL;
  protected final String TEXT_74 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_75 = " ";
  protected final String TEXT_76 = "</em>}' array accessor." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_77 = NL + "\t/**" + NL + "\t * The default value of the '{@link #";
  protected final String TEXT_78 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_79 = "; // TODO The default value literal \"";
  protected final String TEXT_80 = "\" is not valid.";
  protected final String TEXT_81 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_82 = NL + "\t/**" + NL + "\t * The offset of the flags representing the value of the '{@link #";
  protected final String TEXT_83 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_84 = NL + "\tprotected static final int ";
  protected final String TEXT_85 = "_EFLAG_OFFSET = ";
  protected final String TEXT_86 = ";" + NL + "" + NL + "\t/**" + NL + "\t * The flags representing the default value of the '{@link #";
  protected final String TEXT_87 = "_EFLAG_DEFAULT = ";
  protected final String TEXT_88 = ".ordinal()";
  protected final String TEXT_89 = ".VALUES.indexOf(";
  protected final String TEXT_90 = ")";
  protected final String TEXT_91 = " << ";
  protected final String TEXT_92 = "_EFLAG_OFFSET;" + NL + "" + NL + "\t/**" + NL + "\t * The array of enumeration values for '{@link ";
  protected final String TEXT_93 = "}'" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_94 = NL + "\tprivate static final ";
  protected final String TEXT_95 = "_EFLAG_VALUES = ";
  protected final String TEXT_96 = ".values()";
  protected final String TEXT_97 = "(";
  protected final String TEXT_98 = "[])";
  protected final String TEXT_99 = ".VALUES.toArray(new ";
  protected final String TEXT_100 = "[";
  protected final String TEXT_101 = ".VALUES.size()])";
  protected final String TEXT_102 = NL + "\t/**" + NL + "\t * The flag";
  protected final String TEXT_103 = " representing the value of the '{@link #";
  protected final String TEXT_104 = "_EFLAG = ";
  protected final String TEXT_105 = "_EFLAG_OFFSET";
  protected final String TEXT_106 = NL + "\t/**" + NL + "\t * The flag representing whether the ";
  protected final String TEXT_107 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_108 = "_ESETFLAG = 1 << ";
  protected final String TEXT_109 = NL + "\t/**" + NL + "\t * This is true if the ";
  protected final String TEXT_110 = NL + "\tprotected boolean ";
  protected final String TEXT_111 = "ESet;" + NL;
  protected final String TEXT_112 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final int ";
  protected final String TEXT_113 = ".getFeatureID(";
  protected final String TEXT_114 = ") - ";
  protected final String TEXT_115 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_116 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_117 = NL + "\tprivate static final int ";
  protected final String TEXT_118 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final int EOPERATION_OFFSET_CORRECTION = ";
  protected final String TEXT_119 = ".getOperationID(";
  protected final String TEXT_120 = "public";
  protected final String TEXT_121 = "protected";
  protected final String TEXT_122 = "()" + NL + "\t{" + NL + "\t\tsuper();";
  protected final String TEXT_123 = NL + "\t\t";
  protected final String TEXT_124 = " |= ";
  protected final String TEXT_125 = "_EFLAG";
  protected final String TEXT_126 = "_DEFAULT";
  protected final String TEXT_127 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_128 = NL + "\t@Override";
  protected final String TEXT_129 = " eStaticClass()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_130 = ";" + NL + "\t}" + NL;
  protected final String TEXT_131 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected static final int ESTATIC_FEATURE_COUNT = ";
  protected final String TEXT_132 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_133 = NL + "\tprotected int eStaticFeatureCount()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_134 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * This is specialized for the more specific element type known in this context." + NL + "\t * @see #";
  protected final String TEXT_135 = NL + "\tpublic ";
  protected final String TEXT_136 = "()" + NL + "\t{";
  protected final String TEXT_137 = " list = (";
  protected final String TEXT_138 = "();" + NL + "\t\tif (list.isEmpty()) return ";
  protected final String TEXT_139 = "_EEMPTY_ARRAY;";
  protected final String TEXT_140 = NL + "\t\tif (";
  protected final String TEXT_141 = " == null || ";
  protected final String TEXT_142 = ".isEmpty()) return ";
  protected final String TEXT_143 = "_EEMPTY_ARRAY;" + NL + "\t\t";
  protected final String TEXT_144 = NL + "\t\tlist.shrink();" + NL + "\t\treturn (";
  protected final String TEXT_145 = "[])list.data();" + NL + "\t}" + NL;
  protected final String TEXT_146 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * This is specialized for the more specific element type known in this context.";
  protected final String TEXT_147 = "_";
  protected final String TEXT_148 = " = (";
  protected final String TEXT_149 = ")eVirtualGet(";
  protected final String TEXT_150 = ");";
  protected final String TEXT_151 = " == null)" + NL + "\t\t{";
  protected final String TEXT_152 = NL + "\t\t\teVirtualSet(";
  protected final String TEXT_153 = ", ";
  protected final String TEXT_154 = " = new ";
  protected final String TEXT_155 = NL + "\t\t\t";
  protected final String TEXT_156 = NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_157 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * This is specialized for the more specific type known in this context.";
  protected final String TEXT_158 = " basicSet";
  protected final String TEXT_159 = " new";
  protected final String TEXT_160 = " msgs)" + NL + "\t{" + NL + "\t\treturn super.basicSet";
  protected final String TEXT_161 = "(new";
  protected final String TEXT_162 = ", msgs);" + NL + "\t}" + NL;
  protected final String TEXT_163 = NL + "\tpublic void set";
  protected final String TEXT_164 = ")" + NL + "\t{" + NL + "\t\tsuper.set";
  protected final String TEXT_165 = ");" + NL + "\t}" + NL;
  protected final String TEXT_166 = "();" + NL;
  protected final String TEXT_167 = " get";
  protected final String TEXT_168 = "(int index);" + NL;
  protected final String TEXT_169 = "(int index)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_170 = "().get(index);" + NL + "\t}" + NL;
  protected final String TEXT_171 = NL + "\tint get";
  protected final String TEXT_172 = "Length();" + NL;
  protected final String TEXT_173 = NL + "\tpublic int get";
  protected final String TEXT_174 = "Length()" + NL + "\t{";
  protected final String TEXT_175 = NL + "\t\treturn ";
  protected final String TEXT_176 = "().size();";
  protected final String TEXT_177 = " == null ? 0 : ";
  protected final String TEXT_178 = ".size();";
  protected final String TEXT_179 = NL + "\t}" + NL;
  protected final String TEXT_180 = NL + "\tvoid set";
  protected final String TEXT_181 = "[] new";
  protected final String TEXT_182 = ");" + NL;
  protected final String TEXT_183 = ")" + NL + "\t{" + NL + "\t\t((";
  protected final String TEXT_184 = "()).setData(new";
  protected final String TEXT_185 = ".length, new";
  protected final String TEXT_186 = "(int index, ";
  protected final String TEXT_187 = " element);" + NL;
  protected final String TEXT_188 = " element)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_189 = "().set(index, element);" + NL + "\t}" + NL;
  protected final String TEXT_190 = NL + "\t/**" + NL + "\t * Returns the value of the '<em><b>";
  protected final String TEXT_191 = "</b></em>' ";
  protected final String TEXT_192 = ".";
  protected final String TEXT_193 = NL + "\t * The key is of type ";
  protected final String TEXT_194 = "list of {@link ";
  protected final String TEXT_195 = "}";
  protected final String TEXT_196 = "{@link ";
  protected final String TEXT_197 = "," + NL + "\t * and the value is of type ";
  protected final String TEXT_198 = ",";
  protected final String TEXT_199 = NL + "\t * The list contents are of type {@link ";
  protected final String TEXT_200 = NL + "\t * The default value is <code>";
  protected final String TEXT_201 = "</code>.";
  protected final String TEXT_202 = NL + "\t * The literals are from the enumeration {@link ";
  protected final String TEXT_203 = "}.";
  protected final String TEXT_204 = NL + "\t * It is bidirectional and its opposite is '{@link ";
  protected final String TEXT_205 = "</em>}'.";
  protected final String TEXT_206 = NL + "\t * <!-- begin-user-doc -->";
  protected final String TEXT_207 = NL + "\t * <p>" + NL + "\t * If the meaning of the '<em>";
  protected final String TEXT_208 = "</em>' ";
  protected final String TEXT_209 = " isn't clear," + NL + "\t * there really should be more of a description here..." + NL + "\t * </p>";
  protected final String TEXT_210 = NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_211 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_212 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_213 = NL + "\t * @return the value of the '<em>";
  protected final String TEXT_214 = NL + "\t * @see ";
  protected final String TEXT_215 = NL + "\t * @see #isSet";
  protected final String TEXT_216 = NL + "\t * @see #unset";
  protected final String TEXT_217 = NL + "\t * @see #set";
  protected final String TEXT_218 = NL + "\t * @model ";
  protected final String TEXT_219 = NL + "\t *        ";
  protected final String TEXT_220 = NL + "\t * @model";
  protected final String TEXT_221 = ")eDynamicGet(";
  protected final String TEXT_222 = " - ESTATIC_FEATURE_COUNT";
  protected final String TEXT_223 = ", true, ";
  protected final String TEXT_224 = ").";
  protected final String TEXT_225 = ")eGet(";
  protected final String TEXT_226 = ", true)";
  protected final String TEXT_227 = "__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false)";
  protected final String TEXT_228 = NL + "\t\tif (eContainerFeatureID() != (";
  protected final String TEXT_229 = ")) return null;" + NL + "\t\treturn (";
  protected final String TEXT_230 = "eContainer";
  protected final String TEXT_231 = "eInternalContainer";
  protected final String TEXT_232 = "();";
  protected final String TEXT_233 = " != null && ";
  protected final String TEXT_234 = ".eIsProxy())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_235 = " old";
  protected final String TEXT_236 = ";" + NL + "\t\t\t";
  protected final String TEXT_237 = "eResolveProxy(old";
  protected final String TEXT_238 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_239 = " != old";
  protected final String TEXT_240 = ")" + NL + "\t\t\t{";
  protected final String TEXT_241 = NL + "\t\t\t\t";
  protected final String TEXT_242 = " msgs = old";
  protected final String TEXT_243 = ".eInverseRemove(this, EOPPOSITE_FEATURE_BASE - (";
  protected final String TEXT_244 = "), null, null);";
  protected final String TEXT_245 = " msgs =  old";
  protected final String TEXT_246 = ".eInverseRemove(this, ";
  protected final String TEXT_247 = ".class, null);";
  protected final String TEXT_248 = NL + "\t\t\t\tif (new";
  protected final String TEXT_249 = ".eInternalContainer() == null)" + NL + "\t\t\t\t{";
  protected final String TEXT_250 = NL + "\t\t\t\t\tmsgs = new";
  protected final String TEXT_251 = ".eInverseAdd(this, EOPPOSITE_FEATURE_BASE - (";
  protected final String TEXT_252 = "), null, msgs);";
  protected final String TEXT_253 = NL + "\t\t\t\t\tmsgs =  new";
  protected final String TEXT_254 = ".eInverseAdd(this, ";
  protected final String TEXT_255 = ".class, msgs);";
  protected final String TEXT_256 = NL + "\t\t\t\t}" + NL + "\t\t\t\tif (msgs != null) msgs.dispatch();";
  protected final String TEXT_257 = NL + "\t\t\t\teVirtualSet(";
  protected final String TEXT_258 = NL + "\t\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\t\teNotify(new ";
  protected final String TEXT_259 = "(this, ";
  protected final String TEXT_260 = ".RESOLVE, ";
  protected final String TEXT_261 = ", old";
  protected final String TEXT_262 = "));";
  protected final String TEXT_263 = NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_264 = NL + "\t\treturn (";
  protected final String TEXT_265 = " & ";
  protected final String TEXT_266 = "_EFLAG) != 0;";
  protected final String TEXT_267 = "_EFLAG_VALUES[(";
  protected final String TEXT_268 = "_EFLAG) >>> ";
  protected final String TEXT_269 = "_EFLAG_OFFSET];";
  protected final String TEXT_270 = " = basicGet";
  protected final String TEXT_271 = "();" + NL + "\t\treturn ";
  protected final String TEXT_272 = ".eIsProxy() ? ";
  protected final String TEXT_273 = "eResolveProxy((";
  protected final String TEXT_274 = ") : ";
  protected final String TEXT_275 = NL + "\t\treturn new ";
  protected final String TEXT_276 = "((";
  protected final String TEXT_277 = ".Internal)((";
  protected final String TEXT_278 = ".Internal.Wrapper)get";
  protected final String TEXT_279 = "()).featureMap().";
  protected final String TEXT_280 = "list(";
  protected final String TEXT_281 = ")get";
  protected final String TEXT_282 = "().";
  protected final String TEXT_283 = NL + "\t\treturn ((";
  protected final String TEXT_284 = "()).featureMap().list(";
  protected final String TEXT_285 = NL + "\t\treturn get";
  protected final String TEXT_286 = "().list(";
  protected final String TEXT_287 = "()).featureMap().get(";
  protected final String TEXT_288 = "get";
  protected final String TEXT_289 = "().get(";
  protected final String TEXT_290 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_291 = "' ";
  protected final String TEXT_292 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT";
  protected final String TEXT_293 = NL + "\t\t// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting" + NL + "\t\t// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.";
  protected final String TEXT_294 = "EcoreEMap";
  protected final String TEXT_295 = "BasicFeatureMap";
  protected final String TEXT_296 = "EcoreEList";
  protected final String TEXT_297 = " should be used.";
  protected final String TEXT_298 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_299 = " basicGet";
  protected final String TEXT_300 = ", false, ";
  protected final String TEXT_301 = "__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false)";
  protected final String TEXT_302 = ")eInternalContainer();";
  protected final String TEXT_303 = ")((";
  protected final String TEXT_304 = ", false);";
  protected final String TEXT_305 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_306 = " msgs)" + NL + "\t{";
  protected final String TEXT_307 = NL + "\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_308 = ")new";
  protected final String TEXT_309 = ", msgs);";
  protected final String TEXT_310 = NL + "\t\treturn msgs;";
  protected final String TEXT_311 = NL + "\t\tmsgs = eDynamicInverseAdd((";
  protected final String TEXT_312 = NL + "\t\tObject old";
  protected final String TEXT_313 = " = eVirtualSet(";
  protected final String TEXT_314 = ", new";
  protected final String TEXT_315 = ";" + NL + "\t\t";
  protected final String TEXT_316 = " = new";
  protected final String TEXT_317 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_318 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_319 = NL + "\t\tboolean old";
  protected final String TEXT_320 = "ESet = (";
  protected final String TEXT_321 = "_ESETFLAG) != 0;";
  protected final String TEXT_322 = "_ESETFLAG;";
  protected final String TEXT_323 = "ESet = ";
  protected final String TEXT_324 = "ESet;";
  protected final String TEXT_325 = "ESet = true;";
  protected final String TEXT_326 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_327 = " notification = new ";
  protected final String TEXT_328 = ".SET, ";
  protected final String TEXT_329 = "isSetChange ? null : old";
  protected final String TEXT_330 = "old";
  protected final String TEXT_331 = "isSetChange";
  protected final String TEXT_332 = "!old";
  protected final String TEXT_333 = "ESet";
  protected final String TEXT_334 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_335 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_336 = "()).featureMap()).basicAdd(";
  protected final String TEXT_337 = ".Internal)get";
  protected final String TEXT_338 = "()).basicAdd(";
  protected final String TEXT_339 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_340 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_341 = NL + "\t/**" + NL + "\t * Sets the value of the '{@link ";
  protected final String TEXT_342 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param value the new value of the '<em>";
  protected final String TEXT_343 = NL + "\t * @see #";
  protected final String TEXT_344 = " value);" + NL;
  protected final String TEXT_345 = ")" + NL + "\t{";
  protected final String TEXT_346 = NL + "\t\teDynamicSet(";
  protected final String TEXT_347 = "new ";
  protected final String TEXT_348 = "new";
  protected final String TEXT_349 = NL + "\t\teSet(";
  protected final String TEXT_350 = "__ESETTING_DELEGATE.dynamicSet(this, null, 0, ";
  protected final String TEXT_351 = NL + "\t\tif (new";
  protected final String TEXT_352 = " != eInternalContainer() || (eContainerFeatureID() != (";
  protected final String TEXT_353 = ") && new";
  protected final String TEXT_354 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_355 = ".isAncestor(this, ";
  protected final String TEXT_356 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_357 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_358 = " msgs = null;" + NL + "\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_359 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_360 = ").eInverseAdd(this, ";
  protected final String TEXT_361 = ".class, msgs);" + NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_362 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_363 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_364 = " != ";
  protected final String TEXT_365 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_366 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_367 = " != null)";
  protected final String TEXT_368 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_369 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - (";
  protected final String TEXT_370 = "), null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_371 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - (";
  protected final String TEXT_372 = ").eInverseRemove(this, ";
  protected final String TEXT_373 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_374 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_375 = NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_376 = NL + "\t\t\tboolean old";
  protected final String TEXT_377 = "ESet = eVirtualIsSet(";
  protected final String TEXT_378 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_379 = ", !old";
  protected final String TEXT_380 = "ESet));";
  protected final String TEXT_381 = NL + "\t\t}";
  protected final String TEXT_382 = ") ";
  protected final String TEXT_383 = "_EFLAG; else ";
  protected final String TEXT_384 = " &= ~";
  protected final String TEXT_385 = "_EFLAG;";
  protected final String TEXT_386 = " == null) new";
  protected final String TEXT_387 = "_EDEFAULT;" + NL + "\t\t";
  protected final String TEXT_388 = " & ~";
  protected final String TEXT_389 = "_EFLAG | ";
  protected final String TEXT_390 = ".VALUES.indexOf(new";
  protected final String TEXT_391 = "_EFLAG_OFFSET;";
  protected final String TEXT_392 = " == null ? ";
  protected final String TEXT_393 = " : new";
  protected final String TEXT_394 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_395 = "isSetChange ? ";
  protected final String TEXT_396 = " : old";
  protected final String TEXT_397 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_398 = NL + "\t\t((";
  protected final String TEXT_399 = "()).featureMap()).set(";
  protected final String TEXT_400 = "()).set(";
  protected final String TEXT_401 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_402 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_403 = " basicUnset";
  protected final String TEXT_404 = NL + "\t\treturn eDynamicInverseRemove((";
  protected final String TEXT_405 = "basicGet";
  protected final String TEXT_406 = "(), ";
  protected final String TEXT_407 = "Object old";
  protected final String TEXT_408 = "eVirtualUnset(";
  protected final String TEXT_409 = " = null;";
  protected final String TEXT_410 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_411 = "ESet = false;";
  protected final String TEXT_412 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_413 = ".UNSET, ";
  protected final String TEXT_414 = "isSetChange ? old";
  protected final String TEXT_415 = " : null";
  protected final String TEXT_416 = ", null, ";
  protected final String TEXT_417 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_418 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_419 = NL + "\t/**" + NL + "\t * Unsets the value of the '{@link ";
  protected final String TEXT_420 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_421 = NL + "\tvoid unset";
  protected final String TEXT_422 = NL + "\tpublic void unset";
  protected final String TEXT_423 = NL + "\t\teDynamicUnset(";
  protected final String TEXT_424 = NL + "\t\teUnset(";
  protected final String TEXT_425 = "__ESETTING_DELEGATE.dynamicUnset(this, null, 0);";
  protected final String TEXT_426 = " != null) ((";
  protected final String TEXT_427 = ".Unsettable";
  protected final String TEXT_428 = ").unset();";
  protected final String TEXT_429 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_430 = " msgs = null;";
  protected final String TEXT_431 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_432 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_433 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_434 = ", null, null, old";
  protected final String TEXT_435 = " = eVirtualUnset(";
  protected final String TEXT_436 = "_EFLAG_DEFAULT;";
  protected final String TEXT_437 = " : ";
  protected final String TEXT_438 = "()).featureMap()).clear(";
  protected final String TEXT_439 = "()).clear(";
  protected final String TEXT_440 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_441 = NL + "\t/**" + NL + "\t * Returns whether the value of the '{@link ";
  protected final String TEXT_442 = " is set.";
  protected final String TEXT_443 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return whether the value of the '<em>";
  protected final String TEXT_444 = NL + "\tboolean isSet";
  protected final String TEXT_445 = NL + "\tpublic boolean isSet";
  protected final String TEXT_446 = NL + "\t\treturn eDynamicIsSet(";
  protected final String TEXT_447 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_448 = "__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);";
  protected final String TEXT_449 = " != null && ((";
  protected final String TEXT_450 = ").isSet();";
  protected final String TEXT_451 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_452 = NL + "\t\treturn !((";
  protected final String TEXT_453 = "()).featureMap()).isEmpty(";
  protected final String TEXT_454 = "()).isEmpty(";
  protected final String TEXT_455 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_456 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_457 = NL + "\t/**" + NL + "\t * The cached validation expression for the '{@link #";
  protected final String TEXT_458 = ") <em>";
  protected final String TEXT_459 = "</em>}' invariant operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_460 = "__EEXPRESSION = \"";
  protected final String TEXT_461 = NL + "\t/**" + NL + "\t * The cached invocation delegate for the '{@link #";
  protected final String TEXT_462 = "</em>}' operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_463 = ".Internal.InvocationDelegate ";
  protected final String TEXT_464 = "__EINVOCATION_DELEGATE = ((";
  protected final String TEXT_465 = ").getInvocationDelegate();" + NL;
  protected final String TEXT_466 = NL + "\t/**";
  protected final String TEXT_467 = NL + "\t * <!-- begin-model-doc -->";
  protected final String TEXT_468 = NL + "\t * @param ";
  protected final String TEXT_469 = NL + "\t *   ";
  protected final String TEXT_470 = NL + "\t{";
  protected final String TEXT_471 = NL + "\t\treturn" + NL + "\t\t\t";
  protected final String TEXT_472 = ".validate" + NL + "\t\t\t\t(";
  protected final String TEXT_473 = "," + NL + "\t\t\t\t this," + NL + "\t\t\t\t ";
  protected final String TEXT_474 = "," + NL + "\t\t\t\t ";
  protected final String TEXT_475 = "," + NL + "\t\t\t\t \"";
  protected final String TEXT_476 = "\",";
  protected final String TEXT_477 = NL + "\t\t\t\t ";
  protected final String TEXT_478 = "__EEXPRESSION," + NL + "\t\t\t\t ";
  protected final String TEXT_479 = ".ERROR," + NL + "\t\t\t\t ";
  protected final String TEXT_480 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t ";
  protected final String TEXT_481 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_482 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_483 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_484 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_485 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_486 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_487 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_488 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_489 = "\", ";
  protected final String TEXT_490 = ".getObjectLabel(this, ";
  protected final String TEXT_491 = ") }),";
  protected final String TEXT_492 = NL + "\t\t\t\t\t\t new Object [] { this }));" + NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_493 = NL + "\t\ttry" + NL + "\t\t{";
  protected final String TEXT_494 = "__EINVOCATION_DELEGATE.dynamicInvoke(this, ";
  protected final String TEXT_495 = ".UnmodifiableEList<Object>(";
  protected final String TEXT_496 = "null";
  protected final String TEXT_497 = NL + "\t\t\treturn ";
  protected final String TEXT_498 = NL + "\t\t}" + NL + "\t\tcatch (";
  protected final String TEXT_499 = " ite)" + NL + "\t\t{" + NL + "\t\t\tthrow new ";
  protected final String TEXT_500 = "(ite);" + NL + "\t\t}";
  protected final String TEXT_501 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_502 = " eInverseAdd(";
  protected final String TEXT_503 = " otherEnd, int featureID, ";
  protected final String TEXT_504 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_505 = ")" + NL + "\t\t{";
  protected final String TEXT_506 = NL + "\t\t\tcase ";
  protected final String TEXT_507 = ":";
  protected final String TEXT_508 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_509 = ".InternalMapView";
  protected final String TEXT_510 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_511 = NL + "\t\t\t\treturn (";
  protected final String TEXT_512 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_513 = NL + "\t\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);";
  protected final String TEXT_514 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_515 = ")otherEnd, msgs);";
  protected final String TEXT_516 = NL + "\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_517 = NL + "\t\t\t\tif (";
  protected final String TEXT_518 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_519 = NL + "\t\treturn super.eInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_520 = NL + "\t\treturn eDynamicInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_521 = " eInverseRemove(";
  protected final String TEXT_522 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_523 = ".Internal.Wrapper)";
  protected final String TEXT_524 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_525 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_526 = NL + "\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_527 = NL + "\t\t\t\treturn basicUnset";
  protected final String TEXT_528 = "(msgs);";
  protected final String TEXT_529 = "(null, msgs);";
  protected final String TEXT_530 = NL + "\t\treturn super.eInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_531 = NL + "\t\treturn eDynamicInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_532 = " eBasicRemoveFromContainerFeature(";
  protected final String TEXT_533 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (eContainerFeatureID()";
  protected final String TEXT_534 = ":" + NL + "\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
  protected final String TEXT_535 = NL + "\t\treturn super.eBasicRemoveFromContainerFeature(msgs);";
  protected final String TEXT_536 = NL + "\t\treturn eDynamicBasicRemoveFromContainer(msgs);";
  protected final String TEXT_537 = NL + "\tpublic Object eGet(int featureID, boolean resolve, boolean coreType)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_538 = NL + "\t\t\t\treturn ";
  protected final String TEXT_539 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_540 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_541 = "());";
  protected final String TEXT_542 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_543 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_544 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_545 = "()).eMap();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_546 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_547 = "();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_548 = "().map();";
  protected final String TEXT_549 = "()).featureMap();" + NL + "\t\t\t\treturn ";
  protected final String TEXT_550 = "();" + NL + "\t\t\t\treturn ((";
  protected final String TEXT_551 = "()).getWrapper();";
  protected final String TEXT_552 = NL + "\t\treturn super.eGet(featureID, resolve, coreType);";
  protected final String TEXT_553 = NL + "\t\treturn eDynamicGet(featureID, resolve, coreType);";
  protected final String TEXT_554 = NL + "\tpublic void eSet(int featureID, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_555 = NL + "\t\t\t\t((";
  protected final String TEXT_556 = "()).featureMap()).set(newValue);";
  protected final String TEXT_557 = "()).set(newValue);";
  protected final String TEXT_558 = ".Setting)((";
  protected final String TEXT_559 = "()).eMap()).set(newValue);";
  protected final String TEXT_560 = ".Setting)";
  protected final String TEXT_561 = "().clear();" + NL + "\t\t\t\t";
  protected final String TEXT_562 = "().addAll((";
  protected final String TEXT_563 = "<? extends ";
  protected final String TEXT_564 = ">";
  protected final String TEXT_565 = ")newValue);";
  protected final String TEXT_566 = NL + "\t\t\t\tset";
  protected final String TEXT_567 = "(((";
  protected final String TEXT_568 = ")newValue).";
  protected final String TEXT_569 = "newValue);";
  protected final String TEXT_570 = NL + "\t\t\t\treturn;";
  protected final String TEXT_571 = NL + "\t\tsuper.eSet(featureID, newValue);";
  protected final String TEXT_572 = NL + "\t\teDynamicSet(featureID, newValue);";
  protected final String TEXT_573 = NL + "\tpublic void eUnset(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_574 = "()).featureMap().clear();";
  protected final String TEXT_575 = "().clear();";
  protected final String TEXT_576 = NL + "\t\t\t\tunset";
  protected final String TEXT_577 = ")null);";
  protected final String TEXT_578 = NL + "\t\tsuper.eUnset(featureID);";
  protected final String TEXT_579 = NL + "\t\teDynamicUnset(featureID);";
  protected final String TEXT_580 = NL + "\tpublic boolean eIsSet(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_581 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_582 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_583 = "()).featureMap().isEmpty();";
  protected final String TEXT_584 = " != null && !";
  protected final String TEXT_585 = ".featureMap().isEmpty();";
  protected final String TEXT_586 = ".isEmpty();";
  protected final String TEXT_587 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_588 = NL + "\t\t\t\treturn !";
  protected final String TEXT_589 = "().isEmpty();";
  protected final String TEXT_590 = " != null;";
  protected final String TEXT_591 = NL + "\t\t\t\treturn eVirtualGet((";
  protected final String TEXT_592 = ")) != null;";
  protected final String TEXT_593 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_594 = "() != null;";
  protected final String TEXT_595 = "_EFLAG) != 0) != ";
  protected final String TEXT_596 = "_EFLAG) != ";
  protected final String TEXT_597 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_598 = ") != ";
  protected final String TEXT_599 = "() != ";
  protected final String TEXT_600 = " != null : !";
  protected final String TEXT_601 = ".equals(";
  protected final String TEXT_602 = "() != null : !";
  protected final String TEXT_603 = NL + "\t\treturn super.eIsSet(featureID);";
  protected final String TEXT_604 = NL + "\t\treturn eDynamicIsSet(featureID);";
  protected final String TEXT_605 = NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class";
  protected final String TEXT_606 = " baseClass)" + NL + "\t{";
  protected final String TEXT_607 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_608 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID";
  protected final String TEXT_609 = NL + "\t\t\t\tcase ";
  protected final String TEXT_610 = ": return ";
  protected final String TEXT_611 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_612 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}";
  protected final String TEXT_613 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_614 = NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class";
  protected final String TEXT_615 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_616 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID";
  protected final String TEXT_617 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_618 = NL + "\tpublic int eDerivedOperationID(int baseOperationID, Class";
  protected final String TEXT_619 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseOperationID)" + NL + "\t\t\t{";
  protected final String TEXT_620 = NL + "\t\t\t\tdefault: return super.eDerivedOperationID(baseOperationID, baseClass);" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_621 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseOperationID";
  protected final String TEXT_622 = NL + "\t\treturn super.eDerivedOperationID(baseOperationID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_623 = NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_624 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_625 = NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_626 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_627 = NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_628 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_629 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_630 = NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_631 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_632 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_633 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_634 = NL + "\t@SuppressWarnings(";
  protected final String TEXT_635 = "\"unchecked\"";
  protected final String TEXT_636 = "{\"rawtypes\", \"unchecked\" }";
  protected final String TEXT_637 = NL + "\tpublic Object eInvoke(int operationID, ";
  protected final String TEXT_638 = " arguments) throws ";
  protected final String TEXT_639 = NL + "\t{" + NL + "\t\tswitch (operationID";
  protected final String TEXT_640 = NL + "\t\t\t\ttry" + NL + "\t\t\t\t{";
  protected final String TEXT_641 = "arguments.get(";
  protected final String TEXT_642 = ");" + NL + "\t\t\t\t";
  protected final String TEXT_643 = "return null;";
  protected final String TEXT_644 = "return ";
  protected final String TEXT_645 = NL + "\t\t\t\t}" + NL + "\t\t\t\tcatch (";
  protected final String TEXT_646 = " throwable)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tthrow new ";
  protected final String TEXT_647 = "(throwable);" + NL + "\t\t\t\t}";
  protected final String TEXT_648 = NL + "\t\treturn super.eInvoke(operationID, arguments);";
  protected final String TEXT_649 = NL + "\t\treturn eDynamicInvoke(operationID, arguments);";
  protected final String TEXT_650 = NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\t";
  protected final String TEXT_651 = " result = new ";
  protected final String TEXT_652 = "(super.toString());";
  protected final String TEXT_653 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_654 = ": \");";
  protected final String TEXT_655 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_656 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_657 = ")) result.append(eVirtualGet(";
  protected final String TEXT_658 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_659 = "_ESETFLAG) != 0";
  protected final String TEXT_660 = ") result.append((";
  protected final String TEXT_661 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_662 = ") result.append(";
  protected final String TEXT_663 = "_EFLAG_OFFSET]); else result.append(\"<unset>\");";
  protected final String TEXT_664 = "); else result.append(\"<unset>\");";
  protected final String TEXT_665 = NL + "\t\tresult.append(eVirtualGet(";
  protected final String TEXT_666 = NL + "\t\tresult.append((";
  protected final String TEXT_667 = "_EFLAG) != 0);";
  protected final String TEXT_668 = NL + "\t\tresult.append(";
  protected final String TEXT_669 = "_EFLAG_OFFSET]);";
  protected final String TEXT_670 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_671 = NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_672 = NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_673 = " theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_674 = NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_675 = " getKey()" + NL + "\t{";
  protected final String TEXT_676 = "(getTypedKey());";
  protected final String TEXT_677 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_678 = NL + "\tpublic void setKey(";
  protected final String TEXT_679 = " key)" + NL + "\t{";
  protected final String TEXT_680 = NL + "\t\tgetTypedKey().addAll(";
  protected final String TEXT_681 = "key);";
  protected final String TEXT_682 = NL + "\t\tsetTypedKey(key);";
  protected final String TEXT_683 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_684 = ")key).";
  protected final String TEXT_685 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_686 = ")key);";
  protected final String TEXT_687 = " getValue()" + NL + "\t{";
  protected final String TEXT_688 = "(getTypedValue());";
  protected final String TEXT_689 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_690 = " setValue(";
  protected final String TEXT_691 = " value)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_692 = " oldValue = getValue();";
  protected final String TEXT_693 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll(";
  protected final String TEXT_694 = "value);";
  protected final String TEXT_695 = NL + "\t\tsetTypedValue(value);";
  protected final String TEXT_696 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_697 = ")value).";
  protected final String TEXT_698 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_699 = ")value);";
  protected final String TEXT_700 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_701 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_702 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_703 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_704 = NL + "\t/**" + NL + "\t * Accept a visit from a visitor and return the result of a call to the derived type-specific visitXXX in the visitor." + NL + "\t * @generated" + NL + "\t */" + NL + "\t// Generated from org.eclipse.ocl.examples.build/templates/model/Class/insert.javajetinc" + NL + "\tpublic <R> R accept(";
  protected final String TEXT_705 = "<R> visitor);";
  protected final String TEXT_706 = NL + "\t/**" + NL + "\t * {@inheritDoc}" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_707 = NL + "\tpublic <R> R accept(";
  protected final String TEXT_708 = "<R> visitor) {";
  protected final String TEXT_709 = NL + "\t\tif (visitor instanceof ";
  protected final String TEXT_710 = ") {" + NL + "\t\t\treturn (R) ((";
  protected final String TEXT_711 = "<?>)visitor).visit";
  protected final String TEXT_712 = "(this);" + NL + "\t\t}" + NL + "\t\telse {" + NL + "\t\t\treturn super.accept(visitor);" + NL + "\t\t}";
  protected final String TEXT_713 = NL + "\t\treturn visitor.visit";
  protected final String TEXT_714 = "(this);";
  protected final String TEXT_715 = NL + "\t}";
  protected final String TEXT_716 = NL + "} //";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * Copyright (c) 2002-2019 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */

    final GenClass genClass = (GenClass)((Object[])argument)[0]; final GenPackage genPackage = genClass.getGenPackage(); final GenModel genModel=genPackage.getGenModel();
    final boolean isJDK50 = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50;
    final boolean isInterface = Boolean.TRUE.equals(((Object[])argument)[1]); final boolean isImplementation = Boolean.TRUE.equals(((Object[])argument)[2]); final boolean useInterfaceOverrideAnnotation = OCLGenModelUtil.INSTANCE.useInterfaceOverrideAnnotation(genModel) && !(isInterface && isImplementation);
    final boolean isGWT = genModel.getRuntimePlatform() == GenRuntimePlatform.GWT;
    final String publicStaticFinalFlag = isImplementation ? "public static final " : "";
    final String singleWildcard = isJDK50 ? "<?>" : "";
    final String negativeOffsetCorrection = genClass.hasOffsetCorrection() ? " - " + genClass.getOffsetCorrectionField(null) : "";
    final String positiveOffsetCorrection = genClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(null) : "";
    final String negativeOperationOffsetCorrection = genClass.hasOffsetCorrection() ? " - EOPERATION_OFFSET_CORRECTION" : "";
    final String positiveOperationOffsetCorrection = genClass.hasOffsetCorrection() ? " + EOPERATION_OFFSET_CORRECTION" : "";
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    if (isInterface) {
    stringBuffer.append(TEXT_3);
    stringBuffer.append(genPackage.getInterfacePackageName());
    stringBuffer.append(TEXT_4);
    } else {
    stringBuffer.append(TEXT_3);
    stringBuffer.append(genPackage.getClassPackageName());
    stringBuffer.append(TEXT_4);
    }
    stringBuffer.append(TEXT_5);
    genModel.markImportLocation(stringBuffer, genPackage);
    if (isImplementation) { genClass.addClassPsuedoImports(); }
    stringBuffer.append(TEXT_5);
    if (isInterface) {
    stringBuffer.append(TEXT_6);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_7);
    if (genClass.hasDocumentation()) {
    stringBuffer.append(TEXT_8);
    stringBuffer.append(genClass.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_9);
    }
    stringBuffer.append(TEXT_10);
    if (!genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_11);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_12);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getRawQualifiedInterfaceName(genClass));
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_15);
    }
    }
    stringBuffer.append(TEXT_16);
    }
    stringBuffer.append(TEXT_10);
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_17);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_18);
    stringBuffer.append(genClass.getClassifierAccessorName());
    stringBuffer.append(TEXT_19);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genClass.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_20);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_21);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_22);
    }}
    if (genClass.needsRootExtendsInterfaceExtendsTag()) {
    stringBuffer.append(TEXT_23);
    stringBuffer.append(genModel.getImportedName(genModel.getRootExtendsInterface()));
    }
    if (OCLGenModelUtil.INSTANCE.hasImplicitAPITags(genClass, true)) {
    stringBuffer.append(TEXT_24);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getImplicitAPITags(genClass, genModel.getIndentation(stringBuffer), true));
    }
    stringBuffer.append(TEXT_25);
    //Class/interface.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_26);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_7);
    if (!genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_27);
    for (GenFeature genFeature : genClass.getImplementedGenFeatures()) {
    stringBuffer.append(TEXT_12);
    stringBuffer.append(genClass.getQualifiedClassName());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_15);
    }
    stringBuffer.append(TEXT_16);
    }
    stringBuffer.append(TEXT_10);
    if (OCLGenModelUtil.INSTANCE.hasImplicitAPITags(genClass)) {
    stringBuffer.append(TEXT_24);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getImplicitAPITags(genClass, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_25);
    }
    if (isJDK50 && OCLGenModelUtil.INSTANCE.hasImplicitAPIDeprecatedTag(genClass)) {
    stringBuffer.append(TEXT_28);
    }
    if (isImplementation) {
    if (isJDK50 && !OCLGenModelUtil.INSTANCE.hasAPIDeprecatedTag(genClass) && OCLGenModelUtil.INSTANCE.hasImplicitAPIDeprecatedTag(genClass.getEGetGenFeatures(), genClass.getEIsSetGenFeatures(), genClass.getESetGenFeatures(), genClass.getEUnsetGenFeatures(), genClass.getEInverseAddGenFeatures(), genClass.getEInverseRemoveGenFeatures(), genClass.getEBasicRemoveFromContainerGenFeatures(), genClass.getToStringGenFeatures())) {
    stringBuffer.append(TEXT_29);
    }
    stringBuffer.append(TEXT_30);
    if (genClass.isAbstract()) {
    stringBuffer.append(TEXT_31);
    }
    stringBuffer.append(TEXT_32);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(genClass.getTypeParameters().trim());
    stringBuffer.append(genClass.getClassExtends());
    stringBuffer.append(genClass.getClassImplements());
    } else {
    stringBuffer.append(TEXT_33);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(genClass.getTypeParameters().trim());
    stringBuffer.append(genClass.getInterfaceExtends());
    }
    stringBuffer.append(TEXT_34);
    if (genModel.hasCopyrightField()) {
    stringBuffer.append(TEXT_35);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genModel.getCopyrightFieldLiteral());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_5);
    }
    if (isImplementation && genModel.getDriverNumber() != null) {
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_38);
    stringBuffer.append(genModel.getDriverNumber());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_5);
    }
    if (isImplementation && genClass.isJavaIOSerializable()) {
    stringBuffer.append(TEXT_40);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_41);
    if (isGWT) {
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_43);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_44);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) {
    for (String eVirtualIndexBitField : eVirtualIndexBitFields) {
    stringBuffer.append(TEXT_45);
    if (isGWT) {
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_46);
    stringBuffer.append(eVirtualIndexBitField);
    stringBuffer.append(TEXT_44);
    }
    }
    }
    }
    if (isImplementation && genClass.isModelRoot() && genModel.isBooleanFlagsEnabled() && genModel.getBooleanFlagsReservedBits() == -1) {
    stringBuffer.append(TEXT_47);
    if (isGWT) {
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_46);
    stringBuffer.append(genModel.getBooleanFlagsField());
    stringBuffer.append(TEXT_48);
    }
    if (isImplementation && !genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_50);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genClass)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genClass, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_52);
    if (isJDK50 && OCLGenModelUtil.INSTANCE.hasAPIDeprecatedTag(genClass)) {
    stringBuffer.append(TEXT_53);
    }
    stringBuffer.append(TEXT_54);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(TEXT_55);
    stringBuffer.append(genClass.getFeatureCountID());
    stringBuffer.append(TEXT_56);
    stringBuffer.append(OCLGenModelUtil.getFeatureCountValue(genClass));
    stringBuffer.append(TEXT_44);
    if (genModel.isOperationReflection()) {
    stringBuffer.append(TEXT_57);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_50);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genClass)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genClass, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_52);
    if (isJDK50 && OCLGenModelUtil.INSTANCE.hasAPIDeprecatedTag(genClass)) {
    stringBuffer.append(TEXT_53);
    }
    stringBuffer.append(TEXT_54);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(TEXT_55);
    stringBuffer.append(genClass.getOperationCountID());
    stringBuffer.append(TEXT_56);
    stringBuffer.append(OCLGenModelUtil.getOperationCountValue(genClass));
    stringBuffer.append(TEXT_44);
    }
    stringBuffer.append(TEXT_5);
    for (GenFeature genFeature : genClass.getReifiedGenFeatures()) {
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) { String rawListItemType = genFeature.getRawListItemType(genClass); int index = rawListItemType.indexOf('['); String head = rawListItemType; String tail = ""; if (index != -1) { head = rawListItemType.substring(0, index); tail = rawListItemType.substring(index); } 
    stringBuffer.append(TEXT_58);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_19);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genFeature)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genFeature, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_52);
    if (isJDK50 && OCLGenModelUtil.INSTANCE.hasAPIDeprecatedTag(genFeature)) {
    stringBuffer.append(TEXT_53);
    }
    if (genFeature.getQualifiedListItemType(genClass).contains("<") || genFeature.getArrayItemType(genClass).contains("<")) {
    stringBuffer.append(TEXT_61);
    }
    stringBuffer.append(TEXT_62);
    stringBuffer.append(rawListItemType);
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_64);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_65);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_44);
    }
    }
    for (GenFeature genFeature : genClass.getDeclaredFieldGenFeatures()) {
    if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_66);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_19);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genFeature)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genFeature, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_52);
    if (isGWT) {
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    if (isJDK50 && OCLGenModelUtil.INSTANCE.hasAPIDeprecatedTag(genFeature)) {
    stringBuffer.append(TEXT_53);
    }
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_71);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_72);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_73);
    } else if (genFeature.isListType() || genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_74);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_19);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genFeature)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genFeature, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_52);
    if (isGWT) {
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    if (isJDK50 && OCLGenModelUtil.INSTANCE.hasAPIDeprecatedTag(genFeature)) {
    stringBuffer.append(TEXT_53);
    }
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_44);
    }
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) { String rawListItemType = genFeature.getRawListItemType(genClass); int index = rawListItemType.indexOf('['); String head = rawListItemType; String tail = ""; if (index != -1) { head = rawListItemType.substring(0, index); tail = rawListItemType.substring(index); } 
    stringBuffer.append(TEXT_58);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_19);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genFeature)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genFeature, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_52);
    if (genFeature.getQualifiedListItemType(genClass).contains("<") || genFeature.getArrayItemType(genClass).contains("<")) {
    stringBuffer.append(TEXT_61);
    }
    if (isJDK50 && OCLGenModelUtil.INSTANCE.hasAPIDeprecatedTag(genFeature)) {
    stringBuffer.append(TEXT_53);
    }
    stringBuffer.append(TEXT_62);
    stringBuffer.append(rawListItemType);
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_64);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_65);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_44);
    }
    } else {
    if (genFeature.hasEDefault() && (!genFeature.isVolatile() || !genModel.isReflectiveDelegation() && (!genFeature.hasDelegateFeature() || !genFeature.isUnsettable()))) { String staticDefaultValue = genFeature.getStaticDefaultValue();
    stringBuffer.append(TEXT_77);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_19);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genFeature)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genFeature, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_52);
    if (genModel.useGenerics() && genFeature.isListDataType() && genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_78);
    }
    if (isJDK50 && OCLGenModelUtil.INSTANCE.hasAPIDeprecatedTag(genFeature)) {
    stringBuffer.append(TEXT_53);
    }
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getEDefault());
    if ("".equals(staticDefaultValue)) {
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genFeature.getEcoreFeature().getDefaultValueLiteral());
    stringBuffer.append(TEXT_80);
    } else {
    stringBuffer.append(TEXT_56);
    stringBuffer.append(staticDefaultValue);
    stringBuffer.append(TEXT_4);
    stringBuffer.append(genModel.getNonNLS(staticDefaultValue));
    }
    stringBuffer.append(TEXT_5);
    }
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) { int flagIndex = genClass.getFlagIndex(genFeature);
    if (flagIndex > 31 && flagIndex % 32 == 0) {
    stringBuffer.append(TEXT_81);
    if (isGWT) {
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_46);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_48);
    }
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_83);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genFeature)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genFeature, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_52);
    if (isJDK50 && OCLGenModelUtil.INSTANCE.hasAPIDeprecatedTag(genFeature)) {
    stringBuffer.append(TEXT_53);
    }
    stringBuffer.append(TEXT_84);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_85);
    stringBuffer.append(flagIndex % 32);
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_83);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genFeature)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genFeature, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_52);
    if (isJDK50 && OCLGenModelUtil.INSTANCE.hasAPIDeprecatedTag(genFeature)) {
    stringBuffer.append(TEXT_53);
    }
    stringBuffer.append(TEXT_84);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_87);
    if (isJDK50) {
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_88);
    } else {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_89);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_90);
    }
    stringBuffer.append(TEXT_91);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getTypeGenClassifier().getFormattedName());
    stringBuffer.append(TEXT_93);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genFeature)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genFeature, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_52);
    if (isJDK50 && OCLGenModelUtil.INSTANCE.hasAPIDeprecatedTag(genFeature)) {
    stringBuffer.append(TEXT_53);
    }
    stringBuffer.append(TEXT_94);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_95);
    if (isJDK50) {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_96);
    } else {
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_98);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_100);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_101);
    }
    stringBuffer.append(TEXT_44);
    }
    stringBuffer.append(TEXT_102);
    stringBuffer.append(genClass.getFlagSize(genFeature) > 1 ? "s" : "");
    stringBuffer.append(TEXT_103);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_19);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genFeature)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genFeature, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_52);
    if (isJDK50 && OCLGenModelUtil.INSTANCE.hasAPIDeprecatedTag(genFeature)) {
    stringBuffer.append(TEXT_53);
    }
    stringBuffer.append(TEXT_84);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_104);
    stringBuffer.append(genClass.getFlagMask(genFeature));
    stringBuffer.append(TEXT_91);
    if (genFeature.isEnumType()) {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_105);
    } else {
    stringBuffer.append(flagIndex % 32);
    }
    stringBuffer.append(TEXT_44);
    } else {
    stringBuffer.append(TEXT_74);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_19);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genFeature)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genFeature, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_52);
    if (isGWT) {
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    if (isJDK50 && OCLGenModelUtil.INSTANCE.hasAPIDeprecatedTag(genFeature)) {
    stringBuffer.append(TEXT_53);
    }
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getSafeName());
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_56);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_44);
    }
    }
    }
    if (genClass.isESetField(genFeature)) {
    if (genClass.isESetFlag(genFeature)) { int flagIndex = genClass.getESetFlagIndex(genFeature);
    if (flagIndex > 31 && flagIndex % 32 == 0) {
    stringBuffer.append(TEXT_81);
    if (isGWT) {
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_46);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_48);
    }
    stringBuffer.append(TEXT_106);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_107);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genFeature)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genFeature, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_52);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genFeature)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genFeature, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_84);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_108);
    stringBuffer.append(flagIndex % 32 );
    stringBuffer.append(TEXT_44);
    } else {
    stringBuffer.append(TEXT_109);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_107);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genFeature)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genFeature, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_52);
    if (isGWT) {
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    if (isJDK50 && OCLGenModelUtil.INSTANCE.hasAPIDeprecatedTag(genFeature)) {
    stringBuffer.append(TEXT_53);
    }
    stringBuffer.append(TEXT_110);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_111);
    }
    }
    //Class/declaredFieldGenFeature.override.javajetinc
    }
    }
    if (isImplementation && genClass.hasOffsetCorrection() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_112);
    stringBuffer.append(genClass.getOffsetCorrectionField(null));
    stringBuffer.append(TEXT_56);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_113);
    stringBuffer.append(genClass.getImplementedGenFeatures().get(0).getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_114);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genClass.getImplementedGenFeatures().get(0)));
    stringBuffer.append(TEXT_44);
    }
    if (isImplementation && !genModel.isReflectiveDelegation()) {
    for (GenFeature genFeature : genClass.getImplementedGenFeatures()) { GenFeature reverseFeature = genFeature.getReverse();
    if (reverseFeature != null && reverseFeature.getGenClass().hasOffsetCorrection()) {
    stringBuffer.append(TEXT_115);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genFeature)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genFeature, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_116);
    if (isJDK50 && OCLGenModelUtil.INSTANCE.hasAPIDeprecatedTag(genFeature)) {
    stringBuffer.append(TEXT_53);
    }
    stringBuffer.append(TEXT_117);
    stringBuffer.append(genClass.getOffsetCorrectionField(genFeature));
    stringBuffer.append(TEXT_56);
    stringBuffer.append(reverseFeature.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_113);
    stringBuffer.append(reverseFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_114);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(reverseFeature.getGenClass(), reverseFeature));
    stringBuffer.append(TEXT_44);
    }
    }
    }
    if (genModel.isOperationReflection() && isImplementation && genClass.hasOffsetCorrection() && !genClass.getImplementedGenOperations().isEmpty()) {
    stringBuffer.append(TEXT_118);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genClass.getImplementedGenOperations().get(0).getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_114);
    stringBuffer.append(OCLGenModelUtil.getQualifiedOperationValue(genClass, genClass.getImplementedGenOperations().get(0)));
    stringBuffer.append(TEXT_44);
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_35);
    if (genModel.isPublicConstructors()) {
    stringBuffer.append(TEXT_120);
    } else {
    stringBuffer.append(TEXT_121);
    }
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(TEXT_122);
    for (GenFeature genFeature : genClass.getFlagGenFeaturesWithDefault()) {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_124);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_125);
    if (!genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_126);
    }
    stringBuffer.append(TEXT_4);
    }
    stringBuffer.append(TEXT_127);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_129);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_130);
    }
    if (isImplementation && genModel.isDynamicDelegation()) {
    }
    if (isImplementation && (genModel.getFeatureDelegation() == GenDelegationKind.REFLECTIVE_LITERAL || genModel.isDynamicDelegation()) && (genClass.getClassExtendsGenClass() == null || (genClass.getClassExtendsGenClass().getGenModel().getFeatureDelegation() != GenDelegationKind.REFLECTIVE_LITERAL && !genClass.getClassExtendsGenClass().getGenModel().isDynamicDelegation()))) {
    if (genClass.hasStaticFeatures()) {
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genClass.getClassExtendsGenClass() == null ? 0 : genClass.getClassExtendsGenClass().getAllGenFeatures().size());
    stringBuffer.append(TEXT_44);
    }
    stringBuffer.append(TEXT_132);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_133);
    stringBuffer.append(genClass.getClassExtendsGenClass() == null ? "0" : genClass.hasStaticFeatures() ? "ESTATIC_FEATURE_COUNT" : Integer.toString(genClass.getClassExtendsGenClass().getAllGenFeatures().size()));
    stringBuffer.append(TEXT_130);
    }
    //Class/reflectiveDelegation.override.javajetinc
    if (isImplementation) {
    new Runnable() { public void run() { GenClass classExtendsGenClass = genClass.getClassExtendsGenClass(); List<GenFeature> classExtendsAllGenFeatures = classExtendsGenClass == null? Collections.<GenFeature>emptyList() : classExtendsGenClass.getAllGenFeatures();
    for (GenFeature genFeature : genClass.getReifiedGenFeatures()) {
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) { String arrayElementType = genFeature.getArrayItemType(genClass);
    stringBuffer.append(TEXT_134);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_19);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genFeature)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genFeature, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_116);
    if (genModel.useGenerics() && CodeGenUtil.isUncheckedCast(arrayElementType)) {
    stringBuffer.append(TEXT_78);
    }
    if (isJDK50 && OCLGenModelUtil.INSTANCE.hasAPIDeprecatedTag(genFeature)) {
    stringBuffer.append(TEXT_53);
    }
    if (useInterfaceOverrideAnnotation || classExtendsAllGenFeatures.contains(genFeature)) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_135);
    stringBuffer.append(arrayElementType);
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_136);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_138);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_139);
    } else {
    stringBuffer.append(TEXT_140);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_141);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_143);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_4);
    }
    stringBuffer.append(TEXT_144);
    stringBuffer.append(arrayElementType);
    stringBuffer.append(TEXT_145);
    }
    if (genFeature.isGet() && genFeature.isListType()) {
    stringBuffer.append(TEXT_146);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genFeature)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genFeature, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_116);
    if (isJDK50) { //Class/getGenFeature.annotations.insert.javajetinc
    }
    if (genFeature.isListType() && genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_78);
    }
    if (isJDK50 && OCLGenModelUtil.INSTANCE.hasAPIDeprecatedTag(genFeature)) {
    stringBuffer.append(TEXT_53);
    }
    if (useInterfaceOverrideAnnotation || classExtendsAllGenFeatures.contains(genFeature)) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getGetAccessor());
    if (genClass.hasCollidingGetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_147);
    }
    stringBuffer.append(TEXT_136);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_149);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_150);
    }
    stringBuffer.append(TEXT_140);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_151);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_152);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_154);
    stringBuffer.append(OCLGenModelUtil.getListConstructor(genClass, genFeature));
    stringBuffer.append(TEXT_150);
    } else {
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_154);
    stringBuffer.append(OCLGenModelUtil.getListConstructor(genClass, genFeature));
    stringBuffer.append(TEXT_4);
    }
    stringBuffer.append(TEXT_156);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_130);
    }
    if (!genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_157);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genFeature)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genFeature, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_116);
    if (isJDK50) { //Class/basicSetGenFeature.annotations.insert.javajetinc
    }
    if (isJDK50 && OCLGenModelUtil.INSTANCE.hasAPIDeprecatedTag(genFeature)) {
    stringBuffer.append(TEXT_53);
    }
    if (classExtendsAllGenFeatures.contains(genFeature)) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_159);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_160);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_161);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_162);
    }
    if (genFeature.isSet() && !(!genModel.isReflectiveDelegation() && genFeature.isBasicSet())) {
    stringBuffer.append(TEXT_157);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genFeature)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genFeature, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_116);
    if (isJDK50) { //Class/setGenFeature.annotations.insert.javajetinc
    }
    { GenOperation setAccessorOperation = genClass.getSetAccessorOperation(genFeature);
    if (isJDK50 && OCLGenModelUtil.INSTANCE.hasAPIDeprecatedTag(genFeature)) {
    stringBuffer.append(TEXT_53);
    }
    if (classExtendsAllGenFeatures.contains(genFeature)) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_163);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_147);
    }
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(setAccessorOperation == null ? "new" + genFeature.getCapName() : setAccessorOperation.getGenParameters().get(0).getName());
    stringBuffer.append(TEXT_164);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_147);
    }
    stringBuffer.append(TEXT_97);
    stringBuffer.append(setAccessorOperation == null ? "new" + genFeature.getCapName() : setAccessorOperation.getGenParameters().get(0).getName());
    stringBuffer.append(TEXT_165);
    }
    }
    //Class/genFeatureReified.override.javajetinc
    }}}.run();}
    new Runnable() { public void run() {
    for (GenFeature genFeature : (isImplementation ? genClass.getImplementedGenFeatures() : genClass.getDeclaredGenFeatures())) {
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) { String arrayElementType = genFeature.getArrayItemType(genClass);
    stringBuffer.append(TEXT_115);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genFeature)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genFeature, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_116);
    if (!isImplementation) {
    stringBuffer.append(TEXT_54);
    stringBuffer.append(arrayElementType);
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_166);
    } else {
    if (genModel.useGenerics() && CodeGenUtil.isUncheckedCast(arrayElementType)) {
    stringBuffer.append(TEXT_78);
    }
    if (isJDK50 && OCLGenModelUtil.INSTANCE.hasAPIDeprecatedTag(genFeature)) {
    stringBuffer.append(TEXT_53);
    }
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_135);
    stringBuffer.append(arrayElementType);
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_136);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_138);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_139);
    } else {
    stringBuffer.append(TEXT_140);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_141);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_143);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_4);
    }
    stringBuffer.append(TEXT_144);
    stringBuffer.append(arrayElementType);
    stringBuffer.append(TEXT_145);
    }
    stringBuffer.append(TEXT_115);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genFeature)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genFeature, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_116);
    if (isJDK50 && OCLGenModelUtil.INSTANCE.hasAPIDeprecatedTag(genFeature)) {
    stringBuffer.append(TEXT_53);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_54);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_167);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_168);
    } else {
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_167);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_169);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_90);
    }
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_170);
    }
    stringBuffer.append(TEXT_115);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genFeature)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genFeature, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_116);
    if (isJDK50 && OCLGenModelUtil.INSTANCE.hasAPIDeprecatedTag(genFeature)) {
    stringBuffer.append(TEXT_53);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_171);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_172);
    } else {
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_174);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_175);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_176);
    } else {
    stringBuffer.append(TEXT_175);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_177);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_178);
    }
    stringBuffer.append(TEXT_179);
    }
    stringBuffer.append(TEXT_115);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genFeature)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genFeature, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_116);
    if (isJDK50 && OCLGenModelUtil.INSTANCE.hasAPIDeprecatedTag(genFeature)) {
    stringBuffer.append(TEXT_53);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_180);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_181);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_182);
    } else {
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_163);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_181);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_183);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_184);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_185);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_165);
    }
    stringBuffer.append(TEXT_115);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genFeature)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genFeature, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_116);
    if (isJDK50 && OCLGenModelUtil.INSTANCE.hasAPIDeprecatedTag(genFeature)) {
    stringBuffer.append(TEXT_53);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_180);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_186);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_187);
    } else {
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_163);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_186);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_188);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_189);
    }
    }
    if (genFeature.isGet() && (isImplementation || !genFeature.isSuppressedGetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_190);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_191);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_192);
    if (genFeature.isListType() && genFeature.getEcoreFeature().getEGenericType().getETypeParameter() == null) {
    if (genFeature.isMapType()) { GenFeature keyFeature = genFeature.getMapEntryTypeGenClass().getMapEntryKeyFeature(); GenFeature valueFeature = genFeature.getMapEntryTypeGenClass().getMapEntryValueFeature(); 
    stringBuffer.append(TEXT_193);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_194);
    stringBuffer.append(keyFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_195);
    } else {
    stringBuffer.append(TEXT_196);
    stringBuffer.append(keyFeature.getType(genClass));
    stringBuffer.append(TEXT_195);
    }
    stringBuffer.append(TEXT_197);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_194);
    stringBuffer.append(valueFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_195);
    } else {
    stringBuffer.append(TEXT_196);
    stringBuffer.append(valueFeature.getType(genClass));
    stringBuffer.append(TEXT_195);
    }
    stringBuffer.append(TEXT_198);
    } else if (!genFeature.isWrappedFeatureMapType() && !(genModel.isSuppressEMFMetaData() && "org.eclipse.emf.ecore.EObject".equals(genFeature.getQualifiedListItemType(genClass)))) {
String typeName = genFeature.getQualifiedListItemType(genClass); String head = typeName; String tail = ""; int index = typeName.indexOf('<'); if (index == -1) { index = typeName.indexOf('['); } 
if (index != -1) { head = typeName.substring(0, index); tail = "<code>" + CodeGenUtil.xmlEscapeEncode(typeName.substring(index)) + "</code>"; }

    stringBuffer.append(TEXT_199);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_195);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_192);
    }
    } else if (genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_200);
    stringBuffer.append(genFeature.getDefaultValue());
    stringBuffer.append(TEXT_201);
    }
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_202);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    stringBuffer.append(TEXT_203);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_204);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getRawQualifiedInterfaceName(reverseGenFeature.getGenClass()));
    stringBuffer.append(TEXT_13);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(reverseGenFeature.getFormattedName());
    stringBuffer.append(TEXT_205);
    }
    }
    stringBuffer.append(TEXT_206);
    if (!genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_207);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_208);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_209);
    }
    stringBuffer.append(TEXT_210);
    if (genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genFeature.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_212);
    }
    stringBuffer.append(TEXT_213);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_208);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_192);
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_214);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_19);
    }
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_216);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_19);
    }
    }
    if (genFeature.isChangeable() && !genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_217);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_90);
    }
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_214);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_18);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_19);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_214);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getRawQualifiedInterfaceName(reverseGenFeature.getGenClass()));
    stringBuffer.append(TEXT_13);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    }
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genFeature.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_218);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_219);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_220);
    }}
    stringBuffer.append(TEXT_116);
    //Class/getGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_115);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genFeature)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genFeature, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_116);
    if (isJDK50) { //Class/getGenFeature.annotations.insert.javajetinc
    }
    }
    if (isJDK50 && OCLGenModelUtil.INSTANCE.hasAPIDeprecatedTag(genFeature)) {
    stringBuffer.append(TEXT_53);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_54);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_166);
    } else {
    if (genModel.useGenerics() && ((genFeature.isContainer() || genFeature.isResolveProxies()) && !genFeature.isListType() && genFeature.isUncheckedCast(genClass) || genFeature.isListType() && !genFeature.isFeatureMapType() && (genModel.isReflectiveDelegation() || genModel.isVirtualDelegation() || (genModel.isDynamicDelegation() && !genFeature.isVolatile())) || genFeature.isListDataType() && genFeature.hasDelegateFeature() || genFeature.isListType() && genFeature.hasSettingDelegate())) {
    stringBuffer.append(TEXT_78);
    }
    if (useInterfaceOverrideAnnotation && !genClass.isMapEntry() && !genClass.hasCollidingGetAccessorOperation(genFeature) && !genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getGetAccessor());
    if (genClass.hasCollidingGetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_147);
    }
    stringBuffer.append(TEXT_136);
    if (genModel.isDynamicDelegation() && !genFeature.isVolatile()) {
    stringBuffer.append(TEXT_175);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_97);
    }
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_221);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    if (genClass.hasStaticFeatures()){
    stringBuffer.append(TEXT_222);
    }
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_223);
    stringBuffer.append(!genFeature.isEffectiveSuppressEMFTypes());
    stringBuffer.append(TEXT_90);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_19);
    }
    stringBuffer.append(TEXT_4);
    } else if (genModel.isReflectiveDelegation()) {
    if (genFeature.hasGetterBody()) {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getGetterBody(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_175);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_97);
    }
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_225);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_226);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_19);
    }
    stringBuffer.append(TEXT_4);
    }
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_175);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_97);
    }
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_227);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_19);
    }
    stringBuffer.append(TEXT_4);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_149);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_150);
    }
    stringBuffer.append(TEXT_140);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_151);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_152);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_154);
    stringBuffer.append(OCLGenModelUtil.getListConstructor(genClass, genFeature));
    stringBuffer.append(TEXT_150);
    } else {
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_154);
    stringBuffer.append(OCLGenModelUtil.getListConstructor(genClass, genFeature));
    stringBuffer.append(TEXT_4);
    }
    stringBuffer.append(TEXT_156);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_4);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_228);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_229);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_90);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_230);
    } else {
    stringBuffer.append(TEXT_231);
    }
    stringBuffer.append(TEXT_232);
    } else {
    if (genFeature.isResolveProxies()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_149);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_150);
    }
    stringBuffer.append(TEXT_140);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_233);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_234);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_56);
    if (!genFeature.getTypeGenPackage().getGenModel().isSuppressInterfaces()) {
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_90);
    }
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_56);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_237);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_238);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_239);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_240);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_241);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_159);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_4);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_241);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_242);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_243);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_244);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_241);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_245);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_246);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(targetClass, reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_153);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_247);
    }
    stringBuffer.append(TEXT_248);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_249);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_250);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_251);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_252);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_253);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_254);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(targetClass, reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_153);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_255);
    }
    stringBuffer.append(TEXT_256);
    } else if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_257);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_150);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_258);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_260);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_261);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_262);
    }
    stringBuffer.append(TEXT_263);
    }
    if (!genFeature.isResolveProxies() && genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_149);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_150);
    } else if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_266);
    } else {
    stringBuffer.append(TEXT_175);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_267);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_268);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_269);
    }
    } else {
    stringBuffer.append(TEXT_175);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_4);
    }
    }
    } else {//volatile
    if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_270);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_233);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_272);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_273);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_274);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_4);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (genFeature.isFeatureMapType()) {
    String featureMapEntryTemplateArgument = isJDK50 ? "<" + genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap") + ".Entry>" : "";
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_275);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperClass());
    stringBuffer.append(TEXT_276);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_278);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_279);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_280);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_262);
    } else {
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_281);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_282);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_280);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_150);
    }
    } else if (genFeature.isListType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_283);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_278);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_284);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_150);
    } else {
    stringBuffer.append(TEXT_285);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_286);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_150);
    }
    } else {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_175);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_97);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_90);
    }
    stringBuffer.append(TEXT_276);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_278);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_287);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_226);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_19);
    }
    stringBuffer.append(TEXT_4);
    } else {
    stringBuffer.append(TEXT_175);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_97);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_90);
    }
    stringBuffer.append(TEXT_288);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_289);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_226);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_19);
    }
    stringBuffer.append(TEXT_4);
    }
    }
    } else if (genClass.getGetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genClass.getGetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else if (genFeature.hasGetterBody()) {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getGetterBody(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_290);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_292);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_293);
    if (genFeature.isMapType()) {
    stringBuffer.append(TEXT_294);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_295);
    } else {
    stringBuffer.append(TEXT_296);
    }
    stringBuffer.append(TEXT_297);
    }
    stringBuffer.append(TEXT_298);
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_179);
    }
    //Class/getGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_115);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genFeature)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genFeature, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_116);
    if (isJDK50) { //Class/basicGetGenFeature.annotations.insert.javajetinc
    }
    if (isJDK50 && OCLGenModelUtil.INSTANCE.hasAPIDeprecatedTag(genFeature)) {
    stringBuffer.append(TEXT_53);
    }
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_299);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_136);
    if (genModel.isDynamicDelegation() && !genFeature.isVolatile()) {
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_221);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    if (genClass.hasStaticFeatures()){
    stringBuffer.append(TEXT_222);
    }
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_300);
    stringBuffer.append(!genFeature.isEffectiveSuppressEMFTypes());
    stringBuffer.append(TEXT_150);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_175);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_97);
    }
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_301);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_19);
    }
    stringBuffer.append(TEXT_4);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_228);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_229);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_302);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_149);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_150);
    } else {
    stringBuffer.append(TEXT_175);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_4);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_303);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_278);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_287);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_304);
    } else {
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_281);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_289);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_304);
    }
    } else if (genFeature.hasGetterBody()) {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getGetterBody(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_290);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_305);
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_179);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_115);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genFeature)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genFeature, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_116);
    if (isJDK50) { //Class/basicSetGenFeature.annotations.insert.javajetinc
    }
    if (isJDK50 && OCLGenModelUtil.INSTANCE.hasAPIDeprecatedTag(genFeature)) {
    stringBuffer.append(TEXT_53);
    }
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_159);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_306);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_307);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_308);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_153);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_309);
    stringBuffer.append(TEXT_310);
    } else if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_311);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_308);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_153);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_309);
    stringBuffer.append(TEXT_310);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_312);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_313);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_150);
    } else {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_56);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_315);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_4);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_317);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_318);
    }
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_320);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_321);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_124);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_322);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_323);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_324);
    }
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_325);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_326);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_328);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_153);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_330);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_153);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_331);
    } else {
    stringBuffer.append(TEXT_332);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_333);
    }
    stringBuffer.append(TEXT_150);
    } else {
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_328);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_153);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_330);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_334);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_330);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_150);
    }
    stringBuffer.append(TEXT_335);
    }
    stringBuffer.append(TEXT_310);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_283);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_278);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_336);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_309);
    } else {
    stringBuffer.append(TEXT_283);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_337);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_338);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_309);
    }
    } else {
    stringBuffer.append(TEXT_339);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_340);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_179);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && (isImplementation || !genFeature.isSuppressedSetVisibility())) {
    if (isInterface) { 
    stringBuffer.append(TEXT_341);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getRawQualifiedInterfaceName(genClass));
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_192);
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_208);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_192);
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_214);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_19);
    }
    if (!genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_216);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_19);
    }
    }
    stringBuffer.append(TEXT_343);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_19);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genFeature)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genFeature, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_116);
    //Class/setGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_115);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genFeature)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genFeature, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_116);
    if (isJDK50) { //Class/setGenFeature.annotations.insert.javajetinc
    }
    }
    if (isJDK50 && OCLGenModelUtil.INSTANCE.hasAPIDeprecatedTag(genFeature)) {
    stringBuffer.append(TEXT_53);
    }
    if (!isImplementation) { 
    stringBuffer.append(TEXT_180);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_344);
    } else { GenOperation setAccessorOperation = genClass.getSetAccessorOperation(genFeature);
    if (useInterfaceOverrideAnnotation && !genClass.isMapEntry() && !genClass.hasCollidingSetAccessorOperation(genFeature) && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_163);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_147);
    }
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(setAccessorOperation == null ? "new" + genFeature.getCapName() : setAccessorOperation.getGenParameters().get(0).getName());
    stringBuffer.append(TEXT_345);
    if (genModel.isDynamicDelegation() && !genFeature.isVolatile()) {
    stringBuffer.append(TEXT_346);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    if (genClass.hasStaticFeatures()){
    stringBuffer.append(TEXT_222);
    }
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_153);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_347);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_97);
    }
    stringBuffer.append(TEXT_348);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_90);
    }
    stringBuffer.append(TEXT_150);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_349);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_153);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_347);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_97);
    }
    stringBuffer.append(TEXT_348);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_90);
    }
    stringBuffer.append(TEXT_150);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_350);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_347);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_97);
    }
    stringBuffer.append(TEXT_348);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_90);
    }
    stringBuffer.append(TEXT_150);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_351);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_352);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_353);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_354);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_355);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_348);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_356);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_357);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_358);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_359);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_308);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_360);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(targetClass, reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_153);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_361);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_348);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_362);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_363);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_328);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_262);
    }
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_149);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_150);
    }
    stringBuffer.append(TEXT_351);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_364);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_365);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_366);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_367);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_368);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_369);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_370);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_359);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_308);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_371);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_252);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_368);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_372);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(reverseFeature.getGenClass(), reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_153);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_373);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_359);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_308);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_360);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(targetClass, reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_153);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_255);
    }
    stringBuffer.append(TEXT_374);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_348);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_362);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_375);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_376);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_377);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_150);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_376);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_320);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_321);
    }
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_124);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_322);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_376);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_323);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_324);
    }
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_325);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_378);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_328);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_379);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_380);
    }
    stringBuffer.append(TEXT_381);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_363);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_328);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_262);
    }
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_266);
    } else {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_56);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_267);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_268);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_269);
    }
    }
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_351);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_382);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_124);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_383);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_384);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_385);
    } else {
    stringBuffer.append(TEXT_351);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_386);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_56);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_387);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_56);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_388);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_389);
    if (isJDK50) {
    stringBuffer.append(TEXT_348);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_88);
    } else {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_390);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_90);
    }
    stringBuffer.append(TEXT_91);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_391);
    }
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_56);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_4);
    }
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_392);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_393);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_4);
    } else {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_392);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_393);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_4);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_56);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_348);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_4);
    } else {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_56);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_348);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_4);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_312);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_313);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_150);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_317);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_318);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_320);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_321);
    }
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_124);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_322);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_323);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_324);
    }
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_325);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_394);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_328);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_153);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_395);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_396);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_330);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_153);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_348);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_153);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_331);
    } else {
    stringBuffer.append(TEXT_332);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_333);
    }
    stringBuffer.append(TEXT_262);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_394);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_328);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_153);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_330);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_397);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_396);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_330);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_153);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_348);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_262);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_398);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_278);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_399);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_153);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_347);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_97);
    }
    stringBuffer.append(TEXT_348);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_90);
    }
    stringBuffer.append(TEXT_150);
    } else {
    stringBuffer.append(TEXT_398);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_337);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_400);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_153);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_347);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_97);
    }
    stringBuffer.append(TEXT_348);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_90);
    }
    stringBuffer.append(TEXT_150);
    }
    } else if (setAccessorOperation != null) {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(setAccessorOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_401);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_402);
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_179);
    }
    //Class/setGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_115);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genFeature)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genFeature, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_116);
    if (isJDK50) { //Class/basicUnsetGenFeature.annotations.insert.javajetinc
    }
    if (isJDK50 && OCLGenModelUtil.INSTANCE.hasAPIDeprecatedTag(genFeature)) {
    stringBuffer.append(TEXT_53);
    }
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_403);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_306);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_404);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_90);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_406);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_309);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_407);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_56);
    }
    stringBuffer.append(TEXT_408);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_150);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_56);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_4);
    }
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_409);
    }
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_317);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_410);
    }
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_320);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_321);
    }
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_384);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_322);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_323);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_324);
    }
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_411);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_412);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_413);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_153);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_414);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_415);
    } else {
    stringBuffer.append(TEXT_330);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_416);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_331);
    } else {
    stringBuffer.append(TEXT_330);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_333);
    }
    stringBuffer.append(TEXT_417);
    }
    } else {
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_340);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_179);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && (isImplementation || !genFeature.isSuppressedUnsetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_419);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getRawQualifiedInterfaceName(genClass));
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_192);
    stringBuffer.append(TEXT_420);
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_19);
    }
    stringBuffer.append(TEXT_343);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_19);
    if (!genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_217);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_90);
    }
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genFeature)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genFeature, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_116);
    //Class/unsetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_115);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genFeature)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genFeature, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_116);
    if (isJDK50) { //Class/unsetGenFeature.annotations.insert.javajetinc
    }
    }
    if (isJDK50 && OCLGenModelUtil.INSTANCE.hasAPIDeprecatedTag(genFeature)) {
    stringBuffer.append(TEXT_53);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_421);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_166);
    } else {
    if (useInterfaceOverrideAnnotation && !genClass.isMapEntry() && !genClass.hasCollidingUnsetAccessorOperation(genFeature) && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_422);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingUnsetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_147);
    }
    stringBuffer.append(TEXT_136);
    if (genModel.isDynamicDelegation() && !genFeature.isVolatile()) {
    stringBuffer.append(TEXT_423);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    if (genClass.hasStaticFeatures()){
    stringBuffer.append(TEXT_222);
    }
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_150);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_424);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_150);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_425);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_149);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_150);
    }
    stringBuffer.append(TEXT_140);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_426);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_427);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_428);
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_149);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_150);
    }
    stringBuffer.append(TEXT_140);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_429);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_430);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_431);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_369);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_252);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_431);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_372);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(targetClass, reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_153);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_255);
    }
    stringBuffer.append(TEXT_432);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_433);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_376);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_377);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_150);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_376);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_320);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_321);
    }
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_384);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_322);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_376);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_323);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_324);
    }
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_411);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_378);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_413);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_434);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_380);
    }
    stringBuffer.append(TEXT_381);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_266);
    } else {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_56);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_267);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_268);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_269);
    }
    }
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_312);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_435);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_150);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_56);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_4);
    }
    }
    if (!genModel.isSuppressNotification()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_317);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_410);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_320);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_321);
    } else {
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_323);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_324);
    }
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_409);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_384);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_322);
    } else {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_411);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_394);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_413);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_153);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_414);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_415);
    } else {
    stringBuffer.append(TEXT_330);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_416);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_331);
    } else {
    stringBuffer.append(TEXT_330);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_333);
    }
    stringBuffer.append(TEXT_262);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_140);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_382);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_124);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_383);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_384);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_385);
    } else {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_56);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_388);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_436);
    }
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_56);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_4);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_384);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_322);
    } else {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_411);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_394);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_413);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_153);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_414);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_437);
    stringBuffer.append(genFeature.getEDefault());
    } else {
    stringBuffer.append(TEXT_330);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_153);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_331);
    } else {
    stringBuffer.append(TEXT_330);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_333);
    }
    stringBuffer.append(TEXT_262);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_398);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_278);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_438);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_150);
    } else {
    stringBuffer.append(TEXT_398);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_337);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_150);
    }
    } else if (genClass.getUnsetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genClass.getUnsetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_440);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_402);
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_179);
    }
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && (isImplementation || !genFeature.isSuppressedIsSetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_441);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getRawQualifiedInterfaceName(genClass));
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_442);
    stringBuffer.append(TEXT_443);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_208);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_442);
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_216);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_19);
    }
    stringBuffer.append(TEXT_343);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_19);
    if (!genFeature.isListType() && genFeature.isChangeable() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_217);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_90);
    }
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genFeature)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genFeature, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_116);
    //Class/isSetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_115);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genFeature)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genFeature, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_116);
    if (isJDK50) { //Class/isSetGenFeature.annotations.insert.javajetinc
    }
    }
    if (isJDK50 && OCLGenModelUtil.INSTANCE.hasAPIDeprecatedTag(genFeature)) {
    stringBuffer.append(TEXT_53);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_444);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_166);
    } else {
    if (useInterfaceOverrideAnnotation  && !genClass.isMapEntry() && !genClass.hasCollidingIsSetAccessorOperation(genFeature) && !genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_445);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingIsSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_147);
    }
    stringBuffer.append(TEXT_136);
    if (genModel.isDynamicDelegation() && !genFeature.isVolatile()) {
    stringBuffer.append(TEXT_446);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    if (genClass.hasStaticFeatures()){
    stringBuffer.append(TEXT_222);
    }
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_150);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_447);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_150);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_175);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_448);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_149);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_150);
    }
    stringBuffer.append(TEXT_175);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_449);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_427);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_450);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_451);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_150);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_321);
    } else {
    stringBuffer.append(TEXT_175);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_324);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_452);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_278);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_453);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_150);
    } else {
    stringBuffer.append(TEXT_452);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_337);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_454);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_150);
    }
    } else if (genClass.getIsSetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genClass.getIsSetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_455);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_456);
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_179);
    }
    //Class/isSetGenFeature.override.javajetinc
    }
    //Class/genFeature.override.javajetinc
    }//for
    }}.run();
    for (GenOperation genOperation : (isImplementation ? genClass.getImplementedGenOperations() : genClass.getDeclaredGenOperations())) {
    if (isImplementation) {
    if (genOperation.isInvariant() && genOperation.hasInvariantExpression()) {
    stringBuffer.append(TEXT_457);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_458);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_459);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_90);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genOperation)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genOperation, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_52);
    if (isJDK50 && OCLGenModelUtil.INSTANCE.hasAPIDeprecatedTag(genOperation)) {
    stringBuffer.append(TEXT_53);
    }
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_460);
    stringBuffer.append(genOperation.getInvariantExpression("\t\t"));
    stringBuffer.append(TEXT_39);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_5);
    } else if (genOperation.hasInvocationDelegate()) {
    stringBuffer.append(TEXT_461);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_458);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_462);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_90);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genOperation)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genOperation, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_52);
    if (isJDK50 && OCLGenModelUtil.INSTANCE.hasAPIDeprecatedTag(genOperation)) {
    stringBuffer.append(TEXT_53);
    }
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EOperation"));
    stringBuffer.append(TEXT_463);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_464);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EOperation"));
    stringBuffer.append(TEXT_72);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_465);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_466);
    stringBuffer.append(TEXT_420);
    if (genOperation.hasDocumentation() || genOperation.hasParameterDocumentation()) {
    stringBuffer.append(TEXT_467);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    if (genParameter.hasDocumentation()) { String documentation = genParameter.getDocumentation("");
    if (documentation.contains("\n") || documentation.contains("\r")) {
    stringBuffer.append(TEXT_468);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_469);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_468);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    }
    }
    stringBuffer.append(TEXT_212);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genOperation.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_218);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_219);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_220);
    }}
    stringBuffer.append(TEXT_116);
    //Class/genOperation.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_115);
    if (OCLGenModelUtil.INSTANCE.hasAPITags(genOperation)) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(OCLGenModelUtil.INSTANCE.getAPITags(genOperation, genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_116);
    if (isJDK50) { //Class/genOperation.annotations.insert.javajetinc
    }
    }
    if (isJDK50 && OCLGenModelUtil.INSTANCE.hasAPIDeprecatedTag(genOperation)) {
    stringBuffer.append(TEXT_53);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_54);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_44);
    } else {
    if (genModel.useGenerics() && !genOperation.hasBody() && !genOperation.isInvariant() && genOperation.hasInvocationDelegate() && genOperation.isUncheckedCast(genClass)) {
    stringBuffer.append(TEXT_78);
    }
    if (useInterfaceOverrideAnnotation && !genClass.isMapEntry() && !genOperation.isSuppressedVisibility()) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genOperation.getParameters(isImplementation, genClass));
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_470);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = genOperation.getGenParameters().get(0).getName(); String context = genOperation.getGenParameters().get(1).getName();
    if (genOperation.hasInvariantExpression()) {
    stringBuffer.append(TEXT_471);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_472);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_473);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_474);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_475);
    stringBuffer.append(genOperation.getValidationDelegate());
    stringBuffer.append(TEXT_476);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_477);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_474);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_478);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_479);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_480);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_192);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_150);
    } else {
    stringBuffer.append(TEXT_481);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_482);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_483);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_484);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_485);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_486);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_192);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_487);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_488);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_489);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_490);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_491);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_492);
    }
    } else if (genOperation.hasInvocationDelegate()) { int size = genOperation.getGenParameters().size();
    stringBuffer.append(TEXT_493);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_155);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_494);
    if (size > 0) {
    stringBuffer.append(TEXT_347);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_495);
    stringBuffer.append(size);
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genOperation.getParametersArray(genClass));
    stringBuffer.append(TEXT_90);
    } else {
    stringBuffer.append(TEXT_496);
    }
    stringBuffer.append(TEXT_150);
    } else {
    stringBuffer.append(TEXT_497);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_97);
    }
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_90);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_494);
    if (size > 0) {
    stringBuffer.append(TEXT_347);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_495);
    stringBuffer.append(size);
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genOperation.getParametersArray(genClass));
    stringBuffer.append(TEXT_90);
    } else {
    stringBuffer.append(TEXT_496);
    }
    stringBuffer.append(TEXT_90);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_19);
    }
    stringBuffer.append(TEXT_4);
    }
    stringBuffer.append(TEXT_498);
    stringBuffer.append(genModel.getImportedName(isGWT ? "org.eclipse.emf.common.util.InvocationTargetException" : "java.lang.reflect.InvocationTargetException"));
    stringBuffer.append(TEXT_499);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.WrappedException"));
    stringBuffer.append(TEXT_500);
    } else {
    stringBuffer.append(TEXT_501);
    //Class/implementedGenOperation.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_179);
    }
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_132);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass)) {
    stringBuffer.append(TEXT_78);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_502);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_503);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_504);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_505);
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    stringBuffer.append(TEXT_506);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(TEXT_507);
    if (genFeature.isListType()) { String cast = "("  + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + (!genModel.useGenerics() ? ")" : "<" + genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject") + ">)(" + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + "<?>)");
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_508);
    stringBuffer.append(cast);
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_509);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_510);
    } else {
    stringBuffer.append(TEXT_511);
    stringBuffer.append(cast);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_512);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_513);
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_514);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_276);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_515);
    } else {
    stringBuffer.append(TEXT_516);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_309);
    }
    } else {
    if (genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_241);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_149);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_150);
    } else if (genFeature.isVolatile() || genClass.getImplementingGenModel(genFeature).isDynamicDelegation()) {
    stringBuffer.append(TEXT_241);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_56);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_232);
    }
    stringBuffer.append(TEXT_517);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_367);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_518);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_369);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_252);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_518);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_372);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(targetClass, reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_153);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_255);
    }
    stringBuffer.append(TEXT_514);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_276);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_515);
    }
    }
    stringBuffer.append(TEXT_381);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_519);
    } else {
    stringBuffer.append(TEXT_520);
    }
    stringBuffer.append(TEXT_179);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_132);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_521);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_503);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_504);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_505);
    for (GenFeature genFeature : genClass.getEInverseRemoveGenFeatures()) {
    stringBuffer.append(TEXT_506);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(TEXT_507);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_508);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_303);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_509);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_522);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_508);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_303);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_523);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_524);
    } else {
    stringBuffer.append(TEXT_508);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_525);
    }
    } else if (genFeature.isContainer() && !genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_526);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_309);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_527);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_528);
    } else {
    stringBuffer.append(TEXT_514);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_529);
    }
    }
    stringBuffer.append(TEXT_381);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_530);
    } else {
    stringBuffer.append(TEXT_531);
    }
    stringBuffer.append(TEXT_179);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_132);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_532);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_533);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_505);
    for (GenFeature genFeature : genClass.getEBasicRemoveFromContainerGenFeatures()) {
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_506);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(TEXT_534);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(targetClass, reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_153);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_255);
    }
    stringBuffer.append(TEXT_381);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_535);
    } else {
    stringBuffer.append(TEXT_536);
    }
    stringBuffer.append(TEXT_179);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEGetGenFeatures())) {
    stringBuffer.append(TEXT_132);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_537);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_505);
    for (GenFeature genFeature : genClass.getEGetGenFeatures()) {
    stringBuffer.append(TEXT_506);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(TEXT_507);
    if (genFeature.isPrimitiveType()) {
    if (isJDK50) {
    stringBuffer.append(TEXT_538);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_232);
    } else if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_538);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_539);
    } else {
    stringBuffer.append(TEXT_540);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_541);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_542);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_543);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_232);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_544);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_509);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_545);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_232);
    } else {
    stringBuffer.append(TEXT_546);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_547);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_548);
    }
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_544);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_523);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_549);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_232);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_546);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_550);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_72);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_551);
    } else {
    stringBuffer.append(TEXT_538);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_232);
    }
    }
    stringBuffer.append(TEXT_381);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_552);
    } else {
    stringBuffer.append(TEXT_553);
    }
    stringBuffer.append(TEXT_179);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_132);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass) && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_78);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_554);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_505);
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    stringBuffer.append(TEXT_506);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(TEXT_507);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_555);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_523);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_556);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_555);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_72);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_557);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_555);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_558);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_509);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_559);
    } else {
    stringBuffer.append(TEXT_555);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_560);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_557);
    }
    } else {
    stringBuffer.append(TEXT_241);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_561);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_562);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    if (isJDK50) {
    stringBuffer.append(TEXT_563);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_564);
    }
    stringBuffer.append(TEXT_565);
    }
    } else if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_566);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_567);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_568);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_541);
    } else {
    stringBuffer.append(TEXT_566);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_97);
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType() || !genFeature.getRawType().equals(genFeature.getType(genClass))) {
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_90);
    }
    stringBuffer.append(TEXT_569);
    }
    stringBuffer.append(TEXT_570);
    }
    stringBuffer.append(TEXT_381);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_571);
    } else {
    stringBuffer.append(TEXT_572);
    }
    stringBuffer.append(TEXT_179);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEUnsetGenFeatures())) {
    stringBuffer.append(TEXT_132);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_573);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_505);
    for (GenFeature genFeature : genClass.getEUnsetGenFeatures()) {
    stringBuffer.append(TEXT_506);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(TEXT_507);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_555);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_523);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_574);
    } else {
    stringBuffer.append(TEXT_241);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_575);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_576);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_232);
    } else if (!genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_566);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_276);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_577);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_241);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_425);
    } else {
    stringBuffer.append(TEXT_566);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_150);
    }
    stringBuffer.append(TEXT_570);
    }
    stringBuffer.append(TEXT_381);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_578);
    } else {
    stringBuffer.append(TEXT_579);
    }
    stringBuffer.append(TEXT_179);
    //Class/eUnset.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEIsSetGenFeatures())) {
    stringBuffer.append(TEXT_132);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) {
    if (genFeature.isListType() && !genFeature.isUnsettable() && !genFeature.isWrappedFeatureMapType() && !genClass.isField(genFeature) && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_78);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_580);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_505);
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) { String safeNameAccessor = genFeature.getSafeName(); if ("featureID".equals(safeNameAccessor)) { safeNameAccessor = "this." + safeNameAccessor; }
    stringBuffer.append(TEXT_506);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(TEXT_507);
    if (genFeature.hasSettingDelegate()) {
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_581);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_232);
    } else {
    stringBuffer.append(TEXT_538);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_448);
    }
    } else if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_582);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_523);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_583);
    } else {
    stringBuffer.append(TEXT_538);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_584);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_585);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_538);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_584);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_586);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_241);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_149);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_587);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_584);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_586);
    } else {
    stringBuffer.append(TEXT_588);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_589);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_581);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_232);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_538);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_590);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_591);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_592);
    } else {
    stringBuffer.append(TEXT_593);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_594);
    }
    }
    } else if (!genFeature.hasEDefault()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_538);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_590);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_591);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_592);
    } else {
    stringBuffer.append(TEXT_538);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_594);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_508);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_595);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_4);
    } else {
    stringBuffer.append(TEXT_511);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_596);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_436);
    }
    } else {
    stringBuffer.append(TEXT_538);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_364);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_4);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_597);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_598);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_4);
    } else {
    stringBuffer.append(TEXT_538);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_599);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_4);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_538);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_392);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_600);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_601);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_150);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_241);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_149);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_587);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_392);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_600);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_601);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_150);
    } else {
    stringBuffer.append(TEXT_538);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_392);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_602);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_601);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_541);
    }
    }
    }
    }
    stringBuffer.append(TEXT_381);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_603);
    } else {
    stringBuffer.append(TEXT_604);
    }
    stringBuffer.append(TEXT_179);
    //Class/eIsSet.override.javajetinc
    }
    if (isImplementation && (!genClass.getMixinGenFeatures().isEmpty() || genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty())) {
    if (!genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_132);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_605);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_606);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_607);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_608);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_240);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_609);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(TEXT_610);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(mixinGenClass, genFeature));
    stringBuffer.append(TEXT_4);
    }
    stringBuffer.append(TEXT_611);
    }
    stringBuffer.append(TEXT_612);
    }
    stringBuffer.append(TEXT_613);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_614);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_606);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_607);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_615);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_609);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(mixinGenClass, genFeature));
    stringBuffer.append(TEXT_610);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_4);
    }
    stringBuffer.append(TEXT_611);
    }
    if (genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_607);
    stringBuffer.append(genClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_616);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_240);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    stringBuffer.append(TEXT_609);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(TEXT_610);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_4);
    }
    stringBuffer.append(TEXT_611);
    }
    stringBuffer.append(TEXT_617);
    }
    if (genModel.isOperationReflection() && isImplementation && (!genClass.getMixinGenOperations().isEmpty() || !genClass.getOverrideGenOperations(genClass.getExtendedGenOperations(), genClass.getImplementedGenOperations()).isEmpty() || genClass.hasOffsetCorrection() && !genClass.getGenOperations().isEmpty())) {
    stringBuffer.append(TEXT_132);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_618);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_606);
    for (GenClass extendedGenClass : genClass.getExtendedGenClasses()) { List<GenOperation> extendedImplementedGenOperations = extendedGenClass.getImplementedGenOperations(); List<GenOperation> implementedGenOperations = genClass.getImplementedGenOperations();
    if (!genClass.getOverrideGenOperations(extendedImplementedGenOperations, implementedGenOperations).isEmpty()) {
    stringBuffer.append(TEXT_607);
    stringBuffer.append(extendedGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_619);
    for (GenOperation genOperation : extendedImplementedGenOperations) { GenOperation overrideGenOperation = genClass.getOverrideGenOperation(genOperation);
    if (implementedGenOperations.contains(overrideGenOperation)) {
    stringBuffer.append(TEXT_609);
    stringBuffer.append(OCLGenModelUtil.getQualifiedOperationValue(extendedGenClass, genOperation));
    stringBuffer.append(TEXT_610);
    stringBuffer.append(OCLGenModelUtil.getQualifiedOperationValue(genClass, overrideGenOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_4);
    }
    }
    stringBuffer.append(TEXT_620);
    }
    }
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_607);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_619);
    for (GenOperation genOperation : mixinGenClass.getGenOperations()) { GenOperation overrideGenOperation = genClass.getOverrideGenOperation(genOperation);
    stringBuffer.append(TEXT_609);
    stringBuffer.append(OCLGenModelUtil.getQualifiedOperationValue(mixinGenClass, genOperation));
    stringBuffer.append(TEXT_610);
    stringBuffer.append(OCLGenModelUtil.getQualifiedOperationValue(genClass, overrideGenOperation != null ? overrideGenOperation : genOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_4);
    }
    stringBuffer.append(TEXT_611);
    }
    if (genClass.hasOffsetCorrection() && !genClass.getGenOperations().isEmpty()) {
    stringBuffer.append(TEXT_607);
    stringBuffer.append(genClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_621);
    stringBuffer.append(negativeOperationOffsetCorrection);
    stringBuffer.append(TEXT_240);
    for (GenOperation genOperation : genClass.getGenOperations()) {
    stringBuffer.append(TEXT_609);
    stringBuffer.append(OCLGenModelUtil.getQualifiedOperationValue(genClass, genOperation));
    stringBuffer.append(TEXT_610);
    stringBuffer.append(OCLGenModelUtil.getQualifiedOperationValue(genClass, genOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_4);
    }
    stringBuffer.append(TEXT_611);
    }
    stringBuffer.append(TEXT_622);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_132);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_623);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_624);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_625);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_626);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) { List<String> allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList<String>());
    stringBuffer.append(TEXT_132);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_627);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_506);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_628);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_4);
    }
    stringBuffer.append(TEXT_629);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_630);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_506);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_631);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_632);
    }
    stringBuffer.append(TEXT_633);
    }
    }
    }
    if (genModel.isOperationReflection() && isImplementation && !genClass.getImplementedGenOperations().isEmpty()) {
    stringBuffer.append(TEXT_132);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_128);
    }
    if (genModel.useGenerics()) {
    boolean isUnchecked = false; boolean isRaw = false; LOOP: for (GenOperation genOperation : (genModel.isMinimalReflectiveMethods() ? genClass.getImplementedGenOperations() : genClass.getAllGenOperations())) { for (GenParameter genParameter : genOperation.getGenParameters()) { if (genParameter.isUncheckedCast()) { if (genParameter.getTypeGenDataType() == null || !genParameter.getTypeGenDataType().isObjectType()) { isUnchecked = true; } if (genParameter.usesOperationTypeParameters() && !genParameter.getEcoreParameter().getEGenericType().getETypeArguments().isEmpty()) { isRaw = true; break LOOP; }}}}
    if (isUnchecked) {
    stringBuffer.append(TEXT_634);
    if (!isRaw) {
    stringBuffer.append(TEXT_635);
    } else {
    stringBuffer.append(TEXT_636);
    }
    stringBuffer.append(TEXT_90);
    }
    }
    stringBuffer.append(TEXT_637);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_638);
    stringBuffer.append(genModel.getImportedName(isGWT ? "org.eclipse.emf.common.util.InvocationTargetException" : "java.lang.reflect.InvocationTargetException"));
    stringBuffer.append(TEXT_639);
    stringBuffer.append(negativeOperationOffsetCorrection);
    stringBuffer.append(TEXT_505);
    for (GenOperation genOperation : (genModel.isMinimalReflectiveMethods() ? genClass.getImplementedGenOperations() : genClass.getAllGenOperations())) { List<GenParameter> genParameters = genOperation.getGenParameters(); int size = genParameters.size();  boolean hasCheckedException = genOperation.hasCheckedException(); String indent = hasCheckedException ? "\t" : ""; GenOperation overrideGenOperation = genClass.getOverrideGenOperation(genOperation);
    stringBuffer.append(TEXT_506);
    stringBuffer.append(OCLGenModelUtil.getQualifiedOperationValue(genClass, overrideGenOperation != null ? overrideGenOperation : genOperation));
    stringBuffer.append(TEXT_507);
    if (hasCheckedException) {
    stringBuffer.append(TEXT_640);
    /*}*/}
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_241);
    stringBuffer.append(indent);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_97);
    for (int i = 0; i < size; i++) { GenParameter genParameter = genParameters.get(i);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_97);
    }
    if (genParameter.getTypeGenDataType() == null || !genParameter.getTypeGenDataType().isObjectType() || !genParameter.usesOperationTypeParameters() && !genParameter.getRawType().equals(genParameter.getType(genClass))) {
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genParameter.usesOperationTypeParameters() ? genParameter.getRawImportedType() : genParameter.getObjectType(genClass));
    stringBuffer.append(TEXT_90);
    }
    stringBuffer.append(TEXT_641);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_90);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genParameter.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_19);
    }
    if (i < (size - 1)) {
    stringBuffer.append(TEXT_153);
    }
    }
    stringBuffer.append(TEXT_642);
    stringBuffer.append(indent);
    stringBuffer.append(TEXT_643);
    } else {
    stringBuffer.append(TEXT_241);
    stringBuffer.append(indent);
    stringBuffer.append(TEXT_644);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_347);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_97);
    }
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_97);
    for (int i = 0; i < size; i++) { GenParameter genParameter = genParameters.get(i);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_97);
    }
    if (genParameter.getTypeGenDataType() == null || !genParameter.getTypeGenDataType().isObjectType() || !genParameter.usesOperationTypeParameters() && !genParameter.getRawType().equals(genParameter.getType(genClass))) {
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genParameter.usesOperationTypeParameters() ? genParameter.getRawImportedType() : genParameter.getObjectType(genClass));
    stringBuffer.append(TEXT_90);
    }
    stringBuffer.append(TEXT_641);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_90);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genParameter.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_19);
    }
    if (i < (size - 1)) {
    stringBuffer.append(TEXT_153);
    }
    }
    stringBuffer.append(TEXT_90);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_90);
    }
    stringBuffer.append(TEXT_4);
    }
    if (hasCheckedException) {/*{*/
    stringBuffer.append(TEXT_645);
    stringBuffer.append(genModel.getImportedName("java.lang.Throwable"));
    stringBuffer.append(TEXT_646);
    stringBuffer.append(genModel.getImportedName(isGWT ? "org.eclipse.emf.common.util.InvocationTargetException" : "java.lang.reflect.InvocationTargetException"));
    stringBuffer.append(TEXT_647);
    }
    }
    stringBuffer.append(TEXT_381);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_648);
    } else {
    stringBuffer.append(TEXT_649);
    }
    stringBuffer.append(TEXT_179);
    }
    if (!genClass.hasImplementedToStringGenOperation() && isImplementation && !genModel.isReflectiveDelegation() && !genModel.isDynamicDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_132);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_650);
    stringBuffer.append(genModel.useGenerics() ? "StringBuilder" : "StringBuffer");
    stringBuffer.append(TEXT_651);
    stringBuffer.append(genModel.useGenerics() ? "StringBuilder" : "StringBuffer");
    stringBuffer.append(TEXT_652);
    { boolean first = true;
    for (GenFeature genFeature : genClass.getToStringGenFeatures()) {
    if (first) { first = false;
    stringBuffer.append(TEXT_653);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_654);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_655);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_654);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_656);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_657);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_658);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_140);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_659);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_333);
    }
    stringBuffer.append(TEXT_660);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_661);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_140);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_659);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_333);
    }
    stringBuffer.append(TEXT_662);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_267);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_268);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_663);
    stringBuffer.append(genModel.getNonNLS());
    }
    } else {
    stringBuffer.append(TEXT_140);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_659);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_333);
    }
    stringBuffer.append(TEXT_662);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_664);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_665);
    stringBuffer.append(OCLGenModelUtil.getQualifiedFeatureValue(genClass, genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (!genFeature.isListType() && !genFeature.isReferenceType()){
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_262);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_666);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_667);
    } else {
    stringBuffer.append(TEXT_668);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_267);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_268);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_669);
    }
    } else {
    stringBuffer.append(TEXT_668);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_150);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_670);
    }
    if (isImplementation && genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    String objectType = genModel.getImportedName("java.lang.Object");
    String keyType = isJDK50 ? keyFeature.getObjectType(genClass) : objectType;
    String valueType = isJDK50 ? valueFeature.getObjectType(genClass) : objectType;
    String eMapType = genModel.getImportedName("org.eclipse.emf.common.util.EMap") + (isJDK50 ? "<" + keyType + ", " + valueType + ">" : "");
    stringBuffer.append(TEXT_132);
    if (isGWT) {
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_671);
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_672);
    stringBuffer.append(objectType);
    stringBuffer.append(TEXT_673);
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_674);
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_135);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_675);
    if (!isJDK50 && keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_275);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_676);
    } else {
    stringBuffer.append(TEXT_677);
    }
    stringBuffer.append(TEXT_127);
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_678);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_679);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_680);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_90);
    }
    stringBuffer.append(TEXT_681);
    } else if (isJDK50) {
    stringBuffer.append(TEXT_682);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_683);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_684);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_541);
    } else {
    stringBuffer.append(TEXT_685);
    stringBuffer.append(keyFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_686);
    }
    stringBuffer.append(TEXT_127);
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_135);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_687);
    if (!isJDK50 && valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_275);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_688);
    } else {
    stringBuffer.append(TEXT_689);
    }
    stringBuffer.append(TEXT_127);
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_135);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_690);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_691);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_692);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_693);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_90);
    }
    stringBuffer.append(TEXT_694);
    } else if (isJDK50) {
    stringBuffer.append(TEXT_695);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_696);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_697);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_541);
    } else {
    stringBuffer.append(TEXT_698);
    stringBuffer.append(valueFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_699);
    }
    stringBuffer.append(TEXT_700);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_78);
    }
    stringBuffer.append(TEXT_135);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_701);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_702);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_703);
    }
    /*-------------------------------------------------------------------------------------
     * http://www.eclipse.org/OCL/GenModel/Visitor support for non-abstract classes
     *-------------------------------------------------------------------------------------*/
    if (isInterface) {
    boolean isRootVisitable = OCLGenModelUtil.isRootVisitableClass(genClass);
    GenAnnotation visitorAnnotation = genModel.getGenAnnotation(OCLGenModelUtil.OCL_GENMODEL_VISITOR_URI);
    if (visitorAnnotation != null) {
    if (isRootVisitable) {
    String rootVisitorClassName = visitorAnnotation.getDetails().get(OCLGenModelUtil.ROOT_VISITOR_CLASS);
    stringBuffer.append(TEXT_704);
    stringBuffer.append(OCLGenModelUtil.atNonNull(genModel));
    stringBuffer.append(genModel.getImportedName(rootVisitorClassName));
    stringBuffer.append(TEXT_705);
    }
    }
    }
    if (isImplementation) {
    boolean isRootVisitable = OCLGenModelUtil.isRootVisitableClass(genClass);
    GenAnnotation visitorAnnotation = genModel.getGenAnnotation(OCLGenModelUtil.OCL_GENMODEL_VISITOR_URI);
    if (visitorAnnotation != null) {
    if (!genClass.getEcoreClass().isAbstract() || isRootVisitable) {
    String rootVisitorClassName = visitorAnnotation.getDetails().get(OCLGenModelUtil.ROOT_VISITOR_CLASS);
    String derivedVisitorClassName = visitorAnnotation.getDetails().get(OCLGenModelUtil.DERIVED_VISITOR_CLASS);
    boolean isDerivedVisitor = (derivedVisitorClassName != null) && !rootVisitorClassName.equals(derivedVisitorClassName);
    stringBuffer.append(TEXT_706);
    if (isDerivedVisitor && genModel.useGenerics()) {
    stringBuffer.append(TEXT_78);
    }
    if (genModel.useClassOverrideAnnotation() && !isRootVisitable) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_707);
    stringBuffer.append(OCLGenModelUtil.atNonNull(genModel));
    stringBuffer.append(genModel.getImportedName(rootVisitorClassName));
    stringBuffer.append(TEXT_708);
    if (isDerivedVisitor) {
    stringBuffer.append(TEXT_709);
    stringBuffer.append(genModel.getImportedName(derivedVisitorClassName));
    stringBuffer.append(TEXT_710);
    stringBuffer.append(genModel.getImportedName(derivedVisitorClassName));
    stringBuffer.append(TEXT_711);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_712);
    } else {
    stringBuffer.append(TEXT_713);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_714);
    }
    stringBuffer.append(TEXT_715);
    }
    }
    }
    /*-------------------------------------------------------------------------------------
     * http://www.eclipse.org/OCL/GenModel/CopyAndPaste support
     *-------------------------------------------------------------------------------------*/
    if (isImplementation) {
    stringBuffer.append(TEXT_5);
    stringBuffer.append(OCLGenModelUtil.copyAndPaste(genClass));
    }
    /*-------------------------------------------------------------------------------------
     * Contributions from CGModelSpec instances
     *-------------------------------------------------------------------------------------*/
    if (isInterface) {
    stringBuffer.append(ModelSpec.generate(genClass, false));
    }
    if (isImplementation) {
    stringBuffer.append(ModelSpec.generate(genClass, true));
    }
    stringBuffer.append(TEXT_716);
    stringBuffer.append(isInterface ? " " + genClass.getInterfaceName() : genClass.getClassName());
    // TODO fix the space above
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }
}
