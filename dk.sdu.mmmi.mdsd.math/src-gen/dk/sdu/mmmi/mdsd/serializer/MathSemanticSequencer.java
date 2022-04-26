/*
 * generated by Xtext 2.26.0
 */
package dk.sdu.mmmi.mdsd.serializer;

import com.google.inject.Inject;
import dk.sdu.mmmi.mdsd.math.Div;
import dk.sdu.mmmi.mdsd.math.LetBinding;
import dk.sdu.mmmi.mdsd.math.MathExp;
import dk.sdu.mmmi.mdsd.math.MathNumber;
import dk.sdu.mmmi.mdsd.math.MathPackage;
import dk.sdu.mmmi.mdsd.math.Minus;
import dk.sdu.mmmi.mdsd.math.Mult;
import dk.sdu.mmmi.mdsd.math.Plus;
import dk.sdu.mmmi.mdsd.math.Power;
import dk.sdu.mmmi.mdsd.math.Program;
import dk.sdu.mmmi.mdsd.math.SquareRoot;
import dk.sdu.mmmi.mdsd.math.VarBinding;
import dk.sdu.mmmi.mdsd.math.VariableUse;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class MathSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MathGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MathPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MathPackage.DIV:
				sequence_MulOrDiv(context, (Div) semanticObject); 
				return; 
			case MathPackage.LET_BINDING:
				sequence_LetBinding(context, (LetBinding) semanticObject); 
				return; 
			case MathPackage.MATH_EXP:
				sequence_MathExp(context, (MathExp) semanticObject); 
				return; 
			case MathPackage.MATH_NUMBER:
				sequence_Primary(context, (MathNumber) semanticObject); 
				return; 
			case MathPackage.MINUS:
				sequence_Exp(context, (Minus) semanticObject); 
				return; 
			case MathPackage.MULT:
				sequence_MulOrDiv(context, (Mult) semanticObject); 
				return; 
			case MathPackage.PLUS:
				sequence_Exp(context, (Plus) semanticObject); 
				return; 
			case MathPackage.POWER:
				sequence_Power(context, (Power) semanticObject); 
				return; 
			case MathPackage.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			case MathPackage.SQUARE_ROOT:
				sequence_SquareRoot(context, (SquareRoot) semanticObject); 
				return; 
			case MathPackage.VAR_BINDING:
				sequence_VarBinding(context, (VarBinding) semanticObject); 
				return; 
			case MathPackage.VARIABLE_USE:
				sequence_VariableUse(context, (VariableUse) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns Minus
	 *     Exp.Plus_1_0_0_0 returns Minus
	 *     Exp.Minus_1_0_1_0 returns Minus
	 *     MulOrDiv returns Minus
	 *     MulOrDiv.Mult_1_0_0_0 returns Minus
	 *     MulOrDiv.Div_1_0_1_0 returns Minus
	 *     Primary returns Minus
	 *
	 * Constraint:
	 *     (left=Exp_Minus_1_0_1_0 right=MulOrDiv)
	 * </pre>
	 */
	protected void sequence_Exp(ISerializationContext context, Minus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.MINUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.MINUS__LEFT));
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.MINUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.MINUS__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpAccess().getRightMulOrDivParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns Plus
	 *     Exp.Plus_1_0_0_0 returns Plus
	 *     Exp.Minus_1_0_1_0 returns Plus
	 *     MulOrDiv returns Plus
	 *     MulOrDiv.Mult_1_0_0_0 returns Plus
	 *     MulOrDiv.Div_1_0_1_0 returns Plus
	 *     Primary returns Plus
	 *
	 * Constraint:
	 *     (left=Exp_Plus_1_0_0_0 right=MulOrDiv)
	 * </pre>
	 */
	protected void sequence_Exp(ISerializationContext context, Plus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.PLUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.PLUS__LEFT));
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.PLUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.PLUS__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpAccess().getRightMulOrDivParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns LetBinding
	 *     Exp.Plus_1_0_0_0 returns LetBinding
	 *     Exp.Minus_1_0_1_0 returns LetBinding
	 *     MulOrDiv returns LetBinding
	 *     MulOrDiv.Mult_1_0_0_0 returns LetBinding
	 *     MulOrDiv.Div_1_0_1_0 returns LetBinding
	 *     Primary returns LetBinding
	 *     LetBinding returns LetBinding
	 *     Binding returns LetBinding
	 *
	 * Constraint:
	 *     (name=ID binding=Exp body=Exp)
	 * </pre>
	 */
	protected void sequence_LetBinding(ISerializationContext context, LetBinding semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.BINDING__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.BINDING__NAME));
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.LET_BINDING__BINDING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.LET_BINDING__BINDING));
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.LET_BINDING__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.LET_BINDING__BODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLetBindingAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getLetBindingAccess().getBindingExpParserRuleCall_3_0(), semanticObject.getBinding());
		feeder.accept(grammarAccess.getLetBindingAccess().getBodyExpParserRuleCall_5_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     MathExp returns MathExp
	 *
	 * Constraint:
	 *     variables+=VarBinding*
	 * </pre>
	 */
	protected void sequence_MathExp(ISerializationContext context, MathExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns Div
	 *     Exp.Plus_1_0_0_0 returns Div
	 *     Exp.Minus_1_0_1_0 returns Div
	 *     MulOrDiv returns Div
	 *     MulOrDiv.Mult_1_0_0_0 returns Div
	 *     MulOrDiv.Div_1_0_1_0 returns Div
	 *     Primary returns Div
	 *
	 * Constraint:
	 *     (left=MulOrDiv_Div_1_0_1_0 right=Primary)
	 * </pre>
	 */
	protected void sequence_MulOrDiv(ISerializationContext context, Div semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.DIV__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.DIV__LEFT));
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.DIV__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.DIV__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMulOrDivAccess().getDivLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns Mult
	 *     Exp.Plus_1_0_0_0 returns Mult
	 *     Exp.Minus_1_0_1_0 returns Mult
	 *     MulOrDiv returns Mult
	 *     MulOrDiv.Mult_1_0_0_0 returns Mult
	 *     MulOrDiv.Div_1_0_1_0 returns Mult
	 *     Primary returns Mult
	 *
	 * Constraint:
	 *     (left=MulOrDiv_Mult_1_0_0_0 right=Primary)
	 * </pre>
	 */
	protected void sequence_MulOrDiv(ISerializationContext context, Mult semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.MULT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.MULT__LEFT));
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.MULT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.MULT__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMulOrDivAccess().getMultLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns Power
	 *     Exp.Plus_1_0_0_0 returns Power
	 *     Exp.Minus_1_0_1_0 returns Power
	 *     MulOrDiv returns Power
	 *     MulOrDiv.Mult_1_0_0_0 returns Power
	 *     MulOrDiv.Div_1_0_1_0 returns Power
	 *     Primary returns Power
	 *     Power returns Power
	 *
	 * Constraint:
	 *     (n=Exp m=Exp)
	 * </pre>
	 */
	protected void sequence_Power(ISerializationContext context, Power semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.POWER__N) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.POWER__N));
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.POWER__M) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.POWER__M));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPowerAccess().getNExpParserRuleCall_1_0(), semanticObject.getN());
		feeder.accept(grammarAccess.getPowerAccess().getMExpParserRuleCall_3_0(), semanticObject.getM());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns MathNumber
	 *     Exp.Plus_1_0_0_0 returns MathNumber
	 *     Exp.Minus_1_0_1_0 returns MathNumber
	 *     MulOrDiv returns MathNumber
	 *     MulOrDiv.Mult_1_0_0_0 returns MathNumber
	 *     MulOrDiv.Div_1_0_1_0 returns MathNumber
	 *     Primary returns MathNumber
	 *
	 * Constraint:
	 *     value=INT?
	 * </pre>
	 */
	protected void sequence_Primary(ISerializationContext context, MathNumber semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Program returns Program
	 *
	 * Constraint:
	 *     (program=ID (external='sqrt(int)' | external='pi()' | external='pow(int,int)')* math+=MathExp)
	 * </pre>
	 */
	protected void sequence_Program(ISerializationContext context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns SquareRoot
	 *     Exp.Plus_1_0_0_0 returns SquareRoot
	 *     Exp.Minus_1_0_1_0 returns SquareRoot
	 *     MulOrDiv returns SquareRoot
	 *     MulOrDiv.Mult_1_0_0_0 returns SquareRoot
	 *     MulOrDiv.Div_1_0_1_0 returns SquareRoot
	 *     Primary returns SquareRoot
	 *     SquareRoot returns SquareRoot
	 *
	 * Constraint:
	 *     n=Exp
	 * </pre>
	 */
	protected void sequence_SquareRoot(ISerializationContext context, SquareRoot semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.SQUARE_ROOT__N) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.SQUARE_ROOT__N));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSquareRootAccess().getNExpParserRuleCall_1_0(), semanticObject.getN());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     VarBinding returns VarBinding
	 *     Binding returns VarBinding
	 *
	 * Constraint:
	 *     (name=ID expression=Exp)
	 * </pre>
	 */
	protected void sequence_VarBinding(ISerializationContext context, VarBinding semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.BINDING__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.BINDING__NAME));
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.VAR_BINDING__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.VAR_BINDING__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVarBindingAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVarBindingAccess().getExpressionExpParserRuleCall_3_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns VariableUse
	 *     Exp.Plus_1_0_0_0 returns VariableUse
	 *     Exp.Minus_1_0_1_0 returns VariableUse
	 *     MulOrDiv returns VariableUse
	 *     MulOrDiv.Mult_1_0_0_0 returns VariableUse
	 *     MulOrDiv.Div_1_0_1_0 returns VariableUse
	 *     Primary returns VariableUse
	 *     VariableUse returns VariableUse
	 *
	 * Constraint:
	 *     ref=[Binding|ID]
	 * </pre>
	 */
	protected void sequence_VariableUse(ISerializationContext context, VariableUse semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.VARIABLE_USE__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.VARIABLE_USE__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableUseAccess().getRefBindingIDTerminalRuleCall_0_1(), semanticObject.eGet(MathPackage.Literals.VARIABLE_USE__REF, false));
		feeder.finish();
	}
	
	
}
