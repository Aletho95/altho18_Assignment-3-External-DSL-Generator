/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import dk.sdu.mmmi.mdsd.math.Binding;
import dk.sdu.mmmi.mdsd.math.Div;
import dk.sdu.mmmi.mdsd.math.LetBinding;
import dk.sdu.mmmi.mdsd.math.MathExp;
import dk.sdu.mmmi.mdsd.math.MathNumber;
import dk.sdu.mmmi.mdsd.math.Minus;
import dk.sdu.mmmi.mdsd.math.Mult;
import dk.sdu.mmmi.mdsd.math.Plus;
import dk.sdu.mmmi.mdsd.math.Power;
import dk.sdu.mmmi.mdsd.math.Program;
import dk.sdu.mmmi.mdsd.math.SquareRoot;
import dk.sdu.mmmi.mdsd.math.VarBinding;
import dk.sdu.mmmi.mdsd.math.VariableUse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MathGenerator extends AbstractGenerator {
  private static Map<String, Integer> variables;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Program> _filter = Iterables.<Program>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Program.class);
    for (final Program m : _filter) {
      {
        MathGenerator.compute(Iterators.<MathExp>filter(resource.getAllContents(), MathExp.class).next());
        String _program = m.getProgram();
        String _plus = ("math_expression/" + _program);
        String _plus_1 = (_plus + ".java");
        fsa.generateFile(_plus_1, 
          this.compile(m));
      }
    }
  }
  
  public CharSequence compile(final Program p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package math_expression;");
    _builder.newLine();
    _builder.append("public class ");
    String _program = p.getProgram();
    _builder.append(_program);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      Set<Map.Entry<String, Integer>> _entrySet = MathGenerator.variables.entrySet();
      for(final Map.Entry<String, Integer> value : _entrySet) {
        _builder.append("public int ");
        String _key = value.getKey();
        _builder.append(_key);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      String _external = p.getExternal();
      boolean _tripleNotEquals = (_external != null);
      if (_tripleNotEquals) {
        _builder.append("private External external;");
        _builder.newLine();
        _builder.newLine();
        _builder.append("public ");
        String _program_1 = p.getProgram();
        _builder.append(_program_1);
        _builder.append("(External external)");
        _builder.newLineIfNotEmpty();
        _builder.append("{");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("this.external = external;");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("public void compute(){");
    _builder.newLine();
    {
      Set<Map.Entry<String, Integer>> _entrySet_1 = MathGenerator.variables.entrySet();
      for(final Map.Entry<String, Integer> value_1 : _entrySet_1) {
        _builder.append("\t");
        String _key_1 = value_1.getKey();
        _builder.append(_key_1, "\t");
        _builder.append("=");
        Integer _value = value_1.getValue();
        _builder.append(_value, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      String _external_1 = p.getExternal();
      boolean _tripleNotEquals_1 = (_external_1 != null);
      if (_tripleNotEquals_1) {
        _builder.append("public interface External {");
        _builder.newLine();
        {
          String _external_2 = p.getExternal();
          boolean _equals = Objects.equal(_external_2, "pi()");
          if (_equals) {
            _builder.append("\t");
            _builder.append("public int pi();");
            _builder.newLine();
          }
        }
        {
          String _external_3 = p.getExternal();
          boolean _equals_1 = Objects.equal(_external_3, "sqrt(int)");
          if (_equals_1) {
            _builder.append("\t");
            _builder.append("public int sqrt(int n);");
            _builder.newLine();
          }
        }
        {
          String _external_4 = p.getExternal();
          boolean _equals_2 = Objects.equal(_external_4, "pow(int,int)");
          if (_equals_2) {
            _builder.append("\t");
            _builder.append("public int pow(int n,int m);");
            _builder.newLine();
          }
        }
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public void displayPanel(final Map<String, Integer> result) {
    String resultString = "";
    Set<Map.Entry<String, Integer>> _entrySet = result.entrySet();
    for (final Map.Entry<String, Integer> entry : _entrySet) {
      String _resultString = resultString;
      String _key = entry.getKey();
      String _plus = ("var " + _key);
      String _plus_1 = (_plus + " = ");
      Integer _value = entry.getValue();
      String _plus_2 = (_plus_1 + _value);
      String _plus_3 = (_plus_2 + "\n");
      resultString = (_resultString + _plus_3);
    }
    JOptionPane.showMessageDialog(null, resultString, "Math Language", JOptionPane.INFORMATION_MESSAGE);
  }
  
  public static void compute(final MathExp math) {
    HashMap<String, Integer> _hashMap = new HashMap<String, Integer>();
    MathGenerator.variables = _hashMap;
    EList<VarBinding> _variables = math.getVariables();
    for (final VarBinding varBinding : _variables) {
      MathGenerator.computeExpression(varBinding);
    }
  }
  
  protected static int _computeExpression(final VarBinding binding) {
    MathGenerator.variables.put(binding.getName(), Integer.valueOf(MathGenerator.computeExpression(binding.getExpression())));
    return (MathGenerator.variables.get(binding.getName())).intValue();
  }
  
  protected static int _computeExpression(final MathNumber exp) {
    return exp.getValue();
  }
  
  protected static int _computeExpression(final Plus exp) {
    int _computeExpression = MathGenerator.computeExpression(exp.getLeft());
    int _computeExpression_1 = MathGenerator.computeExpression(exp.getRight());
    return (_computeExpression + _computeExpression_1);
  }
  
  protected static int _computeExpression(final Minus exp) {
    int _computeExpression = MathGenerator.computeExpression(exp.getLeft());
    int _computeExpression_1 = MathGenerator.computeExpression(exp.getRight());
    return (_computeExpression - _computeExpression_1);
  }
  
  protected static int _computeExpression(final Mult exp) {
    int _computeExpression = MathGenerator.computeExpression(exp.getLeft());
    int _computeExpression_1 = MathGenerator.computeExpression(exp.getRight());
    return (_computeExpression * _computeExpression_1);
  }
  
  protected static int _computeExpression(final Div exp) {
    int _computeExpression = MathGenerator.computeExpression(exp.getLeft());
    int _computeExpression_1 = MathGenerator.computeExpression(exp.getRight());
    return (_computeExpression / _computeExpression_1);
  }
  
  protected static int _computeExpression(final LetBinding exp) {
    return MathGenerator.computeExpression(exp.getBody());
  }
  
  protected static int _computeExpression(final Power exp) {
    int _xblockexpression = (int) 0;
    {
      MathGenerator.computeExpression(exp.getN());
      _xblockexpression = MathGenerator.computeExpression(exp.getM());
    }
    return _xblockexpression;
  }
  
  protected static int _computeExpression(final SquareRoot exp) {
    return MathGenerator.computeExpression(exp.getN());
  }
  
  protected static int _computeExpression(final VariableUse exp) {
    return MathGenerator.computeBinding(exp.getRef());
  }
  
  protected static int _computeBinding(final VarBinding binding) {
    Integer _xblockexpression = null;
    {
      boolean _containsKey = MathGenerator.variables.containsKey(binding.getName());
      boolean _not = (!_containsKey);
      if (_not) {
        MathGenerator.computeExpression(binding);
      }
      _xblockexpression = MathGenerator.variables.get(binding.getName());
    }
    return (_xblockexpression).intValue();
  }
  
  protected static int _computeBinding(final LetBinding binding) {
    return MathGenerator.computeExpression(binding.getBinding());
  }
  
  public static int computeExpression(final EObject exp) {
    if (exp instanceof Div) {
      return _computeExpression((Div)exp);
    } else if (exp instanceof LetBinding) {
      return _computeExpression((LetBinding)exp);
    } else if (exp instanceof MathNumber) {
      return _computeExpression((MathNumber)exp);
    } else if (exp instanceof Minus) {
      return _computeExpression((Minus)exp);
    } else if (exp instanceof Mult) {
      return _computeExpression((Mult)exp);
    } else if (exp instanceof Plus) {
      return _computeExpression((Plus)exp);
    } else if (exp instanceof Power) {
      return _computeExpression((Power)exp);
    } else if (exp instanceof SquareRoot) {
      return _computeExpression((SquareRoot)exp);
    } else if (exp instanceof VarBinding) {
      return _computeExpression((VarBinding)exp);
    } else if (exp instanceof VariableUse) {
      return _computeExpression((VariableUse)exp);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exp).toString());
    }
  }
  
  public static int computeBinding(final Binding binding) {
    if (binding instanceof LetBinding) {
      return _computeBinding((LetBinding)binding);
    } else if (binding instanceof VarBinding) {
      return _computeBinding((VarBinding)binding);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(binding).toString());
    }
  }
}
