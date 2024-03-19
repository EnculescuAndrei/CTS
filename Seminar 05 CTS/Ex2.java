interface Document{
    void open();
    void save();
}
class TextDocument implements Document{
    @Override
    public void open(){
        System.out.println("Text document is open");
    }
    @Override
    public void save(){
        System.out.println("Text document is saved");
    }
}
class ImageDocument implements Document{
    @Override
    public void open(){
        System.out.println("Image document is open");
    }
    @Override
    public void save(){
        System.out.println("Image document is saved");
    }
}
interface DocumentFactory{
    Document createDocument();
}
class TextDocumentFactory implements DocumentFactory{
    @Override
    public Document createDocument(){
        return new TextDocument();
    }
}
class ImageDocumentFactory implements DocumentFactory{
    @Override
    public Document createDocument(){
        return new ImageDocument();
    }
}
public class Ex2 {
    public static void main(String[] args){
        DocumentFactory TextDocumentFactory= new TextDocumentFactory();
        Document textDocument=TextDocumentFactory.createDocument();
        textDocument.open();
        textDocument.save();
        DocumentFactory ImageDocumentFactory= new ImageDocumentFactory();
        Document imageDocument=ImageDocumentFactory.createDocument();
        imageDocument.open();
        imageDocument.save();

    }
}
