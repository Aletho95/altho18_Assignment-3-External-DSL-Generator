/**
 * generated by Xtext 2.26.0
 */
package dk.sdu.mmmi.mdsd.math;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Square Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.SquareRoot#getN <em>N</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.math.MathPackage#getSquareRoot()
 * @model
 * @generated
 */
public interface SquareRoot extends Expression
{
  /**
   * Returns the value of the '<em><b>N</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>N</em>' containment reference.
   * @see #setN(Expression)
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#getSquareRoot_N()
   * @model containment="true"
   * @generated
   */
  Expression getN();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.math.SquareRoot#getN <em>N</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N</em>' containment reference.
   * @see #getN()
   * @generated
   */
  void setN(Expression value);

} // SquareRoot
