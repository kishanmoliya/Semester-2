/* Create interface EventListener with performEvent() method. Create MouseListener interface which inherits EventListener 
along with mouseClicked(), mousePressed(), mouseReleased(), mouseMoved(), mouseDragged() methods. Also create 
KeyListener interface which inherits EventListener along with keyPressed(), keyReleased() methods. WAP to create 
EventDemo class which implements MouseListener and KeyListener and demonstrate all the methods of the interfaces.
 */ 

interface eventListener{
    void performEvent();
}
interface mouseListener extends eventListener{
    void mouseClicked();
    void mousePressed();
    void mouseReleased();
    void mouseMoved();
    void mouseDragged();
}
interface keyListener extends eventListener{
    void keyPressed();
    void keyReleased();
}
class eventDemo implements mouseListener,keyListener{
    public void performEvent(){
        System.out.println("Event is perfomed");
    }
    public void mouseClicked(){
        System.out.println("Click in mouse");
    }
    public void mousePressed(){
        System.out.println("Pressed mouse");
    }
    public void mouseReleased(){
        System.out.println("Mouse released");
    }
    public void mouseMoved(){
        System.out.println("Mouse moved");
    }
    public void mouseDragged(){
        System.out.println("Mouse dragged");
    }
    public void keyPressed(){
        System.out.println("Key pressed");
    }
    public void keyReleased(){
        System.out.println("Key released");
    }
}
public class myEvent {
    public static void main(String[] args) {
        eventDemo ev = new eventDemo();
        ev.performEvent();
        ev.mouseClicked();
        ev.mousePressed();
        ev.mouseReleased();
        ev.mouseMoved();
        ev.mouseDragged();
        ev.keyPressed();
        ev.keyPressed();
    }
}
