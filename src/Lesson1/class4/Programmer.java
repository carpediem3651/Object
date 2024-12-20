package Lesson1.class4;

public abstract Programmer {
    public Program getProgram(Paper paper) {
        paper.setData(this);
        return makeProgram(paper);
    }
    abstract Program makeProgram(Paper paper);
}
