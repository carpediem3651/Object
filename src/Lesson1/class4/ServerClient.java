package Lesson1.class4;

import ViolationOfLSP.Programmer;

public class ServerClient implements Paper{
    Server server = new Server("test");
    Language backEndLanguage = new Language("java");
    Language frontEndLanguage = new Language("kotlinJS");
    private Programmer = backEndProgrammer;
    private Programmer = frontEndProgrammer;
    public void setBackEndLanguage(Programmer programmer){
        backEndLanguage = programmer;
    }
    public void setFrontEndLanguage(Programmer programmer){
        frontEndLanguage = programmer;
    }

    @Override
    public void setData(Programmer programmer) {
        if(programmer instanceof FrontEnd){
            FrontEnd frontEnd = (FrontEnd)programmer;
            frontEnd.setLanguage(frontEndLanguage);
        } else if(programmer instanceof BackEnd){
            BackEnd backEnd = (BackEnd)programmer;
            backEnd.setLanguage(backEndLanguage);
            backEnd.setServer(server);
        }
    }
}
