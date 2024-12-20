package Lesson1.class4;

import ViolationOfLSP.Programmer;

public class Client implements Paper<FrontEnd>{
    Library library = new Library("vueJS");
    Language language = new Language("kotlinJS");
    Programmer prgrammer;

    public void setProgrammer(Programmer prgrammer) {
        this.programmer = programmer;
    }
    @Override
    public void setData(Programmer programmer) {
        programmer.setLibrary(library);
        programmer.setLanguage(language);
    }
}
