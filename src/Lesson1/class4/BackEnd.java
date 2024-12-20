package Lesson1.class4;

public class BackEnd implements Programmer{
    private Language language;
    private Library library;

    @Override
    public Program makeProgram(Paper paper) {
        paper.setData(this);
        return makeFrontEndProgram();
    }
    public void setServer(Server server){this.server = server;}
    public void setLanguage(Language language){this.language = language;}
    private Program makeBackEndProgram(){return new Program();}
}
