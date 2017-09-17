package visitor.impl;

import visitor.Node;
import visitor.Visitor;

public class CustomerB implements Visitor {

    @Override
    public void visit(Node n) {
        if (n instanceof Merchant) {
            ((Merchant)n).orderGoodsB();
        }
    }
}
