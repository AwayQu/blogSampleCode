package visitorDirectoryTree;

import org.junit.Test;
import visitor.Node;

import java.io.File;


public class VisitorDirectoryTreeTest {

    @Test
    public void visitorDirectoryTreeTest() throws Exception {

        FileVisitor visitor = new FileVisitor() {
            private int depth = 0;

            @Override
            public void visitorChildren(FileNode n) {
                depth++;
                File file = n.getFile();
                StringBuilder sb = new StringBuilder();
                for (int i = 1; i < depth; i++) {
                    sb.append(i == 1 ? "|" : "-");
                    sb.append("--");
                }
                sb.append(file.getName());
                System.out.println(sb.toString());


                if (file.isDirectory()) {

                    for (File f : file.listFiles()) {
                        FileNode node = new FileNode();
                        node.setFile(f);
                        node.accept(this);
                    }
                }

                depth--;
            }

            @Override
            public void visit(Node n) {
                if (n instanceof FileNode) {
                    this.visitorChildren((FileNode) n);
                }
            }
        };

        FileNode root = new FileNode();
        root.setFile(new File("./test/res/parent"));
        root.accept(visitor);

    }
}
