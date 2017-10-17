/* Generated By:JJTree: Do not edit this line. ASTIntValue.java */

public class ASTIntValue extends SimpleNode {
  public ASTIntValue(int id) {
    super(id);
  }

  public ASTIntValue(LEParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(LEParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }

  // PLB
  private int value = 0;
  public void setValue(int v) { value = v; }
  public int getValue() { return value; }
}
