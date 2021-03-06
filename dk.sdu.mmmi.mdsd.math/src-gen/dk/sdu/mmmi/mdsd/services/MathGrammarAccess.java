/*
 * generated by Xtext 2.26.0
 */
package dk.sdu.mmmi.mdsd.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MathGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ProgramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Program");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProgramKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cProgramAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cProgramIDTerminalRuleCall_1_0 = (RuleCall)cProgramAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cExternalKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Alternatives cAlternatives_2_1 = (Alternatives)cGroup_2.eContents().get(1);
		private final Assignment cExternalAssignment_2_1_0 = (Assignment)cAlternatives_2_1.eContents().get(0);
		private final Keyword cExternalSqrtIntKeyword_2_1_0_0 = (Keyword)cExternalAssignment_2_1_0.eContents().get(0);
		private final Assignment cExternalAssignment_2_1_1 = (Assignment)cAlternatives_2_1.eContents().get(1);
		private final Keyword cExternalPiKeyword_2_1_1_0 = (Keyword)cExternalAssignment_2_1_1.eContents().get(0);
		private final Assignment cExternalAssignment_2_1_2 = (Assignment)cAlternatives_2_1.eContents().get(2);
		private final Keyword cExternalPowIntIntKeyword_2_1_2_0 = (Keyword)cExternalAssignment_2_1_2.eContents().get(0);
		private final Assignment cMathAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cMathMathExpParserRuleCall_3_0 = (RuleCall)cMathAssignment_3.eContents().get(0);
		
		//Program:
		//    'program' program = ID
		//    ('external' (external = 'sqrt(int)' | external = 'pi()' | external = 'pow(int,int)'))*
		//    math += MathExp
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'program' program = ID
		//('external' (external = 'sqrt(int)' | external = 'pi()' | external = 'pow(int,int)'))*
		//math += MathExp
		public Group getGroup() { return cGroup; }
		
		//'program'
		public Keyword getProgramKeyword_0() { return cProgramKeyword_0; }
		
		//program = ID
		public Assignment getProgramAssignment_1() { return cProgramAssignment_1; }
		
		//ID
		public RuleCall getProgramIDTerminalRuleCall_1_0() { return cProgramIDTerminalRuleCall_1_0; }
		
		//('external' (external = 'sqrt(int)' | external = 'pi()' | external = 'pow(int,int)'))*
		public Group getGroup_2() { return cGroup_2; }
		
		//'external'
		public Keyword getExternalKeyword_2_0() { return cExternalKeyword_2_0; }
		
		//(external = 'sqrt(int)' | external = 'pi()' | external = 'pow(int,int)')
		public Alternatives getAlternatives_2_1() { return cAlternatives_2_1; }
		
		//external = 'sqrt(int)'
		public Assignment getExternalAssignment_2_1_0() { return cExternalAssignment_2_1_0; }
		
		//'sqrt(int)'
		public Keyword getExternalSqrtIntKeyword_2_1_0_0() { return cExternalSqrtIntKeyword_2_1_0_0; }
		
		//external = 'pi()'
		public Assignment getExternalAssignment_2_1_1() { return cExternalAssignment_2_1_1; }
		
		//'pi()'
		public Keyword getExternalPiKeyword_2_1_1_0() { return cExternalPiKeyword_2_1_1_0; }
		
		//external = 'pow(int,int)'
		public Assignment getExternalAssignment_2_1_2() { return cExternalAssignment_2_1_2; }
		
		//'pow(int,int)'
		public Keyword getExternalPowIntIntKeyword_2_1_2_0() { return cExternalPowIntIntKeyword_2_1_2_0; }
		
		//math += MathExp
		public Assignment getMathAssignment_3() { return cMathAssignment_3; }
		
		//MathExp
		public RuleCall getMathMathExpParserRuleCall_3_0() { return cMathMathExpParserRuleCall_3_0; }
	}
	public class MathExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.MathExp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMathExpAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cVariablesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVariablesVarBindingParserRuleCall_1_0 = (RuleCall)cVariablesAssignment_1.eContents().get(0);
		
		//MathExp:
		//    {MathExp} variables += VarBinding*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{MathExp} variables += VarBinding*
		public Group getGroup() { return cGroup; }
		
		//{MathExp}
		public Action getMathExpAction_0() { return cMathExpAction_0; }
		
		//variables += VarBinding*
		public Assignment getVariablesAssignment_1() { return cVariablesAssignment_1; }
		
		//VarBinding
		public RuleCall getVariablesVarBindingParserRuleCall_1_0() { return cVariablesVarBindingParserRuleCall_1_0; }
	}
	public class VarBindingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.VarBinding");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVarKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExpressionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExpressionExpParserRuleCall_3_0 = (RuleCall)cExpressionAssignment_3.eContents().get(0);
		
		//VarBinding:
		//    'var' name=ID '=' expression=Exp
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'var' name=ID '=' expression=Exp
		public Group getGroup() { return cGroup; }
		
		//'var'
		public Keyword getVarKeyword_0() { return cVarKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		//expression=Exp
		public Assignment getExpressionAssignment_3() { return cExpressionAssignment_3; }
		
		//Exp
		public RuleCall getExpressionExpParserRuleCall_3_0() { return cExpressionExpParserRuleCall_3_0; }
	}
	public class ExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Exp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cMulOrDivParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_1_0 = (Alternatives)cGroup_1.eContents().get(0);
		private final Group cGroup_1_0_0 = (Group)cAlternatives_1_0.eContents().get(0);
		private final Action cPlusLeftAction_1_0_0_0 = (Action)cGroup_1_0_0.eContents().get(0);
		private final Keyword cPlusSignKeyword_1_0_0_1 = (Keyword)cGroup_1_0_0.eContents().get(1);
		private final Group cGroup_1_0_1 = (Group)cAlternatives_1_0.eContents().get(1);
		private final Action cMinusLeftAction_1_0_1_0 = (Action)cGroup_1_0_1.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1_0_1_1 = (Keyword)cGroup_1_0_1.eContents().get(1);
		private final Assignment cRightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightMulOrDivParserRuleCall_1_1_0 = (RuleCall)cRightAssignment_1_1.eContents().get(0);
		
		//Exp returns Expression:
		//  MulOrDiv (
		//    ({Plus.left=current} '+' | {Minus.left=current} '-')
		//    right=MulOrDiv
		//  )* ;
		@Override public ParserRule getRule() { return rule; }
		
		//MulOrDiv (
		//  ({Plus.left=current} '+' | {Minus.left=current} '-')
		//  right=MulOrDiv
		//)*
		public Group getGroup() { return cGroup; }
		
		//MulOrDiv
		public RuleCall getMulOrDivParserRuleCall_0() { return cMulOrDivParserRuleCall_0; }
		
		//(
		//   ({Plus.left=current} '+' | {Minus.left=current} '-')
		//   right=MulOrDiv
		// )*
		public Group getGroup_1() { return cGroup_1; }
		
		//({Plus.left=current} '+' | {Minus.left=current} '-')
		public Alternatives getAlternatives_1_0() { return cAlternatives_1_0; }
		
		//{Plus.left=current} '+'
		public Group getGroup_1_0_0() { return cGroup_1_0_0; }
		
		//{Plus.left=current}
		public Action getPlusLeftAction_1_0_0_0() { return cPlusLeftAction_1_0_0_0; }
		
		//'+'
		public Keyword getPlusSignKeyword_1_0_0_1() { return cPlusSignKeyword_1_0_0_1; }
		
		//{Minus.left=current} '-'
		public Group getGroup_1_0_1() { return cGroup_1_0_1; }
		
		//{Minus.left=current}
		public Action getMinusLeftAction_1_0_1_0() { return cMinusLeftAction_1_0_1_0; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_1_0_1_1() { return cHyphenMinusKeyword_1_0_1_1; }
		
		//right=MulOrDiv
		public Assignment getRightAssignment_1_1() { return cRightAssignment_1_1; }
		
		//MulOrDiv
		public RuleCall getRightMulOrDivParserRuleCall_1_1_0() { return cRightMulOrDivParserRuleCall_1_1_0; }
	}
	public class MulOrDivElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.MulOrDiv");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPrimaryParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_1_0 = (Alternatives)cGroup_1.eContents().get(0);
		private final Group cGroup_1_0_0 = (Group)cAlternatives_1_0.eContents().get(0);
		private final Action cMultLeftAction_1_0_0_0 = (Action)cGroup_1_0_0.eContents().get(0);
		private final Keyword cAsteriskKeyword_1_0_0_1 = (Keyword)cGroup_1_0_0.eContents().get(1);
		private final Group cGroup_1_0_1 = (Group)cAlternatives_1_0.eContents().get(1);
		private final Action cDivLeftAction_1_0_1_0 = (Action)cGroup_1_0_1.eContents().get(0);
		private final Keyword cSolidusKeyword_1_0_1_1 = (Keyword)cGroup_1_0_1.eContents().get(1);
		private final Assignment cRightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightPrimaryParserRuleCall_1_1_0 = (RuleCall)cRightAssignment_1_1.eContents().get(0);
		
		//MulOrDiv returns Expression:
		//  Primary (
		//    ({Mult.left=current} '*' | {Div.left=current} '/')
		//    right=Primary
		//  )* ;
		@Override public ParserRule getRule() { return rule; }
		
		//Primary (
		//  ({Mult.left=current} '*' | {Div.left=current} '/')
		//  right=Primary
		//)*
		public Group getGroup() { return cGroup; }
		
		//Primary
		public RuleCall getPrimaryParserRuleCall_0() { return cPrimaryParserRuleCall_0; }
		
		//(
		//   ({Mult.left=current} '*' | {Div.left=current} '/')
		//   right=Primary
		// )*
		public Group getGroup_1() { return cGroup_1; }
		
		//({Mult.left=current} '*' | {Div.left=current} '/')
		public Alternatives getAlternatives_1_0() { return cAlternatives_1_0; }
		
		//{Mult.left=current} '*'
		public Group getGroup_1_0_0() { return cGroup_1_0_0; }
		
		//{Mult.left=current}
		public Action getMultLeftAction_1_0_0_0() { return cMultLeftAction_1_0_0_0; }
		
		//'*'
		public Keyword getAsteriskKeyword_1_0_0_1() { return cAsteriskKeyword_1_0_0_1; }
		
		//{Div.left=current} '/'
		public Group getGroup_1_0_1() { return cGroup_1_0_1; }
		
		//{Div.left=current}
		public Action getDivLeftAction_1_0_1_0() { return cDivLeftAction_1_0_1_0; }
		
		//'/'
		public Keyword getSolidusKeyword_1_0_1_1() { return cSolidusKeyword_1_0_1_1; }
		
		//right=Primary
		public Assignment getRightAssignment_1_1() { return cRightAssignment_1_1; }
		
		//Primary
		public RuleCall getRightPrimaryParserRuleCall_1_1_0() { return cRightPrimaryParserRuleCall_1_1_0; }
	}
	public class PrimaryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Primary");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cMathNumberAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cValueAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_0_1_0 = (RuleCall)cValueAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cExpParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final RuleCall cVariableUseParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cLetBindingParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cSquareRootParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cPowerParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final Group cGroup_6 = (Group)cAlternatives.eContents().get(6);
		private final Action cMathNumberAction_6_0 = (Action)cGroup_6.eContents().get(0);
		private final RuleCall cPIParserRuleCall_6_1 = (RuleCall)cGroup_6.eContents().get(1);
		
		//Primary returns Expression:
		//    {MathNumber} value=INT  | '(' Exp ')'  |  VariableUse | LetBinding | SquareRoot | Power | {MathNumber} PI
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{MathNumber} value=INT  | '(' Exp ')'  |  VariableUse | LetBinding | SquareRoot | Power | {MathNumber} PI
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{MathNumber} value=INT
		public Group getGroup_0() { return cGroup_0; }
		
		//{MathNumber}
		public Action getMathNumberAction_0_0() { return cMathNumberAction_0_0; }
		
		//value=INT
		public Assignment getValueAssignment_0_1() { return cValueAssignment_0_1; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_0_1_0() { return cValueINTTerminalRuleCall_0_1_0; }
		
		//'(' Exp ')'
		public Group getGroup_1() { return cGroup_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_0() { return cLeftParenthesisKeyword_1_0; }
		
		//Exp
		public RuleCall getExpParserRuleCall_1_1() { return cExpParserRuleCall_1_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_2() { return cRightParenthesisKeyword_1_2; }
		
		//VariableUse
		public RuleCall getVariableUseParserRuleCall_2() { return cVariableUseParserRuleCall_2; }
		
		//LetBinding
		public RuleCall getLetBindingParserRuleCall_3() { return cLetBindingParserRuleCall_3; }
		
		//SquareRoot
		public RuleCall getSquareRootParserRuleCall_4() { return cSquareRootParserRuleCall_4; }
		
		//Power
		public RuleCall getPowerParserRuleCall_5() { return cPowerParserRuleCall_5; }
		
		//{MathNumber} PI
		public Group getGroup_6() { return cGroup_6; }
		
		//{MathNumber}
		public Action getMathNumberAction_6_0() { return cMathNumberAction_6_0; }
		
		//PI
		public RuleCall getPIParserRuleCall_6_1() { return cPIParserRuleCall_6_1; }
	}
	public class SquareRootElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.SquareRoot");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSqrtKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNExpParserRuleCall_1_0 = (RuleCall)cNAssignment_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//SquareRoot:
		//    'sqrt(' n = Exp ')'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'sqrt(' n = Exp ')'
		public Group getGroup() { return cGroup; }
		
		//'sqrt('
		public Keyword getSqrtKeyword_0() { return cSqrtKeyword_0; }
		
		//n = Exp
		public Assignment getNAssignment_1() { return cNAssignment_1; }
		
		//Exp
		public RuleCall getNExpParserRuleCall_1_0() { return cNExpParserRuleCall_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}
	public class PIElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.PI");
		private final Keyword cPiKeyword = (Keyword)rule.eContents().get(1);
		
		//PI:
		//    'pi()'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'pi()'
		public Keyword getPiKeyword() { return cPiKeyword; }
	}
	public class PowerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Power");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPowKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNExpParserRuleCall_1_0 = (RuleCall)cNAssignment_1.eContents().get(0);
		private final Keyword cCommaKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cMAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cMExpParserRuleCall_3_0 = (RuleCall)cMAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Power:
		//    'pow('n = Exp','m=Exp')'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'pow('n = Exp','m=Exp')'
		public Group getGroup() { return cGroup; }
		
		//'pow('
		public Keyword getPowKeyword_0() { return cPowKeyword_0; }
		
		//n = Exp
		public Assignment getNAssignment_1() { return cNAssignment_1; }
		
		//Exp
		public RuleCall getNExpParserRuleCall_1_0() { return cNExpParserRuleCall_1_0; }
		
		//','
		public Keyword getCommaKeyword_2() { return cCommaKeyword_2; }
		
		//m=Exp
		public Assignment getMAssignment_3() { return cMAssignment_3; }
		
		//Exp
		public RuleCall getMExpParserRuleCall_3_0() { return cMExpParserRuleCall_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class LetBindingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.LetBinding");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cBindingAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cBindingExpParserRuleCall_3_0 = (RuleCall)cBindingAssignment_3.eContents().get(0);
		private final Keyword cInKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cBodyAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cBodyExpParserRuleCall_5_0 = (RuleCall)cBodyAssignment_5.eContents().get(0);
		private final Keyword cEndKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//LetBinding:
		//    'let' name=ID '=' binding=Exp 'in' body=Exp 'end'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'let' name=ID '=' binding=Exp 'in' body=Exp 'end'
		public Group getGroup() { return cGroup; }
		
		//'let'
		public Keyword getLetKeyword_0() { return cLetKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		//binding=Exp
		public Assignment getBindingAssignment_3() { return cBindingAssignment_3; }
		
		//Exp
		public RuleCall getBindingExpParserRuleCall_3_0() { return cBindingExpParserRuleCall_3_0; }
		
		//'in'
		public Keyword getInKeyword_4() { return cInKeyword_4; }
		
		//body=Exp
		public Assignment getBodyAssignment_5() { return cBodyAssignment_5; }
		
		//Exp
		public RuleCall getBodyExpParserRuleCall_5_0() { return cBodyExpParserRuleCall_5_0; }
		
		//'end'
		public Keyword getEndKeyword_6() { return cEndKeyword_6; }
	}
	public class BindingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Binding");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cVarBindingParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cLetBindingParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Binding:
		//    VarBinding | LetBinding
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//VarBinding | LetBinding
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//VarBinding
		public RuleCall getVarBindingParserRuleCall_0() { return cVarBindingParserRuleCall_0; }
		
		//LetBinding
		public RuleCall getLetBindingParserRuleCall_1() { return cLetBindingParserRuleCall_1; }
	}
	public class VariableUseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.VariableUse");
		private final Assignment cRefAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cRefBindingCrossReference_0 = (CrossReference)cRefAssignment.eContents().get(0);
		private final RuleCall cRefBindingIDTerminalRuleCall_0_1 = (RuleCall)cRefBindingCrossReference_0.eContents().get(1);
		
		//VariableUse:
		//    ref = [Binding]
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//ref = [Binding]
		public Assignment getRefAssignment() { return cRefAssignment; }
		
		//[Binding]
		public CrossReference getRefBindingCrossReference_0() { return cRefBindingCrossReference_0; }
		
		//ID
		public RuleCall getRefBindingIDTerminalRuleCall_0_1() { return cRefBindingIDTerminalRuleCall_0_1; }
	}
	
	
	private final ProgramElements pProgram;
	private final MathExpElements pMathExp;
	private final VarBindingElements pVarBinding;
	private final ExpElements pExp;
	private final MulOrDivElements pMulOrDiv;
	private final PrimaryElements pPrimary;
	private final SquareRootElements pSquareRoot;
	private final PIElements pPI;
	private final PowerElements pPower;
	private final LetBindingElements pLetBinding;
	private final BindingElements pBinding;
	private final VariableUseElements pVariableUse;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MathGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pProgram = new ProgramElements();
		this.pMathExp = new MathExpElements();
		this.pVarBinding = new VarBindingElements();
		this.pExp = new ExpElements();
		this.pMulOrDiv = new MulOrDivElements();
		this.pPrimary = new PrimaryElements();
		this.pSquareRoot = new SquareRootElements();
		this.pPI = new PIElements();
		this.pPower = new PowerElements();
		this.pLetBinding = new LetBindingElements();
		this.pBinding = new BindingElements();
		this.pVariableUse = new VariableUseElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("dk.sdu.mmmi.mdsd.Math".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Program:
	//    'program' program = ID
	//    ('external' (external = 'sqrt(int)' | external = 'pi()' | external = 'pow(int,int)'))*
	//    math += MathExp
	//;
	public ProgramElements getProgramAccess() {
		return pProgram;
	}
	
	public ParserRule getProgramRule() {
		return getProgramAccess().getRule();
	}
	
	//MathExp:
	//    {MathExp} variables += VarBinding*
	//;
	public MathExpElements getMathExpAccess() {
		return pMathExp;
	}
	
	public ParserRule getMathExpRule() {
		return getMathExpAccess().getRule();
	}
	
	//VarBinding:
	//    'var' name=ID '=' expression=Exp
	//;
	public VarBindingElements getVarBindingAccess() {
		return pVarBinding;
	}
	
	public ParserRule getVarBindingRule() {
		return getVarBindingAccess().getRule();
	}
	
	//Exp returns Expression:
	//  MulOrDiv (
	//    ({Plus.left=current} '+' | {Minus.left=current} '-')
	//    right=MulOrDiv
	//  )* ;
	public ExpElements getExpAccess() {
		return pExp;
	}
	
	public ParserRule getExpRule() {
		return getExpAccess().getRule();
	}
	
	//MulOrDiv returns Expression:
	//  Primary (
	//    ({Mult.left=current} '*' | {Div.left=current} '/')
	//    right=Primary
	//  )* ;
	public MulOrDivElements getMulOrDivAccess() {
		return pMulOrDiv;
	}
	
	public ParserRule getMulOrDivRule() {
		return getMulOrDivAccess().getRule();
	}
	
	//Primary returns Expression:
	//    {MathNumber} value=INT  | '(' Exp ')'  |  VariableUse | LetBinding | SquareRoot | Power | {MathNumber} PI
	//;
	public PrimaryElements getPrimaryAccess() {
		return pPrimary;
	}
	
	public ParserRule getPrimaryRule() {
		return getPrimaryAccess().getRule();
	}
	
	//SquareRoot:
	//    'sqrt(' n = Exp ')'
	//;
	public SquareRootElements getSquareRootAccess() {
		return pSquareRoot;
	}
	
	public ParserRule getSquareRootRule() {
		return getSquareRootAccess().getRule();
	}
	
	//PI:
	//    'pi()'
	//;
	public PIElements getPIAccess() {
		return pPI;
	}
	
	public ParserRule getPIRule() {
		return getPIAccess().getRule();
	}
	
	//Power:
	//    'pow('n = Exp','m=Exp')'
	//;
	public PowerElements getPowerAccess() {
		return pPower;
	}
	
	public ParserRule getPowerRule() {
		return getPowerAccess().getRule();
	}
	
	//LetBinding:
	//    'let' name=ID '=' binding=Exp 'in' body=Exp 'end'
	//;
	public LetBindingElements getLetBindingAccess() {
		return pLetBinding;
	}
	
	public ParserRule getLetBindingRule() {
		return getLetBindingAccess().getRule();
	}
	
	//Binding:
	//    VarBinding | LetBinding
	//;
	public BindingElements getBindingAccess() {
		return pBinding;
	}
	
	public ParserRule getBindingRule() {
		return getBindingAccess().getRule();
	}
	
	//VariableUse:
	//    ref = [Binding]
	//;
	public VariableUseElements getVariableUseAccess() {
		return pVariableUse;
	}
	
	public ParserRule getVariableUseRule() {
		return getVariableUseAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
