import java.util.List;

public class Tree {
    private List<Tree> subtrees;
    private int root;
    // TODO complete this Tree class to replicate the implementation from the Tree class in adts.py

    public Tree(int root, List<Tree> subtrees) {
        this.root = root;
        this.subtrees = subtrees;
    }

    public Tree(int root) {
        this.root = root;
        this.subtrees = new List<Tree>();
    }
}
