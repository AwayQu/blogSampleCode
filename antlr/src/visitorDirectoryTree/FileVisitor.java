package visitorDirectoryTree;


import visitor.Node;
import visitor.Visitor;

public interface FileVisitor extends Visitor {
    public void visitorChildren(FileNode n);
}
