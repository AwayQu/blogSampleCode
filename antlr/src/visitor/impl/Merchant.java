package visitor.impl;

import visitor.Node;
import visitor.Visitor;

public class Merchant implements Node {


    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public void orderGoodsA() {
        System.out.println("order Goods A");
    }

    public void orderGoodsB() {
        System.out.println("order Goods B");
    }

}
