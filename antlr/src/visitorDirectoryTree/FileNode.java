package visitorDirectoryTree;

import visitor.Node;
import visitor.Visitor;

import java.io.File;

public class FileNode implements Node {

    private File file;

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

}
