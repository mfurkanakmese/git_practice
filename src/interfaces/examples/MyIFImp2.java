package interfaces.examples;

import interfaces.examples.MyIF;

class MyIFImp2 implements MyIF {
    // Here, implementations for both getUserID( ) and getAdminID( ) are
    // provided.
    public int getUserID() {
        return 100;
    }

    public int getAdminID() {
        return 42;
    }
}