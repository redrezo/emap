/*
* generated by Xtext
*/
package at.bestsolution.persistence.emap.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import at.bestsolution.persistence.emap.services.EMapGrammarAccess;

public class EMapParser extends AbstractContentAssistParser {
	
	@Inject
	private EMapGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected at.bestsolution.persistence.emap.ui.contentassist.antlr.internal.InternalEMapParser createParser() {
		at.bestsolution.persistence.emap.ui.contentassist.antlr.internal.InternalEMapParser result = new at.bestsolution.persistence.emap.ui.contentassist.antlr.internal.InternalEMapParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEMappingAccess().getRootAlternatives_0(), "rule__EMapping__RootAlternatives_0");
					put(grammarAccess.getImportAccess().getImportedNamespaceAlternatives_1_0(), "rule__Import__ImportedNamespaceAlternatives_1_0");
					put(grammarAccess.getEMappingEntityAccess().getExtensionTypeAlternatives_3_0_0(), "rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0");
					put(grammarAccess.getEAttributeAccess().getAlternatives_3(), "rule__EAttribute__Alternatives_3");
					put(grammarAccess.getEValueGeneratorAccess().getAlternatives_1(), "rule__EValueGenerator__Alternatives_1");
					put(grammarAccess.getEQueryAccess().getDbTypeAlternatives_0_0(), "rule__EQuery__DbTypeAlternatives_0_0");
					put(grammarAccess.getEQueryAccess().getAlternatives_2(), "rule__EQuery__Alternatives_2");
					put(grammarAccess.getEMappingAttributeAccess().getAlternatives_3(), "rule__EMappingAttribute__Alternatives_3");
					put(grammarAccess.getReturnTypeAccess().getAlternatives(), "rule__ReturnType__Alternatives");
					put(grammarAccess.getEMappingBundleAccess().getGroup(), "rule__EMappingBundle__Group__0");
					put(grammarAccess.getEMappingBundleAccess().getGroup_5(), "rule__EMappingBundle__Group_5__0");
					put(grammarAccess.getEMappingBundleAccess().getGroup_7(), "rule__EMappingBundle__Group_7__0");
					put(grammarAccess.getEMappingBundleAccess().getGroup_7_2(), "rule__EMappingBundle__Group_7_2__0");
					put(grammarAccess.getEMappingEntityDefAccess().getGroup(), "rule__EMappingEntityDef__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getPackageDeclarationAccess().getGroup(), "rule__PackageDeclaration__Group__0");
					put(grammarAccess.getEMappingEntityAccess().getGroup(), "rule__EMappingEntity__Group__0");
					put(grammarAccess.getEMappingEntityAccess().getGroup_3(), "rule__EMappingEntity__Group_3__0");
					put(grammarAccess.getEMappingEntityAccess().getGroup_6(), "rule__EMappingEntity__Group_6__0");
					put(grammarAccess.getEMappingEntityAccess().getGroup_6_3(), "rule__EMappingEntity__Group_6_3__0");
					put(grammarAccess.getEMappingEntityAccess().getGroup_7(), "rule__EMappingEntity__Group_7__0");
					put(grammarAccess.getEMappingEntityAccess().getGroup_7_3(), "rule__EMappingEntity__Group_7_3__0");
					put(grammarAccess.getEMappingEntityAccess().getGroup_9(), "rule__EMappingEntity__Group_9__0");
					put(grammarAccess.getEMappingEntityAccess().getGroup_10(), "rule__EMappingEntity__Group_10__0");
					put(grammarAccess.getEAttributeAccess().getGroup(), "rule__EAttribute__Group__0");
					put(grammarAccess.getEAttributeAccess().getGroup_3_0(), "rule__EAttribute__Group_3_0__0");
					put(grammarAccess.getEAttributeAccess().getGroup_3_0_1(), "rule__EAttribute__Group_3_0_1__0");
					put(grammarAccess.getEAttributeAccess().getGroup_3_0_1_3(), "rule__EAttribute__Group_3_0_1_3__0");
					put(grammarAccess.getEAttributeAccess().getGroup_3_1(), "rule__EAttribute__Group_3_1__0");
					put(grammarAccess.getEAttributeAccess().getGroup_3_1_5(), "rule__EAttribute__Group_3_1_5__0");
					put(grammarAccess.getEValueGeneratorAccess().getGroup(), "rule__EValueGenerator__Group__0");
					put(grammarAccess.getEValueGeneratorAccess().getGroup_1_1(), "rule__EValueGenerator__Group_1_1__0");
					put(grammarAccess.getEValueGeneratorAccess().getGroup_1_2(), "rule__EValueGenerator__Group_1_2__0");
					put(grammarAccess.getENamedQueryAccess().getGroup(), "rule__ENamedQuery__Group__0");
					put(grammarAccess.getENamedQueryAccess().getGroup_2(), "rule__ENamedQuery__Group_2__0");
					put(grammarAccess.getENamedQueryAccess().getGroup_5(), "rule__ENamedQuery__Group_5__0");
					put(grammarAccess.getEParameterAccess().getGroup(), "rule__EParameter__Group__0");
					put(grammarAccess.getEQueryAccess().getGroup(), "rule__EQuery__Group__0");
					put(grammarAccess.getEQueryAccess().getGroup_2_0(), "rule__EQuery__Group_2_0__0");
					put(grammarAccess.getEQueryAccess().getGroup_2_0_2(), "rule__EQuery__Group_2_0_2__0");
					put(grammarAccess.getEQueryAccess().getGroup_2_0_3(), "rule__EQuery__Group_2_0_3__0");
					put(grammarAccess.getEQueryAccess().getGroup_2_0_4(), "rule__EQuery__Group_2_0_4__0");
					put(grammarAccess.getEObjectSectionAccess().getGroup(), "rule__EObjectSection__Group__0");
					put(grammarAccess.getEObjectSectionAccess().getGroup_1(), "rule__EObjectSection__Group_1__0");
					put(grammarAccess.getEObjectSectionAccess().getGroup_1_2(), "rule__EObjectSection__Group_1_2__0");
					put(grammarAccess.getEObjectSectionAccess().getGroup_2(), "rule__EObjectSection__Group_2__0");
					put(grammarAccess.getEObjectSectionAccess().getGroup_2_1(), "rule__EObjectSection__Group_2_1__0");
					put(grammarAccess.getEObjectSectionAccess().getGroup_2_1_2(), "rule__EObjectSection__Group_2_1_2__0");
					put(grammarAccess.getEMappingAttributeAccess().getGroup(), "rule__EMappingAttribute__Group__0");
					put(grammarAccess.getEMappingAttributeAccess().getGroup_3_1(), "rule__EMappingAttribute__Group_3_1__0");
					put(grammarAccess.getEMappingAttributeAccess().getGroup_3_2(), "rule__EMappingAttribute__Group_3_2__0");
					put(grammarAccess.getETypeAccess().getGroup(), "rule__EType__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
					put(grammarAccess.getEMappingAccess().getRootAssignment(), "rule__EMapping__RootAssignment");
					put(grammarAccess.getEMappingBundleAccess().getImportsAssignment_0(), "rule__EMappingBundle__ImportsAssignment_0");
					put(grammarAccess.getEMappingBundleAccess().getNameAssignment_2(), "rule__EMappingBundle__NameAssignment_2");
					put(grammarAccess.getEMappingBundleAccess().getEntitiesAssignment_4(), "rule__EMappingBundle__EntitiesAssignment_4");
					put(grammarAccess.getEMappingBundleAccess().getEntitiesAssignment_5_1(), "rule__EMappingBundle__EntitiesAssignment_5_1");
					put(grammarAccess.getEMappingBundleAccess().getDatabasesAssignment_7_1(), "rule__EMappingBundle__DatabasesAssignment_7_1");
					put(grammarAccess.getEMappingBundleAccess().getDatabasesAssignment_7_2_1(), "rule__EMappingBundle__DatabasesAssignment_7_2_1");
					put(grammarAccess.getEMappingEntityDefAccess().getPackageAssignment_0(), "rule__EMappingEntityDef__PackageAssignment_0");
					put(grammarAccess.getEMappingEntityDefAccess().getImportsAssignment_1(), "rule__EMappingEntityDef__ImportsAssignment_1");
					put(grammarAccess.getEMappingEntityDefAccess().getEntityAssignment_2(), "rule__EMappingEntityDef__EntityAssignment_2");
					put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
					put(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1(), "rule__PackageDeclaration__NameAssignment_1");
					put(grammarAccess.getEMappingEntityAccess().getAbstractAssignment_0(), "rule__EMappingEntity__AbstractAssignment_0");
					put(grammarAccess.getEMappingEntityAccess().getNameAssignment_2(), "rule__EMappingEntity__NameAssignment_2");
					put(grammarAccess.getEMappingEntityAccess().getExtensionTypeAssignment_3_0(), "rule__EMappingEntity__ExtensionTypeAssignment_3_0");
					put(grammarAccess.getEMappingEntityAccess().getParentAssignment_3_1(), "rule__EMappingEntity__ParentAssignment_3_1");
					put(grammarAccess.getEMappingEntityAccess().getEtypeAssignment_5(), "rule__EMappingEntity__EtypeAssignment_5");
					put(grammarAccess.getEMappingEntityAccess().getAttributesAssignment_6_2(), "rule__EMappingEntity__AttributesAssignment_6_2");
					put(grammarAccess.getEMappingEntityAccess().getAttributesAssignment_6_3_1(), "rule__EMappingEntity__AttributesAssignment_6_3_1");
					put(grammarAccess.getEMappingEntityAccess().getNamedQueriesAssignment_7_2(), "rule__EMappingEntity__NamedQueriesAssignment_7_2");
					put(grammarAccess.getEMappingEntityAccess().getNamedQueriesAssignment_7_3_1(), "rule__EMappingEntity__NamedQueriesAssignment_7_3_1");
					put(grammarAccess.getEMappingEntityAccess().getTableNameAssignment_9_1(), "rule__EMappingEntity__TableNameAssignment_9_1");
					put(grammarAccess.getEMappingEntityAccess().getDescriminationColumnAssignment_10_1(), "rule__EMappingEntity__DescriminationColumnAssignment_10_1");
					put(grammarAccess.getEAttributeAccess().getPkAssignment_0(), "rule__EAttribute__PkAssignment_0");
					put(grammarAccess.getEAttributeAccess().getNameAssignment_1(), "rule__EAttribute__NameAssignment_1");
					put(grammarAccess.getEAttributeAccess().getColumnNameAssignment_3_0_0(), "rule__EAttribute__ColumnNameAssignment_3_0_0");
					put(grammarAccess.getEAttributeAccess().getValueGeneratorsAssignment_3_0_1_2(), "rule__EAttribute__ValueGeneratorsAssignment_3_0_1_2");
					put(grammarAccess.getEAttributeAccess().getValueGeneratorsAssignment_3_0_1_3_1(), "rule__EAttribute__ValueGeneratorsAssignment_3_0_1_3_1");
					put(grammarAccess.getEAttributeAccess().getResolvedAssignment_3_1_0(), "rule__EAttribute__ResolvedAssignment_3_1_0");
					put(grammarAccess.getEAttributeAccess().getQueryAssignment_3_1_1(), "rule__EAttribute__QueryAssignment_3_1_1");
					put(grammarAccess.getEAttributeAccess().getParametersAssignment_3_1_3(), "rule__EAttribute__ParametersAssignment_3_1_3");
					put(grammarAccess.getEAttributeAccess().getOppositeAssignment_3_1_5_0(), "rule__EAttribute__OppositeAssignment_3_1_5_0");
					put(grammarAccess.getEAttributeAccess().getRelationTableAssignment_3_1_5_2(), "rule__EAttribute__RelationTableAssignment_3_1_5_2");
					put(grammarAccess.getEValueGeneratorAccess().getDbTypeAssignment_0(), "rule__EValueGenerator__DbTypeAssignment_0");
					put(grammarAccess.getEValueGeneratorAccess().getAutokeyAssignment_1_0(), "rule__EValueGenerator__AutokeyAssignment_1_0");
					put(grammarAccess.getEValueGeneratorAccess().getQueryAssignment_1_1_1(), "rule__EValueGenerator__QueryAssignment_1_1_1");
					put(grammarAccess.getEValueGeneratorAccess().getSequenceAssignment_1_2_1(), "rule__EValueGenerator__SequenceAssignment_1_2_1");
					put(grammarAccess.getENamedQueryAccess().getReturnTypeAssignment_0(), "rule__ENamedQuery__ReturnTypeAssignment_0");
					put(grammarAccess.getENamedQueryAccess().getNameAssignment_1(), "rule__ENamedQuery__NameAssignment_1");
					put(grammarAccess.getENamedQueryAccess().getParametersAssignment_2_1(), "rule__ENamedQuery__ParametersAssignment_2_1");
					put(grammarAccess.getENamedQueryAccess().getQueriesAssignment_4(), "rule__ENamedQuery__QueriesAssignment_4");
					put(grammarAccess.getENamedQueryAccess().getQueriesAssignment_5_1(), "rule__ENamedQuery__QueriesAssignment_5_1");
					put(grammarAccess.getEParameterAccess().getTypeAssignment_0(), "rule__EParameter__TypeAssignment_0");
					put(grammarAccess.getEParameterAccess().getNameAssignment_1(), "rule__EParameter__NameAssignment_1");
					put(grammarAccess.getEQueryAccess().getDbTypeAssignment_0(), "rule__EQuery__DbTypeAssignment_0");
					put(grammarAccess.getEQueryAccess().getMappingAssignment_1(), "rule__EQuery__MappingAssignment_1");
					put(grammarAccess.getEQueryAccess().getFromAssignment_2_0_1(), "rule__EQuery__FromAssignment_2_0_1");
					put(grammarAccess.getEQueryAccess().getWhereAssignment_2_0_2_1(), "rule__EQuery__WhereAssignment_2_0_2_1");
					put(grammarAccess.getEQueryAccess().getGroupByAssignment_2_0_3_1(), "rule__EQuery__GroupByAssignment_2_0_3_1");
					put(grammarAccess.getEQueryAccess().getOrderbyAssignment_2_0_4_1(), "rule__EQuery__OrderbyAssignment_2_0_4_1");
					put(grammarAccess.getEQueryAccess().getAllAssignment_2_1(), "rule__EQuery__AllAssignment_2_1");
					put(grammarAccess.getEObjectSectionAccess().getEntityAssignment_0(), "rule__EObjectSection__EntityAssignment_0");
					put(grammarAccess.getEObjectSectionAccess().getDescriminatedTypesAssignment_1_1(), "rule__EObjectSection__DescriminatedTypesAssignment_1_1");
					put(grammarAccess.getEObjectSectionAccess().getDescriminatedTypesAssignment_1_2_1(), "rule__EObjectSection__DescriminatedTypesAssignment_1_2_1");
					put(grammarAccess.getEObjectSectionAccess().getPrefixAssignment_2_0(), "rule__EObjectSection__PrefixAssignment_2_0");
					put(grammarAccess.getEObjectSectionAccess().getAttributesAssignment_2_1_1(), "rule__EObjectSection__AttributesAssignment_2_1_1");
					put(grammarAccess.getEObjectSectionAccess().getAttributesAssignment_2_1_2_1(), "rule__EObjectSection__AttributesAssignment_2_1_2_1");
					put(grammarAccess.getEMappingAttributeAccess().getPkAssignment_0(), "rule__EMappingAttribute__PkAssignment_0");
					put(grammarAccess.getEMappingAttributeAccess().getPropertyAssignment_1(), "rule__EMappingAttribute__PropertyAssignment_1");
					put(grammarAccess.getEMappingAttributeAccess().getColumnNameAssignment_3_0(), "rule__EMappingAttribute__ColumnNameAssignment_3_0");
					put(grammarAccess.getEMappingAttributeAccess().getResolvedAssignment_3_1_0(), "rule__EMappingAttribute__ResolvedAssignment_3_1_0");
					put(grammarAccess.getEMappingAttributeAccess().getQueryAssignment_3_1_1(), "rule__EMappingAttribute__QueryAssignment_3_1_1");
					put(grammarAccess.getEMappingAttributeAccess().getParametersAssignment_3_1_3(), "rule__EMappingAttribute__ParametersAssignment_3_1_3");
					put(grammarAccess.getEMappingAttributeAccess().getMappedAssignment_3_2_0(), "rule__EMappingAttribute__MappedAssignment_3_2_0");
					put(grammarAccess.getEMappingAttributeAccess().getMapAssignment_3_2_1(), "rule__EMappingAttribute__MapAssignment_3_2_1");
					put(grammarAccess.getETypeAccess().getUrlAssignment_1(), "rule__EType__UrlAssignment_1");
					put(grammarAccess.getETypeAccess().getNameAssignment_3(), "rule__EType__NameAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			at.bestsolution.persistence.emap.ui.contentassist.antlr.internal.InternalEMapParser typedParser = (at.bestsolution.persistence.emap.ui.contentassist.antlr.internal.InternalEMapParser) parser;
			typedParser.entryRuleEMapping();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public EMapGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(EMapGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
