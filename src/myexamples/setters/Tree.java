package myexamples.setters;

public class Tree {
    private String apple;

    public Tree(String apple) {
        this.apple = apple;
    }

    public void setApple(String apple) {
        this.apple = apple;
    }


    public String toString() {
        return apple;
    }

    public void printWord() {
        System.out.println("I get " + apple + "!");
    }
}
