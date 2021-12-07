package com.syntax.class23.abstraction;
//Create a class File that will have the following behaviors: open, edit, close. Edit and close are implemented method while open is an abstract.
// Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
// Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
abstract class File {

    abstract public void open();
   void edit(){
        System.out.println("Editing the files");
    }
    void close(){
        System.out.println("Closing the file");
    }

}
class JavaFile extends File {
    @Override
    public void open() {
        System.out.println("Opening the file with .java and we have to have notepad++");
    }
}
class WordFile extends File {
    @Override
    public void open() {
        System.out.println("Opening the file with .doc and we have to have Microsoft word to be installed in our system");
    }
}
    class PdfFile extends File {
        @Override
        public void open() {
            System.out.println("Opening the file with .pdf need to have PDF reader installed in the system");
        }
    }
